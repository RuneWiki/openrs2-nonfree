import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_230 = new Class150(62, 5);

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
	public static int anInt9117 = 0;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method7398(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static281.method4574(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(45) int local45 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(48) int local48;
			do {
				local48 = arg0.nextInt();
			} while (local45 <= local48);
			return Static384.method6003(local48, arg1);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IILclient!ae;Ljava/awt/Component;I)Lclient!nm;")
	public static Class146 method7399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(3) Component arg3) {
		if (Static527.anInt8915 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class146 local36 = (Class146) Class.forName("Class146_Sub2").getDeclaredConstructor().newInstance();
			local36.anIntArray555 = new int[(Static543.aBoolean438 ? 2 : 1) * 256];
			local36.anInt7105 = arg0;
			local36.method5762(arg3);
			local36.anInt7106 = (-1024 & arg0) + 1024;
			if (local36.anInt7106 > 16384) {
				local36.anInt7106 = 16384;
			}
			local36.method5755(local36.anInt7106);
			if (Static187.anInt3599 > 0 && Static437.aClass46_1 == null) {
				Static437.aClass46_1 = new Class46();
				Static437.aClass46_1.aClass9_5 = arg2;
				arg2.method282(Static437.aClass46_1, Static187.anInt3599);
			}
			if (Static437.aClass46_1 != null) {
				if (Static437.aClass46_1.aClass146Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static437.aClass46_1.aClass146Array1[arg1] = local36;
			}
			return local36;
		} catch (@Pc(109) Throwable local109) {
			try {
				@Pc(115) Class146_Sub1 local115 = new Class146_Sub1(arg2, arg1);
				local115.anIntArray555 = new int[(Static543.aBoolean438 ? 2 : 1) * 256];
				local115.anInt7105 = arg0;
				local115.method5762(arg3);
				local115.anInt7106 = 16384;
				local115.method5755(local115.anInt7106);
				if (Static187.anInt3599 > 0 && Static437.aClass46_1 == null) {
					Static437.aClass46_1 = new Class46();
					Static437.aClass46_1.aClass9_5 = arg2;
					arg2.method282(Static437.aClass46_1, Static187.anInt3599);
				}
				if (Static437.aClass46_1 != null) {
					if (Static437.aClass46_1.aClass146Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static437.aClass46_1.aClass146Array1[arg1] = local115;
				}
				return local115;
			} catch (@Pc(174) Throwable local174) {
				return new Class146();
			}
		}
	}
}
