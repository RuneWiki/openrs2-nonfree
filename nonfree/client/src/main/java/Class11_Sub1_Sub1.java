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

@OriginalClass("client!cb")
public final class Class11_Sub1_Sub1 extends Class11_Sub1 implements Receiver {

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class11_Sub1_Sub1() {
		try {
			Static13.aReceiver1 = MidiSystem.getReceiver();
			Static13.aSequencer1 = MidiSystem.getSequencer(false);
			Static13.aSequencer1.getTransmitter().setReceiver(this);
			Static13.aSequencer1.open();
			this.method536(-1L);
		} catch (@Pc(18) Exception local18) {
			Static25.method559();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method1271(@OriginalArg(1) int arg0) {
		if (Static13.aSequencer1 != null) {
			this.method534(-1L, arg0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
	@Override
	public synchronized void send(@OriginalArg(0) MidiMessage arg0, @OriginalArg(1) long arg1) {
		if (Static13.aBoolean17) {
			@Pc(5) byte[] local5 = arg0.getMessage();
			if (!this.method538(local5[0] & 0xFF, local5[1], local5.length >= 3 ? local5[2] : 0, arg1)) {
				Static13.aReceiver1.send(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIJ)V")
	@Override
	protected void method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		try {
			@Pc(3) ShortMessage local3 = new ShortMessage();
			local3.setMessage(arg0, arg1, arg2);
			Static13.aReceiver1.send(local3, arg3);
		} catch (@Pc(14) InvalidMidiDataException local14) {
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
	@Override
	public synchronized void method1278(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static13.aSequencer1 != null) {
			this.method537(arg0, arg1, -1L);
		}
	}

	@OriginalMember(owner = "client!cb", name = "close", descriptor = "()V")
	@Override
	public void close() {
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	@Override
	public void method1280() {
		if (Static13.aSequencer1 != null) {
			Static13.aSequencer1.close();
			Static13.aSequencer1 = null;
		}
		if (Static13.aReceiver1 != null) {
			Static13.aReceiver1.close();
			Static13.aReceiver1 = null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	@Override
	public void method1277() {
		if (Static13.aSequencer1 != null) {
			Static13.aBoolean17 = false;
			Static13.aSequencer1.stop();
			this.method536(-1L);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZI[B)V")
	@Override
	public void method1272(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		if (Static13.aSequencer1 == null) {
			return;
		}
		try {
			@Pc(15) Sequence local15 = MidiSystem.getSequence(new ByteArrayInputStream(arg2));
			Static13.aSequencer1.setSequence(local15);
			Static13.aSequencer1.setLoopCount(arg0 ? -1 : 0);
			this.method537(arg1, 0, -1L);
			Static13.aBoolean17 = true;
			Static13.aSequencer1.start();
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	@Override
	public void method1275() {
	}
}
