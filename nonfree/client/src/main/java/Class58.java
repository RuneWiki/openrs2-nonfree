import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class58 implements Runnable {

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "Lclient!em;")
	private final Class71 aClass71_2 = new Class71();

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
	public int anInt1265 = 0;

	@OriginalMember(owner = "client!dp", name = "k", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!dp", name = "l", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	static {
		new Class231("Player ", "Spieler ", "Joueur ", "Jogador ");
	}

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!pb;)V")
	public Class58(@OriginalArg(0) Class194 arg0) {
		@Pc(20) Class136 local20 = arg0.method4393(this, 5);
		while (local20.anInt3418 == 0) {
			Static167.method6157(10L);
		}
		if (local20.anInt3418 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject10;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IBLclient!bh;)Lclient!is;")
	public Class2_Sub1_Sub7_Sub1 method1157(@OriginalArg(0) int arg0, @OriginalArg(2) Class24 arg1) {
		@Pc(18) Class2_Sub1_Sub7_Sub1 local18 = new Class2_Sub1_Sub7_Sub1();
		local18.anInt3276 = 1;
		@Pc(24) Class71 local24 = this.aClass71_2;
		synchronized (this.aClass71_2) {
			@Pc(32) Class2_Sub1_Sub7_Sub1 local32 = (Class2_Sub1_Sub7_Sub1) this.aClass71_2.method1431();
			while (true) {
				if (local32 == null) {
					break;
				}
				if (local32.aLong378 == (long) arg0 && arg1 == local32.aClass24_1 && local32.anInt3276 == 2) {
					local18.aBoolean225 = false;
					local18.aByteArray41 = local32.aByteArray41;
					return local18;
				}
				local32 = (Class2_Sub1_Sub7_Sub1) this.aClass71_2.method1428();
			}
		}
		local18.aByteArray41 = arg1.method470(arg0);
		local18.aBoolean226 = true;
		local18.aBoolean225 = false;
		return local18;
	}

	@OriginalMember(owner = "client!dp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean68) {
			@Pc(6) Class71 local6 = this.aClass71_2;
			@Pc(14) Class2_Sub1_Sub7_Sub1 local14;
			synchronized (this.aClass71_2) {
				local14 = (Class2_Sub1_Sub7_Sub1) this.aClass71_2.method1434();
				if (local14 == null) {
					try {
						this.aClass71_2.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt1265--;
			}
			try {
				if (local14.anInt3276 == 2) {
					local14.aClass24_1.method468((int) local14.aLong378, local14.aByteArray41.length, local14.aByteArray41);
				} else if (local14.anInt3276 == 3) {
					local14.aByteArray41 = local14.aClass24_1.method470((int) local14.aLong378);
				}
			} catch (@Pc(74) Exception local74) {
				Static22.method402(local74, null);
			}
			local14.aBoolean225 = false;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!is;)V")
	private void method1159(@OriginalArg(1) Class2_Sub1_Sub7_Sub1 arg0) {
		@Pc(2) Class71 local2 = this.aClass71_2;
		synchronized (this.aClass71_2) {
			this.aClass71_2.method1430(arg0);
			this.anInt1265++;
			this.aClass71_2.notifyAll();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	public void method1160() {
		this.aBoolean68 = true;
		@Pc(9) Class71 local9 = this.aClass71_2;
		synchronized (this.aClass71_2) {
			this.aClass71_2.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!bh;II[B)Lclient!is;")
	public Class2_Sub1_Sub7_Sub1 method1161(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(12) Class2_Sub1_Sub7_Sub1 local12 = new Class2_Sub1_Sub7_Sub1();
		local12.aByteArray41 = arg2;
		local12.aBoolean226 = false;
		local12.aClass24_1 = arg0;
		local12.aLong378 = arg1;
		local12.anInt3276 = 2;
		this.method1159(local12);
		return local12;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BILclient!bh;)Lclient!is;")
	public Class2_Sub1_Sub7_Sub1 method1162(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		@Pc(7) Class2_Sub1_Sub7_Sub1 local7 = new Class2_Sub1_Sub7_Sub1();
		local7.anInt3276 = 3;
		local7.aLong378 = arg0;
		local7.aBoolean226 = false;
		local7.aClass24_1 = arg1;
		this.method1159(local7);
		return local7;
	}
}
