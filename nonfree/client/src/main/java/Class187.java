import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class187 implements Interface10 {

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "Lclient!bn;")
	private final Class24 aClass24_2 = new Class24(256);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "Lclient!ns;")
	private final Class166 aClass166_215;

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "Lclient!ns;")
	private final Class166 aClass166_216;

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "[Lclient!ij;")
	private final Class118[] aClass118Array1;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!ns;Lclient!ns;Lclient!ns;)V")
	public Class187(@OriginalArg(0) Class166 arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_215 = arg2;
		this.aClass166_216 = arg1;
		@Pc(24) Class4_Sub30 local24 = new Class4_Sub30(arg0.method3696(0, 0));
		@Pc(28) int local28 = local24.method4877();
		this.aClass118Array1 = new Class118[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method4864() == 1) {
				this.aClass118Array1[local34] = new Class118();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
			if (this.aClass118Array1[local58] != null) {
				this.aClass118Array1[local58].aBoolean233 = local24.method4864() == 0;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < local28; local87++) {
			if (this.aClass118Array1[local87] != null) {
				this.aClass118Array1[local87].aBoolean237 = local24.method4864() == 1;
			}
		}
		for (@Pc(117) int local117 = 0; local117 < local28; local117++) {
			if (this.aClass118Array1[local117] != null) {
				this.aClass118Array1[local117].aBoolean231 = local24.method4864() == 1;
			}
		}
		for (@Pc(143) int local143 = 0; local143 < local28; local143++) {
			if (this.aClass118Array1[local143] != null) {
				this.aClass118Array1[local143].aBoolean232 = local24.method4864() == 1;
			}
		}
		for (@Pc(169) int local169 = 0; local169 < local28; local169++) {
			if (this.aClass118Array1[local169] != null) {
				this.aClass118Array1[local169].aByte54 = local24.method4865();
			}
		}
		for (@Pc(194) int local194 = 0; local194 < local28; local194++) {
			if (this.aClass118Array1[local194] != null) {
				this.aClass118Array1[local194].aByte53 = local24.method4865();
			}
		}
		for (@Pc(219) int local219 = 0; local219 < local28; local219++) {
			if (this.aClass118Array1[local219] != null) {
				this.aClass118Array1[local219].aByte56 = local24.method4865();
			}
		}
		for (@Pc(240) int local240 = 0; local240 < local28; local240++) {
			if (this.aClass118Array1[local240] != null) {
				this.aClass118Array1[local240].aByte52 = local24.method4865();
			}
		}
		for (@Pc(265) int local265 = 0; local265 < local28; local265++) {
			if (this.aClass118Array1[local265] != null) {
				this.aClass118Array1[local265].aShort57 = (short) local24.method4877();
			}
		}
		for (@Pc(287) int local287 = 0; local287 < local28; local287++) {
			if (this.aClass118Array1[local287] != null) {
				this.aClass118Array1[local287].aByte55 = local24.method4865();
			}
		}
		for (@Pc(312) int local312 = 0; local312 < local28; local312++) {
			if (this.aClass118Array1[local312] != null) {
				this.aClass118Array1[local312].aByte51 = local24.method4865();
			}
		}
		for (@Pc(333) int local333 = 0; local333 < local28; local333++) {
			if (this.aClass118Array1[local333] != null) {
				this.aClass118Array1[local333].aBoolean230 = local24.method4864() == 1;
			}
		}
		for (@Pc(361) int local361 = 0; local361 < local28; local361++) {
			if (this.aClass118Array1[local361] != null) {
				this.aClass118Array1[local361].aBoolean235 = local24.method4864() == 1;
			}
		}
		for (@Pc(393) int local393 = 0; local393 < local28; local393++) {
			if (this.aClass118Array1[local393] != null) {
				this.aClass118Array1[local393].aByte57 = local24.method4865();
			}
		}
		for (@Pc(414) int local414 = 0; local414 < local28; local414++) {
			if (this.aClass118Array1[local414] != null) {
				this.aClass118Array1[local414].aBoolean234 = local24.method4864() == 1;
			}
		}
		for (@Pc(442) int local442 = 0; local442 < local28; local442++) {
			if (this.aClass118Array1[local442] != null) {
				this.aClass118Array1[local442].aBoolean238 = local24.method4864() == 1;
			}
		}
		for (@Pc(468) int local468 = 0; local468 < local28; local468++) {
			if (this.aClass118Array1[local468] != null) {
				this.aClass118Array1[local468].aBoolean236 = local24.method4864() == 1;
			}
		}
		for (@Pc(496) int local496 = 0; local496 < local28; local496++) {
			if (this.aClass118Array1[local496] != null) {
				this.aClass118Array1[local496].anInt3169 = local24.method4864();
			}
		}
		for (@Pc(517) int local517 = 0; local517 < local28; local517++) {
			if (this.aClass118Array1[local517] != null) {
				this.aClass118Array1[local517].anInt3167 = local24.method4872();
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZIIIFI)[I")
	@Override
	public int[] method4239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		return this.method4246(arg0).method3645((double) arg3, this, arg2, this.aClass166_215, this.aClass118Array1[arg0].aBoolean235, arg1);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(FIZIZI)[I")
	@Override
	public int[] method4238(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		return this.method4246(arg1).method3644(arg2, arg4, this, this.aClass118Array1[arg1].aBoolean235, (double) arg0, arg3, this.aClass166_215);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)Lclient!nn;")
	private Class4_Sub1_Sub13 method4246(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub1 local12 = this.aClass24_2.method655((long) arg0);
		if (local12 != null) {
			return (Class4_Sub1_Sub13) local12;
		}
		@Pc(28) byte[] local28 = this.aClass166_216.method3684(arg0);
		if (local28 == null) {
			return null;
		} else {
			@Pc(40) Class4_Sub1_Sub13 local40 = new Class4_Sub1_Sub13(new Class4_Sub30(local28));
			this.aClass24_2.method660(local40, (long) arg0);
			return local40;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method4242(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub1_Sub13 local13 = this.method4246(arg0);
		return local13 != null && local13.method3647(this, this.aClass166_215);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIZFI)[F")
	@Override
	public float[] method4240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method4246(arg1).method3646(this.aClass166_215, this, arg0, arg3, this.aClass118Array1[arg1].aBoolean235);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)Lclient!ij;")
	@Override
	public Class118 method4241(@OriginalArg(0) int arg0) {
		return this.aClass118Array1[arg0];
	}
}
