import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public final class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "[S")
	public final short[] aShortArray31;

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "[B")
	public final byte[] aByteArray33;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub14(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray31 = arg0;
		this.aByteArray33 = arg1;
	}
}
