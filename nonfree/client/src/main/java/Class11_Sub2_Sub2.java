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

@OriginalClass("client!lc")
public final class Class11_Sub2_Sub2 extends Class11_Sub2 implements Receiver {

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub2() {
		try {
			Static59.aReceiver1 = MidiSystem.getReceiver();
			Static59.aSequencer1 = MidiSystem.getSequencer(false);
			Static59.aSequencer1.getTransmitter().setReceiver(this);
			Static59.aSequencer1.open();
			this.method1118(-1L);
		} catch (@Pc(18) Exception local18) {
			Static28.method1393();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIJ)V")
	@Override
	protected void method1115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		try {
			@Pc(3) ShortMessage local3 = new ShortMessage();
			local3.setMessage(arg0, arg1, arg2);
			Static59.aReceiver1.send(local3, arg3);
		} catch (@Pc(14) InvalidMidiDataException local14) {
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	@Override
	public void method1103() {
		if (Static59.aSequencer1 != null) {
			Static59.aBoolean91 = false;
			Static59.aSequencer1.stop();
			this.method1118(-1L);
		}
	}

	@OriginalMember(owner = "client!lc", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
	@Override
	public synchronized void send(@OriginalArg(0) MidiMessage arg0, @OriginalArg(1) long arg1) {
		if (Static59.aBoolean91) {
			@Pc(5) byte[] local5 = arg0.getMessage();
			if (!this.method1119(local5[0] & 0xFF, local5[1], local5.length >= 3 ? local5[2] : 0, arg1)) {
				Static59.aReceiver1.send(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
	@Override
	public synchronized void method1107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static59.aSequencer1 != null) {
			this.method1116(-1L, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(BI)V")
	@Override
	public void method1105(@OriginalArg(1) int arg0) {
		if (Static59.aSequencer1 != null) {
			this.method1121(-1L, arg0);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[BZI)V")
	@Override
	public void method1104(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		if (Static59.aSequencer1 == null) {
			return;
		}
		try {
			@Pc(9) Sequence local9 = MidiSystem.getSequence(new ByteArrayInputStream(arg1));
			Static59.aSequencer1.setSequence(local9);
			Static59.aSequencer1.setLoopCount(arg2 ? -1 : 0);
			this.method1116(-1L, arg0, 0);
			Static59.aBoolean91 = true;
			Static59.aSequencer1.start();
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
	@Override
	public void method1114() {
		if (Static59.aSequencer1 != null) {
			Static59.aSequencer1.close();
			Static59.aSequencer1 = null;
		}
		if (Static59.aReceiver1 != null) {
			Static59.aReceiver1.close();
			Static59.aReceiver1 = null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "close", descriptor = "()V")
	@Override
	public void close() {
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
	@Override
	public void method1111() {
	}
}
