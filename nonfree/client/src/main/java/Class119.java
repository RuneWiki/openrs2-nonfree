import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class119 {

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
	public final int anInt3754;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
	public final int anInt3751;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
	public final int anInt3755;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
	public final int anInt3752;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIII)V")
	public Class119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3754 = arg0;
		this.anInt3751 = arg3;
		this.anInt3755 = arg2;
		this.anInt3752 = arg1;
	}

	@OriginalMember(owner = "client!jd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
