import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public final class Class3_Sub4_Sub4 extends Class3_Sub4 {

	@OriginalMember(owner = "client!cba", name = "x", descriptor = "[B")
	public final byte[] aByteArray14;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "([B)V")
	public Class3_Sub4_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aByteArray14 = arg0;
	}
}
