import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "[S")
	public final short[] aShortArray37;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "[B")
	public final byte[] aByteArray24;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub12(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray37 = arg0;
		this.aByteArray24 = arg1;
	}
}
