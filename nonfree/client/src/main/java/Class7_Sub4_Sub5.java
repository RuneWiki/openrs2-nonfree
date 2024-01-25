import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public final class Class7_Sub4_Sub5 extends Class7_Sub4 {

	@OriginalMember(owner = "client!dq", name = "r", descriptor = "[B")
	public final byte[] aByteArray12;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "([B)V")
	public Class7_Sub4_Sub5(@OriginalArg(0) byte[] arg0) {
		this.aByteArray12 = arg0;
	}
}
