import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class7 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	public int anInt135;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
	public int anInt137;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
	public int anInt139;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "Z")
	public boolean aBoolean12;

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
	public int anInt143;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
	public int anInt131 = 8;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
	public int anInt141 = 16777215;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!pi;Z)V")
	private void method113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub24 arg2) {
		if (arg1 == 1) {
			this.anInt131 = arg2.method3085();
		} else if (arg1 == 2) {
			this.aBoolean12 = true;
		} else if (arg1 == 3) {
			this.anInt139 = arg2.method3072();
			this.anInt143 = arg2.method3072();
			this.anInt135 = arg2.method3072();
		} else if (arg1 == 4) {
			this.anInt137 = arg2.method3110();
		} else if (arg1 == 5) {
			this.anInt130 = arg2.method3085();
		} else if (arg1 == 6) {
			this.anInt141 = arg2.method3063();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!pi;II)V")
	public void method114(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method3110();
			if (local9 == 0) {
				return;
			}
			this.method113(arg1, local9, arg0);
		}
	}
}
