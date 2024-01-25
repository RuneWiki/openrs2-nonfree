import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class25 {

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
	public int anInt610;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
	public int anInt613;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
	public int anInt608 = 128;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
	public int anInt617 = 128;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
	public int anInt605;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(I)V")
	public Class25(@OriginalArg(0) int arg0) {
		this.anInt605 = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIII)V")
	private Class25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt613 = arg5;
		this.anInt610 = arg4;
		this.anInt617 = arg2;
		this.anInt608 = arg1;
		this.anInt605 = arg0;
		this.anInt609 = arg3;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)Lclient!bi;")
	public Class25 method505() {
		return new Class25(this.anInt605, this.anInt608, this.anInt617, this.anInt609, this.anInt610, this.anInt613);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!bi;)V")
	public void method507(@OriginalArg(1) Class25 arg0) {
		this.anInt608 = arg0.anInt608;
		this.anInt609 = arg0.anInt609;
		this.anInt605 = arg0.anInt605;
		this.anInt613 = arg0.anInt613;
		this.anInt617 = arg0.anInt617;
		this.anInt610 = arg0.anInt610;
	}
}
