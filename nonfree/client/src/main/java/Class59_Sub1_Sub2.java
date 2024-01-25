import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class59_Sub1_Sub2 extends Class59_Sub1 {

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "Lclient!aw;")
	private Class23_Sub1 aClass23_Sub1_2;

	@OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
	private final int anInt4875;

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "I")
	private final int anInt4878;

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "I")
	private final int anInt4879;

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "I")
	private final int anInt4874;

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_28;

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
	private final int anInt4873;

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
	private final int anInt4876;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!ih;IIIIII)V")
	public Class59_Sub1_Sub2(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4875 = arg6;
		this.anInt4878 = arg4;
		this.anInt4879 = arg5;
		this.anInt4874 = arg1;
		this.aClass117_Sub1_28 = arg0;
		this.anInt4873 = arg3;
		this.anInt4876 = arg2;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Lclient!aw;")
	@Override
	public Class23_Sub1 method3888() {
		if (this.aClass23_Sub1_2 == null) {
			Static248.anIntArray328[0] = this.anInt4874;
			@Pc(24) Interface4 local24 = this.aClass117_Sub1_28.anInterface4_10;
			Static248.anIntArray328[3] = this.anInt4878;
			Static248.anIntArray328[4] = this.anInt4879;
			Static248.anIntArray328[5] = this.anInt4875;
			Static248.anIntArray328[2] = this.anInt4873;
			Static248.anIntArray328[1] = this.anInt4876;
			@Pc(51) boolean local51 = false;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local24.method5089(Static248.anIntArray328[local55])) {
					return null;
				}
				@Pc(75) Class25 local75 = local24.method5090(Static248.anIntArray328[local55]);
				@Pc(82) int local82 = local75.aBoolean54 ? 64 : 128;
				if (local75.aByte9 > 0) {
					local51 = true;
				}
				if (local82 > local53) {
					local53 = local82;
				}
			}
			for (@Pc(105) int local105 = 0; local105 < 6; local105++) {
				Static329.anIntArrayArray43[local105] = local24.method5088(local53, Static248.anIntArray328[local105], 1.0F, false, local53);
			}
			this.aClass23_Sub1_2 = new Class23_Sub1(this.aClass117_Sub1_28, 6407, local53, local51, Static329.anIntArrayArray43);
		}
		return this.aClass23_Sub1_2;
	}
}
