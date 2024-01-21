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

@OriginalClass("client!qa")
public final class Class38_Sub1_Sub1 extends Class38_Sub1 implements Receiver {

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	public Class38_Sub1_Sub1() {
		try {
			Static82.aReceiver1 = MidiSystem.getReceiver();
			Static82.aSequencer1 = MidiSystem.getSequencer(false);
			Static82.aSequencer1.getTransmitter().setReceiver(this);
			Static82.aSequencer1.open();
			this.method1438(-1L);
		} catch (@Pc(18) Exception local18) {
			Static86.method1409();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
	@Override
	public synchronized void method1584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static82.aSequencer1 != null) {
			this.method1434(arg1, -1L, arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "close", descriptor = "()V")
	@Override
	public void close() {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
	@Override
	public void method1586(@OriginalArg(0) int arg0) {
		if (Static82.aSequencer1 != null) {
			this.method1437(arg0, -1L);
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	@Override
	public void method1579() {
	}

	@OriginalMember(owner = "client!qa", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
	@Override
	public synchronized void send(@OriginalArg(0) MidiMessage arg0, @OriginalArg(1) long arg1) {
		@Pc(2) byte[] local2 = arg0.getMessage();
		if (local2.length < 3 || !this.method1439(local2[0], local2[1], local2[2], arg1)) {
			Static82.aReceiver1.send(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIJ)V")
	@Override
	protected void method1443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		try {
			@Pc(3) ShortMessage local3 = new ShortMessage();
			local3.setMessage(arg0, arg1, arg2);
			Static82.aReceiver1.send(local3, arg3);
		} catch (@Pc(14) InvalidMidiDataException local14) {
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI[BI)V")
	@Override
	public void method1578(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		if (Static82.aSequencer1 == null) {
			return;
		}
		try {
			@Pc(9) Sequence local9 = MidiSystem.getSequence(new ByteArrayInputStream(arg2));
			Static82.aSequencer1.setSequence(local9);
			Static82.aSequencer1.setLoopCount(arg0 ? -1 : 0);
			this.method1434(0, -1L, arg1);
			Static82.aSequencer1.start();
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	@Override
	public void method1577() {
		if (Static82.aSequencer1 != null) {
			Static82.aSequencer1.close();
			Static82.aSequencer1 = null;
		}
		if (Static82.aReceiver1 != null) {
			Static82.aReceiver1.close();
			Static82.aReceiver1 = null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	@Override
	public void method1581() {
		if (Static82.aSequencer1 != null) {
			Static82.aSequencer1.stop();
			this.method1438(-1L);
		}
	}
}
