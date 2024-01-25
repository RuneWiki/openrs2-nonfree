import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!jt", name = "s", descriptor = "[I")
	public static int[] anIntArray266;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "[I")
	public static final int[] anIntArray264 = new int[1000];

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "[I")
	public static final int[] anIntArray265 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!jt", name = "j", descriptor = "I")
	public static int anInt4500 = 0;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILclient!wq;IILclient!ha;Lclient!aa;II)V")
	public static void method3966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class394 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class143 arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) Class262 local8 = Static299.aClass218_1.method5163(arg7);
		if (local8 == null || !local8.aBoolean560 || !local8.method6490(Static413.aClass63_1)) {
			return;
		}
		@Pc(33) int local33;
		if (local8.anIntArray427 != null) {
			@Pc(31) int[] local31 = new int[local8.anIntArray427.length];
			@Pc(44) int local44;
			@Pc(57) int local57;
			@Pc(61) int local61;
			for (local33 = 0; local33 < local31.length / 2; local33++) {
				if (Static133.anInt2254 == 4) {
					local44 = (int) Static495.aFloat161 & 0x3FFF;
				} else {
					local44 = (int) Static495.aFloat161 + Static538.anInt8846 & 0x3FFF;
				}
				local57 = Class242.anIntArray384[local44];
				local61 = Class242.anIntArray383[local44];
				if (Static133.anInt2254 != 4) {
					local57 = local57 * 256 / (Static342.anInt6178 + 256);
					local61 = local61 * 256 / (Static342.anInt6178 + 256);
				}
				local31[local33 * 2] = ((local8.anIntArray427[local33 * 2 + 1] * 4 + arg0) * local57 + local61 * (arg6 + local8.anIntArray427[local33 * 2] * 4) >> 14) + arg1 + arg2.anInt10536 / 2;
				local31[local33 * 2 + 1] = arg3 + arg2.anInt10532 / 2 - ((local8.anIntArray427[local33 * 2 + 1] * 4 + arg0) * local61 - local57 * (arg6 + local8.anIntArray427[local33 * 2] * 4) >> 14);
			}
			Static39.method500(arg4, local31, local8.anInt7610, arg2.anIntArray610, arg2.anIntArray604);
			if (local8.anInt7624 > 0) {
				@Pc(211) int local211;
				@Pc(221) int local221;
				@Pc(230) int local230;
				@Pc(234) int local234;
				for (local44 = 0; local44 < local31.length / 2 - 1; local44++) {
					local57 = local31[local44 * 2];
					local61 = local31[local44 * 2 + 1];
					local211 = local31[(local44 + 1) * 2];
					local221 = local31[(local44 + 1) * 2 + 1];
					if (local211 < local57) {
						local230 = local57;
						local57 = local211;
						local234 = local61;
						local211 = local230;
						local61 = local221;
						local221 = local234;
					} else if (local57 == local211 && local61 > local221) {
						local230 = local61;
						local61 = local221;
						local221 = local230;
					}
					arg4.method6244(local57, local61, local211, local221, local8.anIntArray426[local8.aByteArray76[local44] & 0xFF], arg5, arg1, arg3, local8.anInt7624, local8.anInt7642, local8.anInt7643);
				}
				local57 = local31[local31.length - 2];
				local61 = local31[local31.length - 1];
				local211 = local31[0];
				local221 = local31[1];
				if (local57 > local211) {
					local230 = local57;
					local57 = local211;
					local234 = local61;
					local61 = local221;
					local211 = local230;
					local221 = local234;
				} else if (local211 == local57 && local61 > local221) {
					local230 = local61;
					local61 = local221;
					local221 = local230;
				}
				arg4.method6244(local57, local61, local211, local221, local8.anIntArray426[local8.aByteArray76[local8.aByteArray76.length - 1] & 0xFF], arg5, arg1, arg3, local8.anInt7624, local8.anInt7642, local8.anInt7643);
			} else {
				for (local44 = 0; local44 < local31.length / 2 - 1; local44++) {
					arg4.method6199(local31[local44 * 2], local31[local44 * 2 + 1], local31[local44 * 2 + 2], local31[(local44 + 1) * 2 + 1], local8.anIntArray426[local8.aByteArray76[local44] & 0xFF], arg5, arg1, arg3);
				}
				arg4.method6199(local31[local31.length - 2], local31[local31.length - 1], local31[0], local31[1], local8.anIntArray426[local8.aByteArray76[local8.aByteArray76.length - 1] & 0xFF], arg5, arg1, arg3);
			}
		}
		@Pc(473) Class59 local473 = null;
		if (local8.anInt7628 != -1) {
			local473 = local8.method6489(arg4, false);
			if (local473 != null) {
				Static28.method380(arg5, arg0, arg3, local473, arg6, arg1, arg2);
			}
		}
		if (local8.aString72 == null) {
			return;
		}
		local33 = 0;
		if (local473 != null) {
			local33 = local473.method8061();
		}
		@Pc(507) Class72 local507 = Static383.aClass72_10;
		@Pc(509) Class198 local509 = Static172.aClass198_4;
		if (local8.anInt7623 == 1) {
			local509 = Static364.aClass198_8;
			local507 = Static5.aClass72_1;
		}
		if (local8.anInt7623 == 2) {
			local507 = Static32.aClass72_2;
			local509 = Static358.aClass198_7;
		}
		Static198.method2809(arg5, arg6, arg2, arg1, local33, local8.anInt7619, arg0, local509, local8.aString72, local507, arg3);
		return;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILclient!eha;)V")
	public static void method3968(@OriginalArg(1) Class5_Sub14 arg0) {
		arg0.aBoolean787 = false;
		if (arg0.aClass5_Sub9_6 != null) {
			arg0.aClass5_Sub9_6.anInt487 = 0;
		}
		for (@Pc(21) Class5_Sub14 local21 = arg0.method8779(); local21 != null; local21 = arg0.method8780()) {
			method3968(local21);
		}
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V")
	public static void method3971() {
		if (Static549.aClass107_3 != null) {
			Static549.aClass107_3.method8610();
		}
		if (Static373.aClass107_1 != null) {
			Static373.aClass107_1.method8610();
		}
	}
}
