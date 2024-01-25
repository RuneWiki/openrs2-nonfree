import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!oea", name = "n", descriptor = "I")
	public static int anInt7257;

	@OriginalMember(owner = "client!oea", name = "o", descriptor = "[Lclient!ho;")
	public static Class9[] aClass9Array124;

	@OriginalMember(owner = "client!oea", name = "p", descriptor = "I")
	public static int anInt7258;

	@OriginalMember(owner = "client!oea", name = "m", descriptor = "Lclient!oea;")
	public static final Class250 aClass250_18 = new Class250(4);

	@OriginalMember(owner = "client!oea", name = "i", descriptor = "Lclient!oea;")
	public static final Class250 aClass250_14 = new Class250(1);

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "Lclient!oea;")
	public static final Class250 aClass250_11 = new Class250(1);

	@OriginalMember(owner = "client!oea", name = "g", descriptor = "Lclient!oea;")
	public static final Class250 aClass250_12 = new Class250(2);

	@OriginalMember(owner = "client!oea", name = "h", descriptor = "Lclient!oea;")
	public static final Class250 aClass250_13 = new Class250(4);

	@OriginalMember(owner = "client!oea", name = "j", descriptor = "Lclient!oea;")
	public static final Class250 aClass250_15 = new Class250(2);

	@OriginalMember(owner = "client!oea", name = "k", descriptor = "Lclient!oea;")
	public static final Class250 aClass250_16 = new Class250(4);

	@OriginalMember(owner = "client!oea", name = "l", descriptor = "Lclient!oea;")
	public static final Class250 aClass250_17 = new Class250(2);

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method6237(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local34++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				@Pc(72) char local72 = Static4.aCharArray1[(int) (local58 - arg0 * 37L)];
				if (local72 == '_') {
					@Pc(80) int local80 = local54.length() - 1;
					local54.setCharAt(local80, Character.toUpperCase(local54.charAt(local80)));
					local72 = ' ';
				}
				local54.append(local72);
			}
			local54.reverse();
			local54.setCharAt(0, Character.toUpperCase(local54.charAt(0)));
			return local54.toString();
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZIIII)V")
	public static void method6238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class6_Sub4_Sub18 local9 = Static565.method7924((long) arg2, 8);
		local9.method7976();
		local9.anInt9466 = arg3;
		local9.anInt9464 = arg1;
		local9.anInt9463 = arg0;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZZLjava/awt/Component;)Lclient!rja;")
	public static Class128 method6240(@OriginalArg(2) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class128_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class128) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(42) Throwable local42) {
			return new Class128_Sub1(arg0, true);
		}
	}
}
