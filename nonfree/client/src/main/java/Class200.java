import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public final class Class200 {

	@OriginalMember(owner = "client!kda", name = "k", descriptor = "I")
	public int anInt5719;

	@OriginalMember(owner = "client!kda", name = "i", descriptor = "I")
	public int anInt5725;

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
	public int anInt5726;

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
	public int anInt5721 = 128;

	@OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
	public int anInt5727 = 128;

	@OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
	public int anInt5720;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(I)V")
	public Class200(@OriginalArg(0) int arg0) {
		this.anInt5720 = arg0;
	}

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(IIIIII)V")
	private Class200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5726 = arg3;
		this.anInt5727 = arg1;
		this.anInt5720 = arg0;
		this.anInt5725 = arg4;
		this.anInt5721 = arg2;
		this.anInt5719 = arg5;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lclient!kda;I)V")
	public void method4880(@OriginalArg(0) Class200 arg0) {
		this.anInt5721 = arg0.anInt5721;
		this.anInt5727 = arg0.anInt5727;
		this.anInt5726 = arg0.anInt5726;
		this.anInt5720 = arg0.anInt5720;
		this.anInt5725 = arg0.anInt5725;
		this.anInt5719 = arg0.anInt5719;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Lclient!kda;")
	public Class200 method4882() {
		return new Class200(this.anInt5720, this.anInt5727, this.anInt5721, this.anInt5726, this.anInt5725, this.anInt5719);
	}
}
