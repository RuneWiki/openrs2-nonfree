import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!li", name = "o", descriptor = "[B")
	public final byte[] aByteArray54;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "([B)V")
	public Class1_Sub24(@OriginalArg(0) byte[] arg0) {
		this.aByteArray54 = arg0;
	}
}
