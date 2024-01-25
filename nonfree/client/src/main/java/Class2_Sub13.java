import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!el", name = "n", descriptor = "[S")
	public final short[] aShortArray19;

	@OriginalMember(owner = "client!el", name = "o", descriptor = "[B")
	public final byte[] aByteArray14;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub13(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray19 = arg0;
		this.aByteArray14 = arg1;
	}
}
