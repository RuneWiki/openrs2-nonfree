import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_27 = new Class36(45, 3);

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIZ)I")
	public static int method1135(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return local17 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I")
	public static int method1137(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(25) int local25 = (local10 & 0x33333333) + ((local10 & 0xCCCCCCCF) >>> 2);
		@Pc(42) int local42 = local25 + (local25 >>> 4) & 0xF0F0F0F;
		@Pc(48) int local48 = local42 + (local42 >>> 8);
		@Pc(54) int local54 = local48 + (local48 >>> 16);
		return local54 & 0xFF;
	}
}
