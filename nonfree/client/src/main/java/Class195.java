import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public final class Class195 implements Runnable {

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "Lclient!ifa;")
	private final Class144 aClass144_12 = new Class144();

	@OriginalMember(owner = "client!mca", name = "m", descriptor = "Z")
	private boolean aBoolean344 = false;

	@OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
	public int anInt5476 = 0;

	@OriginalMember(owner = "client!mca", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lclient!cr;)V")
	public Class195(@OriginalArg(0) Class57 arg0) {
		@Pc(20) Class278 local20 = arg0.method916(5, this);
		while (local20.anInt7757 == 0) {
			Static149.method2211(10L);
		}
		if (local20.anInt7757 == 2) {
			throw new RuntimeException();
		}
		this.aThread4 = (Thread) local20.anObject24;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IILclient!vh;)Lclient!uda;")
	public Class6_Sub1_Sub10_Sub2 method4679(@OriginalArg(1) int arg0, @OriginalArg(2) Class331 arg1) {
		@Pc(7) Class6_Sub1_Sub10_Sub2 local7 = new Class6_Sub1_Sub10_Sub2();
		local7.anInt8642 = 3;
		local7.aBoolean605 = false;
		local7.aLong250 = arg0;
		local7.aClass331_3 = arg1;
		this.method4682(local7);
		return local7;
	}

	@OriginalMember(owner = "client!mca", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean344) {
			@Pc(6) Class144 local6 = this.aClass144_12;
			@Pc(14) Class6_Sub1_Sub10_Sub2 local14;
			synchronized (this.aClass144_12) {
				local14 = (Class6_Sub1_Sub10_Sub2) this.aClass144_12.method3115();
				if (local14 == null) {
					try {
						this.aClass144_12.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt5476--;
			}
			try {
				if (local14.anInt8642 == 2) {
					local14.aClass331_3.method7496(local14.aByteArray111, local14.aByteArray111.length, (int) local14.aLong250);
				} else if (local14.anInt8642 == 3) {
					local14.aByteArray111 = local14.aClass331_3.method7493((int) local14.aLong250);
				}
			} catch (@Pc(74) Exception local74) {
				Static169.method2641(null, local74);
			}
			local14.aBoolean607 = false;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!uda;I)V")
	private void method4682(@OriginalArg(0) Class6_Sub1_Sub10_Sub2 arg0) {
		@Pc(2) Class144 local2 = this.aClass144_12;
		synchronized (this.aClass144_12) {
			this.aClass144_12.method3114(arg0);
			this.anInt5476++;
			this.aClass144_12.notifyAll();
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILclient!vh;B)Lclient!uda;")
	public Class6_Sub1_Sub10_Sub2 method4683(@OriginalArg(0) int arg0, @OriginalArg(1) Class331 arg1) {
		@Pc(14) Class6_Sub1_Sub10_Sub2 local14 = new Class6_Sub1_Sub10_Sub2();
		local14.anInt8642 = 1;
		@Pc(20) Class144 local20 = this.aClass144_12;
		synchronized (this.aClass144_12) {
			@Pc(28) Class6_Sub1_Sub10_Sub2 local28 = (Class6_Sub1_Sub10_Sub2) this.aClass144_12.method3116();
			while (true) {
				if (local28 == null) {
					break;
				}
				if (local28.aLong250 == (long) arg0 && arg1 == local28.aClass331_3 && local28.anInt8642 == 2) {
					local14.aBoolean607 = false;
					local14.aByteArray111 = local28.aByteArray111;
					return local14;
				}
				local28 = (Class6_Sub1_Sub10_Sub2) this.aClass144_12.method3113();
			}
		}
		local14.aByteArray111 = arg1.method7493(arg0);
		local14.aBoolean605 = true;
		local14.aBoolean607 = false;
		return local14;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "([BIILclient!vh;)Lclient!uda;")
	public Class6_Sub1_Sub10_Sub2 method4684(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class331 arg2) {
		@Pc(13) Class6_Sub1_Sub10_Sub2 local13 = new Class6_Sub1_Sub10_Sub2();
		local13.aBoolean605 = false;
		local13.anInt8642 = 2;
		local13.aByteArray111 = arg0;
		local13.aClass331_3 = arg2;
		local13.aLong250 = arg1;
		this.method4682(local13);
		return local13;
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(B)V")
	public void method4686() {
		this.aBoolean344 = true;
		@Pc(9) Class144 local9 = this.aClass144_12;
		synchronized (this.aClass144_12) {
			this.aClass144_12.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		this.aThread4 = null;
	}
}
