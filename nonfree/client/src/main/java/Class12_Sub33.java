import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public final class Class12_Sub33 extends Class12 {

	@OriginalMember(owner = "client!mba", name = "z", descriptor = "I")
	public final int anInt5703;

	@OriginalMember(owner = "client!mba", name = "A", descriptor = "I")
	private final int anInt5704;

	@OriginalMember(owner = "client!mba", name = "q", descriptor = "I")
	public final int anInt5694;

	@OriginalMember(owner = "client!mba", name = "p", descriptor = "I")
	private final int anInt5693;

	@OriginalMember(owner = "client!mba", name = "x", descriptor = "I")
	private final int anInt5701;

	@OriginalMember(owner = "client!mba", name = "m", descriptor = "I")
	public final int anInt5690;

	@OriginalMember(owner = "client!mba", name = "u", descriptor = "I")
	private final int anInt5698;

	@OriginalMember(owner = "client!mba", name = "s", descriptor = "I")
	public final int anInt5696;

	@OriginalMember(owner = "client!mba", name = "t", descriptor = "I")
	private final int anInt5697;

	static {
		new Class88("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class12_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5703 = arg5;
		this.anInt5704 = arg2;
		this.anInt5694 = arg7;
		this.anInt5693 = arg1;
		this.anInt5701 = arg4;
		this.anInt5690 = arg8;
		this.anInt5698 = arg3;
		this.anInt5696 = arg6;
		this.anInt5697 = arg0;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BIII)Z")
	public boolean method4796(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt5697 == arg1 && arg0 >= this.anInt5693 && this.anInt5698 >= arg0 && arg2 >= this.anInt5704 && arg2 <= this.anInt5701;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I[III)V")
	public void method4797(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[1] = this.anInt5693 + arg0 - this.anInt5703;
		arg1[2] = this.anInt5704 + arg2 - this.anInt5696;
		arg1[0] = this.anInt5697;
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(III)Z")
	public boolean method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt5703 <= arg1 && this.anInt5694 >= arg1 && this.anInt5696 <= arg0 && this.anInt5690 >= arg0;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZI[I)V")
	public void method4799(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = 0;
		arg2[2] = this.anInt5696 + arg1 - this.anInt5704;
		arg2[1] = this.anInt5703 + arg0 - this.anInt5693;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIB)Z")
	public boolean method4801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt5693 <= arg1 && this.anInt5698 >= arg1 && arg0 >= this.anInt5704 && arg0 <= this.anInt5701;
	}
}
