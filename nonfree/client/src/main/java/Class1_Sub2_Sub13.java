import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jk", name = "z", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub13(@OriginalArg(0) byte[] arg0) {
		this.aByteArray36 = arg0;
	}
}
