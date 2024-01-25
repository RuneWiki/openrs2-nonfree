import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class1_Sub42 extends Class1 {

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "[S")
	public final short[] aShortArray105;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "[B")
	public final byte[] aByteArray87;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub42(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray105 = arg0;
		this.aByteArray87 = arg1;
	}
}
