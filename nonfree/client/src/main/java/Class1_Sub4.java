import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "[S")
	public final short[] aShortArray11;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "[B")
	public final byte[] aByteArray6;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub4(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray11 = arg0;
		this.aByteArray6 = arg1;
	}
}
