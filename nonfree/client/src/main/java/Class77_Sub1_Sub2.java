import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class77_Sub1_Sub2 extends Class77_Sub1 {

	@OriginalMember(owner = "client!qw", name = "r", descriptor = "Lclient!mr;")
	private Class245_Sub1 aClass245_Sub1_2;

	@OriginalMember(owner = "client!qw", name = "h", descriptor = "I")
	private final int anInt9045;

	@OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
	private final int anInt9043;

	@OriginalMember(owner = "client!qw", name = "v", descriptor = "I")
	private final int anInt9039;

	@OriginalMember(owner = "client!qw", name = "u", descriptor = "I")
	private final int anInt9042;

	@OriginalMember(owner = "client!qw", name = "s", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_34;

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
	private final int anInt9044;

	@OriginalMember(owner = "client!qw", name = "o", descriptor = "I")
	private final int anInt9046;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!gia;IIIIII)V")
	public Class77_Sub1_Sub2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt9045 = arg3;
		this.anInt9043 = arg4;
		this.anInt9039 = arg5;
		this.anInt9042 = arg2;
		this.aClass67_Sub2_34 = arg0;
		this.anInt9044 = arg6;
		this.anInt9046 = arg1;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)Lclient!mr;")
	@Override
	public Class245_Sub1 method7555() {
		if (this.aClass245_Sub1_2 == null) {
			Static247.anIntArray248[2] = this.anInt9045;
			Static247.anIntArray248[3] = this.anInt9043;
			Static247.anIntArray248[5] = this.anInt9044;
			Static247.anIntArray248[4] = this.anInt9039;
			Static247.anIntArray248[0] = this.anInt9046;
			Static247.anIntArray248[1] = this.anInt9042;
			@Pc(49) Interface2 local49 = this.aClass67_Sub2_34.anInterface2_11;
			@Pc(51) byte local51 = 0;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local49.method1024(Static247.anIntArray248[local55])) {
					return null;
				}
				@Pc(76) Class32 local76 = local49.method1027(Static247.anIntArray248[local55]);
				@Pc(84) int local84 = local76.aBoolean71 ? 64 : 128;
				if (local76.aByte21 > 0) {
					local51 = 1;
				}
				if (local53 < local84) {
					local53 = local84;
				}
			}
			for (@Pc(104) int local104 = 0; local104 < 6; local104++) {
				Static648.anIntArrayArray57[local104] = local49.method1025(local53, local53, 1.0F, Static247.anIntArray248[local104], false);
			}
			this.aClass245_Sub1_2 = new Class245_Sub1(this.aClass67_Sub2_34, 6407, local53, local51 != 0, Static648.anIntArrayArray57);
		}
		return this.aClass245_Sub1_2;
	}
}
