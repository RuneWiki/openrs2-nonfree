import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class4_Sub2_Sub3 extends Class4_Sub2 {

	@OriginalMember(owner = "client!h", name = "u", descriptor = "Lclient!tb;")
	private final Class70 aClass70_8 = new Class70();

	@OriginalMember(owner = "client!h", name = "v", descriptor = "Lclient!tb;")
	private final Class70 aClass70_9 = new Class70();

	@OriginalMember(owner = "client!h", name = "w", descriptor = "I")
	private int anInt1125 = 0;

	@OriginalMember(owner = "client!h", name = "x", descriptor = "I")
	private int anInt1126 = -1;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()I")
	@Override
	public int method965() {
		return 0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!oc;)V")
	public synchronized void method749(@OriginalArg(0) Class4_Sub2 arg0) {
		this.aClass70_8.method1927(arg0);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Lclient!oc;)V")
	public synchronized void method750(@OriginalArg(0) Class4_Sub2 arg0) {
		arg0.method2124();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!cb;Lclient!wc;)V")
	private void method751(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub23 arg1) {
		while (arg0 != this.aClass70_9.aClass4_109 && ((Class4_Sub23) arg0).anInt3012 <= arg1.anInt3012) {
			arg0 = arg0.aClass4_123;
		}
		this.aClass70_9.method1929(arg1, arg0);
		this.anInt1126 = ((Class4_Sub23) this.aClass70_9.aClass4_109.aClass4_123).anInt3012;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "()Lclient!oc;")
	@Override
	public Class4_Sub2 method967() {
		return (Class4_Sub2) this.aClass70_8.method1936();
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method968(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1126 < 0) {
				this.method753(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1125 + arg2 < this.anInt1126) {
				this.anInt1125 += arg2;
				this.method753(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1126 - this.anInt1125;
			this.method753(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1125 += local33;
			this.method752();
			@Pc(60) Class4_Sub23 local60 = (Class4_Sub23) this.aClass70_9.method1939();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2130(this);
				if (local68 < 0) {
					local60.anInt3012 = 0;
					this.method755(local60);
				} else {
					local60.anInt3012 = local68;
					this.method751(local60.aClass4_123, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "()V")
	private void method752() {
		if (this.anInt1125 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub23 local8 = (Class4_Sub23) this.aClass70_9.method1939(); local8 != null; local8 = (Class4_Sub23) this.aClass70_9.method1936()) {
			local8.anInt3012 -= this.anInt1125;
		}
		this.anInt1126 -= this.anInt1125;
		this.anInt1125 = 0;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method964(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1126 < 0) {
				this.method754(arg0);
				return;
			}
			if (this.anInt1125 + arg0 < this.anInt1126) {
				this.anInt1125 += arg0;
				this.method754(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1126 - this.anInt1125;
			this.method754(local29);
			arg0 -= local29;
			this.anInt1125 += local29;
			this.method752();
			@Pc(50) Class4_Sub23 local50 = (Class4_Sub23) this.aClass70_9.method1939();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2130(this);
				if (local58 < 0) {
					local50.anInt3012 = 0;
					this.method755(local50);
				} else {
					local50.anInt3012 = local58;
					this.method751(local50.aClass4_123, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "([III)V")
	private void method753(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub2 local5 = (Class4_Sub2) this.aClass70_8.method1939(); local5 != null; local5 = (Class4_Sub2) this.aClass70_8.method1936()) {
			local5.method966(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
	private void method754(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub2 local5 = (Class4_Sub2) this.aClass70_8.method1939(); local5 != null; local5 = (Class4_Sub2) this.aClass70_8.method1936()) {
			local5.method964(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "()Lclient!oc;")
	@Override
	public Class4_Sub2 method969() {
		return (Class4_Sub2) this.aClass70_8.method1939();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!wc;)V")
	private void method755(@OriginalArg(0) Class4_Sub23 arg0) {
		arg0.method2124();
		arg0.method2131();
		@Pc(9) Class4 local9 = this.aClass70_9.aClass4_109.aClass4_123;
		if (local9 == this.aClass70_9.aClass4_109) {
			this.anInt1126 = -1;
		} else {
			this.anInt1126 = ((Class4_Sub23) local9).anInt3012;
		}
	}
}
