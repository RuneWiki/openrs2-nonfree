import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public final class Class85 {

	@OriginalMember(owner = "client!go", name = "g", descriptor = "I")
	public int anInt2745;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	public int anInt2746;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "I")
	public int anInt2749;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "I")
	public int anInt2741 = 128;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "I")
	public int anInt2748 = 128;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "I")
	public int anInt2743;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(I)V")
	public Class85(@OriginalArg(0) int arg0) {
		this.anInt2743 = arg0;
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIIII)V")
	private Class85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2743 = arg0;
		this.anInt2745 = arg5;
		this.anInt2741 = arg1;
		this.anInt2748 = arg2;
		this.anInt2746 = arg4;
		this.anInt2749 = arg3;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!go;)V")
	public void method2314(@OriginalArg(1) Class85 arg0) {
		this.anInt2745 = arg0.anInt2745;
		this.anInt2748 = arg0.anInt2748;
		this.anInt2743 = arg0.anInt2743;
		this.anInt2749 = arg0.anInt2749;
		this.anInt2746 = arg0.anInt2746;
		this.anInt2741 = arg0.anInt2741;
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)Lclient!go;")
	public Class85 method2317() {
		return new Class85(this.anInt2743, this.anInt2741, this.anInt2748, this.anInt2749, this.anInt2746, this.anInt2745);
	}
}
