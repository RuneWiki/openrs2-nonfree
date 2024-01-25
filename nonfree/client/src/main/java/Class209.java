import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class209 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public int anInt6174;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!ld;")
	public Class209 aClass209_1;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	public int anInt6176;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!oha;")
	public Class254 aClass254_4;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
	public int anInt6182;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
	public final int anInt6179;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
	public final int anInt6178;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(II)V")
	public Class209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6179 = arg0;
		this.anInt6178 = arg1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)Lclient!ai;")
	public Class15 method5131() {
		return Static520.method7364(this.anInt6179);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)Lclient!ld;")
	public Class209 method5132(@OriginalArg(0) int arg0) {
		return new Class209(this.anInt6179, arg0);
	}
}
