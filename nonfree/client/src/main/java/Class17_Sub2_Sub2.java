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

@OriginalClass("client!vd")
public final class Class17_Sub2_Sub2 extends Class17_Sub2 implements Receiver {

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class17_Sub2_Sub2() {
		try {
			Static115.aReceiver1 = MidiSystem.getReceiver();
			Static115.aSequencer1 = MidiSystem.getSequencer(false);
			Static115.aSequencer1.getTransmitter().setReceiver(this);
			Static115.aSequencer1.open();
			this.method2017(-1L);
		} catch (@Pc(18) Exception local18) {
			Static94.method1542();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	@Override
	public void method2001() {
		if (Static115.aSequencer1 != null) {
			Static115.aBoolean164 = false;
			Static115.aSequencer1.stop();
			this.method2017(-1L);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZIB[B)V")
	@Override
	public void method2007(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		if (Static115.aSequencer1 == null) {
			return;
		}
		try {
			@Pc(10) Sequence local10 = MidiSystem.getSequence(new ByteArrayInputStream(arg2));
			Static115.aSequencer1.setSequence(local10);
			Static115.aSequencer1.setLoopCount(arg0 ? -1 : 0);
			this.method2019(-1L, arg1, 0);
			Static115.aBoolean164 = true;
			Static115.aSequencer1.start();
		} catch (@Pc(36) Exception local36) {
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	@Override
	public void method2004() {
	}

	@OriginalMember(owner = "client!vd", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
	@Override
	public synchronized void send(@OriginalArg(0) MidiMessage arg0, @OriginalArg(1) long arg1) {
		if (Static115.aBoolean164) {
			@Pc(5) byte[] local5 = arg0.getMessage();
			if (!this.method2015(local5[0] & 0xFF, local5[1], local5.length >= 3 ? local5[2] : 0, arg1)) {
				Static115.aReceiver1.send(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
	@Override
	public void method2008() {
		if (Static115.aSequencer1 != null) {
			Static115.aSequencer1.close();
			Static115.aSequencer1 = null;
		}
		if (Static115.aReceiver1 != null) {
			Static115.aReceiver1.close();
			Static115.aReceiver1 = null;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	@Override
	public void method2009(@OriginalArg(1) int arg0) {
		if (Static115.aSequencer1 != null) {
			this.method2014(arg0, -1L);
		}
	}

	@OriginalMember(owner = "client!vd", name = "close", descriptor = "()V")
	@Override
	public void close() {
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIJ)V")
	@Override
	protected void method2012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		try {
			@Pc(3) ShortMessage local3 = new ShortMessage();
			local3.setMessage(arg0, arg1, arg2);
			Static115.aReceiver1.send(local3, arg3);
		} catch (@Pc(14) InvalidMidiDataException local14) {
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
	@Override
	public synchronized void method2000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static115.aSequencer1 != null) {
			this.method2019(-1L, arg1, arg0);
		}
	}
}
