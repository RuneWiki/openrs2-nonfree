import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static664 {

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "I")
	public static int anInt6954;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Z)I")
	public static int method5817() {
		return Static39.anInt1153++;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IBLjava/awt/Component;Lclient!lu;I)Lclient!lv;")
	public static Class232 method5820(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class231 arg2, @OriginalArg(4) int arg3) {
		if (Static656.anInt1392 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class232 local36 = (Class232) Class.forName("Class232_Sub2").getDeclaredConstructor().newInstance();
			local36.anIntArray642 = new int[(Static293.aBoolean421 ? 2 : 1) * 256];
			local36.anInt10011 = arg0;
			local36.method8513(arg1);
			local36.anInt10005 = (arg0 & 0xFFFFFC00) + 1024;
			if (local36.anInt10005 > 16384) {
				local36.anInt10005 = 16384;
			}
			local36.method8521(local36.anInt10005);
			if (Static11.anInt121 > 0 && Static229.aClass310_3 == null) {
				Static229.aClass310_3 = new Class310();
				Static229.aClass310_3.aClass231_5 = arg2;
				arg2.method5297(Static11.anInt121, Static229.aClass310_3);
			}
			if (Static229.aClass310_3 != null) {
				if (Static229.aClass310_3.aClass232Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static229.aClass310_3.aClass232Array1[arg3] = local36;
			}
			return local36;
		} catch (@Pc(111) Throwable local111) {
			try {
				@Pc(117) Class232_Sub1 local117 = new Class232_Sub1(arg2, arg3);
				local117.anIntArray642 = new int[(Static293.aBoolean421 ? 2 : 1) * 256];
				local117.anInt10011 = arg0;
				local117.method8513(arg1);
				local117.anInt10005 = 16384;
				local117.method8521(local117.anInt10005);
				if (Static11.anInt121 > 0 && Static229.aClass310_3 == null) {
					Static229.aClass310_3 = new Class310();
					Static229.aClass310_3.aClass231_5 = arg2;
					arg2.method5297(Static11.anInt121, Static229.aClass310_3);
				}
				if (Static229.aClass310_3 != null) {
					if (Static229.aClass310_3.aClass232Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static229.aClass310_3.aClass232Array1[arg3] = local117;
				}
				return local117;
			} catch (@Pc(176) Throwable local176) {
				return new Class232();
			}
		}
	}
}
