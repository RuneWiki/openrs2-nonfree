import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
	public static int anInt5130;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
	public static int anInt5131;

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "Ljava/awt/Image;")
	public static Image anImage12;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "Lclient!hda;")
	public static final Class143 aClass143_6 = new Class143();

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_76 = new Class274(74, 6);

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZIIII)Z")
	public static boolean method4281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static417.aBoolean571 || !Static253.aBoolean399) {
			return false;
		} else if (Static141.anInt3106 < 100) {
			return false;
		} else if (Static182.method3302(arg3, arg0, arg2)) {
			@Pc(33) int local33 = arg2 << Static415.anInt7579;
			@Pc(37) int local37 = arg0 << Static415.anInt7579;
			if (Static24.method592(Static312.anInt5690, local33, Static331.aClass112Array3[arg3].method7819(arg0, arg2), Static312.anInt5690, local37, arg1)) {
				Static33.anInt861++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Lclient!ht;")
	public static Class11_Sub1_Sub4 method4286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static440.aClass217ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass11_Sub1_Sub4_1 == null ? null : local7.aClass11_Sub1_Sub4_1;
	}
}
