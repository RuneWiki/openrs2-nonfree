import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!vg", name = "q", descriptor = "[B")
	public final byte[] aByteArray40;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "([B)V")
	public Class1_Sub23(@OriginalArg(0) byte[] arg0) {
		this.aByteArray40 = arg0;
	}
}
