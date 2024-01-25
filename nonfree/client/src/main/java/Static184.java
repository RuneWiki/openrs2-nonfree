import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_62 = new Class70(64);

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString142 = " ";

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
	public static void method3475() {
		Static296.aClass40_18 = null;
		Static238.anInt5126 = -1;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
	public static void method3477() {
		Static289.method4941();
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			Static334.aClass27Array1[local16].method522();
		}
		method3475();
		Static83.method1391();
		System.gc();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)[B")
	public static byte[] method3478(@OriginalArg(1) int arg0) {
		@Pc(17) Class6_Sub2_Sub12 local17 = (Class6_Sub2_Sub12) Static297.aClass31_9.method634((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(50) int local50 = 255 - local43;
				@Pc(55) int local55 = Static24.method368(local50, local28);
				@Pc(59) byte local59 = local22[local55];
				local22[local55] = local22[local50];
				local22[local50] = local22[511 - local43] = local59;
			}
			local17 = new Class6_Sub2_Sub12(local22);
			Static297.aClass31_9.method632((long) arg0, local17);
		}
		return local17.aByteArray63;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!ml;ILclient!ja;)I")
	public static int method3479(@OriginalArg(0) Class136 arg0, @OriginalArg(2) Class81 arg1) {
		if (arg0.anInt3673 != -1) {
			return arg0.anInt3673;
		}
		if (arg0.anInt3688 != -1) {
			@Pc(25) Class82 local25 = Static263.anInterface2_5.method346(arg1.method2988() ? arg0.anInt3688 : arg0.anInt3671);
			if (!local25.aBoolean162) {
				return local25.aShort23;
			}
		}
		return arg0.anInt3679;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIB)I")
	public static int method3480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg0 > 0) {
			local15 = arg1 & 0x1 | local15 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local15;
	}
}
