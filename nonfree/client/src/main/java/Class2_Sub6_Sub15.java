import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class2_Sub6_Sub15 extends Class2_Sub6 {

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "[B")
	public final byte[] aByteArray98;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([B)V")
	public Class2_Sub6_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray98 = arg0;
	}
}
