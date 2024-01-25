import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public final class Class205 {

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
	public int anInt5830;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
	public int anInt5831;

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
	public int anInt5833;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
	public int anInt5835;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
	public int anInt5836;

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
	public int anInt5839;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
	public int anInt5841;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
	public int anInt5842;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	public int anInt5828 = 128;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
	public int anInt5834 = 128;

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
	public int anInt5829;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(I)V")
	public Class205(@OriginalArg(0) int arg0) {
		this.anInt5829 = arg0;
	}

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(IIIIII)V")
	private Class205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5834 = arg1;
		this.anInt5841 = arg3;
		this.anInt5830 = arg5;
		this.anInt5829 = arg0;
		this.anInt5828 = arg2;
		this.anInt5835 = arg4;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ki;I)V")
	public void method4979(@OriginalArg(0) Class205 arg0) {
		this.anInt5830 = arg0.anInt5830;
		this.anInt5829 = arg0.anInt5829;
		this.anInt5841 = arg0.anInt5841;
		this.anInt5828 = arg0.anInt5828;
		this.anInt5834 = arg0.anInt5834;
		this.anInt5835 = arg0.anInt5835;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)Lclient!ki;")
	public Class205 method4981() {
		return new Class205(this.anInt5829, this.anInt5834, this.anInt5828, this.anInt5841, this.anInt5835, this.anInt5830);
	}
}
