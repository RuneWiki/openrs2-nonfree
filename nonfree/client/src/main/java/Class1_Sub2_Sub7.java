import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!he", name = "P", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aByteArray28 = arg0;
	}
}
