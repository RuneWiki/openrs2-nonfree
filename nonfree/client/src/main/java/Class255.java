import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public final class Class255 {

	@OriginalMember(owner = "client!os", name = "d", descriptor = "I")
	public int anInt7566;

	@OriginalMember(owner = "client!os", name = "f", descriptor = "I")
	public int anInt7568;

	@OriginalMember(owner = "client!os", name = "k", descriptor = "I")
	public int anInt7573;

	@OriginalMember(owner = "client!os", name = "m", descriptor = "I")
	public int anInt7575;

	@OriginalMember(owner = "client!os", name = "n", descriptor = "I")
	public int anInt7576;

	@OriginalMember(owner = "client!os", name = "o", descriptor = "I")
	public int anInt7577;

	@OriginalMember(owner = "client!os", name = "p", descriptor = "I")
	public int anInt7578;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "I")
	public int anInt7580;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "I")
	public int anInt7564 = 128;

	@OriginalMember(owner = "client!os", name = "j", descriptor = "I")
	public int anInt7572 = 128;

	@OriginalMember(owner = "client!os", name = "q", descriptor = "I")
	public int anInt7579;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(I)V")
	public Class255(@OriginalArg(0) int arg0) {
		this.anInt7579 = arg0;
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(IIIIII)V")
	private Class255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7564 = arg2;
		this.anInt7580 = arg5;
		this.anInt7577 = arg3;
		this.anInt7572 = arg1;
		this.anInt7579 = arg0;
		this.anInt7575 = arg4;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BLclient!os;)V")
	public void method5957(@OriginalArg(1) Class255 arg0) {
		this.anInt7577 = arg0.anInt7577;
		this.anInt7564 = arg0.anInt7564;
		this.anInt7572 = arg0.anInt7572;
		this.anInt7575 = arg0.anInt7575;
		this.anInt7579 = arg0.anInt7579;
		this.anInt7580 = arg0.anInt7580;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)Lclient!os;")
	public Class255 method5959() {
		return new Class255(this.anInt7579, this.anInt7572, this.anInt7564, this.anInt7577, this.anInt7575, this.anInt7580);
	}
}
