import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public final class Class244 {

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
	public int anInt6524;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
	public int anInt6525;

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
	public int anInt6529;

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
	public int anInt6531;

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
	public int anInt6533;

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
	public int anInt6534;

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
	public int anInt6535;

	@OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
	public int anInt6536;

	@OriginalMember(owner = "client!ns", name = "r", descriptor = "I")
	public int anInt6537;

	@OriginalMember(owner = "client!ns", name = "s", descriptor = "Lclient!ns;")
	public Class244 aClass244_2;

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
	public final int anInt6527;

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
	public final int anInt6532;

	@OriginalMember(owner = "client!ns", name = "t", descriptor = "B")
	public final byte aByte88;

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
	public final int anInt6530;

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
	private final int anInt6526;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(IIIIB)V")
	public Class244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt6527 = arg1;
		this.anInt6532 = arg2;
		this.aByte88 = arg4;
		this.anInt6530 = arg3;
		this.anInt6526 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Lclient!df;")
	public Class59 method5296() {
		return Static528.method7270(this.anInt6526);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIII)Lclient!ns;")
	public Class244 method5297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return new Class244(this.anInt6526, arg2, arg1, arg0, this.aByte88);
	}
}
