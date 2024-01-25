import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public final class Class2_Sub5_Sub6 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ht", name = "r", descriptor = "[B")
	public final byte[] aByteArray22;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "([B)V")
	public Class2_Sub5_Sub6(@OriginalArg(0) byte[] arg0) {
		this.aByteArray22 = arg0;
	}
}
