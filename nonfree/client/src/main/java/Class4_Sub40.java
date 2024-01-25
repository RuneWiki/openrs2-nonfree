import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class4_Sub40 extends Class4 {

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "[S")
	public final short[] aShortArray119;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "[B")
	public final byte[] aByteArray96;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "([S[B)V")
	public Class4_Sub40(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray119 = arg0;
		this.aByteArray96 = arg1;
	}
}
