import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class2_Sub22 extends Class2 {

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "[S")
	public final short[] aShortArray61;

	@OriginalMember(owner = "client!jt", name = "m", descriptor = "[B")
	public final byte[] aByteArray43;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub22(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray61 = arg0;
		this.aByteArray43 = arg1;
	}
}
