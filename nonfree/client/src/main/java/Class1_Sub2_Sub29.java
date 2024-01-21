import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public class Class1_Sub2_Sub29 extends Class1_Sub2 {

	@OriginalMember(owner = "client!p", name = "Z", descriptor = "I")
	protected int anInt3936;

	@OriginalMember(owner = "client!p", name = "ab", descriptor = "I")
	protected int anInt3937;

	@OriginalMember(owner = "client!p", name = "db", descriptor = "[I")
	protected int[] anIntArray539;

	@OriginalMember(owner = "client!p", name = "ob", descriptor = "I")
	private int anInt3946;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193 && this.method2774()) {
			@Pc(28) int[] local28 = local16[1];
			@Pc(44) int local44 = (this.anInt3937 == Static102.anInt2580 ? arg0 : arg0 * this.anInt3937 / Static102.anInt2580) * this.anInt3936;
			@Pc(48) int[] local48 = local16[2];
			@Pc(52) int[] local52 = local16[0];
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (Static110.anInt2825 == this.anInt3936) {
				for (local62 = 0; local62 < Static110.anInt2825; local62++) {
					local71 = this.anIntArray539[local44++];
					local48[local62] = (local71 & 0xFF) << 4;
					local28[local62] = local71 >> 4 & 0xFF0;
					local52[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static110.anInt2825; local62++) {
					local71 = this.anInt3936 * local62 / Static110.anInt2825;
					@Pc(79) int local79 = this.anIntArray539[local44 + local71];
					local48[local62] = (local79 & 0xFF) << 4;
					local28[local62] = local79 >> 4 & 0xFF0;
					local52[local62] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)I")
	@Override
	public final int method3119() {
		return this.anInt3946;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public final void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3946 = arg0.method878();
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)Z")
	protected final boolean method2774() {
		if (this.anIntArray539 != null) {
			return true;
		} else if (this.anInt3946 >= 0) {
			@Pc(25) Class1_Sub1_Sub12_Sub1 local25 = Static148.method2558(this.anInt3946, Static169.aClass30_60);
			local25.method1934();
			this.anInt3936 = local25.anInt2798;
			this.anIntArray539 = local25.anIntArray374;
			this.anInt3937 = local25.anInt2799;
			return true;
		} else {
			return false;
		}
	}
}
