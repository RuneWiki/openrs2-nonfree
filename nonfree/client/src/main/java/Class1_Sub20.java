import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "[B")
	public final byte[] aByteArray60;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "([B)V")
	public Class1_Sub20(@OriginalArg(0) byte[] arg0) {
		this.aByteArray60 = arg0;
	}
}
