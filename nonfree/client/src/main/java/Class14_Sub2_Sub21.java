import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class14_Sub2_Sub21 extends Class14_Sub2 {

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "[B")
	public final byte[] aByteArray175;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([B)V")
	public Class14_Sub2_Sub21(@OriginalArg(0) byte[] arg0) {
		this.aByteArray175 = arg0;
	}
}
