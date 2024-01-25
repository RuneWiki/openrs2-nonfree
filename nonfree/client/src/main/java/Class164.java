import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class164 implements Interface4 {

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "Lclient!kr;")
	private final Class147 aClass147_2 = new Class147(256);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "Lclient!mg;")
	private final Class160 aClass160_49;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "Lclient!mg;")
	private final Class160 aClass160_50;

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "[Lclient!kf;")
	private final Class140[] aClass140Array1;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!mg;Lclient!mg;Lclient!mg;)V")
	public Class164(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_49 = arg1;
		this.aClass160_50 = arg2;
		@Pc(24) Class2_Sub23 local24 = new Class2_Sub23(arg0.method3696(0, 0));
		@Pc(28) int local28 = local24.method5500();
		this.aClass140Array1 = new Class140[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method5495() == 1) {
				this.aClass140Array1[local34] = new Class140();
			}
		}
		for (@Pc(54) int local54 = 0; local54 < local28; local54++) {
			if (this.aClass140Array1[local54] != null) {
				this.aClass140Array1[local54].aBoolean293 = local24.method5495() == 0;
			}
		}
		for (@Pc(83) int local83 = 0; local83 < local28; local83++) {
			if (this.aClass140Array1[local83] != null) {
				this.aClass140Array1[local83].aBoolean290 = local24.method5495() == 1;
			}
		}
		for (@Pc(111) int local111 = 0; local111 < local28; local111++) {
			if (this.aClass140Array1[local111] != null) {
				this.aClass140Array1[local111].aBoolean286 = local24.method5495() == 1;
			}
		}
		for (@Pc(139) int local139 = 0; local139 < local28; local139++) {
			if (this.aClass140Array1[local139] != null) {
				this.aClass140Array1[local139].aBoolean289 = local24.method5495() == 1;
			}
		}
		for (@Pc(169) int local169 = 0; local169 < local28; local169++) {
			if (this.aClass140Array1[local169] != null) {
				this.aClass140Array1[local169].aByte65 = local24.method5484();
			}
		}
		for (@Pc(194) int local194 = 0; local194 < local28; local194++) {
			if (this.aClass140Array1[local194] != null) {
				this.aClass140Array1[local194].aByte59 = local24.method5484();
			}
		}
		for (@Pc(215) int local215 = 0; local215 < local28; local215++) {
			if (this.aClass140Array1[local215] != null) {
				this.aClass140Array1[local215].aByte62 = local24.method5484();
			}
		}
		for (@Pc(236) int local236 = 0; local236 < local28; local236++) {
			if (this.aClass140Array1[local236] != null) {
				this.aClass140Array1[local236].aByte61 = local24.method5484();
			}
		}
		for (@Pc(257) int local257 = 0; local257 < local28; local257++) {
			if (this.aClass140Array1[local257] != null) {
				this.aClass140Array1[local257].aShort44 = (short) local24.method5500();
			}
		}
		for (@Pc(279) int local279 = 0; local279 < local28; local279++) {
			if (this.aClass140Array1[local279] != null) {
				this.aClass140Array1[local279].aByte60 = local24.method5484();
			}
		}
		for (@Pc(304) int local304 = 0; local304 < local28; local304++) {
			if (this.aClass140Array1[local304] != null) {
				this.aClass140Array1[local304].aByte63 = local24.method5484();
			}
		}
		for (@Pc(329) int local329 = 0; local329 < local28; local329++) {
			if (this.aClass140Array1[local329] != null) {
				this.aClass140Array1[local329].aBoolean292 = local24.method5495() == 1;
			}
		}
		for (@Pc(361) int local361 = 0; local361 < local28; local361++) {
			if (this.aClass140Array1[local361] != null) {
				this.aClass140Array1[local361].aBoolean287 = local24.method5495() == 1;
			}
		}
		for (@Pc(389) int local389 = 0; local389 < local28; local389++) {
			if (this.aClass140Array1[local389] != null) {
				this.aClass140Array1[local389].aByte64 = local24.method5484();
			}
		}
		for (@Pc(410) int local410 = 0; local410 < local28; local410++) {
			if (this.aClass140Array1[local410] != null) {
				this.aClass140Array1[local410].aBoolean294 = local24.method5495() == 1;
			}
		}
		for (@Pc(438) int local438 = 0; local438 < local28; local438++) {
			if (this.aClass140Array1[local438] != null) {
				this.aClass140Array1[local438].aBoolean291 = local24.method5495() == 1;
			}
		}
		for (@Pc(466) int local466 = 0; local466 < local28; local466++) {
			if (this.aClass140Array1[local466] != null) {
				this.aClass140Array1[local466].aBoolean288 = local24.method5495() == 1;
			}
		}
		for (@Pc(496) int local496 = 0; local496 < local28; local496++) {
			if (this.aClass140Array1[local496] != null) {
				this.aClass140Array1[local496].anInt3820 = local24.method5495();
			}
		}
		for (@Pc(517) int local517 = 0; local517 < local28; local517++) {
			if (this.aClass140Array1[local517] != null) {
				this.aClass140Array1[local517].anInt3819 = local24.method5508();
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(FIIZII)[F")
	@Override
	public float[] method3793(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method3796(arg2).method1165(this, this.aClass160_50, this.aClass140Array1[arg2].aBoolean287, arg3, arg1);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBIZFI)[I")
	@Override
	public int[] method3791(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method3796(arg1).method1164(arg3, this.aClass160_50, (double) arg2, arg0, this.aClass140Array1[arg1].aBoolean287, this);
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)Lclient!kf;")
	@Override
	public Class140 method3794(@OriginalArg(1) int arg0) {
		return this.aClass140Array1[arg0];
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(II)Lclient!dd;")
	private Class2_Sub5_Sub4 method3796(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub5 local10 = this.aClass147_2.method3340((long) arg0);
		if (local10 != null) {
			return (Class2_Sub5_Sub4) local10;
		}
		@Pc(21) byte[] local21 = this.aClass160_49.method3711(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(38) Class2_Sub5_Sub4 local38 = new Class2_Sub5_Sub4(new Class2_Sub23(local21));
			this.aClass147_2.method3336(local38, (long) arg0);
			return local38;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIZFZI)[I")
	@Override
	public int[] method3790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		return this.method3796(arg1).method1162(this, arg3, arg4, (double) arg2, arg0, this.aClass160_50, this.aClass140Array1[arg1].aBoolean287);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3792(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub5_Sub4 local13 = this.method3796(arg0);
		return local13 != null && local13.method1166(this, this.aClass160_50);
	}
}
