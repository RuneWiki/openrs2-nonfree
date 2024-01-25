import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public final class Class1_Sub44 extends Class1 {

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "[S")
	public final short[] aShortArray135;

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "[B")
	public final byte[] aByteArray94;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub44(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray135 = arg0;
		this.aByteArray94 = arg1;
	}
}
