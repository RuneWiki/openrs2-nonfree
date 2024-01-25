import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static679 {

	@OriginalMember(owner = "client!ww", name = "q", descriptor = "Lclient!qha;")
	public static final Class291 aClass291_46 = new Class291(16);

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "(I)V")
	public static void method9319() {
		@Pc(1) Class391 local1 = Static108.aClass391_10;
		synchronized (Static108.aClass391_10) {
			Static108.aClass391_10.method9286();
		}
	}

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "(I)V")
	public static void method9320() {
		Static670.anInt10721 = 1;
		Static295.anInt5127 = -1;
		@Pc(9) String local9 = null;
		if (Static672.aByteArray113 != null) {
			@Pc(16) Class5_Sub23 local16 = new Class5_Sub23(Static672.aByteArray113);
			local9 = Static447.method6658(local16.method8509());
			Static183.aLong91 = local16.method8509();
		}
		if (local9 == null) {
			Static326.method4967(35);
		} else {
			Static261.method3843(false, true, "", local9);
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IJIIZ)Ljava/lang/String;")
	public static String method9322(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg1 < 0L) {
			arg1 = -arg1;
			local27 = true;
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(26);
		@Pc(45) int local45;
		@Pc(50) int local50;
		if (arg0 > 0) {
			for (local45 = 0; local45 < arg0; local45++) {
				local50 = (int) arg1;
				arg1 /= 10L;
				local41.append((char) (local50 + 48 - (int) arg1 * 10));
			}
			local41.append(local7);
		}
		local45 = 0;
		while (true) {
			local50 = (int) arg1;
			arg1 /= 10L;
			local41.append((char) (local50 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local27) {
					local41.append('-');
				}
				return local41.reverse().toString();
			}
			if (arg3) {
				local45++;
				if (local45 % 3 == 0) {
					local41.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "(I)Z")
	public static boolean method9323() {
		return Static481.anInt8130 > 0;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIB)Z")
	public static boolean method9324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(III)I")
	public static int method9325(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static395.anIntArray384[arg1 & 0x3] : Static205.anIntArray194[arg1 & 0x3];
	}
}
