import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!pda", name = "n", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_37 = new Class326(4);

	@OriginalMember(owner = "client!pda", name = "p", descriptor = "[I")
	public static int[] anIntArray474 = new int[2];

	@OriginalMember(owner = "client!pda", name = "q", descriptor = "Lclient!wv;")
	public static Class365 aClass365_12 = null;

	@OriginalMember(owner = "client!pda", name = "t", descriptor = "J")
	public static long aLong297 = 0L;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V")
	public static void method5657() {
		if (Static255.aFrame3 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static208.aFrame4 != null) {
			local12 = Static208.aFrame4;
		} else if (Static412.anApplet1 == null) {
			local12 = Static229.anApplet_Sub1_20;
		} else {
			local12 = Static412.anApplet1;
		}
		Static309.anInt5589 = local12.getSize().width;
		Static20.anInt611 = local12.getSize().height;
		@Pc(36) Insets local36;
		if (Static208.aFrame4 == local12) {
			local36 = Static208.aFrame4.getInsets();
			Static309.anInt5589 -= local36.left + local36.right;
			Static20.anInt611 -= local36.bottom + local36.top;
		}
		if (Static19.method541() == 1) {
			Static443.anInt7718 = Static483.anInt8133;
			Static393.anInt6807 = (Static309.anInt5589 - Static483.anInt8133) / 2;
			Static300.anInt5516 = Static443.anInt7712;
			Static377.anInt6644 = 0;
		} else {
			Static241.method3956();
		}
		if (Static253.aClass218_6 != Static122.aClass218_4) {
			@Pc(85) boolean local85;
			if (Static443.anInt7718 < 1024 && Static300.anInt5516 < 768) {
				local85 = true;
			} else {
				local85 = false;
			}
		}
		Static26.aCanvas3.setSize(Static443.anInt7718, Static300.anInt5516);
		if (Static136.aClass12_8 != null) {
			Static136.aClass12_8.method6395(Static26.aCanvas3);
		}
		if (local12 == Static208.aFrame4) {
			local36 = Static208.aFrame4.getInsets();
			Static26.aCanvas3.setLocation(local36.left + Static393.anInt6807, Static377.anInt6644 + local36.top);
		} else {
			Static26.aCanvas3.setLocation(Static393.anInt6807, Static377.anInt6644);
		}
		if (Static219.anInt4263 != -1) {
			Static261.method4073(true);
		}
		Static548.method7475();
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!io;)Lclient!oi;")
	public static Class240 method5659(@OriginalArg(1) Class1_Sub20 arg0) {
		@Pc(12) int local12 = arg0.method4371();
		return new Class240(local12);
	}
}
