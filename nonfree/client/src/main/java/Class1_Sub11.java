import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "[S")
	public final short[] aShortArray20;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "[B")
	public final byte[] aByteArray40;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub11(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray20 = arg0;
		this.aByteArray40 = arg1;
	}
}
