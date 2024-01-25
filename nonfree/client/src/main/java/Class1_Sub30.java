import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "[B")
	public final byte[] aByteArray55;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "([B)V")
	public Class1_Sub30(@OriginalArg(0) byte[] arg0) {
		this.aByteArray55 = arg0;
	}
}
