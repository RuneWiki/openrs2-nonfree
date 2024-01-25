import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class167 {

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
	public int anInt4112 = 0;

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "I")
	public int anInt4116 = 2048;

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "I")
	public int anInt4113 = 2048;

	@OriginalMember(owner = "client!kaa", name = "f", descriptor = "I")
	public int anInt4115 = 0;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IBLclient!dga;)V")
	private void method3549(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt4112 = arg1.method6041();
		} else if (arg0 == 2) {
			this.anInt4113 = arg1.method6006();
		} else if (arg0 == 3) {
			this.anInt4116 = arg1.method6006();
		} else if (arg0 == 4) {
			this.anInt4115 = arg1.method6008();
			return;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!dga;Z)V")
	public void method3551(@OriginalArg(0) Class6_Sub14 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6041();
			if (local15 == 0) {
				return;
			}
			this.method3549(local15, arg0);
		}
	}
}
