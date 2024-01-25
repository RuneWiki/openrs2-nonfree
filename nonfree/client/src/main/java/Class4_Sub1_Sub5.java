import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class4_Sub1_Sub5 extends Class4_Sub1 {

	@OriginalMember(owner = "client!cm", name = "B", descriptor = "[B")
	public final byte[] aByteArray18;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "([B)V")
	public Class4_Sub1_Sub5(@OriginalArg(0) byte[] arg0) {
		this.aByteArray18 = arg0;
	}
}
