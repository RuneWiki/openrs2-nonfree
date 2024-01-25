import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class4_Sub7_Sub11 extends Class4_Sub7 {

	@OriginalMember(owner = "client!lv", name = "v", descriptor = "[B")
	public final byte[] aByteArray60;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "([B)V")
	public Class4_Sub7_Sub11(@OriginalArg(0) byte[] arg0) {
		this.aByteArray60 = arg0;
	}
}
