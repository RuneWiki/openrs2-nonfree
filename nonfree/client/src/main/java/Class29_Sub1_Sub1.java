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

@OriginalClass("client!ie")
public final class Class29_Sub1_Sub1 extends Class29_Sub1 implements Receiver {

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class29_Sub1_Sub1() {
		try {
			Static44.aReceiver1 = MidiSystem.getReceiver();
			Static44.aSequencer1 = MidiSystem.getSequencer(false);
			Static44.aSequencer1.getTransmitter().setReceiver(this);
			Static44.aSequencer1.open();
			this.method1844(-1L);
		} catch (@Pc(18) Exception local18) {
			Static51.method1838();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIJ)V")
	@Override
	protected void method1836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		try {
			@Pc(3) ShortMessage local3 = new ShortMessage();
			local3.setMessage(arg0, arg1, arg2);
			Static44.aReceiver1.send(local3, arg3);
		} catch (@Pc(14) InvalidMidiDataException local14) {
		}
	}

	@OriginalMember(owner = "client!ie", name = "close", descriptor = "()V")
	@Override
	public void close() {
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)V")
	@Override
	public void method1934(@OriginalArg(0) int arg0) {
		if (Static44.aSequencer1 != null) {
			this.method1832(arg0, -1L);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z[BII)V")
	@Override
	public void method1935(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		if (Static44.aSequencer1 == null) {
			return;
		}
		try {
			@Pc(17) Sequence local17 = MidiSystem.getSequence(new ByteArrayInputStream(arg1));
			Static44.aSequencer1.setSequence(local17);
			Static44.aSequencer1.setLoopCount(arg0 ? -1 : 0);
			this.method1835(arg2, -1L, 0);
			Static44.aBoolean62 = true;
			Static44.aSequencer1.start();
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!ie", name = "send", descriptor = "(Ljavax/sound/midi/MidiMessage;J)V")
	@Override
	public synchronized void send(@OriginalArg(0) MidiMessage arg0, @OriginalArg(1) long arg1) {
		if (Static44.aBoolean62) {
			@Pc(5) byte[] local5 = arg0.getMessage();
			if (!this.method1842(local5[0] & 0xFF, local5[1], local5.length >= 3 ? local5[2] : 0, arg1)) {
				Static44.aReceiver1.send(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
	@Override
	public void method1929() {
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	@Override
	public void method1933() {
		if (Static44.aSequencer1 != null) {
			Static44.aBoolean62 = false;
			Static44.aSequencer1.stop();
			this.method1844(-1L);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
	@Override
	public synchronized void method1930(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static44.aSequencer1 != null) {
			this.method1835(arg1, -1L, arg0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	@Override
	public void method1936() {
		if (Static44.aSequencer1 != null) {
			Static44.aSequencer1.close();
			Static44.aSequencer1 = null;
		}
		if (Static44.aReceiver1 != null) {
			Static44.aReceiver1.close();
			Static44.aReceiver1 = null;
		}
	}
}
