import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class10_Sub1_Sub12 extends Class10_Sub1 {

	@OriginalMember(owner = "client!p", name = "Z", descriptor = "[B")
	public final byte[] aByteArray7;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "([B)V")
	public Class10_Sub1_Sub12(@OriginalArg(0) byte[] arg0) {
		this.aByteArray7 = arg0;
	}
}
