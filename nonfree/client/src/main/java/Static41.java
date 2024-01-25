import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
	public static int anInt856;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILclient!ul;I)Lclient!lm;")
	public static Class151 method755(@OriginalArg(1) int arg0, @OriginalArg(2) Class246 arg1) {
		@Pc(16) byte[] local16 = arg1.method5477(arg0, 0);
		return local16 == null ? null : new Class151(local16);
	}
}
