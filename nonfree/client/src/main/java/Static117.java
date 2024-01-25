import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
	public static int anInt1906;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_66 = new Class251(18, 0);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)I")
	public static int method1831(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 >>> 31;
		return (local14 + arg1) / arg0 - local14;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!qga;)Lclient!qga;")
	public static Class299 method1833(@OriginalArg(1) Class299 arg0) {
		@Pc(16) Class299 local16 = Static80.method1363(arg0);
		if (local16 == null) {
			local16 = arg0.aClass299_8;
		}
		return local16;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1834(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(16) int local16 = 0; local16 < local6; local16++) {
			local8 = Static621.method8722(arg0.charAt(local16)) + (local8 << 5) - local8;
		}
		return local8;
	}
}
