import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)Z")
	public static boolean method6580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static107.method7094(arg1, arg0) | (arg0 & 0x70000) != 0 || Static611.method9090(arg0, arg1);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIILclient!uw;)Lclient!jk;")
	public static Class2_Sub6_Sub11 method6582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class350 arg2) {
		@Pc(10) int local10 = arg2.anInt10371 | arg0 << 10;
		@Pc(19) Class2_Sub6_Sub11 local19 = (Class2_Sub6_Sub11) Static8.aClass379_1.method9219((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static38.aClass157_28.method4569(Static38.aClass157_28.method4577(local10));
		if (local31 == null) {
			local10 = arg2.anInt10371 | arg1 + 65536 << 10;
			local19 = (Class2_Sub6_Sub11) Static8.aClass379_1.method9219((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static38.aClass157_28.method4569(Static38.aClass157_28.method4577(local10));
			if (local31 == null) {
				local10 = arg2.anInt10371 | 0x3FFFC00;
				local19 = (Class2_Sub6_Sub11) Static8.aClass379_1.method9219((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static38.aClass157_28.method4569(Static38.aClass157_28.method4577(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static257.method4730(local31);
					} catch (@Pc(191) Exception local191) {
						throw new RuntimeException(local191.getMessage() + " S: " + local10);
					}
					local19.aClass350_4 = arg2;
					Static8.aClass379_1.method9222((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static257.method4730(local31);
				} catch (@Pc(121) Exception local121) {
					throw new RuntimeException(local121.getMessage() + " S: " + local10);
				}
				local19.aClass350_4 = arg2;
				Static8.aClass379_1.method9222((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static257.method4730(local31);
			} catch (@Pc(47) Exception local47) {
				throw new RuntimeException(local47.getMessage() + " S: " + local10);
			}
			local19.aClass350_4 = arg2;
			Static8.aClass379_1.method9222((long) local10 << 16, local19);
			return local19;
		}
	}
}
