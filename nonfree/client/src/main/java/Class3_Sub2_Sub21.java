import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public class Class3_Sub2_Sub21 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
	protected int anInt2278;

	@OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
	protected int anInt2279;

	@OriginalMember(owner = "client!rc", name = "bb", descriptor = "[I")
	protected int[] anIntArray229;

	@OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
	private int anInt2281;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public final void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2281 = arg0.method1359();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89 && this.method1771()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(52) int local52 = this.anInt2279 * (this.anInt2278 == Static152.anInt3405 ? arg0 : arg0 * this.anInt2278 / Static152.anInt3405);
			@Pc(62) int local62;
			@Pc(70) int local70;
			if (Static86.anInt1942 == this.anInt2279) {
				for (local62 = 0; local62 < Static86.anInt1942; local62++) {
					local70 = this.anIntArray229[local52++];
					local36[local62] = (local70 & 0xFF) << 4;
					local32[local62] = local70 >> 4 & 0xFF0;
					local28[local62] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static86.anInt1942; local62++) {
					local70 = this.anInt2279 * local62 / Static86.anInt1942;
					@Pc(122) int local122 = this.anIntArray229[local70 + local52];
					local36[local62] = (local122 & 0xFF) << 4;
					local32[local62] = local122 >> 4 & 0xFF0;
					local28[local62] = local122 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)Z")
	protected final boolean method1771() {
		if (this.anIntArray229 != null) {
			return true;
		} else if (this.anInt2281 >= 0) {
			@Pc(28) Class3_Sub1_Sub3_Sub4 local28 = Static102.method1777(Static120.aClass13_22, this.anInt2281);
			local28.method2327();
			this.anInt2279 = local28.anInt3223;
			this.anIntArray229 = local28.anIntArray336;
			this.anInt2278 = local28.anInt3226;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)I")
	@Override
	public final int method2790() {
		return this.anInt2281;
	}
}
