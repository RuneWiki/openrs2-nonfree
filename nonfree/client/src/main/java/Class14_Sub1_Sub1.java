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
			Static19.aReceiver1 = MidiSystem.getReceiver();
			Static19.aSequencer1 = MidiSystem.getSequencer(false);
			Static19.aSequencer1.getTransmitter().setReceiver(this);
			Static19.aSequencer1.open();
			this.method1093(-1L);
		} catch (@Pc(18) Exception local18) {
			Static110.method1796();
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)V")
	@Override
	public synchronized void method1080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static19.aSequencer1 != null) {
			this.method1089(arg0, arg1, -1L);
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V")
	@Override
	public void method1082() {
		if (Static19.aSequencer1 != null) {
			Static19.aSequencer1.close();
			Static19.aSequencer1 = null;
		}
		if (Static19.aReceiver1 != null) {
			Static19.aReceiver1.close();
			Static19.aReceiver1 = null;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
	@Override
	public void method1077(@OriginalArg(0) int arg0) {
		if (Static19.aSequencer1 != null) {
			this.method1090(-1L, arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "close", descriptor = "()V")
	@Override
	public void close() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	@Override
	public void method1079() {
		if (Static19.aSequencer1 != null) {
			Static19.aBoolean37 = false;
			Static19.aSequencer1.stop();
			this.method1093(-1L);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIJ)V")
	@Override
	protected void method1086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		try {
			@Pc(3) ShortMessage local3 = new ShortMessage();
			local3.setMessage(arg0, arg1, arg2);
			Static19.aReceiver1.send(local3, arg3);
		} catch (@Pc(14) InvalidMidiDataException local14) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([BZII)V")
	@Override
	public void method1076(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (Static19.aSequencer1 == null) {
			return;
		}
		try {
			@Pc(14) Sequence local14 = MidiSystem.getSequence(new ByteArrayInputStream(arg0));
			Static19.aSequencer1.setSequence(local14);
			Static19.aSequencer1.setLoopCount(arg1 ? -1 : 0);
			this.method1089(arg2, 0, -1L);
			Static19.aBoolean37 = true;
			Static19.aSequencer1.start();
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!da", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
	@Override
	public synchronized void send(@OriginalArg(0) MidiMessage arg0, @OriginalArg(1) long arg1) {
		if (Static19.aBoolean37) {
			@Pc(5) byte[] local5 = arg0.getMessage();
			if (!this.method1094(local5[0] & 0xFF, local5[1], local5.length >= 3 ? local5[2] : 0, arg1)) {
				Static19.aReceiver1.send(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	@Override
	public void method1078() {
	}
}
