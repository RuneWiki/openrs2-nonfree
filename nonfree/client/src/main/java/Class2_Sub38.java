import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class2_Sub38 extends Class2 {

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
	private final int anInt5835;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
	private final int anInt5834;

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
	public final int anInt5844;

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
	private final int anInt5845;

	@OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
	private final int anInt5849;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
	private final int anInt5837;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
	public final int anInt5838;

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
	public final int anInt5842;

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
	public final int anInt5839;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5835 = arg1;
		this.anInt5834 = arg3;
		this.anInt5844 = arg8;
		this.anInt5845 = arg2;
		this.anInt5849 = arg0;
		this.anInt5837 = arg4;
		this.anInt5838 = arg6;
		this.anInt5842 = arg5;
		this.anInt5839 = arg7;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BII[I)V")
	public void method4579(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[2] = this.anInt5845 + arg1 - this.anInt5838;
		arg2[1] = this.anInt5835 + arg0 - this.anInt5842;
		arg2[0] = this.anInt5849;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBI[I)V")
	public void method4580(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = 0;
		arg2[2] = arg1 + this.anInt5838 - this.anInt5845;
		arg2[1] = this.anInt5842 + arg0 - this.anInt5835;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)Z")
	public boolean method4581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt5835 && arg0 <= this.anInt5834 && arg1 >= this.anInt5845 && this.anInt5837 >= arg1;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)Z")
	public boolean method4582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt5842 <= arg1 && this.anInt5839 >= arg1 && arg0 >= this.anInt5838 && this.anInt5844 >= arg0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIBI)Z")
	public boolean method4583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg0 == this.anInt5849 && arg1 >= this.anInt5835 && arg1 <= this.anInt5834 && this.anInt5845 <= arg2 && this.anInt5837 >= arg2;
	}
}
