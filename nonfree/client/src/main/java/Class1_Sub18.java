import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "[S")
	public final short[] aShortArray44;

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "[B")
	public final byte[] aByteArray36;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub18(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray44 = arg0;
		this.aByteArray36 = arg1;
	}
}
