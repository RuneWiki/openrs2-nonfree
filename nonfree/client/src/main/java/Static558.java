import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!sh", name = "U", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_228 = new Class251(44, 3);

	@OriginalMember(owner = "client!sh", name = "Q", descriptor = "Lclient!fw;")
	public static final Class125 aClass125_39 = new Class125(8);

	@OriginalMember(owner = "client!sh", name = "L", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_231 = new Class160(57, 8);

	@OriginalMember(owner = "client!sh", name = "O", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_232 = new Class160(17, 6);

	@OriginalMember(owner = "client!sh", name = "P", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_233 = new Class160(8, 2);

	@OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
	public static int anInt9347 = -1;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method8062(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < Static261.anInt4885; local10++) {
			if (arg0.equalsIgnoreCase(Static265.aStringArray23[local10])) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(ZI)Z")
	public static boolean method8063(@OriginalArg(1) int arg0) {
		if (Static590.aBooleanArray24[arg0]) {
			return true;
		} else if (Static132.aClass310_32.method7776(arg0)) {
			@Pc(23) int local23 = Static132.aClass310_32.method7773(arg0);
			if (local23 == 0) {
				Static590.aBooleanArray24[arg0] = true;
				return true;
			}
			if (Static339.aClass299ArrayArray1[arg0] == null) {
				Static339.aClass299ArrayArray1[arg0] = new Class299[local23];
			}
			for (@Pc(48) int local48 = 0; local48 < local23; local48++) {
				if (Static339.aClass299ArrayArray1[arg0][local48] == null) {
					@Pc(61) byte[] local61 = Static132.aClass310_32.method7803(local48, arg0);
					if (local61 != null) {
						@Pc(73) Class299 local73 = Static339.aClass299ArrayArray1[arg0][local48] = new Class299();
						local73.anInt8526 = (arg0 << 16) + local48;
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method7436(new Class14_Sub21(local61));
					}
				}
			}
			Static590.aBooleanArray24[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
