import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!wq", name = "K", descriptor = "I")
	public static int anInt7594 = 100;

	@OriginalMember(owner = "client!wq", name = "O", descriptor = "I")
	public static int anInt7598 = 0;

	@OriginalMember(owner = "client!wq", name = "Q", descriptor = "[I")
	public static final int[] anIntArray577 = new int[256];

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIILclient!qa;IIIII)V")
	public static void method5971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class75 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) Interface12 local12 = (Interface12) Static391.method5292(arg3, arg0, arg7);
		@Pc(21) Class128 local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(37) int local37;
		if (local12 != null) {
			local21 = Static55.aClass25_1.method855(local12.method5847());
			local27 = local12.method5851() & 0x3;
			local31 = local12.method5848();
			if (local21.anInt4028 == -1) {
				local37 = arg1;
				if (local21.anInt4009 > 0) {
					local37 = arg6;
				}
				if (local31 == 0 || local31 == 2) {
					if (local27 == 0) {
						arg2.method2573(local37, 4, arg5, arg4);
					} else if (local27 == 1) {
						arg2.method2639(arg4, arg5, local37, 4);
					} else if (local27 == 2) {
						arg2.method2573(local37, 4, arg5, arg4 + 3);
					} else if (local27 == 3) {
						arg2.method2639(arg4, arg5 + 3, local37, 4);
					}
				}
				if (local31 == 3) {
					if (local27 == 0) {
						arg2.method2600(1, arg4, 1, arg5, local37);
					} else if (local27 == 1) {
						arg2.method2600(1, arg4 + 3, 1, arg5, local37);
					} else if (local27 == 2) {
						arg2.method2600(1, arg4 + 3, 1, arg5 + 3, local37);
					} else if (local27 == 3) {
						arg2.method2600(1, arg4, 1, arg5 + 3, local37);
					}
				}
				if (local31 == 2) {
					if (local27 == 0) {
						arg2.method2639(arg4, arg5, local37, 4);
					} else if (local27 == 1) {
						arg2.method2573(local37, 4, arg5, arg4 + 3);
					} else if (local27 == 2) {
						arg2.method2639(arg4, arg5 + 3, local37, 4);
					} else if (local27 == 3) {
						arg2.method2573(local37, 4, arg5, arg4);
					}
				}
			} else {
				Static312.method4570(arg2, arg4, arg5, local21, local27);
			}
		}
		local12 = (Interface12) Static372.method1267(arg3, arg0, arg7, wk.class);
		if (local12 != null) {
			local21 = Static55.aClass25_1.method855(local12.method5847());
			local27 = local12.method5851() & 0x3;
			local31 = local12.method5848();
			if (local21.anInt4028 != -1) {
				Static312.method4570(arg2, arg4, arg5, local21, local27);
			} else if (local31 == 9) {
				local37 = -1118482;
				if (local21.anInt4009 > 0) {
					local37 = -1179648;
				}
				if (local27 == 0 || local27 == 2) {
					arg2.method2632(local37, arg4, arg4 + 3, arg5 + 3, arg5);
				} else {
					arg2.method2632(local37, arg4, arg4 + 3, arg5, arg5 + 3);
				}
			}
		}
		local12 = (Interface12) Static11.method399(arg3, arg0, arg7);
		if (local12 == null) {
			return;
		}
		local21 = Static55.aClass25_1.method855(local12.method5847());
		local27 = local12.method5851() & 0x3;
		if (local21.anInt4028 != -1) {
			Static312.method4570(arg2, arg4, arg5, local21, local27);
			return;
		}
	}

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "(B)V")
	public static void method5972() {
		@Pc(1) Class5 local1 = Static122.aClass5_23;
		synchronized (Static122.aClass5_23) {
			Static122.aClass5_23.method110();
		}
		local1 = Static227.aClass5_49;
		synchronized (Static227.aClass5_49) {
			Static227.aClass5_49.method110();
		}
	}
}
