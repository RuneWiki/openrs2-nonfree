import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_12 = new Class185(66, -1);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method794() {
		for (@Pc(14) Class6_Sub5_Sub4 local14 = (Class6_Sub5_Sub4) Static158.aClass163_20.method4966(); local14 != null; local14 = (Class6_Sub5_Sub4) Static158.aClass163_20.method4965()) {
			@Pc(19) Class9_Sub4_Sub2_Sub3 local19 = local14.aClass9_Sub4_Sub2_Sub3_1;
			if (local19.aBoolean603) {
				local14.method8792();
				local19.method6484();
			} else if (local19.anInt7677 <= Static384.anInt7234) {
				local19.method6490(Static492.anInt8597);
				if (local19.aBoolean603) {
					local14.method8792();
				} else {
					Static397.method6261(local19, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIB)Z")
	public static boolean method795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
