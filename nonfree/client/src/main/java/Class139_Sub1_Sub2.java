import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class139_Sub1_Sub2 extends Class139_Sub1 {

	@OriginalMember(owner = "client!sg", name = "A", descriptor = "Lclient!us;")
	private Class137_Sub4 aClass137_Sub4_2;

	@OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
	private final int anInt6311;

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
	private final int anInt6305;

	@OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
	private final int anInt6312;

	@OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
	private final int anInt6309;

	@OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
	private final int anInt6308;

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
	private final int anInt6306;

	@OriginalMember(owner = "client!sg", name = "E", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_37;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!nq;IIIIII)V")
	public Class139_Sub1_Sub2(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6311 = arg5;
		this.anInt6305 = arg3;
		this.anInt6312 = arg1;
		this.anInt6309 = arg4;
		this.anInt6308 = arg6;
		this.anInt6306 = arg2;
		this.aClass167_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)Lclient!us;")
	@Override
	public Class137_Sub4 method5201() {
		if (this.aClass137_Sub4_2 == null) {
			Static185.anIntArray209[2] = this.anInt6305;
			Static185.anIntArray209[5] = this.anInt6308;
			Static185.anIntArray209[1] = this.anInt6306;
			@Pc(32) Interface7 local32 = this.aClass167_Sub1_37.anInterface7_8;
			Static185.anIntArray209[0] = this.anInt6312;
			Static185.anIntArray209[4] = this.anInt6311;
			Static185.anIntArray209[3] = this.anInt6309;
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local32.method4420(Static185.anIntArray209[local53])) {
					return null;
				}
				@Pc(71) Class105 local71 = local32.method4417(Static185.anIntArray209[local53]);
				@Pc(78) int local78 = local71.aBoolean232 ? 64 : 128;
				if (local71.aByte35 > 0) {
					local49 = 1;
				}
				if (local51 < local78) {
					local51 = local78;
				}
			}
			for (@Pc(94) int local94 = 0; local94 < 6; local94++) {
				Static170.anIntArrayArray14[local94] = local32.method4416(Static185.anIntArray209[local94], false, local51, local51, 1.0F);
			}
			this.aClass137_Sub4_2 = new Class137_Sub4(this.aClass167_Sub1_37, 6407, local51, local49 != 0, Static170.anIntArrayArray14);
		}
		return this.aClass137_Sub4_2;
	}
}
