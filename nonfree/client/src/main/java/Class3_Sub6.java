import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public final class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!baa", name = "n", descriptor = "[B")
	public final byte[] aByteArray5;

	static {
		new Class223("", 73);
	}

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "([B)V")
	public Class3_Sub6(@OriginalArg(0) byte[] arg0) {
		this.aByteArray5 = arg0;
	}
}
