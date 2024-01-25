import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public final class Class4_Sub29 extends Class4 {

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "[S")
	public final short[] aShortArray79;

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "[B")
	public final byte[] aByteArray66;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "([S[B)V")
	public Class4_Sub29(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray79 = arg0;
		this.aByteArray66 = arg1;
	}
}
