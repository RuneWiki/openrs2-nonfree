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

@OriginalClass("client!cd")
public final class Class13_Sub1_Sub1 extends Class13_Sub1 implements Receiver {

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class13_Sub1_Sub1() {
		try {
			Static14.aReceiver1 = MidiSystem.getReceiver();
			Static14.aSequencer1 = MidiSystem.getSequencer(false);
			Static14.aSequencer1.getTransmitter().setReceiver(this);
			Static14.aSequencer1.open();
			this.method1467(-1L);
		} catch (@Pc(18) Exception local18) {
			Static89.method1427();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[BIZ)V")
	@Override
	public void method1500(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2) {
		if (Static14.aSequencer1 == null) {
			return;
		}
		try {
			@Pc(8) Sequence local8 = MidiSystem.getSequence(new ByteArrayInputStream(arg1));
			Static14.aSequencer1.setSequence(local8);
			Static14.aSequencer1.setLoopCount(arg2 ? -1 : 0);
			this.method1464(0, arg0, -1L);
			Static14.aSequencer1.start();
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	@Override
	public void method1506() {
		if (Static14.aSequencer1 != null) {
			Static14.aSequencer1.stop();
			this.method1467(-1L);
		}
	}

	@OriginalMember(owner = "client!cd", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
	@Override
	public synchronized void send(@OriginalArg(0) MidiMessage arg0, @OriginalArg(1) long arg1) {
		@Pc(2) byte[] local2 = arg0.getMessage();
		if (local2.length < 3 || !this.method1466(local2[0], local2[1], local2[2], arg1)) {
			Static14.aReceiver1.send(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	@Override
	public void method1501() {
		if (Static14.aSequencer1 != null) {
			Static14.aSequencer1.close();
			Static14.aSequencer1 = null;
		}
		if (Static14.aReceiver1 != null) {
			Static14.aReceiver1.close();
			Static14.aReceiver1 = null;
		}
	}

	@OriginalMember(owner = "client!cd", name = "close", descriptor = "()V")
	@Override
	public void close() {
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)V")
	@Override
	public void method1504(@OriginalArg(0) int arg0) {
		if (Static14.aSequencer1 != null) {
			this.method1469(arg0, -1L);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIB)V")
	@Override
	public synchronized void method1503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static14.aSequencer1 != null) {
			this.method1464(arg1, arg0, -1L);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIJ)V")
	@Override
	protected void method1465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		try {
			@Pc(3) ShortMessage local3 = new ShortMessage();
			local3.setMessage(arg0, arg1, arg2);
			Static14.aReceiver1.send(local3, arg3);
		} catch (@Pc(14) InvalidMidiDataException local14) {
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	@Override
	public void method1505() {
	}
}
