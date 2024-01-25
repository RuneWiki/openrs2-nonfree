import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class1_Sub3_Sub10 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kj", name = "A", descriptor = "[B")
	public final byte[] aByteArray50;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "([B)V")
	public Class1_Sub3_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray50 = arg0;
	}
}
