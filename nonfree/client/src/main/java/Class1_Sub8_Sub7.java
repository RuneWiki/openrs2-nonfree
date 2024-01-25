import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class1_Sub8_Sub7 extends Class1_Sub8 {

	@OriginalMember(owner = "client!jr", name = "A", descriptor = "[B")
	public final byte[] aByteArray37;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "([B)V")
	public Class1_Sub8_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray37 = arg0;
	}
}
