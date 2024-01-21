import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "[B")
	public final byte[] aByteArray4;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([B)V")
	public Class1_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray4 = arg0;
	}
}
