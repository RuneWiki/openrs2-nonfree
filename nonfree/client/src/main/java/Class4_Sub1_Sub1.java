import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "Lclient!gv;")
	private Class121_Sub1 aClass121_Sub1_1;

	@OriginalMember(owner = "client!aba", name = "o", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_1;

	@OriginalMember(owner = "client!aba", name = "w", descriptor = "I")
	private final int anInt61;

	@OriginalMember(owner = "client!aba", name = "s", descriptor = "I")
	private final int anInt58;

	@OriginalMember(owner = "client!aba", name = "v", descriptor = "I")
	private final int anInt60;

	@OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
	private final int anInt55;

	@OriginalMember(owner = "client!aba", name = "q", descriptor = "I")
	private final int anInt56;

	@OriginalMember(owner = "client!aba", name = "t", descriptor = "I")
	private final int anInt59;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lclient!eq;IIIIII)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass33_Sub3_1 = arg0;
		this.anInt61 = arg3;
		this.anInt58 = arg2;
		this.anInt60 = arg1;
		this.anInt55 = arg6;
		this.anInt56 = arg4;
		this.anInt59 = arg5;
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(I)Lclient!gv;")
	@Override
	public Class121_Sub1 method4632() {
		if (this.aClass121_Sub1_1 == null) {
			Static21.anIntArray16[4] = this.anInt59;
			Static21.anIntArray16[2] = this.anInt61;
			Static21.anIntArray16[5] = this.anInt55;
			Static21.anIntArray16[0] = this.anInt60;
			@Pc(39) Interface5 local39 = this.aClass33_Sub3_1.anInterface5_11;
			Static21.anIntArray16[3] = this.anInt56;
			Static21.anIntArray16[1] = this.anInt58;
			@Pc(51) boolean local51 = false;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local39.method6867(Static21.anIntArray16[local55])) {
					return null;
				}
				@Pc(73) Class156 local73 = local39.method6869(Static21.anIntArray16[local55]);
				@Pc(80) int local80 = local73.aBoolean494 ? 64 : 128;
				if (local53 < local80) {
					local53 = local80;
				}
				if (local73.aByte70 > 0) {
					local51 = true;
				}
			}
			for (@Pc(102) int local102 = 0; local102 < 6; local102++) {
				Static348.anIntArrayArray25[local102] = local39.method6868(false, 1.0F, local53, Static21.anIntArray16[local102], local53);
			}
			this.aClass121_Sub1_1 = new Class121_Sub1(this.aClass33_Sub3_1, 6407, local53, local51, Static348.anIntArrayArray25);
		}
		return this.aClass121_Sub1_1;
	}
}
