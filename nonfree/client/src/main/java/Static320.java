import java.awt.Canvas;
import java.awt.Dimension;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "Lclient!hj;")
	public static final Class158 aClass158_7 = new Class158(8, 0, 4, 1);

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	public static void method5028(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static340.method5225(local6.width, local6.height);
		if (Static290.anInt10204 == 1) {
			Static409.aClass75_13.method6668(arg0, Static367.anInt6186, Static294.anInt5224);
		} else {
			Static409.aClass75_13.method6668(arg0, Static334.anInt5734, Static159.anInt3316);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5029(@OriginalArg(1) String arg0) {
		if (!Static606.aClass122_36.aBoolean281) {
			return -1;
		} else if (Static326.aHashtable5.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(22) String local22 = Static362.method5504(arg0);
			if (local22 == null) {
				return -1;
			}
			@Pc(36) String local36 = Static318.aString62 + local22;
			if (!Static168.aClass223_31.method5278("", local36)) {
				return -1;
			} else if (Static168.aClass223_31.method5258(local36)) {
				@Pc(71) byte[] local71 = Static168.aClass223_31.method5284(local36, "");
				@Pc(77) File local77;
				try {
					local77 = Static134.method2565(local22);
				} catch (@Pc(79) RuntimeException local79) {
					return -1;
				}
				if (local71 == null || local77 == null) {
					return -1;
				}
				@Pc(89) boolean local89 = true;
				@Pc(95) byte[] local95 = Static54.method653(local77);
				if (local95 != null && local95.length == local71.length) {
					for (@Pc(110) int local110 = 0; local110 < local95.length; local110++) {
						if (local71[local110] != local95[local110]) {
							local89 = false;
							break;
						}
					}
				} else {
					local89 = false;
				}
				try {
					if (!local89) {
						Static606.aClass122_36.method3347(local71, local77);
					}
				} catch (@Pc(152) Throwable local152) {
					return -1;
				}
				Static689.method9045(local77, arg0);
				return 100;
			} else {
				return Static168.aClass223_31.method5274(local36);
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V")
	public static void method5031(@OriginalArg(0) int arg0) {
		@Pc(9) Class6_Sub2_Sub4 local9 = Static602.method8315((long) arg0, 2);
		local9.method2038();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V")
	public static void method5032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class6_Sub2_Sub4 local13 = Static602.method8315(0L, 15);
		local13.method2040();
		local13.anInt2113 = arg1;
		local13.anInt2111 = arg0;
	}
}
