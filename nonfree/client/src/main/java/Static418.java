import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!kq;")
	public static final Class184 aClass184_11 = new Class184(4, 1);

	@OriginalMember(owner = "client!q", name = "c", descriptor = "J")
	public static long aLong231 = 20000000L;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Lclient!bp;")
	public static final Class40 aClass40_5 = Static500.method7216();

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BIIII)V")
	public static void method6587(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static141.anInt10589 == 1) {
			Static154.aClass88Array2[Static517.anInt10518 / 100].method8051(Static277.anInt5776 - 8, Static517.anInt10521 - 8);
		}
		if (Static141.anInt10589 == 2) {
			Static154.aClass88Array2[Static517.anInt10518 / 100 + 4].method8051(Static277.anInt5776 - 8, Static517.anInt10521 + -8);
		}
		Static365.method5511();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
	public static int method6588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static511.anIntArrayArray56 == null ? 0 : Static511.anIntArrayArray56[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public static void method6589() {
		@Pc(5) Class167 local5 = Static580.aClass167_36;
		synchronized (Static580.aClass167_36) {
			Static580.aClass167_36.method3975();
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)I")
	public static int method6590(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static8.anInt745 - 1; local3++) {
			if (arg0 < Static13.anIntArray13[local3] + Static427.anIntArray456[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static8.anInt745 - 1;
		}
		return local1;
	}
}
