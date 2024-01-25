import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class177 {

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "Lclient!ae;")
	private final Class8 aClass8_74;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
	public final int anInt4833;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class177(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		new Class10(64);
		this.aClass8_74 = arg2;
		this.anInt4833 = this.aClass8_74.method280(15);
	}
}
