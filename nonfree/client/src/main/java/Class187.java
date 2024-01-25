import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class187 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public int anInt4714;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
	public int anInt4719;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
	public int anInt4723;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public int anInt4713 = 128;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
	public int anInt4722 = 128;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
	public int anInt4715;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V")
	public Class187(@OriginalArg(0) int arg0) {
		this.anInt4715 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIII)V")
	private Class187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4719 = arg3;
		this.anInt4715 = arg0;
		this.anInt4714 = arg4;
		this.anInt4713 = arg1;
		this.anInt4722 = arg2;
		this.anInt4723 = arg5;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)Lclient!ke;")
	public Class187 method4006() {
		return new Class187(this.anInt4715, this.anInt4713, this.anInt4722, this.anInt4719, this.anInt4714, this.anInt4723);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ke;B)V")
	public void method4010(@OriginalArg(0) Class187 arg0) {
		this.anInt4719 = arg0.anInt4719;
		this.anInt4713 = arg0.anInt4713;
		this.anInt4722 = arg0.anInt4722;
		this.anInt4714 = arg0.anInt4714;
		this.anInt4715 = arg0.anInt4715;
		this.anInt4723 = arg0.anInt4723;
	}
}
