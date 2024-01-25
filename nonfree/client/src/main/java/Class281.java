import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class281 implements Runnable {

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!hv;")
	private final Class143 aClass143_10 = new Class143();

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Z")
	private boolean aBoolean632 = false;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	public int anInt8476 = 0;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!pe;)V")
	public Class281(@OriginalArg(0) Class246 arg0) {
		@Pc(20) Class280 local20 = arg0.method6134(this, 5);
		while (local20.anInt8467 == 0) {
			Static566.method8004(10L);
		}
		if (local20.anInt8467 == 2) {
			throw new RuntimeException();
		}
		this.aThread5 = (Thread) local20.anObject16;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!qn;II)Lclient!wh;")
	public Class6_Sub4_Sub9_Sub2 method7110(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class6_Sub4_Sub9_Sub2 local9 = new Class6_Sub4_Sub9_Sub2();
		local9.anInt9636 = 1;
		@Pc(15) Class143 local15 = this.aClass143_10;
		synchronized (this.aClass143_10) {
			@Pc(30) Class6_Sub4_Sub9_Sub2 local30 = (Class6_Sub4_Sub9_Sub2) this.aClass143_10.method3839();
			while (true) {
				if (local30 == null) {
					break;
				}
				if (local30.aLong247 == (long) arg1 && local30.aClass266_6 == arg0 && local30.anInt9636 == 2) {
					local9.aBoolean715 = false;
					local9.aByteArray125 = local30.aByteArray125;
					return local9;
				}
				local30 = (Class6_Sub4_Sub9_Sub2) this.aClass143_10.method3833();
			}
		}
		local9.aByteArray125 = arg0.method6530(arg1);
		local9.aBoolean714 = true;
		local9.aBoolean715 = false;
		return local9;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public void method7111() {
		this.aBoolean632 = true;
		@Pc(9) Class143 local9 = this.aClass143_10;
		synchronized (this.aClass143_10) {
			this.aClass143_10.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!sc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean632) {
			@Pc(10) Class143 local10 = this.aClass143_10;
			@Pc(18) Class6_Sub4_Sub9_Sub2 local18;
			synchronized (this.aClass143_10) {
				local18 = (Class6_Sub4_Sub9_Sub2) this.aClass143_10.method3836();
				if (local18 == null) {
					try {
						this.aClass143_10.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt8476--;
			}
			try {
				if (local18.anInt9636 == 2) {
					local18.aClass266_6.method6527(local18.aByteArray125.length, (int) local18.aLong247, local18.aByteArray125);
				} else if (local18.anInt9636 == 3) {
					local18.aByteArray125 = local18.aClass266_6.method6530((int) local18.aLong247);
				}
			} catch (@Pc(78) Exception local78) {
				Static5.method211(local78, null);
			}
			local18.aBoolean715 = false;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!qn;IB)Lclient!wh;")
	public Class6_Sub4_Sub9_Sub2 method7113(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class6_Sub4_Sub9_Sub2 local7 = new Class6_Sub4_Sub9_Sub2();
		local7.anInt9636 = 3;
		local7.aBoolean714 = false;
		local7.aClass266_6 = arg0;
		local7.aLong247 = arg1;
		this.method7119(local7);
		return local7;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[BLclient!qn;I)Lclient!wh;")
	public Class6_Sub4_Sub9_Sub2 method7115(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class266 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class6_Sub4_Sub9_Sub2 local7 = new Class6_Sub4_Sub9_Sub2();
		local7.aClass266_6 = arg1;
		local7.aBoolean714 = false;
		local7.aLong247 = arg2;
		local7.anInt9636 = 2;
		local7.aByteArray125 = arg0;
		this.method7119(local7);
		return local7;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!wh;I)V")
	private void method7119(@OriginalArg(0) Class6_Sub4_Sub9_Sub2 arg0) {
		@Pc(2) Class143 local2 = this.aClass143_10;
		synchronized (this.aClass143_10) {
			this.aClass143_10.method3835(arg0);
			this.anInt8476++;
			this.aClass143_10.notifyAll();
		}
	}
}
