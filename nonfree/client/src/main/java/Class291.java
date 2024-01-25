import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class291 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	public int anInt8566;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
	public int anInt8567;

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
	public int anInt8569;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
	public int anInt8570;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
	public int anInt8571;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
	public int anInt8574;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
	public int anInt8575;

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
	public int anInt8579;

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
	public int anInt8576 = 128;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
	public int anInt8572 = 128;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
	public int anInt8568;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(I)V")
	public Class291(@OriginalArg(0) int arg0) {
		this.anInt8568 = arg0;
	}

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(IIIIII)V")
	private Class291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8572 = arg2;
		this.anInt8570 = arg4;
		this.anInt8568 = arg0;
		this.anInt8571 = arg5;
		this.anInt8576 = arg1;
		this.anInt8569 = arg3;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Lclient!rj;")
	public Class291 method7387() {
		return new Class291(this.anInt8568, this.anInt8576, this.anInt8572, this.anInt8569, this.anInt8570, this.anInt8571);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!rj;)V")
	public void method7388(@OriginalArg(1) Class291 arg0) {
		this.anInt8569 = arg0.anInt8569;
		this.anInt8570 = arg0.anInt8570;
		this.anInt8568 = arg0.anInt8568;
		this.anInt8572 = arg0.anInt8572;
		this.anInt8576 = arg0.anInt8576;
		this.anInt8571 = arg0.anInt8571;
	}
}
