import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class254 {

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	public int anInt7684;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	public int anInt7686;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	public int anInt7690;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public int anInt7680 = 128;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	public int anInt7688 = 128;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public int anInt7683;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I)V")
	public Class254(@OriginalArg(0) int arg0) {
		this.anInt7683 = arg0;
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIIIII)V")
	private Class254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7680 = arg2;
		this.anInt7690 = arg4;
		this.anInt7684 = arg5;
		this.anInt7686 = arg3;
		this.anInt7683 = arg0;
		this.anInt7688 = arg1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)Lclient!pe;")
	public Class254 method6422() {
		return new Class254(this.anInt7683, this.anInt7688, this.anInt7680, this.anInt7686, this.anInt7690, this.anInt7684);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!pe;)V")
	public void method6424(@OriginalArg(1) Class254 arg0) {
		this.anInt7684 = arg0.anInt7684;
		this.anInt7686 = arg0.anInt7686;
		this.anInt7680 = arg0.anInt7680;
		this.anInt7688 = arg0.anInt7688;
		this.anInt7683 = arg0.anInt7683;
		this.anInt7690 = arg0.anInt7690;
	}
}
