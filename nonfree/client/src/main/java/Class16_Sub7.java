import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class16_Sub7 extends Class16 {

	@OriginalMember(owner = "client!od", name = "m", descriptor = "J")
	private long aLong177;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!od", name = "x", descriptor = "I")
	public int anInt6874;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "Z")
	private boolean aBoolean487 = false;

	@OriginalMember(owner = "client!od", name = "p", descriptor = "Z")
	public boolean aBoolean488 = false;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "I")
	public int anInt6872 = 0;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "Lclient!an;")
	private Class19 aClass19_7 = new Class19();

	@OriginalMember(owner = "client!od", name = "t", descriptor = "I")
	private int anInt6873 = 0;

	@OriginalMember(owner = "client!od", name = "u", descriptor = "Lclient!fh;")
	public Class114 aClass114_35 = new Class114();

	@OriginalMember(owner = "client!od", name = "w", descriptor = "Z")
	public boolean aBoolean489 = false;

	@OriginalMember(owner = "client!od", name = "z", descriptor = "I")
	private int anInt6875 = 0;

	@OriginalMember(owner = "client!od", name = "y", descriptor = "Z")
	private boolean aBoolean490 = false;

	@OriginalMember(owner = "client!od", name = "v", descriptor = "Lclient!fl;")
	public final Class119 aClass119_1 = new Class119();

	@OriginalMember(owner = "client!od", name = "l", descriptor = "[Lclient!vp;")
	public final Class16_Sub6_Sub1_Sub1[] aClass16_Sub6_Sub1_Sub1Array2 = new Class16_Sub6_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IZ)V")
	public Class16_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method5994(arg0, arg1);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method5979(@OriginalArg(0) Class13 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong177 == this.aLong178) {
			this.method5986();
		} else {
			this.method5990();
		}
		if (arg1 - this.aLong177 > 750L) {
			this.method5988();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong178);
		@Pc(36) Class16_Sub2 local36;
		if (this.aBoolean490) {
			for (local36 = (Class16_Sub2) this.aClass19_7.method562(); local36 != null; local36 = (Class16_Sub2) this.aClass19_7.method558()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass40_1.anInt1255; local39++) {
					local36.method2578(arg0, 1, arg1, !this.aBoolean487);
				}
			}
			this.aBoolean490 = false;
		}
		for (local36 = (Class16_Sub2) this.aClass19_7.method562(); local36 != null; local36 = (Class16_Sub2) this.aClass19_7.method558()) {
			local36.method2578(arg0, local27, arg1, !this.aBoolean487);
		}
		this.aLong178 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([Lclient!hv;Z)V")
	private void method5980(@OriginalArg(0) Class156[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static401.aBooleanArray19[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class2_Sub7_Sub8 local16 = (Class2_Sub7_Sub8) this.aClass114_35.method2772(); local16 != null; local16 = (Class2_Sub7_Sub8) this.aClass114_35.method2762()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass156_2 == arg0[local21] || local16.aClass156_2 == arg0[local21].aClass156_1) {
						Static401.aBooleanArray19[local21] = true;
						local16.method5200();
						continue label71;
					}
				}
			}
			local16.method8920();
			this.anInt6875--;
			if (local16.method8503()) {
				local16.method8504();
				Static257.anInt4846--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt6875 != 8; local21++) {
			if (!Static401.aBooleanArray19[local21]) {
				@Pc(96) Class2_Sub7_Sub8 local96 = null;
				if (arg0[local21].method3622().anInt5480 == 1 && Static257.anInt4846 < 32) {
					local96 = new Class2_Sub7_Sub8(arg0[local21], this);
					Static355.aClass261_1.method6092((long) arg0[local21].anInt4161, local96);
					Static257.anInt4846++;
				}
				if (local96 == null) {
					local96 = new Class2_Sub7_Sub8(arg0[local21], this);
				}
				this.aClass114_35.method2771(local96);
				this.anInt6875++;
				Static401.aBooleanArray19[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ha;J[Lclient!qi;[Lclient!hv;Z)V")
	public void method5981(@OriginalArg(0) Class13 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class287[] arg2, @OriginalArg(3) Class156[] arg3) {
		if (!this.aBoolean488) {
			this.method5984(arg0, arg2);
			this.method5980(arg3);
			this.aLong177 = arg1;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()Lclient!fl;")
	public Class119 method5982() {
		return this.aClass119_1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ha;[Lclient!qi;Z)V")
	private void method5984(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class287[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static401.aBooleanArray18[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class16_Sub2 local16 = (Class16_Sub2) this.aClass19_7.method562(); local16 != null; local16 = (Class16_Sub2) this.aClass19_7.method558()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass287_1 == arg1[local21] || local16.aClass287_1 == arg1[local21].aClass287_2) {
						Static401.aBooleanArray18[local21] = true;
						local16.method2582();
						local16.aBoolean234 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt2995 == 0) {
				local16.method8874();
				this.anInt6873--;
			} else {
				local16.aBoolean234 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt6873 != 32; local21++) {
			if (!Static401.aBooleanArray18[local21]) {
				@Pc(104) Class16_Sub2 local104 = new Class16_Sub2(arg0, arg1[local21], this, this.aLong177);
				this.aClass19_7.method566(local104);
				this.anInt6873++;
				Static401.aBooleanArray18[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
	public void method5985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6874 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "()V")
	private void method5986() {
		this.aBoolean487 = false;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(J)V")
	public void method5987(@OriginalArg(0) long arg0) {
		this.aLong177 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "()V")
	public void method5988() {
		this.aBoolean488 = true;
		for (@Pc(8) Class2_Sub7_Sub8 local8 = (Class2_Sub7_Sub8) this.aClass114_35.method2772(); local8 != null; local8 = (Class2_Sub7_Sub8) this.aClass114_35.method2762()) {
			if (local8.aClass206_1.anInt5480 == 1) {
				local8.method8504();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass16_Sub6_Sub1_Sub1Array2.length; local27++) {
			if (this.aClass16_Sub6_Sub1_Sub1Array2[local27] != null) {
				this.aClass16_Sub6_Sub1_Sub1Array2[local27].method8610();
				this.aClass16_Sub6_Sub1_Sub1Array2[local27] = null;
			}
		}
		this.anInt6872 = 0;
		this.aClass19_7 = new Class19();
		this.anInt6873 = 0;
		this.aClass114_35 = new Class114();
		this.anInt6875 = 0;
		this.method8874();
		Static629.aClass16_Sub7Array1[Static141.anInt2982] = this;
		Static141.anInt2982 = Static141.anInt2982 + 1 & Static290.anIntArray332[Static626.anInt10188];
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "()V")
	public void method5989() {
		this.aBoolean490 = true;
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "()V")
	public void method5990() {
		this.aBoolean487 = true;
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "()Lclient!fl;")
	public Class119 method5992() {
		this.aClass119_1.aClass202_1.method4750();
		for (@Pc(6) int local6 = 0; local6 < this.aClass16_Sub6_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass16_Sub6_Sub1_Sub1Array2[local6] != null && this.aClass16_Sub6_Sub1_Sub1Array2[local6].aClass16_Sub2_1 != null) {
				this.aClass119_1.aClass202_1.method4752(this.aClass16_Sub6_Sub1_Sub1Array2[local6]);
			}
		}
		return this.aClass119_1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ha;)V")
	public void method5993(@OriginalArg(0) Class13 arg0) {
		this.aClass119_1.aClass202_1.method4750();
		for (@Pc(10) Class16_Sub2 local10 = (Class16_Sub2) this.aClass19_7.method562(); local10 != null; local10 = (Class16_Sub2) this.aClass19_7.method558()) {
			local10.method2580(arg0, this.aLong178);
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IZ)V")
	public void method5994(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static518.aClass19_9.method566(this);
		this.aLong177 = (long) arg0;
		this.aLong178 = (long) arg0;
		this.aBoolean490 = true;
		this.aBoolean489 = arg1;
	}
}
