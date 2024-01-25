import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class28_Sub2_Sub2 extends Class28_Sub2 {

	@OriginalMember(owner = "client!od", name = "v", descriptor = "I")
	public final int anInt5211 = (int) (Static432.method5870() / 1000L);

	@OriginalMember(owner = "client!od", name = "o", descriptor = "Ljava/lang/String;")
	public final String aString44;

	@OriginalMember(owner = "client!od", name = "u", descriptor = "S")
	public final short aShort71;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class28_Sub2_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString44 = arg0;
		this.aShort71 = (short) arg1;
	}
}
