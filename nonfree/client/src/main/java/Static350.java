import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!mo", name = "D", descriptor = "Lclient!fc;")
	public static Class100 aClass100_15;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBIII)V")
	public static void method8736(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(10, arg2);
		local8.method8958();
		local8.anInt10530 = arg3;
		local8.anInt10533 = arg1;
		local8.anInt10537 = arg0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)[Lclient!wk;")
	public static Class376[] method8737() {
		return new Class376[] { Static532.aClass376_16, Static177.aClass376_9, Static329.aClass376_8, Static277.aClass376_11, Static21.aClass376_1, Static447.aClass376_14, Static39.aClass376_2, Static446.aClass376_13, Static490.aClass376_15, Static96.aClass376_4, Static160.aClass376_17, Static270.aClass376_10, Static80.aClass376_3, Static142.aClass376_5 };
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
	public static void method8738(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static421.aClass217ArrayArrayArray5 = Static61.aClass217ArrayArrayArray6;
			Static11.aClass61Array1 = Static456.aClass61Array3;
		} else {
			Static421.aClass217ArrayArrayArray5 = Static96.aClass217ArrayArrayArray2;
			Static11.aClass61Array1 = Static20.aClass61Array2;
		}
		Static68.anInt1380 = Static421.aClass217ArrayArrayArray5.length;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
	public static void method8739() {
		@Pc(11) Class79 local11 = null;
		try {
			@Pc(17) Class91 local17 = Static470.aClass100_14.method2085("2");
			while (local17.anInt2271 == 0) {
				Static314.method4821(1L);
			}
			if (local17.anInt2271 == 1) {
				local11 = (Class79) local17.anObject2;
				@Pc(41) byte[] local41 = new byte[(int) local11.method1665()];
				@Pc(56) int local56;
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43 += local56) {
					local56 = local11.method1661(local41.length - local43, local43, local41);
					if (local56 == -1) {
						throw new IOException("EOF");
					}
				}
				Static368.method5448(new Class5_Sub22(local41));
			}
		} catch (@Pc(81) Exception local81) {
		}
		try {
			if (local11 != null) {
				local11.method1662();
			}
		} catch (@Pc(88) Exception local88) {
		}
	}
}
