import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class2_Sub3_Sub21 extends Class2_Sub3 {

	@OriginalMember(owner = "client!oa", name = "W", descriptor = "Z")
	public boolean aBoolean144 = true;

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
	public int anInt3251 = -1;

	@OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
	public int anInt3252 = -1;

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
	public int anInt3253 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BILclient!nh;)V")
	public void method2553(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method2122();
			if (local13 == 0) {
				return;
			}
			this.method2554(arg1, arg0, local13);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!nh;BII)V")
	private void method2554(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt3253 = Static79.method1338(arg0.method2091());
		} else if (arg2 == 2) {
			this.anInt3251 = arg0.method2122();
		} else if (arg2 == 3) {
			this.anInt3251 = arg0.method2095();
			if (this.anInt3251 == 65535) {
				this.anInt3251 = -1;
			}
		} else if (arg2 == 5) {
			this.aBoolean144 = false;
		} else if (arg2 == 7) {
			this.anInt3252 = Static79.method1338(arg0.method2091());
		} else if (arg2 == 8) {
			Static182.anInt4235 = arg1;
		} else if (arg2 == 9) {
			arg0.method2095();
		} else if (arg2 != 10) {
			if (arg2 == 11) {
				arg0.method2122();
			} else if (arg2 != 12) {
				if (arg2 == 13) {
					arg0.method2091();
				} else if (arg2 == 14) {
					arg0.method2122();
				}
			}
		}
	}
}
