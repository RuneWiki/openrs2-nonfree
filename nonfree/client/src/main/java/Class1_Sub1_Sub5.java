import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "[B")
	public final byte[] aByteArray18;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub5(@OriginalArg(0) byte[] arg0) {
		this.aByteArray18 = arg0;
	}
}
