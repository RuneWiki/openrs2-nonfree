import java.io.ByteArrayInputStream;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.ShortMessage;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class14_Sub1_Sub1 extends Class14_Sub1 implements Receiver {

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub1() {
		try {
			Static14.aReceiver1 = MidiSystem.getReceiver();
			Static14.aSequencer1 = MidiSystem.getSequencer(false);
			Static14.aSequencer1.getTransmitter().setReceiver(this);
			Static14.aSequencer1.open();
			this.method1434(-1L);
		} catch (@Pc(18) Exception local18) {
			Static88.method1616();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	@Override
	public void method1420() {
		if (Static14.aSequencer1 != null) {
			Static14.aSequencer1.close();
			Static14.aSequencer1 = null;
		}
		if (Static14.aReceiver1 != null) {
			Static14.aReceiver1.close();
			Static14.aReceiver1 = null;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[BIZ)V")
	@Override
	public void method1421(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (Static14.aSequencer1 == null) {
			return;
		}
		try {
			@Pc(8) Sequence local8 = MidiSystem.getSequence(new ByteArrayInputStream(arg0));
			Static14.aSequencer1.setSequence(local8);
			Static14.aSequencer1.setLoopCount(arg2 ? -1 : 0);
			this.method1433(-1L, arg1, 0);
			Static14.aBoolean21 = true;
			Static14.aSequencer1.start();
		} catch (@Pc(30) Exception local30) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBI)V")
	@Override
	public synchronized void method1423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static14.aSequencer1 != null) {
			this.method1433(-1L, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
	@Override
	public synchronized void send(@OriginalArg(0) MidiMessage arg0, @OriginalArg(1) long arg1) {
		if (Static14.aBoolean21) {
			@Pc(5) byte[] local5 = arg0.getMessage();
			if (!this.method1432(local5[0], local5[1], local5.length >= 3 ? local5[2] : 0, arg1)) {
				Static14.aReceiver1.send(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "close", descriptor = "()V")
	@Override
	public void close() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIJ)V")
	@Override
	protected void method1430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		try {
			@Pc(3) ShortMessage local3 = new ShortMessage();
			local3.setMessage(arg0, arg1, arg2);
			Static14.aReceiver1.send(local3, arg3);
		} catch (@Pc(14) InvalidMidiDataException local14) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)V")
	@Override
	public void method1425(@OriginalArg(0) int arg0) {
		if (Static14.aSequencer1 != null) {
			this.method1439(arg0, -1L);
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V")
	@Override
	public void method1426() {
		if (Static14.aSequencer1 != null) {
			Static14.aBoolean21 = false;
			Static14.aSequencer1.stop();
			this.method1434(-1L);
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
	@Override
	public void method1424() {
	}
}
