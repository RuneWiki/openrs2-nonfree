import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class65_Sub2_Sub1 extends Class65_Sub2 {

	@OriginalMember(owner = "client!en", name = "w", descriptor = "Lclient!ng;")
	private Class132_Sub4 aClass132_Sub4_1;

	@OriginalMember(owner = "client!en", name = "n", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_7;

	@OriginalMember(owner = "client!en", name = "l", descriptor = "I")
	private final int anInt2727;

	@OriginalMember(owner = "client!en", name = "k", descriptor = "I")
	private final int anInt2726;

	@OriginalMember(owner = "client!en", name = "s", descriptor = "I")
	private final int anInt2732;

	@OriginalMember(owner = "client!en", name = "r", descriptor = "I")
	private final int anInt2731;

	@OriginalMember(owner = "client!en", name = "o", descriptor = "I")
	private final int anInt2728;

	@OriginalMember(owner = "client!en", name = "q", descriptor = "I")
	private final int anInt2730;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!ap;IIIIII)V")
	public Class65_Sub2_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass9_Sub2_7 = arg0;
		this.anInt2727 = arg2;
		this.anInt2726 = arg4;
		this.anInt2732 = arg6;
		this.anInt2731 = arg5;
		this.anInt2728 = arg1;
		this.anInt2730 = arg3;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)Lclient!ng;")
	@Override
	public Class132_Sub4 method7589() {
		if (this.aClass132_Sub4_1 == null) {
			Static504.anIntArray789[0] = this.anInt2728;
			Static504.anIntArray789[5] = this.anInt2732;
			Static504.anIntArray789[1] = this.anInt2727;
			Static504.anIntArray789[2] = this.anInt2730;
			Static504.anIntArray789[3] = this.anInt2726;
			@Pc(37) Interface2 local37 = this.aClass9_Sub2_7.anInterface2_11;
			Static504.anIntArray789[4] = this.anInt2731;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local37.method3583(Static504.anIntArray789[local48])) {
					return null;
				}
				@Pc(66) Class296 local66 = local37.method3585(Static504.anIntArray789[local48]);
				@Pc(73) int local73 = local66.aBoolean661 ? 64 : 128;
				if (local73 > local46) {
					local46 = local73;
				}
				if (local66.aByte106 > 0) {
					local44 = true;
				}
			}
			for (@Pc(93) int local93 = 0; local93 < 6; local93++) {
				Static52.anIntArrayArray9[local93] = local37.method3582(1.0F, false, local46, Static504.anIntArray789[local93], local46);
			}
			this.aClass132_Sub4_1 = new Class132_Sub4(this.aClass9_Sub2_7, 6407, local46, local44, Static52.anIntArrayArray9);
		}
		return this.aClass132_Sub4_1;
	}
}
