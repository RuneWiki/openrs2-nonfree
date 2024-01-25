import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
	public int anInt526;

	@OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
	public int anInt528;

	@OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
	public int anInt529;

	@OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
	public int anInt530;

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
	public int anInt524 = 0;

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "Lclient!jl;")
	private Class109 aClass109_1 = new Class109();

	@OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
	private int anInt525 = 0;

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "Lclient!vq;")
	public Class211 aClass211_3 = new Class211();

	@OriginalMember(owner = "client!bl", name = "C", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
	private int anInt527 = 0;

	@OriginalMember(owner = "client!bl", name = "y", descriptor = "Lclient!he;")
	public final Class90 aClass90_1 = new Class90();

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "[Lclient!bj;")
	public Class20_Sub1_Sub1_Sub1[] aClass20_Sub1_Sub1_Sub1Array1 = new Class20_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "J")
	private long aLong23;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(I)V")
	public Class20_Sub2(@OriginalArg(0) int arg0) {
		Static334.aClass109_7.method2935(this);
		this.aLong22 = arg0;
		this.aLong23 = arg0;
		this.aBoolean37 = true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
	public void method443() {
		this.aBoolean35 = true;
		for (@Pc(8) Class6_Sub2_Sub16 local8 = (Class6_Sub2_Sub16) this.aClass211_3.method5594(); local8 != null; local8 = (Class6_Sub2_Sub16) this.aClass211_3.method5582()) {
			if (local8.aClass179_1.anInt5333 == 1) {
				local8.method5761();
			}
		}
		this.aClass20_Sub1_Sub1_Sub1Array1 = new Class20_Sub1_Sub1_Sub1[8192];
		this.anInt524 = 0;
		this.aClass109_1 = new Class109();
		this.anInt525 = 0;
		this.aClass211_3 = new Class211();
		this.anInt527 = 0;
		this.method5103();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!ja;J)Z")
	public boolean method444(@OriginalArg(0) Class81 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong22 == this.aLong23) {
			this.method447();
		} else {
			this.method453();
		}
		if (arg1 - this.aLong22 > 750L) {
			this.method443();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong23);
		@Pc(36) Class20_Sub7 local36;
		if (this.aBoolean37) {
			for (local36 = (Class20_Sub7) this.aClass109_1.method2948(); local36 != null; local36 = (Class20_Sub7) this.aClass109_1.method2939()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass162_1.anInt4611; local39++) {
					local36.method3445(1, arg1, arg0, !this.aBoolean36);
				}
			}
			this.aBoolean37 = false;
		}
		for (local36 = (Class20_Sub7) this.aClass109_1.method2948(); local36 != null; local36 = (Class20_Sub7) this.aClass109_1.method2939()) {
			local36.method3445(local27, arg1, arg0, !this.aBoolean36);
		}
		this.aLong23 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!ja;[Lclient!oo;Z)V")
	private void method445(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class157[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static26.aBooleanArray8[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class20_Sub7 local16 = (Class20_Sub7) this.aClass109_1.method2948(); local16 != null; local16 = (Class20_Sub7) this.aClass109_1.method2939()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass157_1 == arg1[local21] || local16.aClass157_1 == arg1[local21].aClass157_2) {
						Static26.aBooleanArray8[local21] = true;
						local16.method3446();
						local16.aBoolean243 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt3348 == 0) {
				local16.method5103();
				this.anInt525--;
			} else {
				local16.aBoolean243 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt525 != 8; local21++) {
			if (!Static26.aBooleanArray8[local21]) {
				@Pc(101) Class20_Sub7 local101 = new Class20_Sub7(arg0, arg1[local21], this, this.aLong22);
				this.aClass109_1.method2935(local101);
				this.anInt525++;
				Static26.aBooleanArray8[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!ja;J[Lclient!oo;[Lclient!bo;Z)V")
	public void method446(@OriginalArg(0) Class81 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class157[] arg2, @OriginalArg(3) Class22[] arg3) {
		if (!this.aBoolean35) {
			this.method445(arg0, arg2);
			this.method455(arg3);
			this.aLong22 = arg1;
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "()V")
	private void method447() {
		this.aBoolean36 = false;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "()V")
	public void method448() {
		this.aClass90_1.aClass59_1.method1263();
		for (@Pc(10) Class20_Sub7 local10 = (Class20_Sub7) this.aClass109_1.method2948(); local10 != null; local10 = (Class20_Sub7) this.aClass109_1.method2939()) {
			local10.method3447(this.aLong23);
		}
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "()Lclient!he;")
	public Class90 method449() {
		return this.aClass90_1;
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "()V")
	public void method450() {
		this.aBoolean37 = true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V")
	public void method451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt530 = arg0;
		this.anInt526 = arg1;
		this.anInt528 = arg3;
		this.anInt529 = arg4;
	}

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "()V")
	public void method453() {
		this.aBoolean36 = true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(J)V")
	public void method454(@OriginalArg(0) long arg0) {
		this.aLong22 = arg0;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([Lclient!bo;Z)V")
	private void method455(@OriginalArg(0) Class22[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static26.aBooleanArray7[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class6_Sub2_Sub16 local16 = (Class6_Sub2_Sub16) this.aClass211_3.method5594(); local16 != null; local16 = (Class6_Sub2_Sub16) this.aClass211_3.method5582()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass22_2 == arg0[local21] || local16.aClass22_2 == arg0[local21].aClass22_1) {
						Static26.aBooleanArray7[local21] = true;
						local16.method4599();
						continue label68;
					}
				}
			}
			local16.method5756();
			this.anInt527--;
			if (local16.method5765()) {
				local16.method5761();
				Static99.anInt6128--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt527 != 8; local21++) {
			if (!Static26.aBooleanArray7[local21]) {
				@Pc(93) Class6_Sub2_Sub16 local93 = null;
				if (Static152.method3080(arg0[local21].anInt560).anInt5333 == 1 && Static99.anInt6128 < 32) {
					local93 = new Class6_Sub2_Sub16(arg0[local21], this);
					Static52.aClass182_1.method4911(local93, (long) arg0[local21].anInt560);
					Static99.anInt6128++;
				}
				if (local93 == null) {
					local93 = new Class6_Sub2_Sub16(arg0[local21], this);
				}
				this.aClass211_3.method5585(local93);
				this.anInt527++;
				Static26.aBooleanArray7[local21] = true;
			}
		}
	}
}
