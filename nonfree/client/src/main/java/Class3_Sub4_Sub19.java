import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class3_Sub4_Sub19 extends Class3_Sub4 {

	@OriginalMember(owner = "client!o", name = "F", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "([B)V")
	public Class3_Sub4_Sub19(@OriginalArg(0) byte[] arg0) {
		this.aByteArray48 = arg0;
	}
}
