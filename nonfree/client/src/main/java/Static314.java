import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "Lclient!ea;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!lj", name = "B", descriptor = "[I")
	public static final int[] anIntArray365 = new int[3];

	@OriginalMember(owner = "client!lj", name = "C", descriptor = "Z")
	public static final boolean aBoolean447 = false;

	@OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
	public static int anInt6379 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
	public static void method5187() {
		if (Static171.aClass16_5.method6117()) {
			Static171.aClass16_5.method6090(Static549.aCanvas13);
			Static137.method2952();
			if (Static513.aBoolean642) {
				Static307.method5078(Static549.aCanvas13);
			} else {
				@Pc(19) Dimension local19 = Static549.aCanvas13.getSize();
				Static171.aClass16_5.method6085(Static549.aCanvas13, local19.width, local19.height);
			}
			Static171.aClass16_5.method6120(Static549.aCanvas13);
		} else {
			Static553.method7773(false, Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358());
		}
		Static121.method2707();
		Static147.aBoolean271 = true;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!bda;BI)V")
	public static void method5188(@OriginalArg(0) Class15_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		if (Static435.anInt8192 < arg0.anInt8101) {
			Static604.method8285(arg0);
		} else if (Static435.anInt8192 > arg0.anInt8124) {
			Static193.method3638(arg0, false);
			local13 = Static618.anInt10390;
			local11 = Static94.anInt6314;
		} else {
			Static533.method7515(arg0);
		}
		if (arg0.anInt10301 < 512 || arg0.anInt10298 < 512 || Static372.anInt7082 * 512 - 512 <= arg0.anInt10301 || arg0.anInt10298 >= Static218.anInt5023 * 512 - 512) {
			local13 = 0;
			local11 = -1;
			arg0.anInt8074 = -1;
			arg0.anInt8105 = -1;
			arg0.anInt8058 = -1;
			arg0.anIntArray434 = null;
			arg0.anInt8124 = 0;
			arg0.anInt8101 = 0;
			arg0.anInt10301 = arg0.anIntArray435[0] * 512 + arg0.method6692() * 256;
			arg0.anInt10298 = arg0.anIntArray436[0] * 512 + arg0.method6692() * 256;
			arg0.method6682();
		}
		if (arg0 == Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2 && (arg0.anInt10301 < 6144 || arg0.anInt10298 < 6144 || (Static372.anInt7082 - 12) * 512 <= arg0.anInt10301 || arg0.anInt10298 >= (Static218.anInt5023 - 12) * 512)) {
			arg0.anInt8058 = -1;
			local11 = -1;
			arg0.anInt8124 = 0;
			arg0.anIntArray434 = null;
			arg0.anInt8074 = -1;
			local13 = 0;
			arg0.anInt8101 = 0;
			arg0.anInt8105 = -1;
			arg0.anInt10301 = arg0.anIntArray435[0] * 512 + arg0.method6692() * 256;
			arg0.anInt10298 = arg0.anIntArray436[0] * 512 + arg0.method6692() * 256;
			arg0.method6682();
		}
		@Pc(221) int local221 = Static206.method7639(arg0);
		Static170.method3365(arg0);
		Static10.method131(local11, arg0, local13, local221);
		Static213.method4051(arg0, local11);
		Static484.method7152(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method5190(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}
