import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!gs;B)Lclient!su;")
	public static Class325 method5552(@OriginalArg(0) Class13_Sub1_Sub1 arg0) {
		@Pc(9) Class325 local9;
		if (Static293.aClass325_2 == null) {
			local9 = new Class325();
		} else {
			local9 = Static293.aClass325_2;
			Static293.aClass325_2 = Static293.aClass325_2.aClass325_3;
			local9.aClass325_3 = null;
			Static495.anInt4074--;
		}
		local9.aClass13_Sub1_Sub1_1 = arg0;
		return local9;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(Z)Lclient!ah;")
	public static Class2_Sub5 method5556() {
		@Pc(7) Class92 local7 = null;
		@Pc(13) Class2_Sub5 local13 = new Class2_Sub5(Static189.aClass375_5, 0);
		try {
			@Pc(19) Class108 local19 = Static452.aClass226_6.method4858("");
			while (local19.anInt2766 == 0) {
				Static444.method6061(1L);
			}
			if (local19.anInt2766 == 1) {
				local7 = (Class92) local19.anObject6;
				@Pc(46) byte[] local46 = new byte[(int) local7.method1846()];
				@Pc(61) int local61;
				for (@Pc(48) int local48 = 0; local48 < local46.length; local48 += local61) {
					local61 = local7.method1843(local46, local48, local46.length - local48);
					if (local61 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class2_Sub5(new Class2_Sub22(local46), Static189.aClass375_5, 0);
			}
		} catch (@Pc(90) Exception local90) {
		}
		try {
			if (local7 != null) {
				local7.method1845();
			}
		} catch (@Pc(97) Exception local97) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
	public static void method5558(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static600.anInt9701 == 2) {
				Static498.aClass212Array1[0].method4413(Static602.aClass358Array1[0]);
				Static498.aClass212Array1[1].method4413(Static602.aClass358Array1[1]);
			} else if (Static600.anInt9701 == 3) {
				Static498.aClass212Array1[0].method4413(Static602.aClass358Array1[0]);
				Static498.aClass212Array1[1].method4413(Static602.aClass358Array1[1]);
				Static498.aClass212Array1[2].method4413(Static602.aClass358Array1[2]);
			} else {
				Static498.aClass212Array1[0].method4413(Static602.aClass358Array1[0]);
				Static498.aClass212Array1[1].method4413(Static602.aClass358Array1[1]);
				Static498.aClass212Array1[2].method4413(Static602.aClass358Array1[2]);
				Static498.aClass212Array1[3].method4413(Static602.aClass358Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static600.anInt9701 == 2) {
				Static498.aClass212Array1[0].method4413(Static602.aClass358Array1[2]);
			} else if (Static600.anInt9701 == 3) {
				Static498.aClass212Array1[0].method4413(Static602.aClass358Array1[3]);
				Static498.aClass212Array1[1].method4413(Static602.aClass358Array1[4]);
			} else {
				Static498.aClass212Array1[0].method4413(Static602.aClass358Array1[4]);
				Static498.aClass212Array1[1].method4413(Static602.aClass358Array1[5]);
				Static498.aClass212Array1[2].method4413(Static602.aClass358Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static600.anInt9701 == 2) {
				Static498.aClass212Array1[0].method4413(Static602.aClass358Array1[3]);
				return;
			}
			if (Static600.anInt9701 == 3) {
				Static498.aClass212Array1[0].method4413(Static602.aClass358Array1[5]);
				return;
			}
			Static498.aClass212Array1[0].method4413(Static602.aClass358Array1[7]);
		}
	}
}
