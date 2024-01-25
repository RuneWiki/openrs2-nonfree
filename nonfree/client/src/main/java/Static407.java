import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
	public static int anInt7215;

	@OriginalMember(owner = "client!nt", name = "u", descriptor = "[J")
	public static long[] aLongArray21;

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
	public static int anInt7214 = 0;

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "Lclient!iea;")
	public static final Class162 aClass162_4 = new Class162();

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!wm;II)Lclient!kca;")
	public static Class5_Sub35 method5977(@OriginalArg(0) Class390 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method8923(arg1);
		return local8 == null ? null : new Class5_Sub35(local8);
	}
}
