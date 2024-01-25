import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public final class Class6_Sub2_Sub3 extends Class6_Sub2 {

	@OriginalMember(owner = "client!cda", name = "x", descriptor = "[B")
	public final byte[] aByteArray7;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "([B)V")
	public Class6_Sub2_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray7 = arg0;
	}
}
