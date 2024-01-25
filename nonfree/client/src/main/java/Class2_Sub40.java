import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class2_Sub40 extends Class2 {

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "[S")
	public final short[] aShortArray110;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "[B")
	public final byte[] aByteArray98;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub40(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray110 = arg0;
		this.aByteArray98 = arg1;
	}
}
