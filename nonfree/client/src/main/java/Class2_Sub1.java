import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aaa", name = "i", descriptor = "[S")
	public final short[] aShortArray1;

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "[B")
	public final byte[] aByteArray1;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub1(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray1 = arg0;
		this.aByteArray1 = arg1;
	}
}
