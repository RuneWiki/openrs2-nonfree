import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class360 {

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
	public int anInt9754;

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
	public int anInt9756;

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
	public int anInt9757;

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
	public int anInt9759;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
	public int anInt9761;

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
	public int anInt9765;

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
	public int anInt9768;

	@OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
	public int anInt9769;

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
	public int anInt9762 = 128;

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
	public int anInt9767 = 128;

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
	public int anInt9758;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(I)V")
	public Class360(@OriginalArg(0) int arg0) {
		this.anInt9758 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(IIIIII)V")
	private Class360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9756 = arg4;
		this.anInt9762 = arg1;
		this.anInt9758 = arg0;
		this.anInt9767 = arg2;
		this.anInt9768 = arg5;
		this.anInt9759 = arg3;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)Lclient!wq;")
	public Class360 method7989() {
		return new Class360(this.anInt9758, this.anInt9762, this.anInt9767, this.anInt9759, this.anInt9756, this.anInt9768);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!wq;B)V")
	public void method7992(@OriginalArg(0) Class360 arg0) {
		this.anInt9759 = arg0.anInt9759;
		this.anInt9756 = arg0.anInt9756;
		this.anInt9762 = arg0.anInt9762;
		this.anInt9767 = arg0.anInt9767;
		this.anInt9768 = arg0.anInt9768;
		this.anInt9758 = arg0.anInt9758;
	}
}
