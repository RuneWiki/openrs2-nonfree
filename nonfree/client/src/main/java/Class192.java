import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class192 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
	public int anInt4889;

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
	public int anInt4891;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
	public int anInt4892;

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
	public int anInt4893;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
	public int anInt4894;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "Lclient!oo;")
	public Class192 aClass192_2;

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
	public int anInt4899;

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
	public int anInt4901;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
	public int anInt4902;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
	public int anInt4904;

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
	public final int anInt4898;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
	private final int anInt4895;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
	public final int anInt4897;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	public final int anInt4896;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "B")
	public final byte aByte59;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(IIIIB)V")
	public Class192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt4898 = arg1;
		this.anInt4895 = arg0;
		this.anInt4897 = arg3;
		this.anInt4896 = arg2;
		this.aByte59 = arg4;
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!oo;I)V")
	public Class192(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1) {
		this.aClass192_2 = arg0;
		this.anInt4897 = this.aClass192_2.anInt4897 + arg1;
		this.anInt4895 = this.aClass192_2.anInt4895;
		this.anInt4898 = this.aClass192_2.anInt4898 + arg1;
		this.aByte59 = this.aClass192_2.aByte59;
		this.anInt4896 = arg1 + this.aClass192_2.anInt4896;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)Lclient!uo;")
	public Class245 method4338() {
		return Static232.method3613(this.anInt4895);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIII)Lclient!oo;")
	public Class192 method4340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return new Class192(this.anInt4895, arg0, arg1, arg2, this.aByte59);
	}
}
