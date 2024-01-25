import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class317 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
	public int anInt8862;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
	public int anInt8863;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
	public int anInt8864;

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
	public int anInt8865;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
	public int anInt8868;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
	public int anInt8872;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "Lclient!ti;")
	public Class317 aClass317_2;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
	public int anInt8875;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
	public int anInt8877;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
	public int anInt8879;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "B")
	public final byte aByte124;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
	public final int anInt8871;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
	public final int anInt8874;

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
	private final int anInt8878;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
	public final int anInt8867;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIB)V")
	public Class317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte124 = arg4;
		this.anInt8871 = arg1;
		this.anInt8874 = arg2;
		this.anInt8878 = arg0;
		this.anInt8867 = arg3;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)Lclient!ti;")
	public Class317 method6931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return new Class317(this.anInt8878, arg2, arg0, arg1, this.aByte124);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)Lclient!wg;")
	public Class358 method6934() {
		return Static561.method7676(this.anInt8878);
	}
}
