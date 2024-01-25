import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
	public static int anInt4645 = 0;

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "[I")
	public static int[] anIntArray233 = new int[1];

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "Lclient!fe;")
	public static final Class114 aClass114_5 = new Class114();

	@OriginalMember(owner = "client!ica", name = "o", descriptor = "[I")
	public static int[] anIntArray234 = new int[1];

	@OriginalMember(owner = "client!ica", name = "h", descriptor = "[B")
	public static final byte[] aByteArray56 = new byte[2048];

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "(II)Lclient!vq;")
	public static Class382 method4068(@OriginalArg(1) int arg0) {
		@Pc(13) Class382[] local13 = Static5.method90();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (arg0 == local13[local15].anInt10732) {
				return local13[local15];
			}
		}
		return null;
	}
}
