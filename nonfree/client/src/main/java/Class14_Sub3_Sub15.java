import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public final class Class14_Sub3_Sub15 extends Class14_Sub3 {

	@OriginalMember(owner = "client!rba", name = "A", descriptor = "[B")
	public final byte[] aByteArray115;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "([B)V")
	public Class14_Sub3_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray115 = arg0;
	}
}
