import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class124_Sub2_Sub1 extends Class124_Sub2 {

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "Lclient!jg;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
	private final int anInt5963;

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
	private final int anInt5965;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
	private final int anInt5961;

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
	private final int anInt5964;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
	private final int anInt5959;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "Lclient!wr;")
	private final Class42_Sub1 aClass42_Sub1_12;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
	private final int anInt5960;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!wr;IIIIII)V")
	public Class124_Sub2_Sub1(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5963 = arg3;
		this.anInt5965 = arg5;
		this.anInt5961 = arg2;
		this.anInt5964 = arg4;
		this.anInt5959 = arg6;
		this.aClass42_Sub1_12 = arg0;
		this.anInt5960 = arg1;
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)Lclient!jg;")
	@Override
	public Interface8 method4974() {
		if (this.anInterface8_1 == null) {
			Static545.anIntArray699[2] = this.anInt5963;
			Static545.anIntArray699[0] = this.anInt5960;
			Static545.anIntArray699[1] = this.anInt5961;
			Static545.anIntArray699[3] = this.anInt5964;
			Static545.anIntArray699[5] = this.anInt5959;
			Static545.anIntArray699[4] = this.anInt5965;
			@Pc(47) Interface11 local47 = this.aClass42_Sub1_12.anInterface11_11;
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local47.method6213(Static545.anIntArray699[local53])) {
					return null;
				}
				@Pc(71) Class278 local71 = local47.method6215(Static545.anIntArray699[local53]);
				@Pc(78) int local78 = local71.aBoolean567 ? 64 : 128;
				if (local71.aByte86 > 0) {
					local49 = 1;
				}
				if (local78 > local51) {
					local51 = local78;
				}
			}
			for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
				Static351.anIntArrayArray57[local100] = local47.method6211(false, Static545.anIntArray699[local100], local51, local51, 1.0F);
			}
			this.anInterface8_1 = this.aClass42_Sub1_12.method5947(Static351.anIntArrayArray57, local51, local49 != 0);
		}
		return this.anInterface8_1;
	}
}
