import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "[S")
	public final short[] aShortArray1;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "[B")
	public final byte[] aByteArray1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub2(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray1 = arg0;
		this.aByteArray1 = arg1;
	}
}
