import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!caa", name = "j", descriptor = "Lclient!mh;")
	public static final Class225 aClass225_30 = new Class225(7, 2);

	@OriginalMember(owner = "client!caa", name = "t", descriptor = "Z")
	public static boolean aBoolean782 = false;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(B[[BLclient!cea;)V")
	public static void method7497(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class50_Sub1 arg1) {
		@Pc(16) int local16 = Static571.aByteArrayArray23.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(24) byte[] local24 = arg0[local18];
			if (local24 != null) {
				@Pc(37) int local37 = (Static301.anIntArray349[local18] >> 8) * 64 - Static485.anInt7725;
				@Pc(48) int local48 = (Static301.anIntArray349[local18] & 0xFF) * 64 - Static310.anInt5129;
				Static574.method7450();
				arg1.method1057(local24, Static417.aClass162_17, local37, local48, Static87.aClass362Array3);
			}
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method7504(@OriginalArg(1) String arg0) {
		@Pc(11) String local11 = Static87.method7703(Static367.method5177(arg0));
		if (local11 == null) {
			local11 = "";
		}
		return local11;
	}
}
