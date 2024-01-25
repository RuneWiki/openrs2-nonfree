import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class4_Sub1_Sub18 extends Class4_Sub1 {

	@OriginalMember(owner = "client!td", name = "A", descriptor = "[B")
	public final byte[] aByteArray86;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V")
	public Class4_Sub1_Sub18(@OriginalArg(0) byte[] arg0) {
		this.aByteArray86 = arg0;
	}
}
