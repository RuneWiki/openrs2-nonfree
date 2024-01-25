import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "Lclient!pa;")
	public static Class272 aClass272_2;

	@OriginalMember(owner = "client!rn", name = "w", descriptor = "D")
	public static double aDouble21;

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "Lclient!aq;")
	public static final Class22 aClass22_48 = new Class22(5);

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
	public static final int anInt9194 = 1409;

	@OriginalMember(owner = "client!rn", name = "D", descriptor = "S")
	public static short aShort101 = 256;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!ol;I)Lclient!hda;")
	public static Class139 method8052(@OriginalArg(0) Class2_Sub8 arg0) {
		@Pc(12) Class236 local12 = Static566.method8589()[arg0.method5203()];
		@Pc(19) Class103 local19 = Static277.method9737()[arg0.method5203()];
		@Pc(23) int local23 = arg0.method5174();
		@Pc(27) int local27 = arg0.method5174();
		@Pc(31) int local31 = arg0.method5211();
		@Pc(35) int local35 = arg0.method5211();
		@Pc(39) int local39 = arg0.method5174();
		@Pc(43) int local43 = arg0.method5172();
		@Pc(51) int local51 = arg0.method5172();
		return new Class139(local12, local19, local23, local27, local31, local35, local39, local43, local51);
	}
}
