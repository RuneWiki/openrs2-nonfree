import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class196 {

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
	public int anInt6787;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	public int anInt6788;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	public int anInt6794;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	public int anInt6785 = 128;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	public int anInt6792 = 128;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	public int anInt6790;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I)V")
	public Class196(@OriginalArg(0) int arg0) {
		this.anInt6790 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIII)V")
	private Class196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6790 = arg0;
		this.anInt6785 = arg2;
		this.anInt6787 = arg3;
		this.anInt6788 = arg4;
		this.anInt6794 = arg5;
		this.anInt6792 = arg1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!mc;B)V")
	public void method5675(@OriginalArg(0) Class196 arg0) {
		this.anInt6792 = arg0.anInt6792;
		this.anInt6790 = arg0.anInt6790;
		this.anInt6787 = arg0.anInt6787;
		this.anInt6785 = arg0.anInt6785;
		this.anInt6794 = arg0.anInt6794;
		this.anInt6788 = arg0.anInt6788;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Lclient!mc;")
	public Class196 method5677() {
		return new Class196(this.anInt6790, this.anInt6792, this.anInt6785, this.anInt6787, this.anInt6788, this.anInt6794);
	}
}
