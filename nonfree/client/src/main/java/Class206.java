import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class206 implements Runnable {

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "Lclient!h;")
	public static final Class89 aClass89_204 = new Class89(36, 8);

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
	public static int anInt5730 = 0;

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "Lclient!wc;")
	private final Class246 aClass246_9 = new Class246();

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "Z")
	private boolean aBoolean404 = false;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
	public int anInt5729 = 0;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!ml;)V", line = 253)
	public Class206(@OriginalArg(0) Class152 arg0) {
		@Pc(20) Class32 local20 = arg0.method3770(5, this);
		while (local20.anInt992 == 0) {
			Static214.method4024(10L);
		}
		if (local20.anInt992 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject2;
	}

	@OriginalMember(owner = "client!ro", name = "run", descriptor = "()V", line = 3)
	@Override
	public void run() {
		while (!this.aBoolean404) {
			@Pc(6) Class246 local6 = this.aClass246_9;
			@Pc(14) Class2_Sub2_Sub10_Sub2 local14;
			synchronized (this.aClass246_9) {
				local14 = (Class2_Sub2_Sub10_Sub2) this.aClass246_9.method6340();
				if (local14 == null) {
					try {
						this.aClass246_9.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt5729--;
			}
			try {
				if (local14.anInt6187 == 2) {
					local14.aClass207_4.method5260(local14.aByteArray91.length, local14.aByteArray91, (int) local14.aLong215);
				} else if (local14.anInt6187 == 3) {
					local14.aByteArray91 = local14.aClass207_4.method5262((int) local14.aLong215);
				}
			} catch (@Pc(74) Exception local74) {
				Static241.method6254(local74, null);
			}
			local14.aBoolean416 = false;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLclient!td;)V", line = 110)
	private void method5225(@OriginalArg(1) Class2_Sub2_Sub10_Sub2 arg0) {
		@Pc(2) Class246 local2 = this.aClass246_9;
		synchronized (this.aClass246_9) {
			this.aClass246_9.method6342(arg0);
			this.anInt5729++;
			this.aClass246_9.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBLclient!rq;)Lclient!td;", line = 139)
	public Class2_Sub2_Sub10_Sub2 method5227(@OriginalArg(0) int arg0, @OriginalArg(2) Class207 arg1) {
		@Pc(15) Class2_Sub2_Sub10_Sub2 local15 = new Class2_Sub2_Sub10_Sub2();
		local15.anInt6187 = 1;
		@Pc(21) Class246 local21 = this.aClass246_9;
		synchronized (this.aClass246_9) {
			@Pc(29) Class2_Sub2_Sub10_Sub2 local29 = (Class2_Sub2_Sub10_Sub2) this.aClass246_9.method6338();
			while (true) {
				if (local29 == null) {
					break;
				}
				if (local29.aLong215 == (long) arg0 && local29.aClass207_4 == arg1 && local29.anInt6187 == 2) {
					local15.aByteArray91 = local29.aByteArray91;
					local15.aBoolean416 = false;
					return local15;
				}
				local29 = (Class2_Sub2_Sub10_Sub2) this.aClass246_9.method6337();
			}
		}
		local15.aByteArray91 = arg1.method5262(arg0);
		local15.aBoolean416 = false;
		local15.aBoolean418 = true;
		return local15;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!rq;Z)Lclient!td;", line = 174)
	public Class2_Sub2_Sub10_Sub2 method5228(@OriginalArg(0) int arg0, @OriginalArg(1) Class207 arg1) {
		@Pc(12) Class2_Sub2_Sub10_Sub2 local12 = new Class2_Sub2_Sub10_Sub2();
		local12.aClass207_4 = arg1;
		local12.anInt6187 = 3;
		local12.aBoolean418 = false;
		local12.aLong215 = arg0;
		this.method5225(local12);
		return local12;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V", line = 192)
	public void method5229() {
		this.aBoolean404 = true;
		@Pc(9) Class246 local9 = this.aClass246_9;
		synchronized (this.aClass246_9) {
			this.aClass246_9.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(30) InterruptedException local30) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "([BILclient!rq;I)Lclient!td;", line = 211)
	public Class2_Sub2_Sub10_Sub2 method5230(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		@Pc(13) Class2_Sub2_Sub10_Sub2 local13 = new Class2_Sub2_Sub10_Sub2();
		local13.aByteArray91 = arg0;
		local13.aBoolean418 = false;
		local13.aLong215 = arg1;
		local13.aClass207_4 = arg2;
		local13.anInt6187 = 2;
		this.method5225(local13);
		return local13;
	}
}
