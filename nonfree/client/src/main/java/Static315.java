import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_97 = new Class67("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III)Z")
	public static boolean method5106(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static191.method3679(arg0, arg1) | Static409.method6183(arg1, arg0)) & Static190.method3577(arg0, arg1);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[Lclient!xa;)V")
	public static void method5108(@OriginalArg(1) Class119[] arg0) {
		Static256.anInt5195 = arg0.length;
		Static525.aClass119Array16 = new Class119[Static256.anInt5195 + 10];
		Static260.anIntArray466 = new int[Static256.anInt5195 + 10];
		Static559.method5954(arg0, 0, Static525.aClass119Array16, 0, Static256.anInt5195);
		for (@Pc(26) int local26 = 0; local26 < Static256.anInt5195; local26++) {
			Static260.anIntArray466[local26] = Static525.aClass119Array16[local26].a();
		}
		for (@Pc(45) int local45 = Static256.anInt5195; local45 < Static525.aClass119Array16.length; local45++) {
			Static260.anIntArray466[local45] = 12;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)I")
	public static int method5109(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
