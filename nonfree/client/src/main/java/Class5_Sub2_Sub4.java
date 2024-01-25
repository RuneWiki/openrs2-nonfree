import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class5_Sub2_Sub4 extends Class5_Sub2 {

	@OriginalMember(owner = "client!be", name = "w", descriptor = "[B")
	public final byte[] aByteArray14;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "([B)V")
	public Class5_Sub2_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aByteArray14 = arg0;
	}
}
