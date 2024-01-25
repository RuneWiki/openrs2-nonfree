import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "[S")
	public final short[] aShortArray53;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "[B")
	public final byte[] aByteArray51;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "([S[B)V")
	public Class3_Sub24(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1) {
		this.aShortArray53 = arg0;
		this.aByteArray51 = arg1;
	}
}
