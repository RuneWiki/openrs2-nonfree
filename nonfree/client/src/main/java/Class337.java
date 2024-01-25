import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public final class Class337 {

	@OriginalMember(owner = "client!uga", name = "e", descriptor = "I")
	public int anInt9393;

	@OriginalMember(owner = "client!uga", name = "f", descriptor = "I")
	public int anInt9394;

	@OriginalMember(owner = "client!uga", name = "i", descriptor = "I")
	public int anInt9397;

	@OriginalMember(owner = "client!uga", name = "j", descriptor = "Lclient!uga;")
	public Class337 aClass337_2;

	@OriginalMember(owner = "client!uga", name = "p", descriptor = "Lclient!kd;")
	public Class6 aClass6_35;

	@OriginalMember(owner = "client!uga", name = "l", descriptor = "I")
	public final int anInt9398;

	@OriginalMember(owner = "client!uga", name = "h", descriptor = "I")
	public final int anInt9396;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(II)V")
	public Class337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9398 = arg1;
		this.anInt9396 = arg0;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(II)Lclient!uga;")
	public Class337 method7846(@OriginalArg(0) int arg0) {
		return new Class337(this.anInt9396, arg0);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(B)Lclient!va;")
	public Class351 method7847() {
		return Static235.method3901(this.anInt9396);
	}
}
