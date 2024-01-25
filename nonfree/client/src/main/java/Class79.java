import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class79 {

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
	public int anInt1518;

	@OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
	public int anInt1519;

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
	public int anInt1521;

	@OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
	public int anInt1523 = 128;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
	public int anInt1524 = 128;

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
	public int anInt1516;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(I)V")
	public Class79(@OriginalArg(0) int arg0) {
		this.anInt1516 = arg0;
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(IIIIII)V")
	private Class79(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1518 = arg4;
		this.anInt1519 = arg3;
		this.anInt1524 = arg2;
		this.anInt1521 = arg5;
		this.anInt1516 = arg0;
		this.anInt1523 = arg1;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!cw;B)V")
	public void method1362(@OriginalArg(0) Class79 arg0) {
		this.anInt1523 = arg0.anInt1523;
		this.anInt1518 = arg0.anInt1518;
		this.anInt1516 = arg0.anInt1516;
		this.anInt1519 = arg0.anInt1519;
		this.anInt1521 = arg0.anInt1521;
		this.anInt1524 = arg0.anInt1524;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)Lclient!cw;")
	public Class79 method1363() {
		return new Class79(this.anInt1516, this.anInt1523, this.anInt1524, this.anInt1519, this.anInt1518, this.anInt1521);
	}
}
