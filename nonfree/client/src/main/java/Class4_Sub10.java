import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "[S")
	public final short[] aShortArray12;

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "[B")
	public final byte[] aByteArray7;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "([S[B)V")
	public Class4_Sub10(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray12 = arg0;
		this.aByteArray7 = arg1;
	}
}
