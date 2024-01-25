import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class67_Sub1_Sub1 extends Class67_Sub1 {

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "Lclient!rj;")
	private Class8_Sub4 aClass8_Sub4_1;

	@OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
	private final int anInt2163;

	@OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
	private final int anInt2166;

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_15;

	@OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
	private final int anInt2164;

	@OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
	private final int anInt2162;

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
	private final int anInt2161;

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "I")
	private final int anInt2165;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!sq;IIIIII)V")
	public Class67_Sub1_Sub1(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2163 = arg3;
		this.anInt2166 = arg4;
		this.aClass46_Sub2_15 = arg0;
		this.anInt2164 = arg1;
		this.anInt2162 = arg5;
		this.anInt2161 = arg6;
		this.anInt2165 = arg2;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)Lclient!rj;")
	@Override
	public Class8_Sub4 method5494() {
		if (this.aClass8_Sub4_1 == null) {
			Static91.anIntArray196[2] = this.anInt2163;
			Static91.anIntArray196[0] = this.anInt2164;
			Static91.anIntArray196[3] = this.anInt2166;
			Static91.anIntArray196[1] = this.anInt2165;
			Static91.anIntArray196[5] = this.anInt2161;
			@Pc(38) Interface2 local38 = this.aClass46_Sub2_15.anInterface2_6;
			Static91.anIntArray196[4] = this.anInt2162;
			@Pc(45) boolean local45 = false;
			@Pc(47) int local47 = 0;
			@Pc(49) int local49;
			for (local49 = 0; local49 < 6; local49++) {
				if (!local38.method117(Static91.anIntArray196[local49])) {
					return null;
				}
				@Pc(71) Class154 local71 = local38.method116(Static91.anIntArray196[local49]);
				@Pc(78) int local78 = local71.aBoolean292 ? 64 : 128;
				if (local47 < local78) {
					local47 = local78;
				}
				if (local71.aByte47 > 0) {
					local45 = true;
				}
			}
			for (local49 = 0; local49 < 6; local49++) {
				Static91.anIntArrayArray30[local49] = local38.method119(Static91.anIntArray196[local49], 1.0F, local47, false, local47);
			}
			this.aClass8_Sub4_1 = new Class8_Sub4(this.aClass46_Sub2_15, 6407, local47, local45, Static91.anIntArrayArray30);
		}
		return this.aClass8_Sub4_1;
	}
}
