import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class223 {

	@OriginalMember(owner = "client!on", name = "a", descriptor = "I")
	public int anInt6749;

	@OriginalMember(owner = "client!on", name = "b", descriptor = "I")
	public int anInt6750;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "I")
	public int anInt6751;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "I")
	public int anInt6755;

	@OriginalMember(owner = "client!on", name = "m", descriptor = "I")
	public int anInt6757;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "Lclient!on;")
	public Class223 aClass223_1;

	@OriginalMember(owner = "client!on", name = "p", descriptor = "I")
	public int anInt6759;

	@OriginalMember(owner = "client!on", name = "r", descriptor = "I")
	public int anInt6761;

	@OriginalMember(owner = "client!on", name = "s", descriptor = "I")
	public int anInt6762;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "I")
	public int anInt6763;

	@OriginalMember(owner = "client!on", name = "x", descriptor = "B")
	public final byte aByte69;

	@OriginalMember(owner = "client!on", name = "f", descriptor = "I")
	public final int anInt6752;

	@OriginalMember(owner = "client!on", name = "v", descriptor = "I")
	public final int anInt6765;

	@OriginalMember(owner = "client!on", name = "l", descriptor = "I")
	public final int anInt6756;

	@OriginalMember(owner = "client!on", name = "w", descriptor = "I")
	private final int anInt6766;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(IIIIB)V")
	public Class223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte69 = arg4;
		this.anInt6752 = arg2;
		this.anInt6765 = arg3;
		this.anInt6756 = arg1;
		this.anInt6766 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!on;I)V")
	public Class223(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1) {
		this.aClass223_1 = arg0;
		this.aByte69 = this.aClass223_1.aByte69;
		this.anInt6766 = this.aClass223_1.anInt6766;
		this.anInt6752 = arg1 + this.aClass223_1.anInt6752;
		this.anInt6756 = this.aClass223_1.anInt6756 + arg1;
		this.anInt6765 = this.aClass223_1.anInt6765 + arg1;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)Lclient!eg;")
	public Class81 method5530() {
		return Static337.method5255(this.anInt6766);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIII)Lclient!on;")
	public Class223 method5531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class223(this.anInt6766, arg2, arg1, arg0, this.aByte69);
	}
}
