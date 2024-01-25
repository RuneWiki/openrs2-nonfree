import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
	public static int anInt575;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
	public static int anInt576;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
	public static int anInt577;

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
	public static int anInt573 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V")
	public static void method539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(16, arg1);
		local8.method8958();
		local8.anInt10530 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BJLclient!ha;)V")
	public static void method540(@OriginalArg(1) long arg0, @OriginalArg(2) Class133 arg1) {
		Static10.anInt221 = 0;
		Static337.anInt5728 = Static556.anInt9402;
		Static566.anInt9571 = 0;
		Static556.anInt9402 = 0;
		@Pc(18) long local18 = Static95.method1587();
		for (@Pc(23) Class4_Sub4 local23 = (Class4_Sub4) Static340.aClass99_6.method2045(); local23 != null; local23 = (Class4_Sub4) Static340.aClass99_6.method2047()) {
			if (local23.method1959(arg1, arg0)) {
				Static566.anInt9571++;
			}
		}
		if (Static346.aBoolean332 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static340.aClass99_6.method2035() + ", running: " + Static566.anInt9571);
			System.out.println("Emitters: " + Static10.anInt221 + " Particles: " + Static556.anInt9402 + ". Time taken: " + (Static95.method1587() - local18) + "ms");
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!fc;IIII)Ljava/awt/Frame;")
	public static Frame method541(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg1.method2090()) {
			return null;
		}
		@Pc(26) Class142[] local26 = Static10.method207(arg1);
		if (local26 == null) {
			return null;
		}
		@Pc(32) boolean local32 = false;
		for (@Pc(34) int local34 = 0; local34 < local26.length; local34++) {
			if (local26[local34].anInt3955 == arg3 && local26[local34].anInt3959 == arg2 && (!local32 || arg0 < local26[local34].anInt3958)) {
				arg0 = local26[local34].anInt3958;
				local32 = true;
			}
		}
		if (!local32) {
			return null;
		}
		@Pc(95) Class91 local95 = arg1.method2084(arg2, arg3, arg0);
		while (local95.anInt2271 == 0) {
			Static314.method4821(10L);
		}
		@Pc(107) Frame local107 = (Frame) local95.anObject2;
		if (local107 == null) {
			return null;
		} else if (local95.anInt2271 == 2) {
			Static548.method7984(local107, arg1);
			return null;
		} else {
			return local107;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[I[I)V")
	public static void method542(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static14.anIntArray6 = null;
			Static92.aByteArrayArrayArray2 = null;
			Static77.anIntArray114 = null;
			return;
		}
		Static14.anIntArray6 = arg1;
		Static77.anIntArray114 = new int[arg1.length];
		Static92.aByteArrayArrayArray2 = new byte[arg1.length][][];
		for (@Pc(36) int local36 = 0; local36 < Static14.anIntArray6.length; local36++) {
			Static92.aByteArrayArrayArray2[local36] = new byte[arg0[local36]][];
		}
	}
}
