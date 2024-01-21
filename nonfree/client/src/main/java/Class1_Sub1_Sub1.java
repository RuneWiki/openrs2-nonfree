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

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 implements Receiver {

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
		try {
			Static1.aReceiver1 = MidiSystem.getReceiver();
			Static1.aSequencer1 = MidiSystem.getSequencer(false);
			Static1.aSequencer1.getTransmitter().setReceiver(this);
			Static1.aSequencer1.open();
			this.method802(-1L);
		} catch (@Pc(18) Exception local18) {
			Static100.method1707();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	@Override
	public void method1041() {
		if (Static1.aSequencer1 != null) {
			this.method805(-1L);
		}
	}

	@OriginalMember(owner = "client!a", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
	@Override
	public synchronized void send(@OriginalArg(0) MidiMessage arg0, @OriginalArg(1) long arg1) {
		@Pc(2) byte[] local2 = arg0.getMessage();
		if (local2.length < 3 || !this.method803(local2[0], local2[1], local2[2], arg1)) {
			Static1.aReceiver1.send(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIJ)V")
	@Override
	protected void method804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		try {
			@Pc(3) ShortMessage local3 = new ShortMessage();
			local3.setMessage(arg0, arg1, arg2);
			Static1.aReceiver1.send(local3, arg3);
		} catch (@Pc(14) InvalidMidiDataException local14) {
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZBI[B)V")
	@Override
	public void method1048(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		if (Static1.aSequencer1 == null) {
			return;
		}
		try {
			@Pc(13) Sequence local13 = MidiSystem.getSequence(new ByteArrayInputStream(arg2));
			Static1.aSequencer1.setSequence(local13);
			Static1.aSequencer1.setLoopCount(arg0 ? -1 : 0);
			this.method800(arg1, -1L, 0);
			Static1.aSequencer1.start();
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	@Override
	public void method1050() {
		if (Static1.aSequencer1 != null) {
			Static1.aSequencer1.stop();
			this.method802(-1L);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BII)V")
	@Override
	public synchronized void method1046(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static1.aSequencer1 != null) {
			this.method800(arg0, -1L, arg1);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	@Override
	public void method1047() {
		if (Static1.aSequencer1 != null) {
			Static1.aSequencer1.close();
			Static1.aSequencer1 = null;
		}
		if (Static1.aReceiver1 != null) {
			Static1.aReceiver1.close();
			Static1.aReceiver1 = null;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	@Override
	public void method1051() {
	}

	@OriginalMember(owner = "client!a", name = "close", descriptor = "()V")
	@Override
	public void close() {
	}
}
