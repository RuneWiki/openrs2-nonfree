import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class356 {

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
	public final int anInt9979;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
	public final int anInt9982;

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
	public final int anInt9985;

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
	public final int anInt9980;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(IIII)V")
	public Class356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9979 = arg3;
		this.anInt9982 = arg2;
		this.anInt9985 = arg0;
		this.anInt9980 = arg1;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)Lclient!uq;")
	public Class356 method8305(@OriginalArg(0) int arg0) {
		return new Class356(this.anInt9985, arg0, this.anInt9982, this.anInt9979);
	}
}
