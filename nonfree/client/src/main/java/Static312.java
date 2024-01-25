import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "Lclient!lm;")
	public static Class134 aClass134_138;

	@OriginalMember(owner = "client!uh", name = "t", descriptor = "[I")
	public static final int[] anIntArray623 = new int[250];

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILjava/awt/Component;Lclient!wd;II)Lclient!po;")
	public static Class125 method5354(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) Class215 arg2, @OriginalArg(4) int arg3) {
		if (Static348.anInt6162 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(31) Class125 local31 = (Class125) Class.forName("Class125_Sub2").getDeclaredConstructor().newInstance();
			local31.anInt6144 = arg0;
			local31.anIntArray588 = new int[(Static340.aBoolean542 ? 2 : 1) * 256];
			local31.method5304(arg1);
			local31.anInt6140 = (-1024 & arg0) + 1024;
			if (local31.anInt6140 > 16384) {
				local31.anInt6140 = 16384;
			}
			local31.method5312(local31.anInt6140);
			if (Static100.anInt1935 > 0 && Static250.aClass5_1 == null) {
				Static250.aClass5_1 = new Class5();
				Static250.aClass5_1.aClass215_1 = arg2;
				arg2.method5654(Static250.aClass5_1, Static100.anInt1935);
			}
			if (Static250.aClass5_1 != null) {
				if (Static250.aClass5_1.aClass125Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static250.aClass5_1.aClass125Array1[arg3] = local31;
			}
			return local31;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(112) Class125_Sub1 local112 = new Class125_Sub1(arg2, arg3);
				local112.anInt6144 = arg0;
				local112.anIntArray588 = new int[(Static340.aBoolean542 ? 2 : 1) * 256];
				local112.method5304(arg1);
				local112.anInt6140 = 16384;
				local112.method5312(local112.anInt6140);
				if (Static100.anInt1935 > 0 && Static250.aClass5_1 == null) {
					Static250.aClass5_1 = new Class5();
					Static250.aClass5_1.aClass215_1 = arg2;
					arg2.method5654(Static250.aClass5_1, Static100.anInt1935);
				}
				if (Static250.aClass5_1 != null) {
					if (Static250.aClass5_1.aClass125Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static250.aClass5_1.aClass125Array1[arg3] = local112;
				}
				return local112;
			} catch (@Pc(174) Throwable local174) {
				return new Class125();
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
	public static void method5355() {
		if (!Static265.aBoolean456) {
			return;
		}
		@Pc(19) Class163 local19 = Static46.method931(Static178.anInt3758, Static259.anInt5310);
		if (local19 != null && local19.anObjectArray20 != null) {
			@Pc(28) Class1_Sub8 local28 = new Class1_Sub8();
			local28.anObjectArray1 = local19.anObjectArray20;
			local28.aClass163_3 = local19;
			Static122.method1972(local28);
		}
		Static265.aBoolean456 = false;
		Static10.anInt163 = -1;
		Static340.method5639(local19);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLclient!nj;)V")
	public static void method5357(@OriginalArg(1) Class1_Sub21 arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static78.anInt1577; local15++) {
			@Pc(21) int local21 = arg0.method5699();
			@Pc(25) int local25 = arg0.method5715();
			if (local25 == 65535) {
				local25 = -1;
			}
			if (Static168.aClass127_Sub1Array2[local21] != null) {
				Static168.aClass127_Sub1Array2[local21].anInt6375 = local25;
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
	public static void method5358() {
		for (@Pc(10) Class1_Sub23 local10 = (Class1_Sub23) Static271.aClass14_28.method302(); local10 != null; local10 = (Class1_Sub23) Static271.aClass14_28.method313()) {
			if (local10.anInt3761 == -1) {
				local10.anInt3753 = 0;
				Static298.method5217(local10);
			} else {
				local10.method5796();
			}
		}
	}
}
