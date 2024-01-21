import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!e", name = "v", descriptor = "[B")
	public final byte[] aByteArray4;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "([B)V")
	public Class2_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray4 = arg0;
	}
}
