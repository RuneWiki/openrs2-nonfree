import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "[S")
	public final short[] aShortArray29;

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "[B")
	public final byte[] aByteArray71;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub17(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray29 = arg0;
		this.aByteArray71 = arg1;
	}
}
