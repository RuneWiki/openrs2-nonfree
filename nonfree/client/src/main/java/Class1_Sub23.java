import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "[B")
	public final byte[] aByteArray45;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "([B)V")
	public Class1_Sub23(@OriginalArg(0) byte[] arg0) {
		this.aByteArray45 = arg0;
	}
}
