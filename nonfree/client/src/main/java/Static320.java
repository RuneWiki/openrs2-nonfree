import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!pu", name = "A", descriptor = "Lclient!l;")
	public static Interface4 anInterface4_7;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIILclient!ul;IZ)Ljava/awt/Frame;")
	public static Frame method4788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class255 arg3) {
		if (!arg3.method5826()) {
			return null;
		}
		@Pc(22) Class261[] local22 = Static228.method3893(arg3);
		if (local22 == null) {
			return null;
		}
		@Pc(28) boolean local28 = false;
		for (@Pc(30) int local30 = 0; local30 < local22.length; local30++) {
			if (arg0 == local22[local30].anInt7470 && local22[local30].anInt7469 == arg2 && (!local28 || local22[local30].anInt7468 > arg1)) {
				local28 = true;
				arg1 = local22[local30].anInt7468;
			}
		}
		if (!local28) {
			return null;
		}
		@Pc(91) Class87 local91 = arg3.method5839(arg2, arg1, arg0);
		while (local91.anInt2679 == 0) {
			Static77.method1653(10L);
		}
		@Pc(103) Frame local103 = (Frame) local91.anObject3;
		if (local103 == null) {
			return null;
		} else if (local91.anInt2679 == 2) {
			Static302.method4668(local103, arg3);
			return null;
		} else {
			return local103;
		}
	}
}
