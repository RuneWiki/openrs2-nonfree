import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class3_Sub2_Sub12 extends Class3_Sub2 {

	@OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
	private int anInt1859;

	@OriginalMember(owner = "client!kc", name = "cb", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!kc", name = "eb", descriptor = "I")
	private int anInt1860;

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
	private int anInt1853;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)I")
	@Override
	public int method2794() {
		return this.anInt1853;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)Z")
	private boolean method1434() {
		if (this.anIntArray190 != null) {
			return true;
		} else if (this.anInt1853 >= 0) {
			@Pc(28) int local28 = Static24.anInterface1_1.method1720(this.anInt1853) ? 64 : 128;
			this.anIntArray190 = Static24.anInterface1_1.method1718(this.anInt1853);
			this.anInt1860 = local28;
			this.anInt1859 = local28;
			return this.anIntArray190 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89 && this.method1434()) {
			@Pc(40) int local40 = (this.anInt1860 == Static152.anInt3405 ? arg0 : arg0 * this.anInt1860 / Static152.anInt3405) * this.anInt1859;
			@Pc(44) int[] local44 = local16[1];
			@Pc(48) int[] local48 = local16[0];
			@Pc(52) int[] local52 = local16[2];
			@Pc(58) int local58;
			@Pc(67) int local67;
			if (Static86.anInt1942 == this.anInt1859) {
				for (local58 = 0; local58 < Static86.anInt1942; local58++) {
					local67 = this.anIntArray190[local40++];
					local52[local58] = (local67 & 0xFF) << 4;
					local44[local58] = local67 >> 4 & 0xFF0;
					local48[local58] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static86.anInt1942; local58++) {
					local67 = local58 * this.anInt1859 / Static86.anInt1942;
					@Pc(74) int local74 = this.anIntArray190[local67 + local40];
					local52[local58] = (local74 & 0xFF) << 4;
					local44[local58] = local74 >> 4 & 0xFF0;
					local48[local58] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1853 = arg0.method1359();
		}
	}
}
