import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class2_Sub39 extends Class2 {

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "[B")
	public final byte[] aByteArray79;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "([B)V")
	public Class2_Sub39(@OriginalArg(0) byte[] arg0) {
		this.aByteArray79 = arg0;
	}
}
