import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class9_Sub1_Sub1 extends Class9_Sub1 {

	@OriginalMember(owner = "client!am", name = "v", descriptor = "Lclient!rc;")
	private Class5_Sub4 aClass5_Sub4_1;

	@OriginalMember(owner = "client!am", name = "x", descriptor = "I")
	private final int anInt261;

	@OriginalMember(owner = "client!am", name = "s", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_3;

	@OriginalMember(owner = "client!am", name = "w", descriptor = "I")
	private final int anInt260;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "I")
	private final int anInt255;

	@OriginalMember(owner = "client!am", name = "t", descriptor = "I")
	private final int anInt259;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "I")
	private final int anInt258;

	@OriginalMember(owner = "client!am", name = "n", descriptor = "I")
	private final int anInt254;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!od;IIIIII)V")
	public Class9_Sub1_Sub1(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt261 = arg4;
		this.aClass128_Sub2_3 = arg0;
		this.anInt260 = arg5;
		this.anInt255 = arg6;
		this.anInt259 = arg3;
		this.anInt258 = arg1;
		this.anInt254 = arg2;
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(B)Lclient!rc;")
	@Override
	public Class5_Sub4 method1534() {
		if (this.aClass5_Sub4_1 == null) {
			Static211.anIntArray183[5] = this.anInt255;
			Static211.anIntArray183[1] = this.anInt254;
			Static211.anIntArray183[2] = this.anInt259;
			@Pc(27) Interface8 local27 = this.aClass128_Sub2_3.anInterface8_8;
			Static211.anIntArray183[3] = this.anInt261;
			Static211.anIntArray183[0] = this.anInt258;
			Static211.anIntArray183[4] = this.anInt260;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local27.method1376(Static211.anIntArray183[local48])) {
					return null;
				}
				@Pc(66) Class201 local66 = local27.method1375(Static211.anIntArray183[local48]);
				@Pc(73) int local73 = local66.aBoolean431 ? 64 : 128;
				if (local66.aByte62 > 0) {
					local44 = true;
				}
				if (local73 > local46) {
					local46 = local73;
				}
			}
			for (@Pc(89) int local89 = 0; local89 < 6; local89++) {
				Static436.anIntArrayArray186[local89] = local27.method1374(local46, false, local46, 1.0F, Static211.anIntArray183[local89]);
			}
			this.aClass5_Sub4_1 = new Class5_Sub4(this.aClass128_Sub2_3, 6407, local46, local44, Static436.anIntArrayArray186);
		}
		return this.aClass5_Sub4_1;
	}
}
