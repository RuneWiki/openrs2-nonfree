import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class280 {

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
	public int anInt6955 = 1;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	public int anInt6954 = 64;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	public int anInt6949 = 64;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "Z")
	public boolean aBoolean569 = false;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
	public int anInt6951 = -1;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
	public int anInt6956 = 2;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "Z")
	public boolean aBoolean570 = false;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILclient!gk;)V")
	public void method5690(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method4464();
			if (local9 == 0) {
				return;
			}
			this.method5691(arg1, arg0, local9);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!gk;II)V")
	private void method5691(@OriginalArg(1) Class2_Sub7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt6951 = arg0.method4518();
			if (this.anInt6951 == 65535) {
				this.anInt6951 = -1;
				return;
			}
		} else if (arg2 == 2) {
			this.anInt6954 = arg0.method4518() + 1;
			this.anInt6949 = arg0.method4518() + 1;
			return;
		} else if (arg2 == 3) {
			arg0.method4477();
		} else if (arg2 == 4) {
			this.anInt6956 = arg0.method4464();
			return;
		} else if (arg2 == 5) {
			this.anInt6955 = arg0.method4464();
			return;
		} else if (arg2 == 6) {
			this.aBoolean570 = true;
			return;
		} else if (arg2 == 7) {
			this.aBoolean569 = true;
			return;
		}
	}
}
