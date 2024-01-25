import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class70 {

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
	public int anInt1881 = 2;

	@OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
	public int anInt1882 = 64;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "Z")
	public boolean aBoolean138 = false;

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
	public int anInt1880 = -1;

	@OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
	public int anInt1883 = 1;

	@OriginalMember(owner = "client!dea", name = "j", descriptor = "I")
	public int anInt1884 = 64;

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!ofa;IZI)V")
	private void method1554(@OriginalArg(0) Class5_Sub22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt1880 = arg0.method5968();
			if (this.anInt1880 == 65535) {
				this.anInt1880 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt1882 = arg0.method5968() + 1;
			this.anInt1884 = arg0.method5968() + 1;
		} else if (arg1 == 3) {
			arg0.method5963();
		} else if (arg1 == 4) {
			this.anInt1881 = arg0.method5966();
		} else if (arg1 == 5) {
			this.anInt1883 = arg0.method5966();
		} else if (arg1 == 6) {
			this.aBoolean139 = true;
		} else if (arg1 == 7) {
			this.aBoolean138 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILclient!ofa;I)V")
	public void method1555(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub22 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method5966();
			if (local5 == 0) {
				return;
			}
			this.method1554(arg1, local5, arg0);
		}
	}
}
