import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class3_Sub3_Sub19 extends Class3_Sub3 {

	@OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
	public int anInt3081 = -1;

	@OriginalMember(owner = "client!pf", name = "K", descriptor = "Z")
	public boolean aBoolean143 = true;

	@OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
	public int anInt3080 = -1;

	@OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
	public int anInt3084 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILclient!ce;I)V")
	private void method2198(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt3084 = Static15.method296(arg1.method1271());
		} else if (arg0 == 2) {
			this.anInt3081 = arg1.method1278();
		} else if (arg0 == 3) {
			this.anInt3081 = arg1.method1270();
			if (this.anInt3081 == 65535) {
				this.anInt3081 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean143 = false;
			return;
		} else if (arg0 == 7) {
			this.anInt3080 = Static15.method296(arg1.method1271());
			return;
		} else {
			if (arg0 == 8) {
				Static139.anInt4129 = arg2;
			} else if (arg0 == 9) {
				arg1.method1270();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILclient!ce;)V")
	public void method2201(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		while (true) {
			@Pc(17) int local17 = arg1.method1278();
			if (local17 == 0) {
				return;
			}
			this.method2198(local17, arg1, arg0);
		}
	}
}
