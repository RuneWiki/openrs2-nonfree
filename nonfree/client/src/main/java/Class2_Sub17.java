import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "[S")
	public final short[] aShortArray38;

	@OriginalMember(owner = "client!cw", name = "j", descriptor = "[B")
	public final byte[] aByteArray37;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub17(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray38 = arg0;
		this.aByteArray37 = arg1;
	}
}
