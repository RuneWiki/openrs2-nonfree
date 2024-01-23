import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class13 {

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "[I")
	public int[] anIntArray31;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "[I")
	public int[] anIntArray32;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
	public int anInt309;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
	public int anInt310;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "Lclient!ed;")
	public Class40 aClass40_1;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "[I")
	public int[] anIntArray34;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "[Lclient!ed;")
	public Class40[] aClass40Array1;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "[I")
	public int[] anIntArray35;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "[I")
	public int[] anIntArray37;

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
	public int anInt316;

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
	public int anInt317;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "([BI)V")
	public Class13(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt317 = Static269.method4012(arg0, arg0.length);
		if (arg1 != this.anInt317) {
			throw new RuntimeException();
		}
		this.method275(arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([BI)V")
	private void method275(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class4_Sub17 local12 = new Class4_Sub17(Static116.method2003(arg0));
		@Pc(16) int local16 = local12.method1874();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt316 = 0;
		} else {
			this.anInt316 = local12.method1889();
		}
		@Pc(48) int local48 = local12.method1874();
		this.anInt309 = local12.method1837();
		this.anIntArray31 = new int[this.anInt309];
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = -1;
		@Pc(64) int local64;
		for (local64 = 0; local64 < this.anInt309; local64++) {
			this.anIntArray31[local64] = local60 += local12.method1837();
			if (local62 < this.anIntArray31[local64]) {
				local62 = this.anIntArray31[local64];
			}
		}
		this.anInt310 = local62 + 1;
		this.anIntArray32 = new int[this.anInt310];
		this.anIntArray36 = new int[this.anInt310];
		this.anIntArrayArray5 = new int[this.anInt310][];
		this.anIntArray35 = new int[this.anInt310];
		this.anIntArray34 = new int[this.anInt310];
		if (local48 != 0) {
			this.anIntArray37 = new int[this.anInt310];
			for (local64 = 0; local64 < this.anInt310; local64++) {
				this.anIntArray37[local64] = -1;
			}
			for (local64 = 0; local64 < this.anInt309; local64++) {
				this.anIntArray37[this.anIntArray31[local64]] = local12.method1889();
			}
			this.aClass40_1 = new Class40(this.anIntArray37);
		}
		for (local64 = 0; local64 < this.anInt309; local64++) {
			this.anIntArray34[this.anIntArray31[local64]] = local12.method1889();
		}
		for (local64 = 0; local64 < this.anInt309; local64++) {
			this.anIntArray32[this.anIntArray31[local64]] = local12.method1889();
		}
		for (local64 = 0; local64 < this.anInt309; local64++) {
			this.anIntArray35[this.anIntArray31[local64]] = local12.method1837();
		}
		@Pc(258) int local258;
		@Pc(263) int local263;
		@Pc(271) int local271;
		@Pc(273) int local273;
		for (local64 = 0; local64 < this.anInt309; local64++) {
			local60 = 0;
			local258 = this.anIntArray31[local64];
			local263 = this.anIntArray35[local258];
			this.anIntArrayArray5[local258] = new int[local263];
			local271 = -1;
			for (local273 = 0; local273 < local263; local273++) {
				@Pc(295) int local295 = this.anIntArrayArray5[local258][local273] = local60 += local12.method1837();
				if (local295 > local271) {
					local271 = local295;
				}
			}
			this.anIntArray36[local258] = local271 + 1;
			if (local263 == local271 + 1) {
				this.anIntArrayArray5[local258] = null;
			}
		}
		if (local48 == 0) {
			return;
		}
		this.aClass40Array1 = new Class40[local62 + 1];
		this.anIntArrayArray4 = new int[local62 + 1][];
		for (local64 = 0; local64 < this.anInt309; local64++) {
			local258 = this.anIntArray31[local64];
			local263 = this.anIntArray35[local258];
			this.anIntArrayArray4[local258] = new int[this.anIntArray36[local258]];
			for (local271 = 0; local271 < this.anIntArray36[local258]; local271++) {
				this.anIntArrayArray4[local258][local271] = -1;
			}
			for (local271 = 0; local271 < local263; local271++) {
				if (this.anIntArrayArray5[local258] == null) {
					local273 = local271;
				} else {
					local273 = this.anIntArrayArray5[local258][local271];
				}
				this.anIntArrayArray4[local258][local273] = local12.method1889();
			}
			this.aClass40Array1[local258] = new Class40(this.anIntArrayArray4[local258]);
		}
	}
}
