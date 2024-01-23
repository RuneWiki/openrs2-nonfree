import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class25 {

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
	public int anInt695 = -1;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
	public int anInt698 = -1;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
	public int anInt701 = 0;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "Z")
	public boolean aBoolean26 = true;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!k;B)V")
	public void method541(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method3793();
			if (local5 == 0) {
				return;
			}
			this.method544(local5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BIILclient!k;)V")
	private void method544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub16 arg2) {
		if (arg0 == 1) {
			this.anInt701 = Static76.method1310(arg2.method3806());
		} else if (arg0 == 2) {
			this.anInt698 = arg2.method3793();
		} else if (arg0 == 3) {
			this.anInt698 = arg2.method3805();
			if (this.anInt698 == 65535) {
				this.anInt698 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean26 = false;
		} else if (arg0 == 7) {
			this.anInt695 = Static76.method1310(arg2.method3806());
		} else if (arg0 == 8) {
			Static193.anInt4186 = arg1;
		} else if (arg0 == 9) {
			arg2.method3805();
		} else if (arg0 != 10) {
			if (arg0 == 11) {
				arg2.method3793();
			} else if (arg0 != 12) {
				if (arg0 == 13) {
					arg2.method3806();
				} else if (arg0 == 14) {
					arg2.method3793();
				}
			}
		}
	}
}
