import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public final class Class103 {

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
	public int anInt3851;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
	public int anInt3852;

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
	public int anInt3854;

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
	public int anInt3857;

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
	public int anInt3861;

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
	public int anInt3862;

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
	public int anInt3863;

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
	public int anInt3865;

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
	public int anInt3858 = 128;

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
	public int anInt3864 = 128;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
	public int anInt3853;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(I)V")
	public Class103(@OriginalArg(0) int arg0) {
		this.anInt3853 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(IIIIII)V")
	private Class103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3862 = arg3;
		this.anInt3851 = arg4;
		this.anInt3858 = arg2;
		this.anInt3852 = arg5;
		this.anInt3864 = arg1;
		this.anInt3853 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!fo;B)V")
	public void method3382(@OriginalArg(0) Class103 arg0) {
		this.anInt3862 = arg0.anInt3862;
		this.anInt3864 = arg0.anInt3864;
		this.anInt3852 = arg0.anInt3852;
		this.anInt3851 = arg0.anInt3851;
		this.anInt3853 = arg0.anInt3853;
		this.anInt3858 = arg0.anInt3858;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)Lclient!fo;")
	public Class103 method3384() {
		return new Class103(this.anInt3853, this.anInt3864, this.anInt3858, this.anInt3862, this.anInt3851, this.anInt3852);
	}
}
