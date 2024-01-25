import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class8_Sub20 extends Class8 {

	@OriginalMember(owner = "client!en", name = "j", descriptor = "[S")
	public final short[] aShortArray26;

	@OriginalMember(owner = "client!en", name = "k", descriptor = "[B")
	public final byte[] aByteArray21;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "([S[B)V")
	public Class8_Sub20(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray26 = arg0;
		this.aByteArray21 = arg1;
	}
}
