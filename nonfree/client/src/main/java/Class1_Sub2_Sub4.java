import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "[B")
	public final byte[] aByteArray15;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aByteArray15 = arg0;
	}
}
