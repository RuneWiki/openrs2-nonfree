import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class172 {

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
	public int anInt4596 = 64;

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
	public int anInt4598 = 1;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "Z")
	public boolean aBoolean329 = false;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
	public int anInt4597 = -1;

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
	public int anInt4595 = 2;

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "Z")
	public boolean aBoolean330 = false;

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
	public int anInt4600 = 64;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBLclient!hw;)V")
	public void method3683(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		while (true) {
			@Pc(17) int local17 = arg1.method6138();
			if (local17 == 0) {
				return;
			}
			this.method3684(arg1, local17, arg0);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!hw;III)V")
	private void method3684(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt4597 = arg0.method6148();
			if (this.anInt4597 == 65535) {
				this.anInt4597 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt4596 = arg0.method6148() + 1;
			this.anInt4600 = arg0.method6148() + 1;
		} else if (arg1 == 3) {
			arg0.method6120();
		} else if (arg1 == 4) {
			this.anInt4595 = arg0.method6138();
		} else if (arg1 == 5) {
			this.anInt4598 = arg0.method6138();
			return;
		} else if (arg1 == 6) {
			this.aBoolean330 = true;
			return;
		} else if (arg1 == 7) {
			this.aBoolean329 = true;
			return;
		}
	}
}
