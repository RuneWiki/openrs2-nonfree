import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class1_Sub42 extends Class1 {

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "[B")
	public final byte[] aByteArray85;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "([B)V")
	public Class1_Sub42(@OriginalArg(0) byte[] arg0) {
		this.aByteArray85 = arg0;
	}
}
