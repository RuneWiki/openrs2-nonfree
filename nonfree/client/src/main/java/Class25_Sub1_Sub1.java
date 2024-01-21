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

@OriginalClass("client!ha")
public final class Class25_Sub1_Sub1 extends Class25_Sub1 implements Receiver {

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
	public Class25_Sub1_Sub1() {
		try {
			Static39.aReceiver1 = MidiSystem.getReceiver();
			Static39.aSequencer1 = MidiSystem.getSequencer(false);
			Static39.aSequencer1.getTransmitter().setReceiver(this);
			Static39.aSequencer1.open();
			this.method776(-1L);
		} catch (@Pc(18) Exception local18) {
			Static92.method1537();
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
	@Override
	public synchronized void method1158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static39.aSequencer1 != null) {
			this.method782(arg0, -1L, arg1);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[BBZ)V")
	@Override
	public void method1154(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2) {
		if (Static39.aSequencer1 == null) {
			return;
		}
		try {
			@Pc(8) Sequence local8 = MidiSystem.getSequence(new ByteArrayInputStream(arg1));
			Static39.aSequencer1.setSequence(local8);
			Static39.aSequencer1.setLoopCount(arg2 ? -1 : 0);
			this.method782(0, -1L, arg0);
			Static39.aBoolean53 = true;
			Static39.aSequencer1.start();
		} catch (@Pc(36) Exception local36) {
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	@Override
	public void method1150() {
		if (Static39.aSequencer1 != null) {
			Static39.aSequencer1.close();
			Static39.aSequencer1 = null;
		}
		if (Static39.aReceiver1 != null) {
			Static39.aReceiver1.close();
			Static39.aReceiver1 = null;
		}
	}

	@OriginalMember(owner = "client!ha", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
	@Override
	public synchronized void send(@OriginalArg(0) MidiMessage arg0, @OriginalArg(1) long arg1) {
		if (Static39.aBoolean53) {
			@Pc(5) byte[] local5 = arg0.getMessage();
			if (!this.method774(local5[0] & 0xFF, local5[1], local5.length >= 3 ? local5[2] : 0, arg1)) {
				Static39.aReceiver1.send(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IB)V")
	@Override
	public void method1156(@OriginalArg(0) int arg0) {
		if (Static39.aSequencer1 != null) {
			this.method775(-1L, arg0);
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	@Override
	public void method1157() {
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIJ)V")
	@Override
	protected void method779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		try {
			@Pc(3) ShortMessage local3 = new ShortMessage();
			local3.setMessage(arg0, arg1, arg2);
			Static39.aReceiver1.send(local3, arg3);
		} catch (@Pc(14) InvalidMidiDataException local14) {
		}
	}

	@OriginalMember(owner = "client!ha", name = "close", descriptor = "()V")
	@Override
	public void close() {
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
	@Override
	public void method1151() {
		if (Static39.aSequencer1 != null) {
			Static39.aBoolean53 = false;
			Static39.aSequencer1.stop();
			this.method776(-1L);
		}
	}
}
