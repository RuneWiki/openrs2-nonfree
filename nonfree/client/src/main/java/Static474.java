import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public static int anInt1074;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!tca;")
	public static final Class307 aClass307_3 = new Class307(9, 2);

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_21 = new Class81(51, 12);

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	public static int anInt1075 = 0;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	public static int anInt1076 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method986(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(25) char local25 = arg0.charAt(local12);
			if (local25 <= '\u007f') {
				local10++;
			} else if (local25 > '\u07ff') {
				local10 += 3;
			} else {
				local10 += 2;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(FIIIIIZII)[[I")
	public static int[][] method988(@OriginalArg(0) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(27) Class1_Sub1_Sub32 local27 = new Class1_Sub1_Sub32();
		local27.aBoolean635 = false;
		local27.anInt8703 = 4;
		local27.anInt8692 = 4;
		local27.anInt8701 = (int) (arg0 * 4096.0F);
		local27.anInt8704 = 3;
		local27.method7885();
		Static94.method1795(256, 64);
		for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
			local27.method7177(local9[local54], local54);
		}
		return local9;
	}
}
