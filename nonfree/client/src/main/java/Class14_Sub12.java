import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class14_Sub12 extends Class14 {

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "[S")
	public final short[] aShortArray24;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "[B")
	public final byte[] aByteArray37;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([S[B)V")
	public Class14_Sub12(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray24 = arg0;
		this.aByteArray37 = arg1;
	}
}
