import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public final class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!gca", name = "n", descriptor = "[S")
	public final short[] aShortArray70;

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "[B")
	public final byte[] aByteArray38;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "([S[B)V")
	public Class2_Sub27(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray70 = arg0;
		this.aByteArray38 = arg1;
	}
}
