import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public final class Class2 {

	@OriginalMember(owner = "client!aaa", name = "j", descriptor = "I")
	public final int anInt57;

	@OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
	public final int anInt56;

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
	public final int anInt52;

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
	public final int anInt51;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(IIII)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt57 = arg2;
		this.anInt56 = arg0;
		this.anInt52 = arg1;
		this.anInt51 = arg3;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IZ)Lclient!aaa;")
	public Class2 method190(@OriginalArg(0) int arg0) {
		return new Class2(this.anInt56, arg0, this.anInt57, this.anInt51);
	}
}
