import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
	private int anInt714;

	@OriginalMember(owner = "client!dc", name = "cb", descriptor = "[I")
	private int[] anIntArray32;

	@OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
	private int anInt717;

	@OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
	private int anInt715;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123 && this.method502()) {
			@Pc(40) int local40 = (Static11.anInt283 == this.anInt717 ? arg0 : arg0 * this.anInt717 / Static11.anInt283) * this.anInt714;
			@Pc(44) int[] local44 = local7[0];
			@Pc(48) int[] local48 = local7[1];
			@Pc(52) int[] local52 = local7[2];
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (Static120.anInt2812 == this.anInt714) {
				for (local62 = 0; local62 < Static120.anInt2812; local62++) {
					local71 = this.anIntArray32[local40++];
					local52[local62] = (local71 & 0xFF) << 4;
					local48[local62] = local71 >> 4 & 0xFF0;
					local44[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static120.anInt2812; local62++) {
					local71 = this.anInt714 * local62 / Static120.anInt2812;
					@Pc(78) int local78 = this.anIntArray32[local71 + local40];
					local52[local62] = (local78 & 0xFF) << 4;
					local48[local62] = local78 >> 4 & 0xFF0;
					local44[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)I")
	@Override
	public int method2788() {
		return this.anInt715;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)Z")
	private boolean method502() {
		if (this.anIntArray32 != null) {
			return true;
		} else if (this.anInt715 >= 0) {
			@Pc(22) int local22 = Static2.anInterface1_1.method1717(this.anInt715) ? 64 : 128;
			this.anIntArray32 = Static2.anInterface1_1.method1714(this.anInt715);
			this.anInt717 = local22;
			this.anInt714 = local22;
			return this.anIntArray32 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt715 = arg0.method1397();
		}
	}
}
