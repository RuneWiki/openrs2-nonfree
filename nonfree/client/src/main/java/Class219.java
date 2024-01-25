import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class219 implements Runnable {

	@OriginalMember(owner = "client!np", name = "l", descriptor = "Lclient!pw;")
	private final Class256 aClass256_7 = new Class256();

	@OriginalMember(owner = "client!np", name = "m", descriptor = "Z")
	private boolean aBoolean458 = false;

	@OriginalMember(owner = "client!np", name = "o", descriptor = "I")
	public int anInt6591 = 0;

	@OriginalMember(owner = "client!np", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class219(@OriginalArg(0) Class313 arg0) {
		@Pc(20) Class224 local20 = arg0.method6991(5, this);
		while (local20.anInt6632 == 0) {
			Static183.method3079(10L);
		}
		if (local20.anInt6632 == 2) {
			throw new RuntimeException();
		}
		this.aThread4 = (Thread) local20.anObject14;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	public void method5317() {
		this.aBoolean458 = true;
		@Pc(9) Class256 local9 = this.aClass256_7;
		synchronized (this.aClass256_7) {
			this.aClass256_7.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread4 = null;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!fo;[BI)Lclient!ifa;")
	public Class6_Sub5_Sub3_Sub1 method5318(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) Class6_Sub5_Sub3_Sub1 local7 = new Class6_Sub5_Sub3_Sub1();
		local7.aBoolean493 = false;
		local7.anInt4087 = 2;
		local7.aLong242 = arg0;
		local7.aClass109_4 = arg1;
		local7.aByteArray54 = arg2;
		this.method5322(local7);
		return local7;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IBLclient!fo;)Lclient!ifa;")
	public Class6_Sub5_Sub3_Sub1 method5321(@OriginalArg(0) int arg0, @OriginalArg(2) Class109 arg1) {
		@Pc(7) Class6_Sub5_Sub3_Sub1 local7 = new Class6_Sub5_Sub3_Sub1();
		local7.aBoolean493 = false;
		local7.aClass109_4 = arg1;
		local7.anInt4087 = 3;
		local7.aLong242 = arg0;
		this.method5322(local7);
		return local7;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!ifa;)V")
	private void method5322(@OriginalArg(1) Class6_Sub5_Sub3_Sub1 arg0) {
		@Pc(6) Class256 local6 = this.aClass256_7;
		synchronized (this.aClass256_7) {
			this.aClass256_7.method5906(arg0);
			this.anInt6591++;
			this.aClass256_7.notifyAll();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!fo;IB)Lclient!ifa;")
	public Class6_Sub5_Sub3_Sub1 method5323(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class6_Sub5_Sub3_Sub1 local9 = new Class6_Sub5_Sub3_Sub1();
		local9.anInt4087 = 1;
		@Pc(15) Class256 local15 = this.aClass256_7;
		synchronized (this.aClass256_7) {
			@Pc(31) Class6_Sub5_Sub3_Sub1 local31 = (Class6_Sub5_Sub3_Sub1) this.aClass256_7.method5902();
			while (true) {
				if (local31 == null) {
					break;
				}
				if ((long) arg1 == local31.aLong242 && local31.aClass109_4 == arg0 && local31.anInt4087 == 2) {
					local9.aBoolean492 = false;
					local9.aByteArray54 = local31.aByteArray54;
					return local9;
				}
				local31 = (Class6_Sub5_Sub3_Sub1) this.aClass256_7.method5901();
			}
		}
		local9.aByteArray54 = arg0.method2457(arg1);
		local9.aBoolean492 = false;
		local9.aBoolean493 = true;
		return local9;
	}

	@OriginalMember(owner = "client!np", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean458) {
			@Pc(6) Class256 local6 = this.aClass256_7;
			@Pc(14) Class6_Sub5_Sub3_Sub1 local14;
			synchronized (this.aClass256_7) {
				local14 = (Class6_Sub5_Sub3_Sub1) this.aClass256_7.method5904();
				if (local14 == null) {
					try {
						this.aClass256_7.wait();
					} catch (@Pc(21) InterruptedException local21) {
					}
					continue;
				}
				this.anInt6591--;
			}
			try {
				if (local14.anInt4087 == 2) {
					local14.aClass109_4.method2455(local14.aByteArray54, local14.aByteArray54.length, (int) local14.aLong242);
				} else if (local14.anInt4087 == 3) {
					local14.aByteArray54 = local14.aClass109_4.method2457((int) local14.aLong242);
				}
			} catch (@Pc(70) Exception local70) {
				Static214.method5693(null, local70);
			}
			local14.aBoolean492 = false;
		}
	}
}
