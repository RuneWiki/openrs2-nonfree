import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class111 {

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
	public int anInt2928;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
	public int anInt2929;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
	public int anInt2930;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
	public int anInt2936;

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
	public int anInt2938;

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
	public int anInt2939;

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
	public int anInt2940;

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
	public int anInt2943;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	public int anInt2931 = 128;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	public int anInt2927 = 128;

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
	public int anInt2935;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
	public Class111(@OriginalArg(0) int arg0) {
		this.anInt2935 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIIIII)V")
	private Class111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2927 = arg1;
		this.anInt2938 = arg4;
		this.anInt2929 = arg3;
		this.anInt2935 = arg0;
		this.anInt2931 = arg2;
		this.anInt2930 = arg5;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!ff;)V")
	public void method2382(@OriginalArg(1) Class111 arg0) {
		this.anInt2927 = arg0.anInt2927;
		this.anInt2931 = arg0.anInt2931;
		this.anInt2938 = arg0.anInt2938;
		this.anInt2929 = arg0.anInt2929;
		this.anInt2935 = arg0.anInt2935;
		this.anInt2930 = arg0.anInt2930;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Lclient!ff;")
	public Class111 method2383() {
		return new Class111(this.anInt2935, this.anInt2927, this.anInt2931, this.anInt2929, this.anInt2938, this.anInt2930);
	}
}
