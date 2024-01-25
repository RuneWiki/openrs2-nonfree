import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class233 implements Runnable {

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "Lclient!oaa;")
	private final Class258 aClass258_5 = new Class258();

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
	public int anInt6400 = 0;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "Z")
	private boolean aBoolean492 = false;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!lu;)V")
	public Class233(@OriginalArg(0) Class231 arg0) {
		@Pc(20) Class129 local20 = arg0.method5297(5, this);
		while (local20.anInt3299 == 0) {
			Static365.method3472(10L);
		}
		if (local20.anInt3299 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject7;
	}

	@OriginalMember(owner = "client!ma", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean492) {
			@Pc(10) Class258 local10 = this.aClass258_5;
			@Pc(18) Class3_Sub6_Sub2_Sub2 local18;
			synchronized (this.aClass258_5) {
				local18 = (Class3_Sub6_Sub2_Sub2) this.aClass258_5.method5931();
				if (local18 == null) {
					try {
						this.aClass258_5.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
					continue;
				}
				this.anInt6400--;
			}
			try {
				if (local18.anInt9099 == 2) {
					local18.aClass313_3.method7373(local18.aByteArray101, local18.aByteArray101.length, (int) local18.aLong290);
				} else if (local18.anInt9099 == 3) {
					local18.aByteArray101 = local18.aClass313_3.method7372((int) local18.aLong290);
				}
			} catch (@Pc(78) Exception local78) {
				Static81.method1711((String) null, local78);
			}
			local18.aBoolean677 = false;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!rt;IB)Lclient!tf;")
	public Class3_Sub6_Sub2_Sub2 method5370(@OriginalArg(0) Class313 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub6_Sub2_Sub2 local15 = new Class3_Sub6_Sub2_Sub2();
		local15.anInt9099 = 3;
		local15.aBoolean678 = false;
		local15.aLong290 = (long) arg1;
		local15.aClass313_3 = arg0;
		this.method5374(local15);
		return local15;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lclient!rt;IB)Lclient!tf;")
	public Class3_Sub6_Sub2_Sub2 method5371(@OriginalArg(0) Class313 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub6_Sub2_Sub2 local9 = new Class3_Sub6_Sub2_Sub2();
		local9.anInt9099 = 1;
		@Pc(15) Class258 local15 = this.aClass258_5;
		synchronized (this.aClass258_5) {
			@Pc(23) Class3_Sub6_Sub2_Sub2 local23 = (Class3_Sub6_Sub2_Sub2) this.aClass258_5.method5934();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg1 == local23.aLong290 && arg0 == local23.aClass313_3 && local23.anInt9099 == 2) {
					local9.aByteArray101 = local23.aByteArray101;
					local9.aBoolean677 = false;
					return local9;
				}
				local23 = (Class3_Sub6_Sub2_Sub2) this.aClass258_5.method5929();
			}
		}
		local9.aByteArray101 = arg0.method7372(arg1);
		local9.aBoolean678 = true;
		local9.aBoolean677 = false;
		return local9;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([BZLclient!rt;I)Lclient!tf;")
	public Class3_Sub6_Sub2_Sub2 method5372(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class313 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class3_Sub6_Sub2_Sub2 local7 = new Class3_Sub6_Sub2_Sub2();
		local7.aByteArray101 = arg0;
		local7.aBoolean678 = false;
		local7.aLong290 = (long) arg2;
		local7.anInt9099 = 2;
		local7.aClass313_3 = arg1;
		this.method5374(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public void method5373() {
		this.aBoolean492 = true;
		@Pc(9) Class258 local9 = this.aClass258_5;
		synchronized (this.aClass258_5) {
			this.aClass258_5.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(32) InterruptedException local32) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!tf;)V")
	private void method5374(@OriginalArg(1) Class3_Sub6_Sub2_Sub2 arg0) {
		@Pc(8) Class258 local8 = this.aClass258_5;
		synchronized (this.aClass258_5) {
			this.aClass258_5.method5936(arg0);
			this.anInt6400++;
			this.aClass258_5.notifyAll();
		}
	}
}
