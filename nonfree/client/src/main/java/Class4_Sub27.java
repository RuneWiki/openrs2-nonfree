import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class4_Sub27 extends Class4 {

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "[S")
	public final short[] aShortArray140;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "[B")
	public final byte[] aByteArray49;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([S[B)V")
	public Class4_Sub27(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray140 = arg0;
		this.aByteArray49 = arg1;
	}
}
