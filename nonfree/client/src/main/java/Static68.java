import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!co", name = "g", descriptor = "I")
	public static int anInt1145;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
	public static void method884() {
		@Pc(7) Class249[] local7 = Class45.aClass249Array3;
		synchronized (Class45.aClass249Array3) {
			for (@Pc(18) int local18 = 0; local18 < Class45.aClass249Array3.length; local18++) {
				Class45.aClass249Array3[local18] = new Class249();
				Static98.anIntArray234[local18] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)I")
	public static int method885(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
