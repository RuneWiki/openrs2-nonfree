import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "Z")
	public static boolean aBoolean392 = false;

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_196 = new Class123(66, -2);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method4667(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub7_Sub19 local13 = Static73.method5992(2, arg1);
		local13.method7363();
		local13.aString244 = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II[S)[S")
	public static short[] method4668(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static604.method6226(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!pca;II)V")
	public static void method4669(@OriginalArg(0) int arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(3) int arg2) {
		Static234.anInt10332 = arg0;
		Static429.anInt7992 = arg2;
		Static543.aClass251_14 = arg1;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BII)Z")
	public static boolean method4671(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BI)Z")
	public static boolean method4673(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static349.aCharArray7[local7 - 128] != '\u0000';
		}
	}
}
