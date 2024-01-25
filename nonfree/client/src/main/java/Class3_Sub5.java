import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public final class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!afa", name = "k", descriptor = "[S")
	public final short[] aShortArray2;

	@OriginalMember(owner = "client!afa", name = "j", descriptor = "[B")
	public final byte[] aByteArray1;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub5(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray2 = arg0;
		this.aByteArray1 = arg1;
	}
}
