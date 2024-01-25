import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class105 {

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "[Lclient!mn;")
	public Class135[] aClass135Array1;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
	public int anInt3033;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	public int anInt3034;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "[I")
	public int[] anIntArray302;

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "[I")
	public int[] anIntArray303;

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "[I")
	public int[] anIntArray306;

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "[I")
	public int[] anIntArray307;

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
	public int anInt3038;

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!jp", name = "r", descriptor = "Lclient!mn;")
	public Class135 aClass135_1;

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
	public final int anInt3036;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([BI)V")
	public Class105(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3036 = Static213.method3822(arg0.length, arg0);
		if (this.anInt3036 != arg1) {
			throw new RuntimeException();
		}
		this.method2791(arg0);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B[B)V")
	private void method2791(@OriginalArg(1) byte[] arg0) {
		@Pc(20) Class5_Sub12 local20 = new Class5_Sub12(Static175.method2600(arg0));
		@Pc(24) int local24 = local20.method5115();
		if (local24 != 5 && local24 != 6) {
			throw new RuntimeException();
		}
		if (local24 < 6) {
			this.anInt3034 = 0;
		} else {
			this.anInt3034 = local20.method5067();
		}
		@Pc(55) int local55 = local20.method5115();
		this.anInt3038 = local20.method5106();
		@Pc(62) int local62 = 0;
		@Pc(64) int local64 = -1;
		this.anIntArray305 = new int[this.anInt3038];
		for (@Pc(71) int local71 = 0; local71 < this.anInt3038; local71++) {
			this.anIntArray305[local71] = local62 += local20.method5106();
			if (this.anIntArray305[local71] > local64) {
				local64 = this.anIntArray305[local71];
			}
		}
		this.anInt3033 = local64 + 1;
		this.anIntArray302 = new int[this.anInt3033];
		this.anIntArray306 = new int[this.anInt3033];
		this.anIntArray307 = new int[this.anInt3033];
		this.anIntArrayArray53 = new int[this.anInt3033][];
		this.anIntArray303 = new int[this.anInt3033];
		@Pc(146) int local146;
		@Pc(160) int local160;
		if (local55 != 0) {
			this.anIntArray304 = new int[this.anInt3033];
			for (local146 = 0; local146 < this.anInt3033; local146++) {
				this.anIntArray304[local146] = -1;
			}
			for (local160 = 0; local160 < this.anInt3038; local160++) {
				this.anIntArray304[this.anIntArray305[local160]] = local20.method5067();
			}
			this.aClass135_1 = new Class135(this.anIntArray304);
		}
		for (local146 = 0; local146 < this.anInt3038; local146++) {
			this.anIntArray306[this.anIntArray305[local146]] = local20.method5067();
		}
		for (local160 = 0; local160 < this.anInt3038; local160++) {
			this.anIntArray307[this.anIntArray305[local160]] = local20.method5067();
		}
		for (@Pc(228) int local228 = 0; local228 < this.anInt3038; local228++) {
			this.anIntArray302[this.anIntArray305[local228]] = local20.method5106();
		}
		@Pc(258) int local258;
		@Pc(265) int local265;
		@Pc(267) int local267;
		@Pc(275) int local275;
		@Pc(292) int local292;
		for (@Pc(251) int local251 = 0; local251 < this.anInt3038; local251++) {
			local258 = this.anIntArray305[local251];
			local62 = 0;
			local265 = this.anIntArray302[local258];
			local267 = -1;
			this.anIntArrayArray53[local258] = new int[local265];
			for (local275 = 0; local275 < local265; local275++) {
				local292 = this.anIntArrayArray53[local258][local275] = local62 += local20.method5106();
				if (local292 > local267) {
					local267 = local292;
				}
			}
			this.anIntArray303[local258] = local267 + 1;
			if (local265 == local267 + 1) {
				this.anIntArrayArray53[local258] = null;
			}
		}
		if (local55 == 0) {
			return;
		}
		this.aClass135Array1 = new Class135[local64 + 1];
		this.anIntArrayArray54 = new int[local64 + 1][];
		for (local258 = 0; local258 < this.anInt3038; local258++) {
			local265 = this.anIntArray305[local258];
			local267 = this.anIntArray302[local265];
			this.anIntArrayArray54[local265] = new int[this.anIntArray303[local265]];
			for (local275 = 0; local275 < this.anIntArray303[local265]; local275++) {
				this.anIntArrayArray54[local265][local275] = -1;
			}
			for (local292 = 0; local292 < local267; local292++) {
				@Pc(409) int local409;
				if (this.anIntArrayArray53[local265] == null) {
					local409 = local292;
				} else {
					local409 = this.anIntArrayArray53[local265][local292];
				}
				this.anIntArrayArray54[local265][local409] = local20.method5067();
			}
			this.aClass135Array1[local265] = new Class135(this.anIntArrayArray54[local265]);
		}
	}
}
