import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class216 implements Runnable {

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!wba;")
	private final Class353 aClass353_34 = new Class353();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5 = new Thread(this);

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class216() {
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!pca;)V")
	private void method4338(@OriginalArg(1) Class1 arg0) {
		@Pc(2) Class353 local2 = this.aClass353_34;
		synchronized (this.aClass353_34) {
			this.aClass353_34.method7679(arg0);
			this.aClass353_34.notify();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public void method4339() {
		if (this.aThread5 == null) {
			return;
		}
		this.method4338(new Class1());
		try {
			this.aThread5.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!ml;")
	public Class1_Sub34 method4340(@OriginalArg(1) String arg0) {
		if (this.aThread5 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(29) Class1_Sub34 local29 = new Class1_Sub34(arg0);
			this.method4338(local29);
			return local29;
		}
	}

	@OriginalMember(owner = "client!ma", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class353 local8 = this.aClass353_34;
			@Pc(38) Class1_Sub34 local38;
			synchronized (this.aClass353_34) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass353_34.method7688(); local15 == null; local15 = this.aClass353_34.method7688()) {
					try {
						this.aClass353_34.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub34)) {
					return;
				}
				local38 = (Class1_Sub34) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString52).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt5530 = local64;
		}
	}
}
