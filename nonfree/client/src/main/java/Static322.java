import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
	public static int anInt6491;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "[S")
	private static final short[] aShortArray90 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
	public static int anInt6492 = -1;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
	public static int anInt6495 = 0;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "[S")
	private static final short[] aShortArray91 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ll", name = "o", descriptor = "[S")
	private static final short[] aShortArray92 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ll", name = "q", descriptor = "[[S")
	public static final short[][] aShortArrayArray9 = new short[][] { aShortArray91, aShortArray92, aShortArray90 };

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method5435(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static655.method6406(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IC)Z")
	public static boolean method5437(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(28) char[] local28 = Static565.aCharArray7;
			for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
				@Pc(36) char local36 = local28[local30];
				if (local36 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!d;BLclient!kha;ILjava/awt/Canvas;I)Lclient!ha;")
	public static Class33 method5439(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) Class181 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg3 != null) {
			@Pc(12) Dimension local12 = arg3.getSize();
			local7 = local12.height;
			local5 = local12.width;
		}
		return Static195.method6180(arg1, arg0, arg3, arg2, local7, local5, arg4);
	}
}
