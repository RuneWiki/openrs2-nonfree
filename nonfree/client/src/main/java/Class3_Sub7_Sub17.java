import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class3_Sub7_Sub17 extends Class3_Sub7 {

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "[B")
	public final byte[] aByteArray189;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([B)V")
	public Class3_Sub7_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray189 = arg0;
	}
}
