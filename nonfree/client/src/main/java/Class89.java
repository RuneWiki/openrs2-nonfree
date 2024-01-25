import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class89 {

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	public int anInt2773;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	public int anInt2775;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
	public int anInt2780;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
	public int anInt2774 = 128;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
	public int anInt2777 = 128;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	public int anInt2772;

	static {
		new Class267(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(I)V")
	public Class89(@OriginalArg(0) int arg0) {
		this.anInt2772 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(IIIIII)V")
	private Class89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2777 = arg2;
		this.anInt2775 = arg3;
		this.anInt2773 = arg5;
		this.anInt2774 = arg1;
		this.anInt2772 = arg0;
		this.anInt2780 = arg4;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!gi;)V")
	public void method2314(@OriginalArg(1) Class89 arg0) {
		this.anInt2780 = arg0.anInt2780;
		this.anInt2775 = arg0.anInt2775;
		this.anInt2777 = arg0.anInt2777;
		this.anInt2774 = arg0.anInt2774;
		this.anInt2773 = arg0.anInt2773;
		this.anInt2772 = arg0.anInt2772;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)Lclient!gi;")
	public Class89 method2315() {
		return new Class89(this.anInt2772, this.anInt2774, this.anInt2777, this.anInt2775, this.anInt2780, this.anInt2773);
	}
}
