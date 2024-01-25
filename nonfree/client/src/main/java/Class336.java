import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class336 {

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
	public int anInt8907;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
	private int anInt8909;

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
	public int anInt8910;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "Lclient!gi;")
	public Class112 aClass112_1;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!ji;B)V")
	public void method7316(@OriginalArg(0) Class6_Sub21 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6069();
			if (local5 == 0) {
				return;
			}
			this.method7318(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)Lclient!iba;")
	public synchronized Class140 method7317() {
		@Pc(23) Class140 local23 = (Class140) this.aClass112_1.aClass136_38.method3473((long) this.anInt8909);
		if (local23 != null) {
			return local23;
		}
		local23 = Static604.method3623(this.aClass112_1.aClass251_52, this.anInt8909, 0);
		if (local23 != null) {
			this.aClass112_1.aClass136_38.method3482((long) this.anInt8909, local23);
		}
		return local23;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!ji;II)V")
	private void method7318(@OriginalArg(0) Class6_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8909 = arg0.method6003();
		} else if (arg1 == 2) {
			this.anInt8907 = arg0.method6069();
			this.anInt8910 = arg0.method6069();
		}
	}
}
