import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public final class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!cha", name = "n", descriptor = "[B")
	public final byte[] aByteArray18;

	@OriginalMember(owner = "client!cha", name = "<init>", descriptor = "([B)V")
	public Class2_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aByteArray18 = arg0;
	}
}
