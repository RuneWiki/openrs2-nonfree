import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class3_Sub7_Sub8 extends Class3_Sub7 {

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "[B")
	public final byte[] aByteArray26;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "([B)V")
	public Class3_Sub7_Sub8(@OriginalArg(0) byte[] arg0) {
		this.aByteArray26 = arg0;
	}
}
