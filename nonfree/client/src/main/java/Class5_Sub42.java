import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public final class Class5_Sub42 extends Class5 {

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "[B")
	public final byte[] aByteArray91;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "([B)V")
	public Class5_Sub42(@OriginalArg(0) byte[] arg0) {
		this.aByteArray91 = arg0;
	}
}
