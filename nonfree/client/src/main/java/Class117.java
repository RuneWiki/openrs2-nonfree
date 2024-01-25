import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class117 implements Runnable {

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!eb;")
	private final Class42 aClass42_30 = new Class42();

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2 = new Thread(this);

	static {
		new Class106("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
		new Class106("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class117() {
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!l", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class42 local8 = this.aClass42_30;
			@Pc(38) Class1_Sub12 local38;
			synchronized (this.aClass42_30) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass42_30.method1541(); local15 == null; local15 = this.aClass42_30.method1541()) {
					try {
						this.aClass42_30.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub12)) {
					return;
				}
				local38 = (Class1_Sub12) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString3).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt930 = local64;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public void method3398() {
		if (this.aThread2 == null) {
			return;
		}
		this.method3401(new Class1());
		try {
			this.aThread2.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/lang/String;)Lclient!cb;")
	public Class1_Sub12 method3399(@OriginalArg(1) String arg0) {
		if (this.aThread2 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class1_Sub12 local23 = new Class1_Sub12(arg0);
			this.method3401(local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!gk;)V")
	private void method3401(@OriginalArg(1) Class1 arg0) {
		@Pc(6) Class42 local6 = this.aClass42_30;
		synchronized (this.aClass42_30) {
			this.aClass42_30.method1549(arg0);
			this.aClass42_30.notify();
		}
	}
}
