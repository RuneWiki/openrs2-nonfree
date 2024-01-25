import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class66 implements Runnable {

	@OriginalMember(owner = "client!el", name = "d", descriptor = "Lclient!sr;")
	private final Class227 aClass227_7 = new Class227();

	@OriginalMember(owner = "client!el", name = "b", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	static {
		new Class119("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class66() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!pe;B)V")
	private void method1460(@OriginalArg(0) Class1 arg0) {
		@Pc(6) Class227 local6 = this.aClass227_7;
		synchronized (this.aClass227_7) {
			this.aClass227_7.method4972(arg0);
			this.aClass227_7.notify();
		}
	}

	@OriginalMember(owner = "client!el", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class227 local8 = this.aClass227_7;
			@Pc(38) Class1_Sub42 local38;
			synchronized (this.aClass227_7) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass227_7.method4974(); local15 == null; local15 = this.aClass227_7.method4974()) {
					try {
						this.aClass227_7.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub42)) {
					return;
				}
				local38 = (Class1_Sub42) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString78).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt7261 = local64;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!vn;")
	public Class1_Sub42 method1461(@OriginalArg(0) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(31) Class1_Sub42 local31 = new Class1_Sub42(arg0);
			this.method1460(local31);
			return local31;
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	public void method1463() {
		if (this.aThread1 == null) {
			return;
		}
		this.method1460(new Class1());
		try {
			this.aThread1.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread1 = null;
	}
}
