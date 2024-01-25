import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class57_Sub1_Sub1 extends Class57_Sub1 {

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "Lclient!nc;")
	private Class3_Sub4 aClass3_Sub4_1;

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "I")
	private final int anInt1756;

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
	private final int anInt1757;

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_16;

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
	private final int anInt1754;

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
	private final int anInt1753;

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
	private final int anInt1752;

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
	private final int anInt1755;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!wh;IIIIII)V")
	public Class57_Sub1_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1756 = arg2;
		this.anInt1757 = arg4;
		this.aClass100_Sub3_16 = arg0;
		this.anInt1754 = arg1;
		this.anInt1753 = arg6;
		this.anInt1752 = arg3;
		this.anInt1755 = arg5;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)Lclient!nc;")
	@Override
	public Class3_Sub4 method1534() {
		if (this.aClass3_Sub4_1 == null) {
			Static179.anIntArray222[3] = this.anInt1757;
			Static179.anIntArray222[4] = this.anInt1755;
			Static179.anIntArray222[0] = this.anInt1754;
			Static179.anIntArray222[2] = this.anInt1752;
			@Pc(37) Interface4 local37 = this.aClass100_Sub3_16.anInterface4_12;
			Static179.anIntArray222[5] = this.anInt1753;
			Static179.anIntArray222[1] = this.anInt1756;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local37.method892(Static179.anIntArray222[local53])) {
					return null;
				}
				@Pc(73) Class325 local73 = local37.method895(Static179.anIntArray222[local53]);
				@Pc(80) int local80 = local73.aBoolean633 ? 64 : 128;
				if (local73.aByte114 > 0) {
					local49 = true;
				}
				if (local80 > local51) {
					local51 = local80;
				}
			}
			for (@Pc(105) int local105 = 0; local105 < 6; local105++) {
				Static486.anIntArrayArray42[local105] = local37.method894(1.0F, false, Static179.anIntArray222[local105], local51, local51);
			}
			this.aClass3_Sub4_1 = new Class3_Sub4(this.aClass100_Sub3_16, 6407, local51, local49, Static486.anIntArrayArray42);
		}
		return this.aClass3_Sub4_1;
	}
}
