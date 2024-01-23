import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "([B)V")
	public Class1_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray22 = arg0;
	}
}
