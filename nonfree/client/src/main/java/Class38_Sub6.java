import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class38_Sub6 extends Class38 {

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
	public int anInt4407;

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
	public int anInt4408;

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
	public int anInt4409;

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
	public int anInt4411;

	@OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
	public int anInt4412;

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
	public int anInt4405 = 0;

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "Z")
	public boolean aBoolean368 = false;

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "Z")
	private boolean aBoolean369 = false;

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "Lclient!os;")
	private Class184 aClass184_3 = new Class184();

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
	private int anInt4406 = 0;

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "Lclient!wl;")
	public Class265 aClass265_33 = new Class265();

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "Z")
	private boolean aBoolean370 = false;

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
	private int anInt4410 = 0;

	@OriginalMember(owner = "client!lr", name = "y", descriptor = "Lclient!pm;")
	public final Class192 aClass192_2 = new Class192();

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "[Lclient!cv;")
	public Class38_Sub2_Sub1_Sub1[] aClass38_Sub2_Sub1_Sub1Array1 = new Class38_Sub2_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "J")
	private long aLong131;

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "J")
	private long aLong130;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(I)V")
	public Class38_Sub6(@OriginalArg(0) int arg0) {
		Static384.aClass184_7.method4207(this);
		this.aLong131 = arg0;
		this.aLong130 = arg0;
		this.aBoolean370 = true;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(J)V")
	public void method3544(@OriginalArg(0) long arg0) {
		this.aLong131 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "()V")
	public void method3545() {
		this.aClass192_2.aClass114_1.method2573();
		for (@Pc(10) Class38_Sub5 local10 = (Class38_Sub5) this.aClass184_3.method4212(); local10 != null; local10 = (Class38_Sub5) this.aClass184_3.method4215()) {
			local10.method2832(this.aLong130);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!qa;[Lclient!qm;Z)V")
	private void method3546(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class202[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static232.aBooleanArray34[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class38_Sub5 local16 = (Class38_Sub5) this.aClass184_3.method4212(); local16 != null; local16 = (Class38_Sub5) this.aClass184_3.method4215()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass202_1 == arg1[local21] || local16.aClass202_1 == arg1[local21].aClass202_2) {
						Static232.aBooleanArray34[local21] = true;
						local16.method2831();
						local16.aBoolean300 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt3541 == 0) {
				local16.method5069();
				this.anInt4406--;
			} else {
				local16.aBoolean300 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt4406 != 8; local21++) {
			if (!Static232.aBooleanArray34[local21]) {
				@Pc(101) Class38_Sub5 local101 = new Class38_Sub5(arg0, arg1[local21], this, this.aLong131);
				this.aClass184_3.method4207(local101);
				this.anInt4406++;
				Static232.aBooleanArray34[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "()V")
	private void method3547() {
		this.aBoolean369 = false;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "()V")
	public void method3548() {
		this.aBoolean369 = true;
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "()Lclient!pm;")
	public Class192 method3549() {
		return this.aClass192_2;
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "()V")
	public void method3550() {
		this.aBoolean368 = true;
		for (@Pc(8) Class2_Sub2_Sub8 local8 = (Class2_Sub2_Sub8) this.aClass265_33.method6005(); local8 != null; local8 = (Class2_Sub2_Sub8) this.aClass265_33.method6001()) {
			if (local8.aClass27_1.anInt980 == 1) {
				local8.method5934();
			}
		}
		this.aClass38_Sub2_Sub1_Sub1Array1 = new Class38_Sub2_Sub1_Sub1[8192];
		this.anInt4405 = 0;
		this.aClass184_3 = new Class184();
		this.anInt4406 = 0;
		this.aClass265_33 = new Class265();
		this.anInt4410 = 0;
		this.method5069();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!qa;J)Z")
	public boolean method3552(@OriginalArg(0) Class26 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong131 == this.aLong130) {
			this.method3547();
		} else {
			this.method3548();
		}
		if (arg1 - this.aLong131 > 750L) {
			this.method3550();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong130);
		@Pc(36) Class38_Sub5 local36;
		if (this.aBoolean370) {
			for (local36 = (Class38_Sub5) this.aClass184_3.method4212(); local36 != null; local36 = (Class38_Sub5) this.aClass184_3.method4215()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass6_1.anInt172; local39++) {
					local36.method2833(arg0, !this.aBoolean369, 1, arg1);
				}
			}
			this.aBoolean370 = false;
		}
		for (local36 = (Class38_Sub5) this.aClass184_3.method4212(); local36 != null; local36 = (Class38_Sub5) this.aClass184_3.method4215()) {
			local36.method2833(arg0, !this.aBoolean369, local27, arg1);
		}
		this.aLong130 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "()V")
	public void method3553() {
		this.aBoolean370 = true;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([Lclient!au;Z)V")
	private void method3554(@OriginalArg(0) Class17[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static232.aBooleanArray33[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class2_Sub2_Sub8 local16 = (Class2_Sub2_Sub8) this.aClass265_33.method6005(); local16 != null; local16 = (Class2_Sub2_Sub8) this.aClass265_33.method6001()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass17_2 == arg0[local21] || local16.aClass17_2 == arg0[local21].aClass17_1) {
						Static232.aBooleanArray33[local21] = true;
						local16.method2138();
						continue label68;
					}
				}
			}
			local16.method6072();
			this.anInt4410--;
			if (local16.method5936()) {
				local16.method5934();
				Static387.anInt6831--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt4410 != 8; local21++) {
			if (!Static232.aBooleanArray33[local21]) {
				@Pc(93) Class2_Sub2_Sub8 local93 = null;
				if (arg0[local21].method270().anInt980 == 1 && Static387.anInt6831 < 32) {
					local93 = new Class2_Sub2_Sub8(arg0[local21], this);
					Static143.aClass98_4.method1994((long) arg0[local21].anInt424, local93);
					Static387.anInt6831++;
				}
				if (local93 == null) {
					local93 = new Class2_Sub2_Sub8(arg0[local21], this);
				}
				this.aClass265_33.method5999(local93);
				this.anInt4410++;
				Static232.aBooleanArray33[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(IIIII)V")
	public void method3555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4412 = arg0;
		this.anInt4409 = arg1;
		this.anInt4407 = arg2;
		this.anInt4411 = arg3;
		this.anInt4408 = arg4;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!qa;J[Lclient!qm;[Lclient!au;Z)V")
	public void method3556(@OriginalArg(0) Class26 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class202[] arg2, @OriginalArg(3) Class17[] arg3) {
		if (!this.aBoolean368) {
			this.method3546(arg0, arg2);
			this.method3554(arg3);
			this.aLong131 = arg1;
		}
	}
}
