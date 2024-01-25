import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class7_Sub7 extends Class7 {

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "[S")
	public final short[] aShortArray8;

	@OriginalMember(owner = "client!bp", name = "i", descriptor = "[B")
	public final byte[] aByteArray9;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "([S[B)V")
	public Class7_Sub7(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray8 = arg0;
		this.aByteArray9 = arg1;
	}
}
