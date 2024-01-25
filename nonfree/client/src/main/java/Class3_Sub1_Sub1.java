import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Lclient!gm;")
	private Class81_Sub1 aClass81_Sub1_1;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_1;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	private final int anInt74;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	private final int anInt72;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
	private final int anInt75;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	private final int anInt70;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	private final int anInt71;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
	private final int anInt73;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!cg;IIIIII)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass37_Sub1_1 = arg0;
		this.anInt74 = arg2;
		this.anInt72 = arg1;
		this.anInt75 = arg5;
		this.anInt70 = arg4;
		this.anInt71 = arg3;
		this.anInt73 = arg6;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Lclient!gm;")
	@Override
	public Class81_Sub1 method3586() {
		if (this.aClass81_Sub1_1 == null) {
			Static3.anIntArray6[1] = this.anInt74;
			Static3.anIntArray6[2] = this.anInt71;
			Static3.anIntArray6[3] = this.anInt70;
			Static3.anIntArray6[4] = this.anInt75;
			Static3.anIntArray6[0] = this.anInt72;
			@Pc(38) Interface3 local38 = this.aClass37_Sub1_1.anInterface3_1;
			Static3.anIntArray6[5] = this.anInt73;
			@Pc(45) boolean local45 = false;
			@Pc(47) int local47 = 0;
			@Pc(49) int local49;
			for (local49 = 0; local49 < 6; local49++) {
				if (!local38.method167(Static3.anIntArray6[local49])) {
					return null;
				}
				@Pc(68) Class89 local68 = local38.method166(Static3.anIntArray6[local49]);
				@Pc(75) int local75 = local68.aBoolean249 ? 64 : 128;
				if (local68.aByte31 > 0) {
					local45 = true;
				}
				if (local47 < local75) {
					local47 = local75;
				}
			}
			for (local49 = 0; local49 < 6; local49++) {
				Static3.anIntArrayArray1[local49] = local38.method165(local47, false, local47, 1.0F, Static3.anIntArray6[local49]);
			}
			this.aClass81_Sub1_1 = new Class81_Sub1(this.aClass37_Sub1_1, 6407, local47, local45, Static3.anIntArrayArray1);
		}
		return this.aClass81_Sub1_1;
	}
}
