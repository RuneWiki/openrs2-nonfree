import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "[S")
	public final short[] aShortArray56;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "[B")
	public final byte[] aByteArray45;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub25(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray56 = arg0;
		this.aByteArray45 = arg1;
	}
}
