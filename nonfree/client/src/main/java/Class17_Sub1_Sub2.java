import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class17_Sub1_Sub2 extends Class17_Sub1 {

	@OriginalMember(owner = "client!te", name = "o", descriptor = "Lclient!eg;")
	private Class3_Sub3 aClass3_Sub3_2;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "I")
	private final int anInt8119;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "I")
	private final int anInt8120;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "I")
	private final int anInt8122;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "I")
	private final int anInt8118;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "I")
	private final int anInt8117;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "I")
	private final int anInt8123;

	@OriginalMember(owner = "client!te", name = "h", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_38;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!uca;IIIIII)V")
	public Class17_Sub1_Sub2(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt8119 = arg2;
		this.anInt8120 = arg1;
		this.anInt8122 = arg5;
		this.anInt8118 = arg3;
		this.anInt8117 = arg4;
		this.anInt8123 = arg6;
		this.aClass162_Sub3_38 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Lclient!eg;")
	@Override
	public Class3_Sub3 method6601() {
		if (this.aClass3_Sub3_2 == null) {
			Static478.anIntArray510[1] = this.anInt8119;
			Static478.anIntArray510[4] = this.anInt8122;
			Static478.anIntArray510[0] = this.anInt8120;
			Static478.anIntArray510[5] = this.anInt8123;
			Static478.anIntArray510[2] = this.anInt8118;
			Static478.anIntArray510[3] = this.anInt8117;
			@Pc(42) Interface9 local42 = this.aClass162_Sub3_38.anInterface9_10;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local42.method1073(Static478.anIntArray510[local48])) {
					return null;
				}
				@Pc(66) Class291 local66 = local42.method1074(Static478.anIntArray510[local48]);
				@Pc(73) int local73 = local66.aBoolean602 ? 64 : 128;
				if (local46 < local73) {
					local46 = local73;
				}
				if (local66.aByte99 > 0) {
					local44 = true;
				}
			}
			for (@Pc(89) int local89 = 0; local89 < 6; local89++) {
				Static383.anIntArrayArray45[local89] = local42.method1076(1.0F, local46, false, local46, Static478.anIntArray510[local89]);
			}
			this.aClass3_Sub3_2 = new Class3_Sub3(this.aClass162_Sub3_38, 6407, local46, local44, Static383.anIntArrayArray45);
		}
		return this.aClass3_Sub3_2;
	}
}
