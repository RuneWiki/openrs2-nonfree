import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class2_Sub44 extends Class2 {

	@OriginalMember(owner = "client!wi", name = "x", descriptor = "Lclient!h;")
	public static final Class89 aClass89_255 = new Class89(71, 20);

	@OriginalMember(owner = "client!wi", name = "A", descriptor = "[Lclient!nt;")
	public static final Class2_Sub2_Sub13[] aClass2_Sub2_Sub13Array4 = new Class2_Sub2_Sub13[14];

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "[B")
	public final byte[] aByteArray99;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "([B)V", line = 55)
	public Class2_Sub44(@OriginalArg(0) byte[] arg0) {
		this.aByteArray99 = arg0;
	}
}
