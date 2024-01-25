import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	public static int anInt6678;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_157 = new Class263(33, 6);

	@OriginalMember(owner = "client!se", name = "f", descriptor = "[[B")
	private static final byte[][] aByteArrayArray21 = new byte[250][];

	@OriginalMember(owner = "client!se", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString59 = null;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "I")
	public static int anInt6679 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLclient!s;)V")
	public static void method5094(@OriginalArg(1) Class1_Sub40 arg0) {
		if (Static67.aClass252ArrayArrayArray2 == null) {
			return;
		}
		@Pc(12) Interface5 local12 = null;
		if (arg0.anInt6623 == 0) {
			local12 = (Interface5) Static232.method3536(arg0.anInt6626, arg0.anInt6621, arg0.anInt6627);
		}
		if (arg0.anInt6623 == 1) {
			local12 = (Interface5) Static392.method5433(arg0.anInt6626, arg0.anInt6621, arg0.anInt6627);
		}
		if (arg0.anInt6623 == 2) {
			local12 = (Interface5) Static461.method5974(arg0.anInt6626, arg0.anInt6621, arg0.anInt6627, jg.class);
		}
		if (arg0.anInt6623 == 3) {
			local12 = (Interface5) Static454.method6163(arg0.anInt6626, arg0.anInt6621, arg0.anInt6627);
		}
		if (local12 == null) {
			arg0.anInt6622 = 0;
			arg0.anInt6630 = 0;
			arg0.anInt6617 = -1;
		} else {
			arg0.anInt6617 = local12.method5730();
			arg0.anInt6630 = local12.method5727();
			arg0.anInt6622 = local12.method5729();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method5095(@OriginalArg(0) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static170.anInt3495 > 0) {
			local16 = Static73.aByteArrayArray6[--Static170.anInt3495];
			Static73.aByteArrayArray6[Static170.anInt3495] = null;
			return local16;
		} else if (arg0 == 5000 && Static326.anInt6019 > 0) {
			local16 = aByteArrayArray21[--Static326.anInt6019];
			aByteArrayArray21[Static326.anInt6019] = null;
			return local16;
		} else if (arg0 == 30000 && Static385.anInt7048 > 0) {
			local16 = Static107.aByteArrayArray9[--Static385.anInt7048];
			Static107.aByteArrayArray9[Static385.anInt7048] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BZI)V")
	public static void method5097(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub46 local10 = Static114.method1848(arg0, arg1);
		if (local10 != null) {
			for (@Pc(21) int local21 = 0; local21 < local10.anIntArray750.length; local21++) {
				local10.anIntArray750[local21] = -1;
				local10.anIntArray751[local21] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIB)V")
	public static void method5098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static135.anInt3020 = arg1 - Static377.anInt5040;
		Static332.anInt6412 = arg0 - Static377.anInt5030;
	}
}
