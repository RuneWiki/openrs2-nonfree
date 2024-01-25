import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "Lclient!qda;")
	public static Class59 aClass59_6;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "Z")
	public static boolean aBoolean212;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
	public static int anInt3093;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public static int anInt3090 = 0;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_121 = new Class196(50, 8);

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!ve;")
	public static final Class370 aClass370_3 = new Class370(8, 1);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)V")
	public static void method2730() {
		@Pc(12) Class5_Sub16 local12 = Static455.method6717(Static161.aClass187_25, Static16.aClass332_8);
		Static479.method7038(local12);
		for (@Pc(25) Class5_Sub4 local25 = (Class5_Sub4) Static131.aClass335_15.method7768(); local25 != null; local25 = (Class5_Sub4) Static131.aClass335_15.method7777()) {
			if (!local25.method8826()) {
				local25 = (Class5_Sub4) Static131.aClass335_15.method7768();
				if (local25 == null) {
					break;
				}
			}
			if (local25.anInt259 == 0) {
				Static272.method3801(local25, true, true);
			}
		}
		if (Static415.aClass394_5 != null) {
			Static609.method8190(Static415.aClass394_5);
			Static415.aClass394_5 = null;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!vm;II)V")
	public static void method2731(@OriginalArg(0) int arg0, @OriginalArg(1) Class378 arg1, @OriginalArg(3) int arg2) {
		Static322.aClass378ArrayArray1[arg0][arg2] = arg1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(JI)V")
	public static void method2732(@OriginalArg(0) long arg0) {
		Static594.aCalendar2.setTime(new Date(arg0));
	}
}
