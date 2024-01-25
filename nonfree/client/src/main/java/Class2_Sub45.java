import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public final class Class2_Sub45 extends Class2 {

	@OriginalMember(owner = "client!uba", name = "l", descriptor = "[S")
	public final short[] aShortArray136;

	@OriginalMember(owner = "client!uba", name = "k", descriptor = "[B")
	public final byte[] aByteArray103;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub45(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray136 = arg0;
		this.aByteArray103 = arg1;
	}
}
