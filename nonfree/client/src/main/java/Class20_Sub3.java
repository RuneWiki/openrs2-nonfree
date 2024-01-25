import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	public int anInt2749;

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
	public int anInt2751;

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
	public int anInt2752;

	@OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
	public int anInt2753;

	@OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
	public int anInt2754;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "Z")
	public boolean aBoolean199 = false;

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
	public int anInt2747 = 0;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "Lclient!um;")
	private Class248 aClass248_4 = new Class248();

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
	private int anInt2748 = 0;

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "Lclient!ub;")
	public Class244 aClass244_13 = new Class244();

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
	private int anInt2750 = 0;

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "Lclient!fm;")
	public final Class83 aClass83_2 = new Class83();

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "[Lclient!bs;")
	public Class20_Sub1_Sub1_Sub1[] aClass20_Sub1_Sub1_Sub1Array1 = new Class20_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "J")
	private long aLong79;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "J")
	private long aLong78;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I)V")
	public Class20_Sub3(@OriginalArg(0) int arg0) {
		Static73.aClass248_3.method5585(this);
		this.aLong79 = arg0;
		this.aLong78 = arg0;
		this.aBoolean201 = true;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "()V")
	public void method2124() {
		this.aBoolean199 = true;
		for (@Pc(8) Class4_Sub2_Sub12 local8 = (Class4_Sub2_Sub12) this.aClass244_13.method5263(); local8 != null; local8 = (Class4_Sub2_Sub12) this.aClass244_13.method5271()) {
			if (local8.aClass218_1.anInt5714 == 1) {
				local8.method5538();
			}
		}
		this.aClass20_Sub1_Sub1_Sub1Array1 = new Class20_Sub1_Sub1_Sub1[8192];
		this.anInt2747 = 0;
		this.aClass248_4 = new Class248();
		this.anInt2748 = 0;
		this.aClass244_13 = new Class244();
		this.anInt2750 = 0;
		this.method5771();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ya;J[Lclient!ew;[Lclient!fs;Z)V")
	public void method2125(@OriginalArg(0) Class135 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class76[] arg2, @OriginalArg(3) Class88[] arg3) {
		if (!this.aBoolean199) {
			this.method2134(arg0, arg2);
			this.method2133(arg3);
			this.aLong79 = arg1;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "()V")
	public void method2126() {
		this.aClass83_2.aClass203_1.method4066();
		for (@Pc(10) Class20_Sub6 local10 = (Class20_Sub6) this.aClass248_4.method5583(); local10 != null; local10 = (Class20_Sub6) this.aClass248_4.method5577()) {
			local10.method3838(this.aLong78);
		}
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "()V")
	public void method2127() {
		this.aBoolean200 = true;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(J)V")
	public void method2128(@OriginalArg(0) long arg0) {
		this.aLong79 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "()Lclient!fm;")
	public Class83 method2129() {
		return this.aClass83_2;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ya;J)Z")
	public boolean method2130(@OriginalArg(0) Class135 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong79 == this.aLong78) {
			this.method2135();
		} else {
			this.method2127();
		}
		if (arg1 - this.aLong79 > 750L) {
			this.method2124();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong78);
		@Pc(36) Class20_Sub6 local36;
		if (this.aBoolean201) {
			for (local36 = (Class20_Sub6) this.aClass248_4.method5583(); local36 != null; local36 = (Class20_Sub6) this.aClass248_4.method5577()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass132_1.anInt3251; local39++) {
					local36.method3840(!this.aBoolean200, 1, arg1, arg0);
				}
			}
			this.aBoolean201 = false;
		}
		for (local36 = (Class20_Sub6) this.aClass248_4.method5583(); local36 != null; local36 = (Class20_Sub6) this.aClass248_4.method5577()) {
			local36.method3840(!this.aBoolean200, local27, arg1, arg0);
		}
		this.aLong78 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "()V")
	public void method2131() {
		this.aBoolean201 = true;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([Lclient!fs;Z)V")
	private void method2133(@OriginalArg(0) Class88[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static152.aBooleanArray14[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class4_Sub2_Sub12 local16 = (Class4_Sub2_Sub12) this.aClass244_13.method5263(); local16 != null; local16 = (Class4_Sub2_Sub12) this.aClass244_13.method5271()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass88_2 == arg0[local21] || local16.aClass88_2 == arg0[local21].aClass88_1) {
						Static152.aBooleanArray14[local21] = true;
						local16.method3164();
						continue label68;
					}
				}
			}
			local16.method6059();
			this.anInt2750--;
			if (local16.method5539()) {
				local16.method5538();
				Static364.anInt6038--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt2750 != 8; local21++) {
			if (!Static152.aBooleanArray14[local21]) {
				@Pc(93) Class4_Sub2_Sub12 local93 = null;
				if (arg0[local21].method1696().anInt5714 == 1 && Static364.anInt6038 < 32) {
					local93 = new Class4_Sub2_Sub12(arg0[local21], this);
					Static52.aClass225_1.method4680((long) arg0[local21].anInt2136, local93);
					Static364.anInt6038++;
				}
				if (local93 == null) {
					local93 = new Class4_Sub2_Sub12(arg0[local21], this);
				}
				this.aClass244_13.method5273(local93);
				this.anInt2750++;
				Static152.aBooleanArray14[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ya;[Lclient!ew;Z)V")
	private void method2134(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class76[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static152.aBooleanArray13[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class20_Sub6 local16 = (Class20_Sub6) this.aClass248_4.method5583(); local16 != null; local16 = (Class20_Sub6) this.aClass248_4.method5577()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass76_2 == arg1[local21] || local16.aClass76_2 == arg1[local21].aClass76_1) {
						Static152.aBooleanArray13[local21] = true;
						local16.method3839();
						local16.aBoolean351 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt4810 == 0) {
				local16.method5771();
				this.anInt2748--;
			} else {
				local16.aBoolean351 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt2748 != 8; local21++) {
			if (!Static152.aBooleanArray13[local21]) {
				@Pc(101) Class20_Sub6 local101 = new Class20_Sub6(arg0, arg1[local21], this, this.aLong79);
				this.aClass248_4.method5585(local101);
				this.anInt2748++;
				Static152.aBooleanArray13[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "()V")
	private void method2135() {
		this.aBoolean200 = false;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V")
	public void method2136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2753 = arg0;
		this.anInt2749 = arg1;
		this.anInt2751 = arg2;
		this.anInt2752 = arg3;
		this.anInt2754 = arg4;
	}
}
