import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "[B")
	public final byte[] aByteArray1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([B)V")
	public Class5_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		this.aByteArray1 = arg0;
	}
}
