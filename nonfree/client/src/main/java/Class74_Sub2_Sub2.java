import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class74_Sub2_Sub2 extends Class74_Sub2 {

	@OriginalMember(owner = "client!qw", name = "t", descriptor = "Lclient!el;")
	private Class64_Sub2 aClass64_Sub2_2;

	@OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
	private final int anInt8500;

	@OriginalMember(owner = "client!qw", name = "m", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_35;

	@OriginalMember(owner = "client!qw", name = "u", descriptor = "I")
	private final int anInt8498;

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
	private final int anInt8494;

	@OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
	private final int anInt8496;

	@OriginalMember(owner = "client!qw", name = "q", descriptor = "I")
	private final int anInt8503;

	@OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
	private final int anInt8493;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!uja;IIIIII)V")
	public Class74_Sub2_Sub2(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt8500 = arg1;
		this.aClass145_Sub3_35 = arg0;
		this.anInt8498 = arg2;
		this.anInt8494 = arg6;
		this.anInt8496 = arg4;
		this.anInt8503 = arg5;
		this.anInt8493 = arg3;
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)Lclient!el;")
	@Override
	public Class64_Sub2 method7519() {
		if (this.aClass64_Sub2_2 == null) {
			Static509.anIntArray575[5] = this.anInt8494;
			@Pc(24) Interface3 local24 = this.aClass145_Sub3_35.anInterface3_12;
			Static509.anIntArray575[4] = this.anInt8503;
			Static509.anIntArray575[1] = this.anInt8498;
			Static509.anIntArray575[2] = this.anInt8493;
			Static509.anIntArray575[3] = this.anInt8496;
			Static509.anIntArray575[0] = this.anInt8500;
			@Pc(51) byte local51 = 0;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local24.method2852(Static509.anIntArray575[local55])) {
					return null;
				}
				@Pc(76) Class8 local76 = local24.method2857(Static509.anIntArray575[local55]);
				@Pc(84) int local84 = local76.aBoolean28 ? 64 : 128;
				if (local76.aByte10 > 0) {
					local51 = 1;
				}
				if (local53 < local84) {
					local53 = local84;
				}
			}
			for (@Pc(106) int local106 = 0; local106 < 6; local106++) {
				Static269.anIntArrayArray31[local106] = local24.method2853(Static509.anIntArray575[local106], 1.0F, local53, local53, false);
			}
			this.aClass64_Sub2_2 = new Class64_Sub2(this.aClass145_Sub3_35, 6407, local53, local51 != 0, Static269.anIntArrayArray31);
		}
		return this.aClass64_Sub2_2;
	}
}
