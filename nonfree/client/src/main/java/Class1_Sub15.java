import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "[S")
	public final short[] aShortArray33;

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "[B")
	public final byte[] aByteArray14;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub15(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray33 = arg0;
		this.aByteArray14 = arg1;
	}
}
