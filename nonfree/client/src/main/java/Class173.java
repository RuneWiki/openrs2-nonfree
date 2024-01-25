import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class173 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
	public int anInt4647;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
	public int anInt4648;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
	public int anInt4649;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
	public int anInt4653;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
	public int anInt4654;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
	public int anInt4656;

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
	public int anInt4658;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
	public int anInt4659;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
	public int anInt4655 = 128;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
	public int anInt4657 = 128;

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
	public int anInt4650;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(I)V")
	public Class173(@OriginalArg(0) int arg0) {
		this.anInt4650 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIII)V")
	private Class173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4659 = arg5;
		this.anInt4650 = arg0;
		this.anInt4653 = arg4;
		this.anInt4655 = arg2;
		this.anInt4657 = arg1;
		this.anInt4648 = arg3;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLclient!jl;)V")
	public void method3996(@OriginalArg(1) Class173 arg0) {
		this.anInt4648 = arg0.anInt4648;
		this.anInt4653 = arg0.anInt4653;
		this.anInt4650 = arg0.anInt4650;
		this.anInt4657 = arg0.anInt4657;
		this.anInt4655 = arg0.anInt4655;
		this.anInt4659 = arg0.anInt4659;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)Lclient!jl;")
	public Class173 method3997() {
		return new Class173(this.anInt4650, this.anInt4657, this.anInt4655, this.anInt4648, this.anInt4653, this.anInt4659);
	}
}
