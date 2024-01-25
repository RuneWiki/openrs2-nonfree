import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class301 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
	public int anInt8598;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	public int anInt8602;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
	public int anInt8604;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	public int anInt8603 = 128;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	public int anInt8600 = 128;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
	public int anInt8601;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(I)V")
	public Class301(@OriginalArg(0) int arg0) {
		this.anInt8601 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(IIIIII)V")
	private Class301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8604 = arg3;
		this.anInt8601 = arg0;
		this.anInt8598 = arg5;
		this.anInt8602 = arg4;
		this.anInt8603 = arg2;
		this.anInt8600 = arg1;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!vd;Z)V")
	public void method7297(@OriginalArg(0) Class301 arg0) {
		this.anInt8604 = arg0.anInt8604;
		this.anInt8603 = arg0.anInt8603;
		this.anInt8600 = arg0.anInt8600;
		this.anInt8601 = arg0.anInt8601;
		this.anInt8602 = arg0.anInt8602;
		this.anInt8598 = arg0.anInt8598;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Lclient!vd;")
	public Class301 method7298() {
		return new Class301(this.anInt8601, this.anInt8600, this.anInt8603, this.anInt8604, this.anInt8602, this.anInt8598);
	}
}
