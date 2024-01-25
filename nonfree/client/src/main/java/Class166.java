import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class166 {

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "S")
	public final short aShort48;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "Lclient!rl;")
	public Interface18 anInterface18_3;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "B")
	public byte aByte49;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "B")
	public final byte aByte50;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!rl;III)V")
	public Class166(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort48 = (short) arg1;
		this.anInterface18_3 = arg0;
		this.aByte49 = (byte) arg3;
		this.aByte50 = (byte) arg2;
	}
}
