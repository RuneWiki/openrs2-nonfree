import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "Lclient!bi;")
	public static Class31 aClass31_32;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
	public static int anInt3331;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "Lclient!gba;")
	public static Class115 aClass115_7 = null;

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "Lclient!mf;")
	public static final Class221 aClass221_1 = new Class221();

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
	public static int anInt3333 = -1;

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)I")
	public static int method3045(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static61.anIntArray144[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BLclient!no;)V")
	public static void method3046(@OriginalArg(1) Class66_Sub3 arg0) {
		@Pc(12) byte[] local12;
		if (Static165.anObject15 == null) {
			@Pc(5) Class63_Sub2_Sub1 local5 = new Class63_Sub2_Sub1();
			local12 = local5.method4250();
			Static165.anObject15 = Static422.method6064(local12);
		}
		if (Static433.anObject37 == null) {
			@Pc(33) Class63_Sub1_Sub2 local33 = new Class63_Sub1_Sub2();
			local12 = local33.method5840();
			Static433.anObject37 = Static422.method6064(local12);
		}
		@Pc(48) Class203 local48 = arg0.aClass203_1;
		if (local48.method4527() && Static83.anObject49 == null) {
			local12 = Static21.method415(4.0F, 0.6F, 0.5F, new Class109_Sub1(419684), 16.0F, 4.0F);
			Static83.anObject49 = Static422.method6064(local12);
		}
	}
}
