import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public final class Class161 {

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
	public final int anInt4504;

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
	public final int anInt4505;

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "I")
	public final int anInt4509;

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
	public final int anInt4511;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(IIII)V")
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4504 = arg2;
		this.anInt4505 = arg3;
		this.anInt4509 = arg0;
		this.anInt4511 = arg1;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZI)Lclient!jca;")
	public Class161 method4002(@OriginalArg(1) int arg0) {
		return new Class161(this.anInt4509, arg0, this.anInt4504, this.anInt4505);
	}
}
