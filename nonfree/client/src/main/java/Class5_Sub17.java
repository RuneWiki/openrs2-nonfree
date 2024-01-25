import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class5_Sub17 extends Class5 {

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "[S")
	public final short[] aShortArray40;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "[B")
	public final byte[] aByteArray19;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "([S[B)V")
	public Class5_Sub17(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray40 = arg0;
		this.aByteArray19 = arg1;
	}
}
