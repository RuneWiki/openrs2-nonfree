import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class189 {

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
	public int anInt4883;

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "Lclient!jk;")
	public Class189 aClass189_2;

	@OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
	public int anInt4886;

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
	public int anInt4888;

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
	public int anInt4894;

	@OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
	public int anInt4895;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
	public int anInt4896;

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
	public int anInt4898;

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
	public int anInt4899;

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
	public int anInt4900;

	@OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
	public final int anInt4885;

	@OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
	private final int anInt4893;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
	public final int anInt4891;

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	public final int anInt4901;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "B")
	public final byte aByte69;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(IIIIB)V")
	public Class189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt4885 = arg2;
		this.anInt4893 = arg0;
		this.anInt4891 = arg1;
		this.anInt4901 = arg3;
		this.aByte69 = arg4;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)Lclient!jd;")
	public Class184 method4147() {
		return Static602.method8655(this.anInt4893);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)Lclient!jk;")
	public Class189 method4152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class189(this.anInt4893, arg0, arg2, arg1, this.aByte69);
	}
}
