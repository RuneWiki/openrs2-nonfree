import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class4_Sub6_Sub17 extends Class4_Sub6 {

	@OriginalMember(owner = "client!rh", name = "B", descriptor = "[B")
	public final byte[] aByteArray83;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "([B)V")
	public Class4_Sub6_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray83 = arg0;
	}
}
