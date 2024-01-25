import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class4_Sub4_Sub19 extends Class4_Sub4 {

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "[B")
	public final byte[] aByteArray80;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([B)V")
	public Class4_Sub4_Sub19(@OriginalArg(0) byte[] arg0) {
		this.aByteArray80 = arg0;
	}
}
