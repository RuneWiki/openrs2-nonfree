import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class3_Sub4_Sub17 extends Class3_Sub4 {

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "[B")
	public final byte[] aByteArray95;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "([B)V")
	public Class3_Sub4_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray95 = arg0;
	}
}
