import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!od", name = "w", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "([B)V")
	public Class1_Sub25(@OriginalArg(0) byte[] arg0) {
		this.aByteArray53 = arg0;
	}
}
