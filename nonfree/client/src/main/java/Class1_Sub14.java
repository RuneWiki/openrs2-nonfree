import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "[S")
	public final short[] aShortArray9;

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "[B")
	public final byte[] aByteArray9;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub14(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray9 = arg0;
		this.aByteArray9 = arg1;
	}
}
