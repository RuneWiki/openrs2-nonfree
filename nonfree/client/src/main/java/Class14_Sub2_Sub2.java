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

@OriginalClass("client!rb")
public final class Class14_Sub2_Sub2 extends Class14_Sub2 implements Receiver {

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class14_Sub2_Sub2() {
		try {
			Static88.aReceiver1 = MidiSystem.getReceiver();
			Static88.aSequencer1 = MidiSystem.getSequencer(false);
			Static88.aSequencer1.getTransmitter().setReceiver(this);
			Static88.aSequencer1.open();
			this.method1561(-1L);
		} catch (@Pc(18) Exception local18) {
			Static85.method1494();
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(IIIJ)V")
	@Override
	protected void method1564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		try {
			@Pc(3) ShortMessage local3 = new ShortMessage();
			local3.setMessage(arg0, arg1, arg2);
			Static88.aReceiver1.send(local3, arg3);
		} catch (@Pc(14) InvalidMidiDataException local14) {
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	@Override
	public void method1548() {
		if (Static88.aSequencer1 != null) {
			Static88.aSequencer1.close();
			Static88.aSequencer1 = null;
		}
		if (Static88.aReceiver1 != null) {
			Static88.aReceiver1.close();
			Static88.aReceiver1 = null;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	@Override
	public void method1550() {
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([BZIZ)V")
	@Override
	public void method1555(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (Static88.aSequencer1 == null) {
			return;
		}
		try {
			@Pc(13) Sequence local13 = MidiSystem.getSequence(new ByteArrayInputStream(arg0));
			Static88.aSequencer1.setSequence(local13);
			Static88.aSequencer1.setLoopCount(arg2 ? -1 : 0);
			this.method1560(-1L, 0, arg1);
			Static88.aBoolean129 = true;
			Static88.aSequencer1.start();
		} catch (@Pc(35) Exception local35) {
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
	@Override
	public synchronized void method1549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static88.aSequencer1 != null) {
			this.method1560(-1L, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	@Override
	public void method1554() {
		if (Static88.aSequencer1 != null) {
			Static88.aBoolean129 = false;
			Static88.aSequencer1.stop();
			this.method1561(-1L);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
	@Override
	public void method1557(@OriginalArg(1) int arg0) {
		if (Static88.aSequencer1 != null) {
			this.method1559(arg0, -1L);
		}
	}

	@OriginalMember(owner = "client!rb", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
	@Override
	public synchronized void send(@OriginalArg(0) MidiMessage arg0, @OriginalArg(1) long arg1) {
		if (Static88.aBoolean129) {
			@Pc(5) byte[] local5 = arg0.getMessage();
			if (!this.method1563(local5[0] & 0xFF, local5[1], local5.length >= 3 ? local5[2] : 0, arg1)) {
				Static88.aReceiver1.send(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "close", descriptor = "()V")
	@Override
	public void close() {
	}
}
