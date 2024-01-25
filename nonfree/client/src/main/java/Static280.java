import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!jia", name = "d", descriptor = "[I")
	public static int[] anIntArray713;

	@OriginalMember(owner = "client!jia", name = "g", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame10;

	@OriginalMember(owner = "client!jia", name = "h", descriptor = "I")
	public static int anInt10342;

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_152 = new Class216(52, 8);

	@OriginalMember(owner = "client!jia", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray49 = new String[100];

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IBI)Z")
	public static boolean method8738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static260.method7099(arg1, arg0) || Static567.method7517(arg0, arg1);
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(Lclient!oaa;Lclient!ha;Lclient!ke;B)V")
	public static void method8740(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class4_Sub30 arg2) {
		@Pc(10) Class17 local10 = arg0.method5866(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5268();
		if (local16 < local10.method5253()) {
			local16 = local10.method5253();
		}
		@Pc(32) int local32 = arg2.anInt4801;
		@Pc(35) int local35 = arg2.anInt4796;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(82) int local82;
		if (arg0.aString80 != null) {
			local37 = Static321.aClass31_5.method1023((int[]) null, arg0.aString80, Static326.aStringArray25, (Class17[]) null);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static326.aStringArray25[local55];
				if (local37 - 1 > local55) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static37.aClass157_1.method3370(local61);
				if (local82 > local39) {
					local39 = local82;
				}
			}
			local41 = local37 * Static37.aClass157_1.method3373() + Static37.aClass157_1.method3375() / 2;
		}
		local55 = local16 / 2 + arg2.anInt4801;
		@Pc(112) int local112 = arg2.anInt4796;
		if (Static154.anInt430 + local16 > local32) {
			local55 = local39 / 2 + Static154.anInt430 + local16 / 2 + 10 + 5;
			local32 = Static154.anInt430;
		} else if (Static154.anInt432 - local16 < local32) {
			local32 = Static154.anInt432 - local16;
			local55 = Static154.anInt432 - local16 / 2 - local39 / 2 - 5 - 10;
		}
		if (Static154.anInt431 + local16 > local35) {
			local35 = Static154.anInt431;
			local112 = local16 / 2 + Static154.anInt431 + 10;
		} else if (local35 > Static154.anInt436 - local16) {
			local112 = Static154.anInt436 - local41 - local16 / 2 - 10;
			local35 = Static154.anInt436 - local16;
		}
		local82 = (int) (Math.atan2((double) (local32 - arg2.anInt4801), (double) (local35 - arg2.anInt4796)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5252((float) local32 + (float) local16 / 2.0F, (float) local16 / 2.0F + (float) local35, 4096, local82);
		@Pc(252) int local252 = -2;
		@Pc(254) int local254 = -2;
		@Pc(256) int local256 = -2;
		@Pc(258) int local258 = -2;
		if (arg0.aString80 != null) {
			local254 = local112;
			local252 = local55 - local39 / 2 - 5;
			local256 = local252 + local39 + 10;
			local258 = local112 + Static37.aClass157_1.method3373() * local37 + 3;
			if (arg0.anInt6655 != 0) {
				arg1.method8103(local252, local112, arg0.anInt6655, local258 - local112, -local252 + local256);
			}
			if (arg0.anInt6664 != 0) {
				arg1.method8100(local256 - local252, local112, local252, local258 - local112, arg0.anInt6664);
			}
			for (@Pc(331) int local331 = 0; local331 < local37; local331++) {
				@Pc(337) String local337 = Static326.aStringArray25[local331];
				if (local331 < local37 - 1) {
					local337 = local337.substring(0, local337.length() - 4);
				}
				Static37.aClass157_1.method3372(arg1, local337, local55, local112, arg0.anInt6662);
				local112 += Static37.aClass157_1.method3373();
			}
		}
		if (arg0.anInt6678 == -1 && arg0.aString80 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(393) Class4_Sub32 local393 = new Class4_Sub32(arg2);
		local393.anInt5356 = local252;
		local393.anInt5357 = local32 + local16;
		local393.anInt5361 = local254;
		local393.anInt5362 = local35 + local16;
		local393.anInt5353 = local35 - local16;
		local393.anInt5354 = local258;
		local393.anInt5359 = local32 - local16;
		local393.anInt5358 = local256;
		Static600.aClass163_64.method3646(local393);
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(Z)V")
	public static void method8741() {
		Static337.method4620();
	}
}
