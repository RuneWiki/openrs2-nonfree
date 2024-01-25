import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!ni", name = "O", descriptor = "Lclient!aj;")
	public static Class15 aClass15_107;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_45 = new Class165(8);

	@OriginalMember(owner = "client!ni", name = "K", descriptor = "Lclient!naa;")
	public static final Class232 aClass232_4 = new Class232();

	@OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
	public static int anInt6411 = 0;

	@OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
	public static int anInt6412 = 0;

	@OriginalMember(owner = "client!ni", name = "R", descriptor = "S")
	public static short aShort71 = 256;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/awt/Component;ILclient!qn;I)Lclient!gw;")
	public static Class127 method5707(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class291 arg2, @OriginalArg(4) int arg3) {
		if (Static348.anInt5701 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(31) Class127 local31 = (Class127) Class.forName("Class127_Sub2").getDeclaredConstructor().newInstance();
			local31.anInt8660 = arg3;
			local31.anIntArray739 = new int[(Static219.aBoolean313 ? 2 : 1) * 256];
			local31.method7572(arg0);
			local31.anInt8652 = (arg3 & 0xFFFFFC00) + 1024;
			if (local31.anInt8652 > 16384) {
				local31.anInt8652 = 16384;
			}
			local31.method7561(local31.anInt8652);
			if (Static163.anInt3211 > 0 && Static601.aClass162_1 == null) {
				Static601.aClass162_1 = new Class162();
				Static601.aClass162_1.aClass291_4 = arg2;
				arg2.method7136(Static601.aClass162_1, Static163.anInt3211);
			}
			if (Static601.aClass162_1 != null) {
				if (Static601.aClass162_1.aClass127Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static601.aClass162_1.aClass127Array1[arg1] = local31;
			}
			return local31;
		} catch (@Pc(104) Throwable local104) {
			try {
				@Pc(110) Class127_Sub1 local110 = new Class127_Sub1(arg2, arg1);
				local110.anIntArray739 = new int[(Static219.aBoolean313 ? 2 : 1) * 256];
				local110.anInt8660 = arg3;
				local110.method7572(arg0);
				local110.anInt8652 = 16384;
				local110.method7561(local110.anInt8652);
				if (Static163.anInt3211 > 0 && Static601.aClass162_1 == null) {
					Static601.aClass162_1 = new Class162();
					Static601.aClass162_1.aClass291_4 = arg2;
					arg2.method7136(Static601.aClass162_1, Static163.anInt3211);
				}
				if (Static601.aClass162_1 != null) {
					if (Static601.aClass162_1.aClass127Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static601.aClass162_1.aClass127Array1[arg1] = local110;
				}
				return local110;
			} catch (@Pc(174) Throwable local174) {
				return new Class127();
			}
		}
	}
}
