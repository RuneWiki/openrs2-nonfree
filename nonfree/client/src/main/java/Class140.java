import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class140 implements Runnable {

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "Lclient!nv;")
	private final Class177 aClass177_22 = new Class177();

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3 = new Thread(this);

	static {
		new Class198("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class140() {
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!dd;)V")
	private void method2903(@OriginalArg(1) Class5 arg0) {
		@Pc(2) Class177 local2 = this.aClass177_22;
		synchronized (this.aClass177_22) {
			this.aClass177_22.method3615(arg0);
			this.aClass177_22.notify();
		}
	}

	@OriginalMember(owner = "client!kn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class177 local8 = this.aClass177_22;
			@Pc(38) Class5_Sub10 local38;
			synchronized (this.aClass177_22) {
				@Pc(15) Class5 local15;
				for (local15 = this.aClass177_22.method3621(); local15 == null; local15 = this.aClass177_22.method3621()) {
					try {
						this.aClass177_22.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class5_Sub10)) {
					return;
				}
				local38 = (Class5_Sub10) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString10).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt1414 = local64;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
	public void method2904() {
		if (this.aThread3 == null) {
			return;
		}
		this.method2903(new Class5());
		try {
			this.aThread3.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!dn;")
	public Class5_Sub10 method2905(@OriginalArg(0) String arg0) {
		if (this.aThread3 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class5_Sub10 local23 = new Class5_Sub10(arg0);
			this.method2903(local23);
			return local23;
		}
	}
}
