import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class1_Sub3_Sub20 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
	private int anInt3010;

	@OriginalMember(owner = "client!ke", name = "U", descriptor = "[I")
	private int[] anIntArray273;

	@OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
	private int anInt3017;

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
	private int anInt3009 = -1;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub20() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)I")
	@Override
	public int method4454() {
		return this.anInt3009;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
	@Override
	public void method4456() {
		super.method4456();
		this.anIntArray273 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3009 = arg0.method2691();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144 && this.method2333()) {
			@Pc(32) int[] local32 = local19[0];
			@Pc(36) int[] local36 = local19[1];
			@Pc(40) int[] local40 = local19[2];
			@Pc(60) int local60 = this.anInt3010 * (Static26.anInt632 == this.anInt3017 ? arg0 : arg0 * this.anInt3017 / Static26.anInt632);
			@Pc(70) int local70;
			@Pc(79) int local79;
			if (Static227.anInt4511 == this.anInt3010) {
				for (local70 = 0; local70 < Static227.anInt4511; local70++) {
					local79 = this.anIntArray273[local60++];
					local40[local70] = (local79 & 0xFF) << 4;
					local36[local70] = local79 >> 4 & 0xFF0;
					local32[local70] = local79 >> 12 & 0xFF0;
				}
			} else {
				for (local70 = 0; local70 < Static227.anInt4511; local70++) {
					local79 = local70 * this.anInt3010 / Static227.anInt4511;
					@Pc(131) int local131 = this.anIntArray273[local79 + local60];
					local40[local70] = (local131 & 0xFF) << 4;
					local36[local70] = local131 >> 4 & 0xFF0;
					local32[local70] = local131 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)Z")
	private boolean method2333() {
		if (this.anIntArray273 != null) {
			return true;
		} else if (this.anInt3009 < 0) {
			return false;
		} else {
			@Pc(23) int local23 = Static227.anInt4511;
			@Pc(25) int local25 = Static26.anInt632;
			@Pc(36) int local36 = Static181.anInterface4_1.method2255(this.anInt3009).aBoolean333 ? 64 : 128;
			this.anIntArray273 = Static181.anInterface4_1.method2257(local36, 1.0F, this.anInt3009, local36);
			this.anInt3017 = local36;
			this.anInt3010 = local36;
			Static92.method1623(local23, local25);
			return this.anIntArray273 != null;
		}
	}
}
