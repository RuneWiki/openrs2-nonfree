import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hd", name = "zb", descriptor = "[B")
	public final byte[] aByteArray10;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray10 = arg0;
	}
}
