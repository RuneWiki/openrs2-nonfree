import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Lclient!sa;")
	private Class10_Sub3 aClass10_Sub3_1;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
	private final int anInt41;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	private final int anInt36;

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
	private final int anInt42;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
	private final int anInt40;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	private final int anInt35;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_1;

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
	private final int anInt43;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!ur;IIIIII)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt41 = arg5;
		this.anInt36 = arg3;
		this.anInt42 = arg2;
		this.anInt40 = arg6;
		this.anInt35 = arg4;
		this.aClass34_Sub2_1 = arg0;
		this.anInt43 = arg1;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)Lclient!sa;")
	@Override
	public Class10_Sub3 method2022() {
		if (this.aClass10_Sub3_1 == null) {
			Static238.anIntArray286[2] = this.anInt36;
			Static238.anIntArray286[5] = this.anInt40;
			@Pc(27) Interface6 local27 = this.aClass34_Sub2_1.anInterface6_8;
			Static238.anIntArray286[3] = this.anInt35;
			Static238.anIntArray286[4] = this.anInt41;
			Static238.anIntArray286[1] = this.anInt42;
			Static238.anIntArray286[0] = this.anInt43;
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local27.method3934(Static238.anIntArray286[local53])) {
					return null;
				}
				@Pc(71) Class114 local71 = local27.method3937(Static238.anIntArray286[local53]);
				@Pc(78) int local78 = local71.aBoolean339 ? 64 : 128;
				if (local78 > local51) {
					local51 = local78;
				}
				if (local71.aByte31 > 0) {
					local49 = 1;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static21.anIntArrayArray4[local98] = local27.method3933(1.0F, false, Static238.anIntArray286[local98], local51, local51);
			}
			this.aClass10_Sub3_1 = new Class10_Sub3(this.aClass34_Sub2_1, 6407, local51, local49 != 0, Static21.anIntArrayArray4);
		}
		return this.aClass10_Sub3_1;
	}
}
