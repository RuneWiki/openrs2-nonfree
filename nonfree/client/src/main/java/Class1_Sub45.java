import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public final class Class1_Sub45 extends Class1 {

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "[S")
	public final short[] aShortArray116;

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "[B")
	public final byte[] aByteArray96;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub45(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray116 = arg0;
		this.aByteArray96 = arg1;
	}
}
