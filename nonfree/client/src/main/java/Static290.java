import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!si", name = "n", descriptor = "[I")
	public static int[] anIntArray446;

	@OriginalMember(owner = "client!si", name = "k", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_200 = new Class106("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!si", name = "o", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_186 = new Class217(5, -2);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!jb;ZI)J")
	public static long method5226(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(15) Class71 local15 = Static219.method4081(arg1.method5927());
		@Pc(36) long local36 = (long) (arg2 << 7 | arg0 | arg1.method5925() << 14 | arg1.method5922() << 20 | 0x40000000);
		if (local15.anInt2377 == 0) {
			local36 |= local9;
		}
		if (local15.anInt2409 == 1) {
			local36 |= local5;
		}
		if (local15.aBoolean163) {
			local36 |= local7;
		}
		return local36 | (long) arg1.method5927() << 32;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	public static void method5227(@OriginalArg(0) int arg0) {
		if (!Static209.aBoolean308) {
			arg0 = -1;
		}
		if (arg0 == Static198.anInt4016) {
			return;
		}
		if (arg0 != -1) {
			@Pc(22) Class95 local22 = Static110.method2347(arg0);
			@Pc(26) Class201 local26 = local22.method2822();
			if (local26 == null) {
				arg0 = -1;
			} else {
				Static227.aClass75_5.method2349(new Point(local22.anInt3022, local22.anInt3018), Static174.aCanvas3, local26.method5440(), local26.method5443(), local26.method5439());
				Static198.anInt4016 = arg0;
			}
		}
		if (arg0 == -1 && Static198.anInt4016 != -1) {
			Static227.aClass75_5.method2349(new Point(), Static174.aCanvas3, null, -1, -1);
			Static198.anInt4016 = -1;
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(IIII)I")
	public static int method5228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return ((arg0 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7) + (arg2 >> 1);
	}
}
