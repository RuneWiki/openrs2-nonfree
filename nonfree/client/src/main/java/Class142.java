import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public final class Class142 {

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
	public int anInt4744;

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
	public int anInt4745;

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
	public int anInt4746;

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "I")
	public int anInt4747;

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "I")
	public int anInt4748;

	@OriginalMember(owner = "client!jba", name = "h", descriptor = "I")
	public int anInt4749;

	@OriginalMember(owner = "client!jba", name = "o", descriptor = "I")
	public int anInt4754;

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "I")
	public int anInt4743 = 128;

	@OriginalMember(owner = "client!jba", name = "k", descriptor = "I")
	public int anInt4752 = 128;

	@OriginalMember(owner = "client!jba", name = "m", descriptor = "I")
	public int anInt4753;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(I)V")
	public Class142(@OriginalArg(0) int arg0) {
		this.anInt4753 = arg0;
	}

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(IIIIII)V")
	private Class142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4746 = arg3;
		this.anInt4748 = arg5;
		this.anInt4752 = arg2;
		this.anInt4753 = arg0;
		this.anInt4743 = arg1;
		this.anInt4749 = arg4;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!jba;)V")
	public void method3983(@OriginalArg(1) Class142 arg0) {
		this.anInt4749 = arg0.anInt4749;
		this.anInt4743 = arg0.anInt4743;
		this.anInt4752 = arg0.anInt4752;
		this.anInt4746 = arg0.anInt4746;
		this.anInt4748 = arg0.anInt4748;
		this.anInt4753 = arg0.anInt4753;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)Lclient!jba;")
	public Class142 method3984() {
		return new Class142(this.anInt4753, this.anInt4743, this.anInt4752, this.anInt4746, this.anInt4749, this.anInt4748);
	}
}
