import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public class Class71 implements Interface5 {

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!ii;")
	private Class69 aClass69_2 = new Class69(256);

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "Lclient!lc;")
	private Class98 aClass98_70;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "Lclient!lc;")
	private Class98 aClass98_69;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "[Lclient!ua;")
	private Class168[] aClass168Array2;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!lc;Lclient!lc;Lclient!lc;)V")
	protected Class71(@OriginalArg(0) Class98 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) Class98 arg2) {
		this.aClass98_70 = arg1;
		this.aClass98_69 = arg2;
		@Pc(24) Class4_Sub17 local24 = new Class4_Sub17(arg0.method2396(0, 0));
		@Pc(28) int local28 = local24.method1837();
		this.aClass168Array2 = new Class168[local28];
		@Pc(34) int local34;
		for (local34 = 0; local34 < local28; local34++) {
			if (local24.method1874() == 1) {
				this.aClass168Array2[local34] = new Class168();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass168Array2[local34] != null) {
				this.aClass168Array2[local34].aBoolean325 = local24.method1874() == 0;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass168Array2[local34] != null) {
				this.aClass168Array2[local34].aBoolean329 = local24.method1874() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass168Array2[local34] != null) {
				this.aClass168Array2[local34].aBoolean326 = local24.method1874() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass168Array2[local34] != null) {
				this.aClass168Array2[local34].aBoolean328 = local24.method1874() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass168Array2[local34] != null) {
				this.aClass168Array2[local34].aByte22 = local24.method1892();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass168Array2[local34] != null) {
				this.aClass168Array2[local34].aByte19 = local24.method1892();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass168Array2[local34] != null) {
				this.aClass168Array2[local34].aByte21 = local24.method1892();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass168Array2[local34] != null) {
				this.aClass168Array2[local34].aByte20 = local24.method1892();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass168Array2[local34] != null) {
				this.aClass168Array2[local34].aShort32 = (short) local24.method1837();
			}
		}
		if (local24.anInt2400 < local24.aByteArray30.length) {
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass168Array2[local34] != null) {
					local24.method1892();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass168Array2[local34] != null) {
					local24.method1892();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass168Array2[local34] != null) {
					local24.method1874();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass168Array2[local34] != null) {
					this.aClass168Array2[local34].aBoolean327 = local24.method1874() == 1;
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass168Array2[local34] != null) {
					local24.method1892();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass168Array2[local34] != null) {
					local24.method1874();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass168Array2[local34] != null) {
					local24.method1874();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass168Array2[local34] != null) {
					local24.method1874();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(BI)Lclient!ua;")
	@Override
	public final Class168 method1962(@OriginalArg(1) int arg0) {
		return this.aClass168Array2[arg0];
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIFZI)[I")
	@Override
	public final int[] method1961(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3) {
		return this.method1967(arg3).method3408(this, this.aClass168Array2[arg3].aBoolean327, arg0, this.aClass98_69, false, (double) arg2, arg1);
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(IB)Z")
	@Override
	public final boolean method1963(@OriginalArg(0) int arg0) {
		@Pc(14) Class4_Sub2_Sub17 local14 = this.method1967(arg0);
		return local14 != null && local14.method3413(this, this.aClass98_69);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)Lclient!qe;")
	protected Class4_Sub2_Sub17 method1967(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub2 local10 = this.aClass69_2.method1930((long) arg0);
		if (local10 != null) {
			return (Class4_Sub2_Sub17) local10;
		}
		@Pc(21) byte[] local21 = this.aClass98_70.method2392(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(34) Class4_Sub2_Sub17 local34 = new Class4_Sub2_Sub17(new Class4_Sub17(local21));
			this.aClass69_2.method1933((long) arg0, local34);
			return local34;
		}
	}
}
