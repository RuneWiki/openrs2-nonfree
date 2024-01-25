import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!nu", name = "s", descriptor = "Lclient!kha;")
	public static Class181 aClass181_73;

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "Lclient!k;")
	public static final Class171 aClass171_7 = new Class171();

	@OriginalMember(owner = "client!nu", name = "o", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_89 = new Class218(61, 3);

	@OriginalMember(owner = "client!nu", name = "r", descriptor = "Lclient!nha;")
	public static final Class229 aClass229_10 = new Class229("", 11);

	@OriginalMember(owner = "client!nu", name = "t", descriptor = "[I")
	public static final int[] anIntArray447 = new int[1];

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!kha;I)Lclient!bea;")
	public static Class3_Sub6 method6099(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1) {
		@Pc(12) byte[] local12 = arg1.method5049(arg0);
		return local12 == null ? null : new Class3_Sub6(local12);
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V")
	public static void method6102() {
		@Pc(12) Class3_Sub26 local12 = Static640.method8636(Static252.aClass344_63, Static403.aClass294_3);
		local12.aClass3_Sub15_Sub1_3.method8448(Static626.method8490());
		local12.aClass3_Sub15_Sub1_3.method8464(Static114.anInt2970);
		local12.aClass3_Sub15_Sub1_3.method8464(Static256.anInt5669);
		local12.aClass3_Sub15_Sub1_3.method8448(Static552.aClass3_Sub48_30.aClass23_Sub24_2.method6648());
		Static472.method5189(local12);
	}
}
