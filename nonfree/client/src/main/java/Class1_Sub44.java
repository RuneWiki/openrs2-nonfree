import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class1_Sub44 extends Class1 {

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
	private final int anInt6725;

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
	public final int anInt6731;

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
	private final int anInt6728;

	@OriginalMember(owner = "client!wm", name = "z", descriptor = "I")
	private final int anInt6735;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
	private final int anInt6721;

	@OriginalMember(owner = "client!wm", name = "B", descriptor = "I")
	public final int anInt6736;

	@OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
	public final int anInt6739;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
	public final int anInt6723;

	@OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
	private final int anInt6737;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt6725 = arg2;
		this.anInt6731 = arg6;
		this.anInt6728 = arg4;
		this.anInt6735 = arg3;
		this.anInt6721 = arg1;
		this.anInt6736 = arg8;
		this.anInt6739 = arg5;
		this.anInt6723 = arg7;
		this.anInt6737 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIBI)Z")
	public boolean method5619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt6737 == arg1 && arg2 >= this.anInt6721 && this.anInt6735 >= arg2 && arg0 >= this.anInt6725 && arg0 <= this.anInt6728;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II[II)V")
	public void method5620(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = 0;
		arg1[1] = this.anInt6739 + arg0 - this.anInt6721;
		arg1[2] = this.anInt6731 + arg2 - this.anInt6725;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[III)V")
	public void method5621(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[1] = this.anInt6721 + arg2 - this.anInt6739;
		arg1[2] = arg0 + this.anInt6725 - this.anInt6731;
		arg1[0] = this.anInt6737;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIB)Z")
	public boolean method5623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt6721 && this.anInt6735 >= arg1 && this.anInt6725 <= arg0 && arg0 <= this.anInt6728;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZI)Z")
	public boolean method5624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt6739 && this.anInt6723 >= arg1 && arg0 >= this.anInt6731 && this.anInt6736 >= arg0;
	}
}
