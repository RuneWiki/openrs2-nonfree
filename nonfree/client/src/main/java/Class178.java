import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class178 {

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
	public int anInt4435;

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
	public int anInt4439;

	@OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
	public int anInt4440;

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
	public int anInt4438 = 128;

	@OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
	public int anInt4441 = 128;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
	public int anInt4434;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V")
	public Class178(@OriginalArg(0) int arg0) {
		this.anInt4434 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIIII)V")
	private Class178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4439 = arg5;
		this.anInt4434 = arg0;
		this.anInt4440 = arg3;
		this.anInt4435 = arg4;
		this.anInt4441 = arg2;
		this.anInt4438 = arg1;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)Lclient!jt;")
	public Class178 method3849() {
		return new Class178(this.anInt4434, this.anInt4438, this.anInt4441, this.anInt4440, this.anInt4435, this.anInt4439);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILclient!jt;)V")
	public void method3850(@OriginalArg(1) Class178 arg0) {
		this.anInt4441 = arg0.anInt4441;
		this.anInt4434 = arg0.anInt4434;
		this.anInt4435 = arg0.anInt4435;
		this.anInt4438 = arg0.anInt4438;
		this.anInt4440 = arg0.anInt4440;
		this.anInt4439 = arg0.anInt4439;
	}
}
