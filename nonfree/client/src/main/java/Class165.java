import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public final class Class165 {

	@OriginalMember(owner = "client!js", name = "b", descriptor = "I")
	public int anInt4941;

	@OriginalMember(owner = "client!js", name = "c", descriptor = "I")
	public int anInt4942;

	@OriginalMember(owner = "client!js", name = "d", descriptor = "I")
	public int anInt4943;

	@OriginalMember(owner = "client!js", name = "g", descriptor = "I")
	public int anInt4946;

	@OriginalMember(owner = "client!js", name = "j", descriptor = "I")
	public int anInt4949;

	@OriginalMember(owner = "client!js", name = "l", descriptor = "I")
	public int anInt4951;

	@OriginalMember(owner = "client!js", name = "o", descriptor = "I")
	public int anInt4953;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "I")
	public int anInt4940 = 128;

	@OriginalMember(owner = "client!js", name = "i", descriptor = "I")
	public int anInt4948 = 128;

	@OriginalMember(owner = "client!js", name = "m", descriptor = "I")
	public int anInt4952;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I)V")
	public Class165(@OriginalArg(0) int arg0) {
		this.anInt4952 = arg0;
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(IIIIII)V")
	private Class165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4940 = arg1;
		this.anInt4948 = arg2;
		this.anInt4953 = arg5;
		this.anInt4952 = arg0;
		this.anInt4949 = arg3;
		this.anInt4941 = arg4;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)Lclient!js;")
	public Class165 method4175() {
		return new Class165(this.anInt4952, this.anInt4940, this.anInt4948, this.anInt4949, this.anInt4941, this.anInt4953);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!js;Z)V")
	public void method4177(@OriginalArg(0) Class165 arg0) {
		this.anInt4940 = arg0.anInt4940;
		this.anInt4941 = arg0.anInt4941;
		this.anInt4953 = arg0.anInt4953;
		this.anInt4952 = arg0.anInt4952;
		this.anInt4949 = arg0.anInt4949;
		this.anInt4948 = arg0.anInt4948;
	}
}
