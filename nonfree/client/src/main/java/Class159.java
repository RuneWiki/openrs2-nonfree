import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class159 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
	public int anInt4496;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
	public int anInt4497;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
	public int anInt4500;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
	public int anInt4502;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
	public int anInt4504;

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
	public int anInt4505;

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
	public int anInt4511;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
	public int anInt4507 = 128;

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
	public int anInt4508 = 128;

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
	public int anInt4510;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V")
	public Class159(@OriginalArg(0) int arg0) {
		this.anInt4510 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IIIIII)V")
	private Class159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4511 = arg3;
		this.anInt4496 = arg4;
		this.anInt4508 = arg2;
		this.anInt4510 = arg0;
		this.anInt4507 = arg1;
		this.anInt4502 = arg5;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!mi;I)V")
	public void method3714(@OriginalArg(0) Class159 arg0) {
		this.anInt4510 = arg0.anInt4510;
		this.anInt4507 = arg0.anInt4507;
		this.anInt4496 = arg0.anInt4496;
		this.anInt4508 = arg0.anInt4508;
		this.anInt4511 = arg0.anInt4511;
		this.anInt4502 = arg0.anInt4502;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Lclient!mi;")
	public Class159 method3715() {
		return new Class159(this.anInt4510, this.anInt4507, this.anInt4508, this.anInt4511, this.anInt4496, this.anInt4502);
	}
}
