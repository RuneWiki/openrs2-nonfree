import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class24_Sub1_Sub2 extends Class24_Sub1 {

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "Lclient!rh;")
	private Class31_Sub4 aClass31_Sub4_2;

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
	private final int anInt4193;

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
	private final int anInt4192;

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
	private final int anInt4186;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
	private final int anInt4187;

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
	private final int anInt4190;

	@OriginalMember(owner = "client!mk", name = "u", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_28;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
	private final int anInt4188;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!tt;IIIIII)V")
	public Class24_Sub1_Sub2(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4193 = arg6;
		this.anInt4192 = arg3;
		this.anInt4186 = arg2;
		this.anInt4187 = arg4;
		this.anInt4190 = arg5;
		this.aClass200_Sub2_28 = arg0;
		this.anInt4188 = arg1;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)Lclient!rh;")
	@Override
	public Class31_Sub4 method3334() {
		if (this.aClass31_Sub4_2 == null) {
			Static209.anIntArray212[5] = this.anInt4193;
			Static209.anIntArray212[4] = this.anInt4190;
			Static209.anIntArray212[1] = this.anInt4186;
			Static209.anIntArray212[2] = this.anInt4192;
			Static209.anIntArray212[0] = this.anInt4188;
			@Pc(44) Interface8 local44 = this.aClass200_Sub2_28.anInterface8_134;
			Static209.anIntArray212[3] = this.anInt4187;
			@Pc(51) boolean local51 = false;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local44.method4123(Static209.anIntArray212[local55])) {
					return null;
				}
				@Pc(73) Class178 local73 = local44.method4125(Static209.anIntArray212[local55]);
				@Pc(80) int local80 = local73.aBoolean324 ? 64 : 128;
				if (local53 < local80) {
					local53 = local80;
				}
				if (local73.aByte51 > 0) {
					local51 = true;
				}
			}
			for (@Pc(99) int local99 = 0; local99 < 6; local99++) {
				Static18.anIntArrayArray1[local99] = local44.method4126(local53, Static209.anIntArray212[local99], local53, false, 1.0F);
			}
			this.aClass31_Sub4_2 = new Class31_Sub4(this.aClass200_Sub2_28, 6407, local53, local51, Static18.anIntArrayArray1);
		}
		return this.aClass31_Sub4_2;
	}
}
