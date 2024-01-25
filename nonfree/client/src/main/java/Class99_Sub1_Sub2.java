import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class99_Sub1_Sub2 extends Class99_Sub1 {

	@OriginalMember(owner = "client!kr", name = "B", descriptor = "Lclient!im;")
	private Class6_Sub4 aClass6_Sub4_2;

	@OriginalMember(owner = "client!kr", name = "y", descriptor = "I")
	private final int anInt3977;

	@OriginalMember(owner = "client!kr", name = "A", descriptor = "I")
	private final int anInt3979;

	@OriginalMember(owner = "client!kr", name = "v", descriptor = "I")
	private final int anInt3974;

	@OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
	private final int anInt3978;

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
	private final int anInt3975;

	@OriginalMember(owner = "client!kr", name = "E", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_24;

	@OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
	private final int anInt3972;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!fd;IIIIII)V")
	public Class99_Sub1_Sub2(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3977 = arg4;
		this.anInt3979 = arg5;
		this.anInt3974 = arg6;
		this.anInt3978 = arg1;
		this.anInt3975 = arg3;
		this.aClass19_Sub2_24 = arg0;
		this.anInt3972 = arg2;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Lclient!im;")
	@Override
	public Class6_Sub4 method3232() {
		if (this.aClass6_Sub4_2 == null) {
			@Pc(17) Interface7 local17 = this.aClass19_Sub2_24.anInterface7_6;
			Static259.anIntArray314[2] = this.anInt3975;
			Static259.anIntArray314[5] = this.anInt3974;
			Static259.anIntArray314[0] = this.anInt3978;
			Static259.anIntArray314[4] = this.anInt3979;
			Static259.anIntArray314[1] = this.anInt3972;
			Static259.anIntArray314[3] = this.anInt3977;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local17.method2392(Static259.anIntArray314[local53])) {
					return null;
				}
				@Pc(73) Class251 local73 = local17.method2396(Static259.anIntArray314[local53]);
				@Pc(80) int local80 = local73.aBoolean637 ? 64 : 128;
				if (local73.aByte92 > 0) {
					local49 = true;
				}
				if (local51 < local80) {
					local51 = local80;
				}
			}
			for (@Pc(105) int local105 = 0; local105 < 6; local105++) {
				Static365.anIntArrayArray57[local105] = local17.method2393(false, Static259.anIntArray314[local105], 1.0F, local51, local51);
			}
			this.aClass6_Sub4_2 = new Class6_Sub4(this.aClass19_Sub2_24, 6407, local51, local49, Static365.anIntArrayArray57);
		}
		return this.aClass6_Sub4_2;
	}
}
