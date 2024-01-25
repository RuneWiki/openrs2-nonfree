import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static665 {

	@OriginalMember(owner = "client!wia", name = "p", descriptor = "Lclient!saa;")
	public static Class312 aClass312_2;

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "Lclient!mt;")
	public static final Class228 aClass228_15 = new Class228(8, 0, 4, 1);

	@OriginalMember(owner = "client!wia", name = "e", descriptor = "[Lclient!lda;")
	public static Class98_Sub1[] aClass98_Sub1Array3 = new Class98_Sub1[0];

	@OriginalMember(owner = "client!wia", name = "j", descriptor = "Z")
	public static boolean aBoolean805 = true;

	@OriginalMember(owner = "client!wia", name = "o", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_215 = new Class180(8, 9);

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lclient!tia;Lclient!tia;I)V")
	public static void method9177(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		if (arg0.aClass3_Sub11_66 != null) {
			arg0.method9345();
		}
		arg0.aClass3_Sub11_66 = arg1.aClass3_Sub11_66;
		arg0.aClass3_Sub11_67 = arg1;
		arg0.aClass3_Sub11_66.aClass3_Sub11_67 = arg0;
		arg0.aClass3_Sub11_67.aClass3_Sub11_66 = arg0;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(III)I")
	public static int method9178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(22) double local22 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(31) double local31 = local22 + Math.random() * (local10 - local22);
		return (int) (Math.pow(2.0D, local31) + 0.5D);
	}
}
