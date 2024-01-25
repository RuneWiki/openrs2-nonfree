import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "[S")
	public final short[] aShortArray21;

	@OriginalMember(owner = "client!fr", name = "o", descriptor = "[B")
	public final byte[] aByteArray31;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub14(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray21 = arg0;
		this.aByteArray31 = arg1;
	}
}
