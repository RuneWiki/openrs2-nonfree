import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class2_Sub5_Sub9 extends Class2_Sub5 {

	@OriginalMember(owner = "client!hh", name = "B", descriptor = "[B")
	public final byte[] aByteArray39;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "([B)V")
	public Class2_Sub5_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray39 = arg0;
	}
}
