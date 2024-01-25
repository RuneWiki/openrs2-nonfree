import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public final class Class106 {

	@OriginalMember(owner = "client!ev", name = "k", descriptor = "Lclient!pd;")
	public Class14_Sub19_Sub1 aClass14_Sub19_Sub1_1;

	@OriginalMember(owner = "client!ev", name = "q", descriptor = "Lclient!vt;")
	public Class14_Sub53 aClass14_Sub53_1;

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "Lclient!aha;")
	public Class15 aClass15_1;

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "Lclient!aga;")
	public Class14_Sub1_Sub1 aClass14_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
	public final int anInt2310;

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "B")
	public final byte aByte32;

	@OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
	public final int anInt2301;

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
	public final int anInt2311;

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
	public final int anInt2308;

	@OriginalMember(owner = "client!ev", name = "s", descriptor = "Lclient!haa;")
	public final Class4_Sub3 aClass4_Sub3_6;

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
	public final int anInt2312;

	@OriginalMember(owner = "client!ev", name = "r", descriptor = "I")
	public int anInt2306;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(BIIIIIILclient!haa;)V")
	public Class106(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class4_Sub3 arg7) {
		this.anInt2310 = arg6;
		this.aByte32 = arg0;
		this.anInt2301 = arg4;
		this.anInt2311 = arg1;
		this.anInt2308 = arg5;
		this.aClass4_Sub3_6 = arg7;
		this.anInt2312 = arg2;
		this.anInt2306 = arg3;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)Z")
	public boolean method2178() {
		return this.aByte32 == 2 || this.aByte32 == 3;
	}
}
