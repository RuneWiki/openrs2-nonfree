import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Z")
	public static boolean aBoolean436;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
	public static int anInt6231;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([Lclient!hh;I)V")
	public static void method5251(@OriginalArg(0) Class6[] arg0) {
		Static627.anInt10388 = arg0.length;
		Static470.aClass6Array11 = new Class6[Static627.anInt10388 + 10];
		Static454.anIntArray397 = new int[Static627.anInt10388 + 10];
		Static681.method4033(arg0, 0, Static470.aClass6Array11, 0, Static627.anInt10388);
		for (@Pc(30) int local30 = 0; local30 < Static627.anInt10388; local30++) {
			Static454.anIntArray397[local30] = Static470.aClass6Array11[local30].method5134();
		}
		for (@Pc(45) int local45 = Static627.anInt10388; local45 < Static470.aClass6Array11.length; local45++) {
			Static454.anIntArray397[local45] = 12;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)[Lclient!eo;")
	public static Class108[] method5252() {
		return new Class108[] { Static119.aClass108_5, Static360.aClass108_8, Static289.aClass108_7, Static27.aClass108_3, Static119.aClass108_4, Static542.aClass108_11, Static158.aClass108_6, Static634.aClass108_10, Static616.aClass108_12, Static370.aClass108_9 };
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!d;Ljava/awt/Canvas;BII)Lclient!ha;")
	public static Class95 method5253(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class95_Sub2(arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Z")
	public static boolean method5254(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}
}
