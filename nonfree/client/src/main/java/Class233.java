import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class233 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	public int anInt6437;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
	public int anInt6438;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
	public int anInt6439;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
	public int anInt6440;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
	public int anInt6441;

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
	public int anInt6443;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
	public int anInt6445;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
	public int anInt6448 = 128;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
	public int anInt6450 = 128;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
	public int anInt6449;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(I)V")
	public Class233(@OriginalArg(0) int arg0) {
		this.anInt6449 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIIII)V")
	private Class233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6448 = arg2;
		this.anInt6450 = arg1;
		this.anInt6439 = arg5;
		this.anInt6438 = arg4;
		this.anInt6440 = arg3;
		this.anInt6449 = arg0;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)Lclient!tn;")
	public Class233 method5131() {
		return new Class233(this.anInt6449, this.anInt6450, this.anInt6448, this.anInt6440, this.anInt6438, this.anInt6439);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!tn;B)V")
	public void method5133(@OriginalArg(0) Class233 arg0) {
		this.anInt6439 = arg0.anInt6439;
		this.anInt6448 = arg0.anInt6448;
		this.anInt6438 = arg0.anInt6438;
		this.anInt6449 = arg0.anInt6449;
		this.anInt6440 = arg0.anInt6440;
		this.anInt6450 = arg0.anInt6450;
	}
}
