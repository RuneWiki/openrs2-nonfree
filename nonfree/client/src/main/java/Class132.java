import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public final class Class132 {

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "I")
	public int anInt3121;

	@OriginalMember(owner = "client!gia", name = "f", descriptor = "I")
	public int anInt3124;

	@OriginalMember(owner = "client!gia", name = "h", descriptor = "I")
	public int anInt3126;

	@OriginalMember(owner = "client!gia", name = "i", descriptor = "I")
	public int anInt3127;

	@OriginalMember(owner = "client!gia", name = "j", descriptor = "I")
	public int anInt3128;

	@OriginalMember(owner = "client!gia", name = "k", descriptor = "I")
	public int anInt3129;

	@OriginalMember(owner = "client!gia", name = "m", descriptor = "I")
	public int anInt3131;

	@OriginalMember(owner = "client!gia", name = "o", descriptor = "I")
	public int anInt3133;

	@OriginalMember(owner = "client!gia", name = "e", descriptor = "I")
	public int anInt3123 = 128;

	@OriginalMember(owner = "client!gia", name = "n", descriptor = "I")
	public int anInt3132 = 128;

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "I")
	public int anInt3120;

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(I)V")
	public Class132(@OriginalArg(0) int arg0) {
		this.anInt3120 = arg0;
	}

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(IIIIII)V")
	private Class132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3126 = arg3;
		this.anInt3120 = arg0;
		this.anInt3121 = arg4;
		this.anInt3123 = arg1;
		this.anInt3131 = arg5;
		this.anInt3132 = arg2;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!gia;B)V")
	public void method2753(@OriginalArg(0) Class132 arg0) {
		this.anInt3131 = arg0.anInt3131;
		this.anInt3121 = arg0.anInt3121;
		this.anInt3126 = arg0.anInt3126;
		this.anInt3123 = arg0.anInt3123;
		this.anInt3120 = arg0.anInt3120;
		this.anInt3132 = arg0.anInt3132;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(B)Lclient!gia;")
	public Class132 method2754() {
		return new Class132(this.anInt3120, this.anInt3123, this.anInt3132, this.anInt3126, this.anInt3121, this.anInt3131);
	}
}
