import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!rja", name = "g", descriptor = "I")
	public static int anInt5959;

	@OriginalMember(owner = "client!rja", name = "h", descriptor = "Lclient!kj;")
	public static Class202 aClass202_6;

	@OriginalMember(owner = "client!rja", name = "j", descriptor = "I")
	public static int anInt5961;

	@OriginalMember(owner = "client!rja", name = "k", descriptor = "I")
	public static int anInt5962;

	@OriginalMember(owner = "client!rja", name = "i", descriptor = "I")
	public static final int anInt5960 = 0;

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "(I)V")
	public static void method5084(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static298.anInt4621 == 2) {
				Static460.aClass360Array1[0].method8175(Static472.aClass345Array1[0]);
				Static460.aClass360Array1[1].method8175(Static472.aClass345Array1[1]);
			} else if (Static298.anInt4621 == 3) {
				Static460.aClass360Array1[0].method8175(Static472.aClass345Array1[0]);
				Static460.aClass360Array1[1].method8175(Static472.aClass345Array1[1]);
				Static460.aClass360Array1[2].method8175(Static472.aClass345Array1[2]);
			} else {
				Static460.aClass360Array1[0].method8175(Static472.aClass345Array1[0]);
				Static460.aClass360Array1[1].method8175(Static472.aClass345Array1[1]);
				Static460.aClass360Array1[2].method8175(Static472.aClass345Array1[2]);
				Static460.aClass360Array1[3].method8175(Static472.aClass345Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static298.anInt4621 == 2) {
				Static460.aClass360Array1[0].method8175(Static472.aClass345Array1[2]);
			} else if (Static298.anInt4621 == 3) {
				Static460.aClass360Array1[0].method8175(Static472.aClass345Array1[3]);
				Static460.aClass360Array1[1].method8175(Static472.aClass345Array1[4]);
			} else {
				Static460.aClass360Array1[0].method8175(Static472.aClass345Array1[4]);
				Static460.aClass360Array1[1].method8175(Static472.aClass345Array1[5]);
				Static460.aClass360Array1[2].method8175(Static472.aClass345Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static298.anInt4621 == 2) {
				Static460.aClass360Array1[0].method8175(Static472.aClass345Array1[3]);
				return;
			}
			if (Static298.anInt4621 == 3) {
				Static460.aClass360Array1[0].method8175(Static472.aClass345Array1[5]);
				return;
			}
			Static460.aClass360Array1[0].method8175(Static472.aClass345Array1[7]);
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(IIILclient!ev;Lclient!ev;)V")
	public static void method5085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class41_Sub1_Sub3 arg3, @OriginalArg(4) Class41_Sub1_Sub3 arg4) {
		@Pc(4) Class313 local4 = Static40.method503(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass41_Sub1_Sub3_2 = arg3;
		local4.aClass41_Sub1_Sub3_1 = arg4;
		@Pc(19) int local19 = Static298.aClass88Array3 == Static176.aClass88Array1 ? 1 : 0;
		if (!arg3.method8650()) {
			arg3.aClass41_Sub1_23 = Static126.aClass41_Sub1Array2[local19];
			Static126.aClass41_Sub1Array2[local19] = arg3;
		} else if (arg3.method8647()) {
			arg3.aClass41_Sub1_23 = Static227.aClass41_Sub1Array3[local19];
			Static227.aClass41_Sub1Array3[local19] = arg3;
		} else {
			arg3.aClass41_Sub1_23 = Static271.aClass41_Sub1Array4[local19];
			Static271.aClass41_Sub1Array4[local19] = arg3;
			Static677.aBoolean794 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8650()) {
			if (arg4.method8647()) {
				arg4.aClass41_Sub1_23 = Static227.aClass41_Sub1Array3[local19];
				Static227.aClass41_Sub1Array3[local19] = arg4;
				return;
			}
			arg4.aClass41_Sub1_23 = Static271.aClass41_Sub1Array4[local19];
			Static271.aClass41_Sub1Array4[local19] = arg4;
			Static677.aBoolean794 = true;
			return;
		}
		arg4.aClass41_Sub1_23 = Static126.aClass41_Sub1Array2[local19];
		Static126.aClass41_Sub1Array2[local19] = arg4;
	}
}
