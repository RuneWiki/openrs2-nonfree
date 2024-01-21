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

@OriginalClass("client!pa")
public final class Class12_Sub1_Sub2 extends Class12_Sub1 implements Receiver {

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub2() {
		try {
			Static77.aReceiver1 = MidiSystem.getReceiver();
			Static77.aSequencer1 = MidiSystem.getSequencer(false);
			Static77.aSequencer1.getTransmitter().setReceiver(this);
			Static77.aSequencer1.open();
			this.method1257(-1L);
		} catch (@Pc(18) Exception local18) {
			Static11.method235();
		}
	}

	@OriginalMember(owner = "client!pa", name = "close", descriptor = "()V")
	@Override
	public void close() {
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
	@Override
	public void method1252() {
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
	@Override
	public void method1251() {
		if (Static77.aSequencer1 != null) {
			this.method1259(-1L);
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
	@Override
	public void method1249() {
		if (Static77.aSequencer1 != null) {
			Static77.aSequencer1.close();
			Static77.aSequencer1 = null;
		}
		if (Static77.aReceiver1 != null) {
			Static77.aReceiver1.close();
			Static77.aReceiver1 = null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZB[BI)V")
	@Override
	public void method1250(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		if (Static77.aSequencer1 == null) {
			return;
		}
		try {
			@Pc(8) Sequence local8 = MidiSystem.getSequence(new ByteArrayInputStream(arg1));
			Static77.aSequencer1.setSequence(local8);
			Static77.aSequencer1.setLoopCount(arg0 ? -1 : 0);
			this.method1256(arg2, -1L, 0);
			Static77.aSequencer1.start();
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BII)V")
	@Override
	public synchronized void method1244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static77.aSequencer1 != null) {
			this.method1256(arg1, -1L, arg0);
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(IIIJ)V")
	@Override
	protected void method1262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		try {
			@Pc(3) ShortMessage local3 = new ShortMessage();
			local3.setMessage(arg0, arg1, arg2);
			Static77.aReceiver1.send(local3, arg3);
		} catch (@Pc(14) InvalidMidiDataException local14) {
		}
	}

	@OriginalMember(owner = "client!pa", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
	@Override
	public synchronized void send(@OriginalArg(0) MidiMessage arg0, @OriginalArg(1) long arg1) {
		@Pc(2) byte[] local2 = arg0.getMessage();
		if (local2.length < 3 || !this.method1253(local2[0], local2[1], local2[2], arg1)) {
			Static77.aReceiver1.send(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
	@Override
	public void method1241() {
		if (Static77.aSequencer1 != null) {
			Static77.aSequencer1.stop();
			this.method1257(-1L);
		}
	}
}
