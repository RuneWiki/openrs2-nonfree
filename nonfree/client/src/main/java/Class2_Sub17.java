import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public final class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "[S")
	public final short[] aShortArray2;

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "[B")
	public final byte[] aByteArray14;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub17(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray2 = arg0;
		this.aByteArray14 = arg1;
	}
}
