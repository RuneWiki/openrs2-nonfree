import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class5_Sub40 extends Class5 {

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "[B")
	public final byte[] aByteArray74;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "([B)V")
	public Class5_Sub40(@OriginalArg(0) byte[] arg0) {
		this.aByteArray74 = arg0;
	}
}
