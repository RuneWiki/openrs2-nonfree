import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!naa", name = "L", descriptor = "J")
	public static long aLong162;

	@OriginalMember(owner = "client!naa", name = "K", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_112 = new Class286(16, 7);

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "(B)V")
	public static void method5248() {
		if (Static79.aClass14_1 != null) {
			Static79.aClass14_1.method5518();
		}
		if (Static417.aClass14_2 != null) {
			Static417.aClass14_2.method5518();
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "([BI)Lclient!it;")
	public static Class2_Sub3_Sub8 method5249(@OriginalArg(0) byte[] arg0) {
		@Pc(17) Class2_Sub3_Sub8 local17 = new Class2_Sub3_Sub8();
		@Pc(22) Class2_Sub15 local22 = new Class2_Sub15(arg0);
		local22.anInt5241 = local22.aByteArray62.length - 2;
		@Pc(33) int local33 = local22.method4294();
		@Pc(43) int local43 = local22.aByteArray62.length - local33 - 12 - 2;
		local22.anInt5241 = local43;
		@Pc(50) int local50 = local22.method4307();
		local17.anInt4340 = local22.method4294();
		local17.anInt4341 = local22.method4294();
		local17.anInt4339 = local22.method4294();
		local17.anInt4335 = local22.method4294();
		@Pc(74) int local74 = local22.method4325();
		@Pc(85) int local85;
		@Pc(91) int local91;
		if (local74 > 0) {
			local17.aClass162Array1 = new Class162[local74];
			for (local85 = 0; local85 < local74; local85++) {
				local91 = local22.method4294();
				@Pc(98) Class162 local98 = new Class162(Static89.method7259(local91));
				local17.aClass162Array1[local85] = local98;
				while (local91-- > 0) {
					@Pc(109) int local109 = local22.method4307();
					@Pc(113) int local113 = local22.method4307();
					local98.method3522(new Class2_Sub22(local113), (long) local109);
				}
			}
		}
		local22.anInt5241 = 0;
		local17.aString32 = local22.method4297();
		local17.anIntArray278 = new int[local50];
		local17.aStringArray71 = new String[local50];
		local17.anIntArray277 = new int[local50];
		local85 = 0;
		while (local22.anInt5241 < local43) {
			local91 = local22.method4294();
			if (local91 == 3) {
				local17.aStringArray71[local85] = local22.method4324().intern();
			} else if (local91 >= 100 || local91 == 21 || local91 == 38 || local91 == 39) {
				local17.anIntArray277[local85] = local22.method4325();
			} else {
				local17.anIntArray277[local85] = local22.method4307();
			}
			local17.anIntArray278[local85++] = local91;
		}
		return local17;
	}

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "(B)Lclient!eaa;")
	public static Class2_Sub3_Sub3 method5250() {
		return Static270.aClass2_Sub3_Sub3_2;
	}
}
