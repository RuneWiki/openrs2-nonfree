import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class27 {

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	public int anInt574;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	public int anInt577;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	public int anInt579;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	public int anInt566 = 128;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	public int anInt578 = 128;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public int anInt569;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I)V")
	public Class27(@OriginalArg(0) int arg0) {
		this.anInt569 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IIIIII)V")
	private Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt574 = arg3;
		this.anInt578 = arg2;
		this.anInt579 = arg5;
		this.anInt566 = arg1;
		this.anInt577 = arg4;
		this.anInt569 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!bc;B)V")
	public void method569(@OriginalArg(0) Class27 arg0) {
		this.anInt569 = arg0.anInt569;
		this.anInt577 = arg0.anInt577;
		this.anInt578 = arg0.anInt578;
		this.anInt574 = arg0.anInt574;
		this.anInt579 = arg0.anInt579;
		this.anInt566 = arg0.anInt566;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Lclient!bc;")
	public Class27 method576() {
		return new Class27(this.anInt569, this.anInt566, this.anInt578, this.anInt574, this.anInt577, this.anInt579);
	}
}
