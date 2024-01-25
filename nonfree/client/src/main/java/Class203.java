import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class203 {

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
	public int anInt5781;

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
	public int anInt5783;

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
	public int anInt5790;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
	public int anInt5785 = 128;

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
	public int anInt5789 = 128;

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
	public int anInt5787;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(I)V")
	public Class203(@OriginalArg(0) int arg0) {
		this.anInt5787 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IIIIII)V")
	private Class203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5789 = arg1;
		this.anInt5783 = arg5;
		this.anInt5787 = arg0;
		this.anInt5790 = arg4;
		this.anInt5785 = arg2;
		this.anInt5781 = arg3;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!qn;I)V")
	public void method4622(@OriginalArg(0) Class203 arg0) {
		this.anInt5787 = arg0.anInt5787;
		this.anInt5783 = arg0.anInt5783;
		this.anInt5785 = arg0.anInt5785;
		this.anInt5781 = arg0.anInt5781;
		this.anInt5790 = arg0.anInt5790;
		this.anInt5789 = arg0.anInt5789;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)Lclient!qn;")
	public Class203 method4623() {
		return new Class203(this.anInt5787, this.anInt5789, this.anInt5785, this.anInt5781, this.anInt5790, this.anInt5783);
	}
}
