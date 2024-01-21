import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class2_Sub7_Sub4 extends Class2_Sub7 {

	@OriginalMember(owner = "client!u", name = "s", descriptor = "Lclient!pi;")
	private final Class67 aClass67_9 = new Class67();

	@OriginalMember(owner = "client!u", name = "t", descriptor = "Lclient!pi;")
	private final Class67 aClass67_10 = new Class67();

	@OriginalMember(owner = "client!u", name = "u", descriptor = "I")
	private int anInt4312 = 0;

	@OriginalMember(owner = "client!u", name = "v", descriptor = "I")
	private int anInt4313 = -1;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!sg;)V")
	public synchronized void method3316(@OriginalArg(0) Class2_Sub7 arg0) {
		arg0.method3556();
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method3309(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4313 < 0) {
				this.method3318(arg0);
				return;
			}
			if (this.anInt4312 + arg0 < this.anInt4313) {
				this.anInt4312 += arg0;
				this.method3318(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4313 - this.anInt4312;
			this.method3318(local29);
			arg0 -= local29;
			this.anInt4312 += local29;
			this.method3319();
			@Pc(50) Class2_Sub8 local50 = (Class2_Sub8) this.aClass67_10.method2848();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1561(this);
				if (local58 < 0) {
					local50.anInt2073 = 0;
					this.method3321(local50);
				} else {
					local50.anInt2073 = local58;
					this.method3317(local50.aClass2_218, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "()I")
	@Override
	public int method3311() {
		return 0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!vd;Lclient!ha;)V")
	private void method3317(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub8 arg1) {
		while (arg0 != this.aClass67_10.aClass2_165 && ((Class2_Sub8) arg0).anInt2073 <= arg1.anInt2073) {
			arg0 = arg0.aClass2_218;
		}
		this.aClass67_10.method2846(arg0, arg1);
		this.anInt4313 = ((Class2_Sub8) this.aClass67_10.aClass2_165.aClass2_218).anInt2073;
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
	private void method3318(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub7 local5 = (Class2_Sub7) this.aClass67_9.method2848(); local5 != null; local5 = (Class2_Sub7) this.aClass67_9.method2851()) {
			local5.method3309(arg0);
		}
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "()V")
	private void method3319() {
		if (this.anInt4312 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub8 local8 = (Class2_Sub8) this.aClass67_10.method2848(); local8 != null; local8 = (Class2_Sub8) this.aClass67_10.method2851()) {
			local8.anInt2073 -= this.anInt4312;
		}
		this.anInt4313 -= this.anInt4312;
		this.anInt4312 = 0;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "()Lclient!sg;")
	@Override
	public Class2_Sub7 method3313() {
		return (Class2_Sub7) this.aClass67_9.method2848();
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "()Lclient!sg;")
	@Override
	public Class2_Sub7 method3314() {
		return (Class2_Sub7) this.aClass67_9.method2851();
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "([III)V")
	private void method3320(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub7 local5 = (Class2_Sub7) this.aClass67_9.method2848(); local5 != null; local5 = (Class2_Sub7) this.aClass67_9.method2851()) {
			local5.method3315(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3312(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4313 < 0) {
				this.method3320(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4312 + arg2 < this.anInt4313) {
				this.anInt4312 += arg2;
				this.method3320(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4313 - this.anInt4312;
			this.method3320(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4312 += local33;
			this.method3319();
			@Pc(60) Class2_Sub8 local60 = (Class2_Sub8) this.aClass67_10.method2848();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1561(this);
				if (local68 < 0) {
					local60.anInt2073 = 0;
					this.method3321(local60);
				} else {
					local60.anInt2073 = local68;
					this.method3317(local60.aClass2_218, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ha;)V")
	private void method3321(@OriginalArg(0) Class2_Sub8 arg0) {
		arg0.method3556();
		arg0.method1560();
		@Pc(9) Class2 local9 = this.aClass67_10.aClass2_165.aClass2_218;
		if (local9 == this.aClass67_10.aClass2_165) {
			this.anInt4313 = -1;
		} else {
			this.anInt4313 = ((Class2_Sub8) local9).anInt2073;
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(Lclient!sg;)V")
	public synchronized void method3322(@OriginalArg(0) Class2_Sub7 arg0) {
		this.aClass67_9.method2845(arg0);
	}
}
