import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class137 {

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	private int anInt3729;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
	private int anInt3732;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "Lclient!fd;")
	private Class103 aClass103_16;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Z")
	private boolean aBoolean266 = true;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	private int anInt3726 = -1;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	private final int anInt3736;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
	private final int anInt3731;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "[Lclient!cm;")
	private final Class57[] aClass57Array2;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	private final int anInt3734;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
	private final int anInt3728;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "Lclient!cm;")
	private final Class57 aClass57_1;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "[Lclient!cm;")
	private final Class57[] aClass57Array1;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I[Lclient!cm;IIII)V")
	public Class137(@OriginalArg(0) int arg0, @OriginalArg(1) Class57[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3736 = arg3;
		this.anInt3731 = arg4;
		this.aClass57Array2 = arg1;
		this.anInt3734 = arg5;
		this.anInt3728 = arg0;
		if (arg1 == null) {
			this.aClass57_1 = null;
			this.aClass57Array1 = null;
		} else {
			this.aClass57Array1 = new Class57[arg1.length];
			this.aClass57_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIILclient!ha;III)V")
	public void method3189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class82 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg7 + arg8 & 0x3FFF;
		if (this.anInt3728 == -1 || this.anInt3729 == 0) {
			arg5.aa(arg1, arg2, arg3, arg6, arg4, 0);
		} else {
			@Pc(27) Class355 local27 = Static549.anInterface5_11.method4129(this.anInt3728);
			if (this.aClass103_16 == null && Static549.anInterface5_11.method4130(this.anInt3728)) {
				@Pc(68) int[] local68 = local27.anInt9790 == 2 ? Static549.anInterface5_11.method4131(this.anInt3729, this.anInt3729, this.anInt3728, 0.7F) : Static549.anInterface5_11.method4127(this.anInt3728, 0.7F, this.anInt3729, this.anInt3729, false);
				this.aClass103_16 = arg5.method6112(this.anInt3729, local68, this.anInt3729, this.anInt3729);
			}
			if (local27.anInt9790 == 2) {
				arg5.aa(arg1, arg2, arg3, arg6, arg4, 0);
			}
			if (this.aClass103_16 != null) {
				@Pc(106) int local106 = local27.anInt9790 == 2 ? 1 : 0;
				@Pc(112) int local112 = arg6 * arg0 / -4096;
				@Pc(124) int local124;
				for (local124 = arg6 * local11 / 4096 + (arg3 - arg6) / 2; local124 > arg6; local124 -= arg6) {
				}
				while (local124 < 0) {
					local124 += arg6;
				}
				while (arg6 < local112) {
					local112 -= arg6;
				}
				while (local112 < 0) {
					local112 += arg6;
				}
				for (@Pc(162) int local162 = local124 - arg6; local162 < arg3; local162 += arg6) {
					for (@Pc(168) int local168 = local112 - arg6; local168 < arg6; local168 += arg6) {
						this.aClass103_16.method7461(local162 + arg1, local168 + arg2, arg6, arg6, 1, 0, local106);
					}
				}
			}
		}
		for (@Pc(224) int local224 = this.anInt3732 - 1; local224 >= 0; local224--) {
			this.aClass57Array1[local224].method1338(arg5, arg1, arg2, arg3, arg6, arg0, local11);
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public void method3191() {
		if (this.aClass57Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass57Array2.length; local6++) {
				this.aClass57Array2[local6].method1333();
			}
		}
		this.aClass103_16 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!ha;)Z")
	public boolean method3192(@OriginalArg(0) int arg0, @OriginalArg(2) Class82 arg1) {
		if (arg0 != this.anInt3726) {
			this.anInt3726 = arg0;
			@Pc(21) int local21 = Static107.method1798(arg0);
			if (local21 > 512) {
				local21 = 512;
			}
			if (local21 <= 0) {
				local21 = 1;
			}
			if (this.anInt3729 != local21) {
				this.aClass103_16 = null;
				this.anInt3729 = local21;
			}
			if (this.aClass57Array2 != null) {
				this.anInt3732 = 0;
				@Pc(57) int[] local57 = new int[this.aClass57Array2.length];
				for (@Pc(59) int local59 = 0; local59 < this.aClass57Array2.length; local59++) {
					@Pc(66) Class57 local66 = this.aClass57Array2[local59];
					if (local66.method1332(this.anInt3736, this.anInt3731, this.anInt3734, this.anInt3726)) {
						local57[this.anInt3732] = local66.anInt1570;
						this.aClass57Array1[this.anInt3732++] = local66;
					}
				}
				Static211.method3296(0, this.anInt3732 - 1, this.aClass57Array1, local57);
			}
			this.aBoolean266 = true;
		}
		@Pc(119) boolean local119 = false;
		if (this.aBoolean266) {
			this.aBoolean266 = false;
			for (@Pc(130) int local130 = this.anInt3732 - 1; local130 >= 0; local130--) {
				@Pc(141) boolean local141 = this.aClass57Array1[local130].method1336(arg1, this.aClass57_1);
				this.aBoolean266 |= !local141;
				local119 |= local141;
			}
		}
		return local119;
	}
}
