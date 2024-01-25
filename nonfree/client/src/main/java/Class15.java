import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class15 {

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
	public final int anInt313;

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
	public final int anInt318;

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
	public final int anInt314;

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
	public final int anInt315;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IIII)V")
	public Class15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt313 = arg3;
		this.anInt318 = arg2;
		this.anInt314 = arg0;
		this.anInt315 = arg1;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZI)Lclient!ar;")
	public Class15 method273(@OriginalArg(1) int arg0) {
		return new Class15(this.anInt314, arg0, this.anInt318, this.anInt313);
	}
}
