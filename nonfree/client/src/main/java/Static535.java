import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!sw", name = "B", descriptor = "[Lclient!cw;")
	public static Class61[] aClass61Array13;

	@OriginalMember(owner = "client!sw", name = "C", descriptor = "[I")
	public static int[] anIntArray593;

	@OriginalMember(owner = "client!sw", name = "J", descriptor = "Lclient!wu;")
	public static Class380 aClass380_120;

	@OriginalMember(owner = "client!sw", name = "A", descriptor = "[I")
	public static final int[] anIntArray592 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V")
	public static void method7387(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1) {
		Static292.aHashtable3.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)V")
	public static void method7389() {
		if (Static452.aClass226_6.aBoolean415) {
			Static234.anInt10094 = 96;
			return;
		}
		try {
			@Pc(23) Method local23 = Runtime.class.getMethod("maxMemory");
			if (local23 != null) {
				try {
					@Pc(27) Runtime local27 = Runtime.getRuntime();
					@Pc(33) Long local33 = (Long) local23.invoke(local27, (Object[]) null);
					Static234.anInt10094 = (int) (local33 / 1048576L) + 1;
				} catch (@Pc(43) Throwable local43) {
				}
			}
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIIIII)V")
	public static void method7390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 != 8 && arg5 != 16) {
			@Pc(32) Class53 local32 = Static28.aClass53ArrayArrayArray1[arg3][arg2][arg0];
			if (local32 == null) {
				local32 = new Class53(arg3);
			}
			if (arg5 == 1) {
				local32.aShort21 = (short) arg4;
				local32.aShort24 = (short) arg1;
			} else if (arg5 == 2) {
				local32.aShort22 = (short) arg1;
				local32.aShort23 = (short) arg4;
			}
			if (Static82.aBoolean120) {
				Static46.method752();
				return;
			}
			return;
		}
		@Pc(77) int local77;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(97) int local97;
		@Pc(109) int local109;
		if (arg5 == 8) {
			local77 = arg2 << Static609.anInt9827;
			local81 = local77 + Static192.anInt3298;
			local85 = arg0 << Static609.anInt9827;
			local89 = local85 + Static192.anInt3298;
			local97 = Static462.aClass76Array3[arg3].method7396(arg0, arg2);
			local109 = Static462.aClass76Array3[arg3].method7396(arg0 + 1, arg2 + 1);
			Static422.aClass327Array4[Static296.anInt4855++] = new Class327(arg5, arg3, local77, local81, local81, local77, local97, local109, local109 - arg1, -arg1 + local97, local85, local89, local89, local85);
			return;
		}
		local77 = (arg2 << Static609.anInt9827) + Static192.anInt3298;
		local81 = local77 - Static192.anInt3298;
		local85 = arg0 << Static609.anInt9827;
		local89 = Static192.anInt3298 + local85;
		local97 = Static462.aClass76Array3[arg3].method7396(arg0, arg2 + 1);
		local109 = Static462.aClass76Array3[arg3].method7396(arg0 + 1, arg2);
		Static422.aClass327Array4[Static296.anInt4855++] = new Class327(arg5, arg3, local77, local81, local81, local77, local97, local109, local109 - arg1, local97 - arg1, local85, local89, local89, local85);
	}
}
