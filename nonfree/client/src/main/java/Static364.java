import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
	public static int anInt6445 = -1;

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "Lclient!im;")
	public static final Class140 aClass140_99 = new Class140(111, -1);

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZILjava/awt/Component;)Lclient!vn;")
	public static Class5 method5423(@OriginalArg(2) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class5_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class5) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class5_Sub1(arg0, true);
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!gaa;B)[Lclient!vw;")
	public static Class308[] method5424(@OriginalArg(0) Class102 arg0) {
		if (!arg0.method2399()) {
			return new Class308[0];
		}
		@Pc(16) Class157 local16 = arg0.method2407();
		while (local16.anInt4742 == 0) {
			Static209.method3565(10L);
		}
		if (local16.anInt4742 == 2) {
			return new Class308[0];
		}
		@Pc(35) int[] local35 = (int[]) local16.anObject12;
		@Pc(41) Class308[] local41 = new Class308[local35.length >> 2];
		for (@Pc(51) int local51 = 0; local51 < local41.length; local51++) {
			@Pc(57) Class308 local57 = new Class308();
			local41[local51] = local57;
			local57.anInt8790 = local35[local51 << 2];
			local57.anInt8789 = local35[(local51 << 2) + 1];
			local57.anInt8792 = local35[(local51 << 2) + 2];
			local57.anInt8793 = local35[(local51 << 2) + 3];
		}
		return local41;
	}
}
