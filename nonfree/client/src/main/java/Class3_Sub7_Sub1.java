import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class3_Sub7_Sub1 extends Class3_Sub7 {

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "[B")
	public final byte[] aByteArray24;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "([B)V")
	public Class3_Sub7_Sub1(@OriginalArg(0) byte[] arg0) {
		this.aByteArray24 = arg0;
	}
}
