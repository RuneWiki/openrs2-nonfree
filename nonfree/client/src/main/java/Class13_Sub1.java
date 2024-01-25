import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	public Class13_Sub1() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)J")
	@Override
	public long method4548() {
		return System.nanoTime();
	}
}
