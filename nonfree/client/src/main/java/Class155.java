import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class155 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	public int anInt3774;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "I")
	public int anInt3777;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "I")
	public int anInt3779;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	public int anInt3776 = 128;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "I")
	public int anInt3781 = 128;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	public int anInt3772;

	static {
		new Class15(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V")
	public Class155(@OriginalArg(0) int arg0) {
		this.anInt3772 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIII)V")
	private Class155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3777 = arg3;
		this.anInt3781 = arg1;
		this.anInt3772 = arg0;
		this.anInt3776 = arg2;
		this.anInt3779 = arg5;
		this.anInt3774 = arg4;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!le;I)V")
	public void method2993(@OriginalArg(0) Class155 arg0) {
		this.anInt3777 = arg0.anInt3777;
		this.anInt3779 = arg0.anInt3779;
		this.anInt3781 = arg0.anInt3781;
		this.anInt3772 = arg0.anInt3772;
		this.anInt3776 = arg0.anInt3776;
		this.anInt3774 = arg0.anInt3774;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)Lclient!le;")
	public Class155 method2994() {
		return new Class155(this.anInt3772, this.anInt3781, this.anInt3776, this.anInt3777, this.anInt3774, this.anInt3779);
	}
}
