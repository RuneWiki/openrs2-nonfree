import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!vba", name = "u", descriptor = "I")
	public static int anInt8565;

	@OriginalMember(owner = "client!vba", name = "v", descriptor = "I")
	public static int anInt8566;

	@OriginalMember(owner = "client!vba", name = "q", descriptor = "Lclient!hn;")
	public static final Class123 aClass123_6 = new Class123();

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V")
	public static void method7226() {
		for (@Pc(1) int local1 = 0; local1 < Static542.aByteArrayArrayArray17.length; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static542.aByteArrayArrayArray17[0].length; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static542.aByteArrayArrayArray17[0][0].length; local7++) {
					Static542.aByteArrayArrayArray17[local1][local4][local7] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method7228(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static202.method5316(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)Lclient!oa;")
	public static Class210 method7229(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static451.aFloat84 == 3.0D) {
				return Static72.aClass210_1;
			}
			if ((double) Static451.aFloat84 == 4.0D) {
				return Static129.aClass210_2;
			}
			if ((double) Static451.aFloat84 == 6.0D) {
				return Static534.aClass210_7;
			}
			if ((double) Static451.aFloat84 >= 8.0D) {
				return Static541.aClass210_8;
			}
		} else if (arg0 == 1) {
			if ((double) Static451.aFloat84 == 3.0D) {
				return Static534.aClass210_7;
			}
			if ((double) Static451.aFloat84 == 4.0D) {
				return Static541.aClass210_8;
			}
			if ((double) Static451.aFloat84 == 6.0D) {
				return Static354.aClass210_5;
			}
			if ((double) Static451.aFloat84 >= 8.0D) {
				return Static530.aClass210_6;
			}
		} else if (arg0 == 2) {
			if ((double) Static451.aFloat84 == 3.0D) {
				return Static354.aClass210_5;
			}
			if ((double) Static451.aFloat84 == 4.0D) {
				return Static530.aClass210_6;
			}
			if ((double) Static451.aFloat84 == 6.0D) {
				return Static300.aClass210_4;
			}
			if ((double) Static451.aFloat84 >= 8.0D) {
				return Static209.aClass210_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!fw;IIIII)V")
	public static void method7231(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt3335 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub27Array4[local4] != null) {
				arg0.anInt3335++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt3335; local22++) {
			@Pc(31) long local31 = Static17.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class201 local41;
			while (local31 != 0L) {
				local41 = Static172.aClass201Array3[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub27_2 == arg0.aClass1_Sub27Array4[local22]) {
					continue label51;
				}
			}
			local31 = Static17.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static172.aClass201Array3[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub27_2 == arg0.aClass1_Sub27Array4[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt3335 - 1; local93++) {
				arg0.aClass1_Sub27Array4[local93] = arg0.aClass1_Sub27Array4[local93 + 1];
			}
			arg0.anInt3335--;
		}
	}
}
