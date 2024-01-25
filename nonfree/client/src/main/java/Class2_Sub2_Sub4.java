import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!dl", name = "w", descriptor = "[B")
	public final byte[] aByteArray35;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aByteArray35 = arg0;
	}
}
