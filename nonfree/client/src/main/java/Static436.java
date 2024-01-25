import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static436 {

	@OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
	public static int anInt7900;

	@OriginalMember(owner = "client!pi", name = "X", descriptor = "Lclient!rk;")
	public static Class292 aClass292_2;

	@OriginalMember(owner = "client!pi", name = "Y", descriptor = "I")
	public static int anInt7905;

	@OriginalMember(owner = "client!pi", name = "R", descriptor = "Lclient!bh;")
	public static final Class35 aClass35_5 = new Class35("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!pi", name = "W", descriptor = "Lclient!pha;")
	public static final Class256 aClass256_4 = new Class256();

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!rg;I)Lclient!mca;")
	public static Class69_Sub3 method6773(@OriginalArg(0) Class6_Sub40 arg0) {
		return new Class69_Sub3(arg0.method8615(), arg0.method8615(), arg0.method8615(), arg0.method8615(), arg0.method8615(), arg0.method8615(), arg0.method8615(), arg0.method8615(), arg0.method8606(), arg0.method8604());
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI)I")
	public static int method6775(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
