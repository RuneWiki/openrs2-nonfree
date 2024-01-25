import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class Class11_Sub27 extends Class11 {

	@OriginalMember(owner = "client!na", name = "p", descriptor = "[B")
	public final byte[] aByteArray62;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "([B)V")
	public Class11_Sub27(@OriginalArg(0) byte[] arg0) {
		this.aByteArray62 = arg0;
	}
}
