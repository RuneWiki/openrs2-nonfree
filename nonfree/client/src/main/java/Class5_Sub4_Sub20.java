import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public final class Class5_Sub4_Sub20 extends Class5_Sub4 {

	@OriginalMember(owner = "client!vca", name = "A", descriptor = "[B")
	public final byte[] aByteArray98;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "([B)V")
	public Class5_Sub4_Sub20(@OriginalArg(0) byte[] arg0) {
		this.aByteArray98 = arg0;
	}
}
