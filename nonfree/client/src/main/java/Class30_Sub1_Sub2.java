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

@OriginalClass("client!sc")
public final class Class30_Sub1_Sub2 extends Class30_Sub1 implements Receiver {

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class30_Sub1_Sub2() {
		try {
			Static97.aReceiver1 = MidiSystem.getReceiver();
			Static97.aSequencer1 = MidiSystem.getSequencer(false);
			Static97.aSequencer1.getTransmitter().setReceiver(this);
			Static97.aSequencer1.open();
			this.method1515(-1L);
		} catch (@Pc(18) Exception local18) {
			Static38.method1910();
		}
	}

	@OriginalMember(owner = "client!sc", name = "close", descriptor = "()V")
	@Override
	public void close() {
	}

	@OriginalMember(owner = "client!sc", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
	@Override
	public synchronized void send(@OriginalArg(0) MidiMessage arg0, @OriginalArg(1) long arg1) {
		if (Static97.aBoolean188) {
			@Pc(5) byte[] local5 = arg0.getMessage();
			if (!this.method1514(local5[0] & 0xFF, local5[1], local5.length >= 3 ? local5[2] : 0, arg1)) {
				Static97.aReceiver1.send(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	@Override
	public void method1882() {
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
	@Override
	public void method1873(@OriginalArg(0) int arg0) {
		if (Static97.aSequencer1 != null) {
			this.method1516(-1L, arg0);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([BIBZ)V")
	@Override
	public void method1875(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		if (Static97.aSequencer1 == null) {
			return;
		}
		try {
			@Pc(8) Sequence local8 = MidiSystem.getSequence(new ByteArrayInputStream(arg0));
			Static97.aSequencer1.setSequence(local8);
			Static97.aSequencer1.setLoopCount(arg2 ? -1 : 0);
			this.method1522(arg1, 0, -1L);
			Static97.aBoolean188 = true;
			Static97.aSequencer1.start();
		} catch (@Pc(34) Exception local34) {
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	@Override
	public void method1883() {
		if (Static97.aSequencer1 != null) {
			Static97.aBoolean188 = false;
			Static97.aSequencer1.stop();
			this.method1515(-1L);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
	@Override
	public void method1881() {
		if (Static97.aSequencer1 != null) {
			Static97.aSequencer1.close();
			Static97.aSequencer1 = null;
		}
		if (Static97.aReceiver1 != null) {
			Static97.aReceiver1.close();
			Static97.aReceiver1 = null;
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(IIIJ)V")
	@Override
	protected void method1523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		try {
			@Pc(3) ShortMessage local3 = new ShortMessage();
			local3.setMessage(arg0, arg1, arg2);
			Static97.aReceiver1.send(local3, arg3);
		} catch (@Pc(14) InvalidMidiDataException local14) {
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBI)V")
	@Override
	public synchronized void method1878(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static97.aSequencer1 != null) {
			this.method1522(arg0, arg1, -1L);
		}
	}
}
