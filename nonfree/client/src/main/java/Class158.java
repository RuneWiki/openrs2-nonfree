import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class158 {

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
	public int anInt4532;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	public int anInt4533;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
	public int anInt4534;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public int anInt4536;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public int anInt4537;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	public int anInt4539;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	public int anInt4544;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public int anInt4538 = 128;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
	public int anInt4545 = 128;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	public int anInt4542;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
	public Class158(@OriginalArg(0) int arg0) {
		this.anInt4542 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIII)V")
	private Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4545 = arg1;
		this.anInt4542 = arg0;
		this.anInt4532 = arg3;
		this.anInt4537 = arg5;
		this.anInt4538 = arg2;
		this.anInt4536 = arg4;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Lclient!mb;")
	public Class158 method3660() {
		return new Class158(this.anInt4542, this.anInt4545, this.anInt4538, this.anInt4532, this.anInt4536, this.anInt4537);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!mb;I)V")
	public void method3665(@OriginalArg(0) Class158 arg0) {
		this.anInt4545 = arg0.anInt4545;
		this.anInt4537 = arg0.anInt4537;
		this.anInt4538 = arg0.anInt4538;
		this.anInt4532 = arg0.anInt4532;
		this.anInt4536 = arg0.anInt4536;
		this.anInt4542 = arg0.anInt4542;
	}
}
