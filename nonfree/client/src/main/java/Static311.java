import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!kka", name = "f", descriptor = "I")
	public static int anInt5530;

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "I")
	public static int anInt5526 = 0;

	@OriginalMember(owner = "client!kka", name = "b", descriptor = "Lclient!ga;")
	public static final Class124 aClass124_49 = new Class124();

	@OriginalMember(owner = "client!kka", name = "c", descriptor = "I")
	public static int anInt5527 = 1;

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Ljava/net/Socket;II)Lclient!wb;")
	public static Class240 method4773(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class240_Sub1(arg0, 15000);
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(Ljava/lang/String;IZILjava/lang/String;BZ)V")
	public static void method4774(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(6) boolean arg5) {
		Static655.aClass50_185.anInt990 = 1;
		@Pc(9) String local9 = arg0.toLowerCase();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = -1;
		@Pc(16) String local16 = null;
		if (arg3 != -1) {
			@Pc(27) Class53 local27 = Static522.aClass282_2.method6901(arg3);
			if (local27 == null || local27.method956() != arg5) {
				return;
			}
			if (local27.method956()) {
				local16 = local27.aString9;
			} else {
				local14 = local27.anInt1028;
			}
		}
		@Pc(50) int local50 = 0;
		for (@Pc(52) int local52 = 0; local52 < Static259.aClass135_1.anInt3162; local52++) {
			@Pc(58) Class219 local58 = Static259.aClass135_1.method2776(local52);
			if ((!arg2 || local58.aBoolean450) && local58.anInt6104 == -1 && local58.anInt6116 == -1 && local58.anInt6126 == -1 && local58.anInt6109 == 0 && local58.aString61.toLowerCase().indexOf(local9) != -1) {
				if (arg3 != -1) {
					if (arg5) {
						if (!arg4.equals(local58.method5181(arg3, local16))) {
							continue;
						}
					} else if (arg1 != local58.method5168(local14, arg3)) {
						continue;
					}
				}
				if (local50 >= 250) {
					Static219.aShortArray46 = null;
					Static500.anInt8516 = -1;
					return;
				}
				if (local50 >= local12.length) {
					@Pc(138) short[] local138 = new short[local12.length * 2];
					for (@Pc(140) int local140 = 0; local140 < local50; local140++) {
						local138[local140] = local12[local140];
					}
					local12 = local138;
				}
				local12[local50++] = (short) local52;
			}
		}
		Static547.anInt8953 = 0;
		Static219.aShortArray46 = local12;
		Static500.anInt8516 = local50;
		@Pc(178) String[] local178 = new String[Static500.anInt8516];
		for (@Pc(180) int local180 = 0; local180 < Static500.anInt8516; local180++) {
			local178[local180] = Static259.aClass135_1.method2776(local12[local180]).aString61;
		}
		Static182.method5927(local178, Static219.aShortArray46);
		Static655.aClass50_185.method903();
		Static655.aClass50_185.anInt990 = 2;
	}
}
