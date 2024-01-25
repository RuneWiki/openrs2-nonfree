import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "[S")
	public final short[] aShortArray51;

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "[B")
	public final byte[] aByteArray32;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub25(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray51 = arg0;
		this.aByteArray32 = arg1;
	}
}
