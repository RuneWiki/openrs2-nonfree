import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!kj", name = "o", descriptor = "[S")
	public final short[] aShortArray46;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "[B")
	public final byte[] aByteArray35;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "([S[B)V")
	public Class1_Sub22(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray46 = arg0;
		this.aByteArray35 = arg1;
	}
}
