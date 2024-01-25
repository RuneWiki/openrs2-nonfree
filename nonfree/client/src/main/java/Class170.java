import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class170 implements Interface18 {

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "Lclient!ur;")
	public final Class356 aClass356_5;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
	public final int anInt4878;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
	public final int anInt4881;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
	public final int anInt4888;

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "Lclient!cf;")
	public final Class56 aClass56_7;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
	public final int anInt4879;

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
	public final int anInt4882;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString46;

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
	public final int anInt4890;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
	public final int anInt4883;

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
	public final int anInt4889;

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
	public final int anInt4887;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
	public final int anInt4885;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!ur;Lclient!cf;IIIIIIIIII)V")
	public Class170(@OriginalArg(0) String arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.aClass356_5 = arg1;
		this.anInt4878 = arg4;
		this.anInt4881 = arg3;
		this.anInt4888 = arg9;
		this.aClass56_7 = arg2;
		this.anInt4879 = arg12;
		this.anInt4882 = arg5;
		this.aString46 = arg0;
		this.anInt4890 = arg6;
		this.anInt4883 = arg10;
		this.anInt4889 = arg7;
		this.anInt4887 = arg11;
		this.anInt4885 = arg8;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Lclient!hv;")
	@Override
	public Class146 method5444() {
		return Static492.aClass146_28;
	}
}
