import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public final class Class3_Sub49 extends Class3 {

	@OriginalMember(owner = "client!uha", name = "m", descriptor = "I")
	public int anInt9420 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!uha", name = "v", descriptor = "I")
	public int anInt9428 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!uha", name = "w", descriptor = "I")
	public int anInt9429 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!uha", name = "u", descriptor = "I")
	public int anInt9427 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!uha", name = "o", descriptor = "I")
	public int anInt9422 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!uha", name = "r", descriptor = "I")
	public int anInt9424 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!uha", name = "z", descriptor = "I")
	public int anInt9432 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!uha", name = "F", descriptor = "I")
	public int anInt9437 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!uha", name = "q", descriptor = "Lclient!to;")
	public final Class3_Sub47 aClass3_Sub47_1;

	@OriginalMember(owner = "client!uha", name = "<init>", descriptor = "(Lclient!to;)V")
	public Class3_Sub49(@OriginalArg(0) Class3_Sub47 arg0) {
		this.aClass3_Sub47_1 = arg0;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIB)Z")
	public boolean method8073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt9422 <= arg0 && arg0 <= this.anInt9420 && arg1 >= this.anInt9428 && this.anInt9437 >= arg1) {
			return true;
		} else {
			return arg0 >= this.anInt9427 && arg0 <= this.anInt9424 && this.anInt9429 <= arg1 && arg1 <= this.anInt9432;
		}
	}
}
