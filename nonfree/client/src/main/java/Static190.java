import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
	public static int anInt4314 = 0;

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "[[B")
	public static final byte[][] aByteArrayArray14 = new byte[1000][];

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "I")
	public static int anInt4325 = -50;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)Z")
	public static boolean method3577(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method3578(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(35) int local35 = 0;
			for (@Pc(37) long local37 = arg0; local37 != 0L; local37 /= 37L) {
				local35++;
			}
			@Pc(55) StringBuffer local55 = new StringBuffer(local35);
			while (arg0 != 0L) {
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				local55.append(Static352.aCharArray8[(int) (local59 - arg0 * 37L)]);
			}
			return local55.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZI)Z")
	public static boolean method3581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/io/File;I)[B")
	public static byte[] method3585(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg0];
			Static214.method3928(local6, arg1, arg0);
			return local6;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
	public static void method3586() {
		for (@Pc(6) Class4_Sub5 local6 = (Class4_Sub5) Static499.aClass90_5.method2319(); local6 != null; local6 = (Class4_Sub5) Static499.aClass90_5.method2319()) {
			Static244.method4214(local6);
		}
		@Pc(31) int local31;
		@Pc(29) int local29;
		if (Static7.aClass3_Sub15_Sub1_1.method6954(Static382.anInt7091)) {
			local29 = 3;
			local31 = 0;
		} else {
			local29 = Static445.anInt8174;
			local31 = Static445.anInt8174;
		}
		Static63.method1282();
		for (@Pc(40) int local40 = local31; local40 <= local29; local40++) {
			Static63.method1291();
			Static63.method1290(local40);
			Static63.method1279(local40);
		}
		Static63.method1292();
		Static63.method1294();
	}
}
