import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gq", name = "t", descriptor = "Z")
	public static boolean aBoolean640 = false;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!ii;IILjava/awt/Component;I)Lclient!sr;")
	public static Class303 method7628(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (Static379.anInt7010 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(31) Class303 local31 = (Class303) Class.forName("Class303_Sub2").getDeclaredConstructor().newInstance();
			local31.anInt9752 = arg2;
			local31.anIntArray722 = new int[(Static558.aBoolean667 ? 2 : 1) * 256];
			local31.method7982(arg3);
			local31.anInt9750 = (arg2 & 0xFFFFFC00) + 1024;
			if (local31.anInt9750 > 16384) {
				local31.anInt9750 = 16384;
			}
			local31.method7985(local31.anInt9750);
			if (Static461.anInt7817 > 0 && Static141.aClass229_1 == null) {
				Static141.aClass229_1 = new Class229();
				Static141.aClass229_1.aClass161_6 = arg0;
				arg0.method3827(Static141.aClass229_1, Static461.anInt7817);
			}
			if (Static141.aClass229_1 != null) {
				if (Static141.aClass229_1.aClass303Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static141.aClass229_1.aClass303Array1[arg1] = local31;
			}
			return local31;
		} catch (@Pc(103) Throwable local103) {
			try {
				@Pc(109) Class303_Sub1 local109 = new Class303_Sub1(arg0, arg1);
				local109.anIntArray722 = new int[(Static558.aBoolean667 ? 2 : 1) * 256];
				local109.anInt9752 = arg2;
				local109.method7982(arg3);
				local109.anInt9750 = 16384;
				local109.method7985(local109.anInt9750);
				if (Static461.anInt7817 > 0 && Static141.aClass229_1 == null) {
					Static141.aClass229_1 = new Class229();
					Static141.aClass229_1.aClass161_6 = arg0;
					arg0.method3827(Static141.aClass229_1, Static461.anInt7817);
				}
				if (Static141.aClass229_1 != null) {
					if (Static141.aClass229_1.aClass303Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static141.aClass229_1.aClass303Array1[arg1] = local109;
				}
				return local109;
			} catch (@Pc(168) Throwable local168) {
				return new Class303();
			}
		}
	}
}
