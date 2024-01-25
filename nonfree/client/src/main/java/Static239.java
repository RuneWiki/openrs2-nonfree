import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZII)Z")
	public static boolean method3386(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!et;Z)Lclient!bw;")
	public static Class2_Sub11 method3390(@OriginalArg(0) Class2_Sub20 arg0) {
		arg0.method8581(-17416);
		@Pc(23) int local23 = arg0.method8581(-17416);
		@Pc(27) Class2_Sub11 local27 = Static381.method5506(local23);
		local27.anInt10918 = arg0.method8581(-17416);
		@Pc(36) int local36 = arg0.method8581(-17416);
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(44) int local44 = arg0.method8581(-17416);
			local27.method9532(local44, arg0);
		}
		local27.method9530();
		return local27;
	}
}
