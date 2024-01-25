import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class2_Sub37 extends Class2 {

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "[S")
	public final short[] aShortArray98;

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "[B")
	public final byte[] aByteArray98;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub37(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray98 = arg0;
		this.aByteArray98 = arg1;
	}
}
