import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "[S")
	public final short[] aShortArray3;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "[B")
	public final byte[] aByteArray8;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub13(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray3 = arg0;
		this.aByteArray8 = arg1;
	}
}
