import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class4_Sub2_Sub10 extends Class4_Sub2 {

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "[B")
	public final byte[] aByteArray23;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "([B)V")
	public Class4_Sub2_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray23 = arg0;
	}
}
