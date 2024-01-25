import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "[Lclient!ug;")
	public static Class43[] aClass43Array9;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
	public static int anInt3829 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)[B")
	public static byte[] method3449(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub6_Sub15 local14 = (Class2_Sub6_Sub15) Static47.aClass378_1.method9118((long) arg0);
		if (local14 == null) {
			@Pc(19) byte[] local19 = new byte[512];
			@Pc(25) Random local25 = new Random((long) arg0);
			for (@Pc(27) int local27 = 0; local27 < 255; local27++) {
				local19[local27] = (byte) local27;
			}
			for (@Pc(44) int local44 = 0; local44 < 255; local44++) {
				@Pc(52) int local52 = 255 - local44;
				@Pc(57) int local57 = Static289.method4068(local52, local25);
				@Pc(61) byte local61 = local19[local57];
				local19[local57] = local19[local52];
				local19[local52] = local19[511 - local44] = local61;
			}
			local14 = new Class2_Sub6_Sub15(local19);
			Static47.aClass378_1.method9117((long) arg0, local14);
		}
		return local14.aByteArray98;
	}
}
