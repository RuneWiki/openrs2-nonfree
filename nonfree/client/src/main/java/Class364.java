import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uga")
public final class Class364 implements Runnable {

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "Lclient!oga;")
	private final Class269 aClass269_158 = new Class269();

	@OriginalMember(owner = "client!uga", name = "k", descriptor = "Z")
	private boolean aBoolean703 = false;

	@OriginalMember(owner = "client!uga", name = "g", descriptor = "I")
	public int anInt10122 = 0;

	@OriginalMember(owner = "client!uga", name = "e", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lclient!iha;)V")
	public Class364(@OriginalArg(0) Class173 arg0) {
		@Pc(20) Class230 local20 = arg0.method4250(5, this);
		while (local20.anInt6256 == 0) {
			Static548.method7968(10L);
		}
		if (local20.anInt6256 == 2) {
			throw new RuntimeException();
		}
		this.aThread7 = (Thread) local20.anObject12;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lclient!dda;I)V")
	private void method8651(@OriginalArg(0) Class14_Sub2_Sub7_Sub1 arg0) {
		@Pc(6) Class269 local6 = this.aClass269_158;
		synchronized (this.aClass269_158) {
			this.aClass269_158.method6493(arg0);
			this.anInt10122++;
			this.aClass269_158.notifyAll();
		}
	}

	@OriginalMember(owner = "client!uga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean703) {
			@Pc(10) Class269 local10 = this.aClass269_158;
			@Pc(18) Class14_Sub2_Sub7_Sub1 local18;
			synchronized (this.aClass269_158) {
				local18 = (Class14_Sub2_Sub7_Sub1) this.aClass269_158.method6490();
				if (local18 == null) {
					try {
						this.aClass269_158.wait();
					} catch (@Pc(36) InterruptedException local36) {
					}
					continue;
				}
				this.anInt10122--;
			}
			try {
				if (local18.anInt1720 == 2) {
					local18.aClass384_1.method9209(local18.aByteArray26, local18.aByteArray26.length, (int) local18.aLong308);
				} else if (local18.anInt1720 == 3) {
					local18.aByteArray26 = local18.aClass384_1.method9208((int) local18.aLong308);
				}
			} catch (@Pc(83) Exception local83) {
				Static629.method8829((String) null, local83);
			}
			local18.aBoolean637 = false;
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(ILclient!vw;I)Lclient!dda;")
	public Class14_Sub2_Sub7_Sub1 method8652(@OriginalArg(0) int arg0, @OriginalArg(1) Class384 arg1) {
		@Pc(7) Class14_Sub2_Sub7_Sub1 local7 = new Class14_Sub2_Sub7_Sub1();
		local7.anInt1720 = 1;
		@Pc(13) Class269 local13 = this.aClass269_158;
		synchronized (this.aClass269_158) {
			@Pc(29) Class14_Sub2_Sub7_Sub1 local29 = (Class14_Sub2_Sub7_Sub1) this.aClass269_158.method6494();
			while (true) {
				if (local29 == null) {
					break;
				}
				if ((long) arg0 == local29.aLong308 && arg1 == local29.aClass384_1 && local29.anInt1720 == 2) {
					local7.aBoolean637 = false;
					local7.aByteArray26 = local29.aByteArray26;
					return local7;
				}
				local29 = (Class14_Sub2_Sub7_Sub1) this.aClass269_158.method6491();
			}
		}
		local7.aByteArray26 = arg1.method9208(arg0);
		local7.aBoolean635 = true;
		local7.aBoolean637 = false;
		return local7;
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(I)V")
	public void method8653() {
		this.aBoolean703 = true;
		@Pc(9) Class269 local9 = this.aClass269_158;
		synchronized (this.aClass269_158) {
			this.aClass269_158.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread7 = null;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "([BLclient!vw;IB)Lclient!dda;")
	public Class14_Sub2_Sub7_Sub1 method8654(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class14_Sub2_Sub7_Sub1 local7 = new Class14_Sub2_Sub7_Sub1();
		local7.aClass384_1 = arg1;
		local7.aBoolean635 = false;
		local7.anInt1720 = 2;
		local7.aByteArray26 = arg0;
		local7.aLong308 = (long) arg2;
		this.method8651(local7);
		return local7;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IILclient!vw;)Lclient!dda;")
	public Class14_Sub2_Sub7_Sub1 method8656(@OriginalArg(1) int arg0, @OriginalArg(2) Class384 arg1) {
		@Pc(7) Class14_Sub2_Sub7_Sub1 local7 = new Class14_Sub2_Sub7_Sub1();
		local7.aBoolean635 = false;
		local7.anInt1720 = 3;
		local7.aLong308 = (long) arg0;
		local7.aClass384_1 = arg1;
		this.method8651(local7);
		return local7;
	}
}
