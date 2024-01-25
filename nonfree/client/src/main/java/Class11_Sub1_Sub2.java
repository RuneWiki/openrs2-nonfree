import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class11_Sub1_Sub2 extends Class11_Sub1 {

	@OriginalMember(owner = "client!io", name = "s", descriptor = "Lclient!mu;")
	private Class44_Sub3 aClass44_Sub3_2;

	@OriginalMember(owner = "client!io", name = "w", descriptor = "I")
	private final int anInt4084;

	@OriginalMember(owner = "client!io", name = "t", descriptor = "I")
	private final int anInt4081;

	@OriginalMember(owner = "client!io", name = "q", descriptor = "I")
	private final int anInt4080;

	@OriginalMember(owner = "client!io", name = "n", descriptor = "I")
	private final int anInt4078;

	@OriginalMember(owner = "client!io", name = "v", descriptor = "I")
	private final int anInt4083;

	@OriginalMember(owner = "client!io", name = "r", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_24;

	@OriginalMember(owner = "client!io", name = "A", descriptor = "I")
	private final int anInt4087;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!kv;IIIIII)V")
	public Class11_Sub1_Sub2(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4084 = arg3;
		this.anInt4081 = arg6;
		this.anInt4080 = arg5;
		this.anInt4078 = arg1;
		this.anInt4083 = arg4;
		this.aClass143_Sub2_24 = arg0;
		this.anInt4087 = arg2;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)Lclient!mu;")
	@Override
	public Class44_Sub3 method3582() {
		if (this.aClass44_Sub3_2 == null) {
			Static666.anIntArray601[5] = this.anInt4081;
			Static666.anIntArray601[2] = this.anInt4084;
			@Pc(22) Interface3 local22 = this.aClass143_Sub2_24.anInterface3_11;
			Static666.anIntArray601[3] = this.anInt4083;
			Static666.anIntArray601[1] = this.anInt4087;
			Static666.anIntArray601[4] = this.anInt4080;
			Static666.anIntArray601[0] = this.anInt4078;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local22.method8500(Static666.anIntArray601[local48])) {
					return null;
				}
				@Pc(66) Class331 local66 = local22.method8501(Static666.anIntArray601[local48]);
				@Pc(73) int local73 = local66.aBoolean659 ? 64 : 128;
				if (local73 > local46) {
					local46 = local73;
				}
				if (local66.aByte119 > 0) {
					local44 = true;
				}
			}
			for (@Pc(94) int local94 = 0; local94 < 6; local94++) {
				Static594.anIntArrayArray84[local94] = local22.method8499(Static666.anIntArray601[local94], local46, false, 1.0F, local46);
			}
			this.aClass44_Sub3_2 = new Class44_Sub3(this.aClass143_Sub2_24, 6407, local46, local44, Static594.anIntArrayArray84);
		}
		return this.aClass44_Sub3_2;
	}
}
