import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "[Lclient!mh;")
	public static Class239[] aClass239Array1 = new Class239[50];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!cea;Ljava/awt/Component;BI)Lclient!bm;")
	public static Class33 method4877(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Component arg2, @OriginalArg(4) int arg3) {
		if (Static103.anInt1658 == 0) {
			throw new IllegalStateException();
		} else if (arg0 >= 2) {
			throw new IllegalArgumentException();
		} else {
			try {
				@Pc(40) Class33 local40 = (Class33) Class.forName("sv").getDeclaredConstructor().newInstance();
				local40.anIntArray542 = new int[(Static510.aBoolean777 ? 2 : 1) * 256];
				local40.anInt9760 = arg3;
				local40.method8238(arg2);
				local40.anInt9755 = (-1024 & arg3) + 1024;
				if (local40.anInt9755 > 16384) {
					local40.anInt9755 = 16384;
				}
				local40.method8237(local40.anInt9755);
				if (Static209.anInt3629 > 0 && Static565.aClass71_1 == null) {
					Static565.aClass71_1 = new Class71();
					Static565.aClass71_1.aClass47_1 = arg1;
					arg1.method941(Static565.aClass71_1, Static209.anInt3629);
				}
				if (Static565.aClass71_1 != null) {
					if (Static565.aClass71_1.aClass33Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static565.aClass71_1.aClass33Array1[arg0] = local40;
				}
				return local40;
			} catch (@Pc(122) Throwable local122) {
				try {
					@Pc(128) Class33_Sub1 local128 = new Class33_Sub1(arg1, arg0);
					local128.anIntArray542 = new int[(Static510.aBoolean777 ? 2 : 1) * 256];
					local128.anInt9760 = arg3;
					local128.method8238(arg2);
					local128.anInt9755 = 16384;
					local128.method8237(local128.anInt9755);
					if (Static209.anInt3629 > 0 && Static565.aClass71_1 == null) {
						Static565.aClass71_1 = new Class71();
						Static565.aClass71_1.aClass47_1 = arg1;
						arg1.method941(Static565.aClass71_1, Static209.anInt3629);
					}
					if (Static565.aClass71_1 != null) {
						if (Static565.aClass71_1.aClass33Array1[arg0] != null) {
							throw new IllegalArgumentException();
						}
						Static565.aClass71_1.aClass33Array1[arg0] = local128;
					}
					return local128;
				} catch (@Pc(205) Throwable local205) {
					return new Class33();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)V")
	public static void method4879(@OriginalArg(0) int arg0) {
		Static173.anInt3140 = arg0;
	}
}
