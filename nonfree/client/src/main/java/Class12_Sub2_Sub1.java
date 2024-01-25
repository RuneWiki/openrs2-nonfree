import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class12_Sub2_Sub1 extends Class12_Sub2 {

	@OriginalMember(owner = "client!dga", name = "o", descriptor = "Lclient!rh;")
	private Class65_Sub4 aClass65_Sub4_1;

	@OriginalMember(owner = "client!dga", name = "k", descriptor = "I")
	private final int anInt1838;

	@OriginalMember(owner = "client!dga", name = "l", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_6;

	@OriginalMember(owner = "client!dga", name = "s", descriptor = "I")
	private final int anInt1844;

	@OriginalMember(owner = "client!dga", name = "q", descriptor = "I")
	private final int anInt1842;

	@OriginalMember(owner = "client!dga", name = "n", descriptor = "I")
	private final int anInt1840;

	@OriginalMember(owner = "client!dga", name = "r", descriptor = "I")
	private final int anInt1843;

	@OriginalMember(owner = "client!dga", name = "m", descriptor = "I")
	private final int anInt1839;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!ep;IIIIII)V")
	public Class12_Sub2_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1838 = arg4;
		this.aClass95_Sub1_6 = arg0;
		this.anInt1844 = arg3;
		this.anInt1842 = arg5;
		this.anInt1840 = arg1;
		this.anInt1843 = arg2;
		this.anInt1839 = arg6;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)Lclient!rh;")
	@Override
	public Class65_Sub4 method8326() {
		if (this.aClass65_Sub4_1 == null) {
			Static232.anIntArray260[2] = this.anInt1844;
			Static232.anIntArray260[0] = this.anInt1840;
			@Pc(29) Interface6 local29 = this.aClass95_Sub1_6.anInterface6_27;
			Static232.anIntArray260[3] = this.anInt1838;
			Static232.anIntArray260[1] = this.anInt1843;
			Static232.anIntArray260[4] = this.anInt1842;
			Static232.anIntArray260[5] = this.anInt1839;
			@Pc(51) boolean local51 = false;
			@Pc(53) int local53 = 0;
			for (@Pc(55) int local55 = 0; local55 < 6; local55++) {
				if (!local29.method1493(Static232.anIntArray260[local55])) {
					return null;
				}
				@Pc(75) Class175 local75 = local29.method1492(Static232.anIntArray260[local55]);
				@Pc(82) int local82 = local75.aBoolean309 ? 64 : 128;
				if (local75.aByte55 > 0) {
					local51 = true;
				}
				if (local82 > local53) {
					local53 = local82;
				}
			}
			for (@Pc(105) int local105 = 0; local105 < 6; local105++) {
				Static602.anIntArrayArray70[local105] = local29.method1489(false, local53, 1.0F, local53, Static232.anIntArray260[local105]);
			}
			this.aClass65_Sub4_1 = new Class65_Sub4(this.aClass95_Sub1_6, 6407, local53, local51, Static602.anIntArrayArray70);
		}
		return this.aClass65_Sub4_1;
	}
}
