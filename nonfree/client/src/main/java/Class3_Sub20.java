import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "[S")
	public final short[] aShortArray45;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "[B")
	public final byte[] aByteArray37;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub20(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray45 = arg0;
		this.aByteArray37 = arg1;
	}
}
