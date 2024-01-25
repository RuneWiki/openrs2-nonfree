import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class113_Sub2_Sub2 extends Class113_Sub2 {

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Lclient!ia;")
	private Class125_Sub2 aClass125_Sub2_2;

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
	private final int anInt5517;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
	private final int anInt5513;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
	private final int anInt5508;

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_25;

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
	private final int anInt5511;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
	private final int anInt5514;

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
	private final int anInt5519;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!aq;IIIIII)V")
	public Class113_Sub2_Sub2(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5517 = arg5;
		this.anInt5513 = arg2;
		this.anInt5508 = arg3;
		this.aClass22_Sub1_25 = arg0;
		this.anInt5511 = arg6;
		this.anInt5514 = arg1;
		this.anInt5519 = arg4;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)Lclient!ia;")
	@Override
	public Class125_Sub2 method4897() {
		if (this.aClass125_Sub2_2 == null) {
			Static705.anIntArray784[0] = this.anInt5514;
			Static705.anIntArray784[2] = this.anInt5508;
			Static705.anIntArray784[1] = this.anInt5513;
			@Pc(34) Interface4 local34 = this.aClass22_Sub1_25.anInterface4_14;
			Static705.anIntArray784[4] = this.anInt5517;
			Static705.anIntArray784[5] = this.anInt5511;
			Static705.anIntArray784[3] = this.anInt5519;
			@Pc(51) byte local51 = 0;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local34.method5758(Static705.anIntArray784[local55])) {
					return null;
				}
				@Pc(76) Class406 local76 = local34.method5761(Static705.anIntArray784[local55]);
				@Pc(84) int local84 = local76.aBoolean762 ? 64 : 128;
				if (local76.aByte148 > 0) {
					local51 = 1;
				}
				if (local84 > local53) {
					local53 = local84;
				}
			}
			for (@Pc(105) int local105 = 0; local105 < 6; local105++) {
				Static12.anIntArrayArray71[local105] = local34.method5760(local53, local53, false, 1.0F, Static705.anIntArray784[local105]);
			}
			this.aClass125_Sub2_2 = new Class125_Sub2(this.aClass22_Sub1_25, 6407, local53, local51 != 0, Static12.anIntArrayArray71);
		}
		return this.aClass125_Sub2_2;
	}
}
