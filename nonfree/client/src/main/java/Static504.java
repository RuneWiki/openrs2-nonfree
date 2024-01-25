import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!rea", name = "M", descriptor = "I")
	public static int anInt8676;

	@OriginalMember(owner = "client!rea", name = "I", descriptor = "Z")
	public static boolean aBoolean656 = false;

	@OriginalMember(owner = "client!rea", name = "J", descriptor = "I")
	public static int anInt8681 = -1;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IILclient!mca;ZLjava/awt/Component;)Lclient!jq;")
	public static Class175 method7423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2, @OriginalArg(4) Component arg3) {
		if (Static608.anInt10099 == 0) {
			throw new IllegalStateException();
		} else if (arg1 >= 2) {
			throw new IllegalArgumentException();
		} else {
			try {
				@Pc(41) Class175 local41 = (Class175) Class.forName("kh").getDeclaredConstructor().newInstance();
				local41.anInt5484 = arg0;
				local41.anIntArray305 = new int[(Static128.aBoolean541 ? 2 : 1) * 256];
				local41.method4697(arg3);
				local41.anInt5482 = (arg0 & -1024) + 1024;
				if (local41.anInt5482 > 16384) {
					local41.anInt5482 = 16384;
				}
				local41.method4699(local41.anInt5482);
				if (Static555.anInt9355 > 0 && Static426.aClass271_1 == null) {
					Static426.aClass271_1 = new Class271();
					Static426.aClass271_1.aClass230_4 = arg2;
					arg2.method5358(Static426.aClass271_1, Static555.anInt9355);
				}
				if (Static426.aClass271_1 != null) {
					if (Static426.aClass271_1.aClass175Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static426.aClass271_1.aClass175Array1[arg1] = local41;
				}
				return local41;
			} catch (@Pc(133) Throwable local133) {
				try {
					@Pc(139) Class175_Sub1 local139 = new Class175_Sub1(arg2, arg1);
					local139.anInt5484 = arg0;
					local139.anIntArray305 = new int[(Static128.aBoolean541 ? 2 : 1) * 256];
					local139.method4697(arg3);
					local139.anInt5482 = 16384;
					local139.method4699(local139.anInt5482);
					if (Static555.anInt9355 > 0 && Static426.aClass271_1 == null) {
						Static426.aClass271_1 = new Class271();
						Static426.aClass271_1.aClass230_4 = arg2;
						arg2.method5358(Static426.aClass271_1, Static555.anInt9355);
					}
					if (Static426.aClass271_1 != null) {
						if (Static426.aClass271_1.aClass175Array1[arg1] != null) {
							throw new IllegalArgumentException();
						}
						Static426.aClass271_1.aClass175Array1[arg1] = local139;
					}
					return local139;
				} catch (@Pc(206) Throwable local206) {
					return new Class175();
				}
			}
		}
	}
}
