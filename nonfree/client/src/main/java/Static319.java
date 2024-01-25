import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "Lclient!hba;")
	public static Class115 aClass115_3;

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
	public static int anInt6355 = 1;

	@OriginalMember(owner = "client!lh", name = "B", descriptor = "Z")
	public static boolean aBoolean495 = false;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)I")
	public static int method5322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg0 / arg2;
		@Pc(18) int local18 = arg0 & arg2 - 1;
		@Pc(22) int local22 = arg1 / arg2;
		@Pc(28) int local28 = arg1 & arg2 - 1;
		@Pc(33) int local33 = Static475.method7041(local22, local12);
		@Pc(40) int local40 = Static475.method7041(local22, local12 + 1);
		@Pc(47) int local47 = Static475.method7041(local22 + 1, local12);
		@Pc(56) int local56 = Static475.method7041(local22 + 1, local12 + 1);
		@Pc(63) int local63 = Static262.method4633(arg2, local33, local18, local40);
		@Pc(70) int local70 = Static262.method4633(arg2, local47, local18, local56);
		return Static262.method4633(arg2, local63, local28, local70);
	}

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)Lclient!kda;")
	public static Class6_Sub33 method5323() {
		@Pc(15) Class360 local15 = null;
		@Pc(21) Class6_Sub33 local21 = new Class6_Sub33(Static8.aClass290_1, 0);
		try {
			@Pc(27) Class159 local27 = Static496.aClass104_4.method3144("");
			while (local27.anInt5910 == 0) {
				Static344.method5698(1L);
			}
			if (local27.anInt5910 == 1) {
				local15 = (Class360) local27.anObject13;
				@Pc(52) byte[] local52 = new byte[(int) local15.method8357()];
				@Pc(66) int local66;
				for (@Pc(54) int local54 = 0; local54 < local52.length; local54 += local66) {
					local66 = local15.method8358(local52.length - local54, local54, local52);
					if (local66 == -1) {
						throw new IOException("EOF");
					}
				}
				local21 = new Class6_Sub33(new Class6_Sub8(local52), Static8.aClass290_1, 0);
			}
		} catch (@Pc(98) Exception local98) {
		}
		try {
			if (local15 != null) {
				local15.method8359();
			}
		} catch (@Pc(105) Exception local105) {
		}
		return local21;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)Z")
	public static boolean method5325(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}
}
