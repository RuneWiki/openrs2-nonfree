import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class1_Sub5_Sub20 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "[B")
	public byte[] aByteArray154;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "([B)V")
	public Class1_Sub5_Sub20(@OriginalArg(0) byte[] arg0) {
		this.aByteArray154 = arg0;
	}
}
