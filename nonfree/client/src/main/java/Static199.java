import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "Lclient!ts;")
	public static Class226 aClass226_1;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([BI)Lclient!js;", line = 38)
	public static Class2_Sub2_Sub11 method3746(@OriginalArg(0) byte[] arg0) {
		@Pc(16) Class2_Sub2_Sub11 local16 = new Class2_Sub2_Sub11();
		@Pc(21) Class2_Sub4 local21 = new Class2_Sub4(arg0);
		local21.anInt5289 = local21.aByteArray73.length - 2;
		@Pc(32) int local32 = local21.method4830();
		@Pc(43) int local43 = local21.aByteArray73.length - local32 - 2 - 12;
		local21.anInt5289 = local43;
		@Pc(50) int local50 = local21.method4837();
		local16.anInt3221 = local21.method4830();
		local16.anInt3224 = local21.method4830();
		local16.anInt3226 = local21.method4830();
		local16.anInt3223 = local21.method4830();
		@Pc(74) int local74 = local21.method4816();
		@Pc(85) int local85;
		@Pc(91) int local91;
		if (local74 > 0) {
			local16.aClass4Array1 = new Class4[local74];
			for (local85 = 0; local85 < local74; local85++) {
				local91 = local21.method4830();
				@Pc(98) Class4 local98 = new Class4(Static152.method2978(local91));
				local16.aClass4Array1[local85] = local98;
				while (local91-- > 0) {
					@Pc(109) int local109 = local21.method4837();
					@Pc(115) int local115 = local21.method4837();
					local98.method87(new Class2_Sub39(local115), (long) local109);
				}
			}
		}
		local21.anInt5289 = 0;
		local16.aString27 = local21.method4860();
		local16.aStringArray27 = new String[local50];
		local16.anIntArray200 = new int[local50];
		local16.anIntArray199 = new int[local50];
		local85 = 0;
		while (local43 > local21.anInt5289) {
			local91 = local21.method4830();
			if (local91 == 3) {
				local16.aStringArray27[local85] = local21.method4810().intern();
			} else if (local91 >= 100 || local91 == 21 || local91 == 38 || local91 == 39) {
				local16.anIntArray200[local85] = local21.method4816();
			} else {
				local16.anIntArray200[local85] = local21.method4837();
			}
			local16.anIntArray199[local85++] = local91;
		}
		return local16;
	}
}
