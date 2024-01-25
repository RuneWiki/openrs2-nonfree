import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class217 implements Runnable {

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "[I")
	public static final int[] anIntArray415;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!am;")
	private final Class14 aClass14_41 = new Class14();

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4 = new Thread(this);

	static {
		new Class142("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
		new Class142("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
		anIntArray415 = new int[4096];
		for (@Pc(16) int local16 = 0; local16 < 4096; local16++) {
			anIntArray415[local16] = Static138.method1751(local16);
		}
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class217() {
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!ev;)V")
	private void method4577(@OriginalArg(1) Class1 arg0) {
		@Pc(6) Class14 local6 = this.aClass14_41;
		synchronized (this.aClass14_41) {
			this.aClass14_41.method205(arg0);
			this.aClass14_41.notify();
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
	public void method4580() {
		if (this.aThread4 == null) {
			return;
		}
		this.method4577(new Class1());
		try {
			this.aThread4.join();
		} catch (@Pc(22) InterruptedException local22) {
		}
		this.aThread4 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!ha;")
	public Class1_Sub17 method4582(@OriginalArg(0) String arg0) {
		if (this.aThread4 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class1_Sub17 local23 = new Class1_Sub17(arg0);
			this.method4577(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!rd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class14 local8 = this.aClass14_41;
			@Pc(38) Class1_Sub17 local38;
			synchronized (this.aClass14_41) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass14_41.method202(); local15 == null; local15 = this.aClass14_41.method202()) {
					try {
						this.aClass14_41.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub17)) {
					return;
				}
				local38 = (Class1_Sub17) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString18).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt2301 = local64;
		}
	}
}
