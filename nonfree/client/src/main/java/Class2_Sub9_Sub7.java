import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public final class Class2_Sub9_Sub7 extends Class2_Sub9 {

	@OriginalMember(owner = "client!gj", name = "N", descriptor = "[B")
	public final byte[] aByteArray19;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "([B)V")
	public Class2_Sub9_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray19 = arg0;
	}
}
