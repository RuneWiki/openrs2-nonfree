import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class114 {

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
	public int anInt3279;

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "Z")
	public boolean aBoolean245;

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
	public int anInt3282;

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
	public int anInt3283;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
	public int anInt3284;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
	public int anInt3286;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
	public int anInt3277 = 8;

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
	public int anInt3285 = 16777215;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLclient!ap;I)V")
	public void method3003(@OriginalArg(1) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method2772();
			if (local3 == 0) {
				return;
			}
			this.method3004(arg0, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ap;III)V")
	private void method3004(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt3277 = arg0.method2764();
		} else if (arg1 == 2) {
			this.aBoolean245 = true;
		} else if (arg1 == 3) {
			this.anInt3286 = arg0.method2744();
			this.anInt3283 = arg0.method2744();
			this.anInt3279 = arg0.method2744();
		} else if (arg1 == 4) {
			this.anInt3284 = arg0.method2772();
		} else if (arg1 == 5) {
			this.anInt3282 = arg0.method2764();
		} else if (arg1 == 6) {
			this.anInt3285 = arg0.method2791();
		}
	}
}
