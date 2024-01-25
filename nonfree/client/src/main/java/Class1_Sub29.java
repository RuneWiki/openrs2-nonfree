import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "[S")
	public final short[] aShortArray75;

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "[B")
	public final byte[] aByteArray53;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub29(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray75 = arg0;
		this.aByteArray53 = arg1;
	}
}
