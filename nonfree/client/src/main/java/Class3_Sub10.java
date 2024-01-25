import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "[S")
	public final short[] aShortArray26;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "[B")
	public final byte[] aByteArray7;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub10(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray26 = arg0;
		this.aByteArray7 = arg1;
	}
}
