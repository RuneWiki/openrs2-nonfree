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

@OriginalClass("client!b")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 implements Receiver {

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub1() {
		try {
			Static6.aReceiver1 = MidiSystem.getReceiver();
			Static6.aSequencer1 = MidiSystem.getSequencer(false);
			Static6.aSequencer1.getTransmitter().setReceiver(this);
			Static6.aSequencer1.open();
			this.method638(-1L);
		} catch (@Pc(18) Exception local18) {
			Static83.method1664();
		}
	}

	@OriginalMember(owner = "client!b", name = "close", descriptor = "()V")
	@Override
	public void close() {
	}

	@OriginalMember(owner = "client!b", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
	@Override
	public synchronized void send(@OriginalArg(0) MidiMessage arg0, @OriginalArg(1) long arg1) {
		if (Static6.aBoolean9) {
			@Pc(5) byte[] local5 = arg0.getMessage();
			if (!this.method635(local5[0] & 0xFF, local5[1] & 0xFF, local5.length >= 3 ? local5[2] & 0xFF : 0, arg1)) {
				Static6.aReceiver1.send(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IBI)V")
	@Override
	public synchronized void method1226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static6.aSequencer1 != null) {
			this.method633(-1L, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZBI[B)V")
	@Override
	public void method1234(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		if (Static6.aSequencer1 == null) {
			return;
		}
		try {
			@Pc(9) Sequence local9 = MidiSystem.getSequence(new ByteArrayInputStream(arg2));
			Static6.aSequencer1.setSequence(local9);
			Static6.aSequencer1.setLoopCount(arg0 ? -1 : 0);
			this.method633(-1L, arg1, 0);
			Static6.aBoolean9 = true;
			Static6.aSequencer1.start();
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
	@Override
	public void method1231() {
		if (Static6.aSequencer1 != null) {
			Static6.aBoolean9 = false;
			Static6.aSequencer1.stop();
			this.method638(-1L);
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	@Override
	public void method1230() {
		if (Static6.aSequencer1 != null) {
			Static6.aSequencer1.close();
			Static6.aSequencer1 = null;
		}
		if (Static6.aReceiver1 != null) {
			Static6.aReceiver1.close();
			Static6.aReceiver1 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V")
	@Override
	public void method1233(@OriginalArg(1) int arg0) {
		if (Static6.aSequencer1 != null) {
			this.method636(-1L, arg0);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIJ)V")
	@Override
	protected void method634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		try {
			@Pc(3) ShortMessage local3 = new ShortMessage();
			local3.setMessage(arg0, arg1, arg2);
			Static6.aReceiver1.send(local3, arg3);
		} catch (@Pc(14) InvalidMidiDataException local14) {
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	@Override
	public void method1228() {
	}
}
