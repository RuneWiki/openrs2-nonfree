import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray48 = arg0;
	}
}
