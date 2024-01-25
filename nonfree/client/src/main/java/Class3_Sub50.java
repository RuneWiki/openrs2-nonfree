import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class3_Sub50 extends Class3 {

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
	public int anInt9370 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
	public int anInt9371 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
	public int anInt9369 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
	public int anInt9374 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
	public int anInt9372 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
	public int anInt9367 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
	public int anInt9375 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
	public int anInt9376 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "Lclient!lq;")
	public final Class3_Sub31 aClass3_Sub31_1;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!lq;)V")
	public Class3_Sub50(@OriginalArg(0) Class3_Sub31 arg0) {
		this.aClass3_Sub31_1 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(III)Z")
	public boolean method7742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= this.anInt9369 && this.anInt9376 >= arg1 && arg0 >= this.anInt9372 && arg0 <= this.anInt9370) {
			return true;
		} else {
			return this.anInt9375 <= arg1 && arg1 <= this.anInt9367 && this.anInt9371 <= arg0 && arg0 <= this.anInt9374;
		}
	}
}
