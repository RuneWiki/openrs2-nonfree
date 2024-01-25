import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class146 {

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
	public int anInt4336;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	public int anInt4340;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
	public int anInt4342;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "Z")
	public boolean aBoolean363;

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
	public int anInt4344;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
	public int anInt4346;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
	public int anInt4337 = 8;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
	public int anInt4339 = 16777215;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ud;I)V")
	public void method3601(@OriginalArg(0) Class2_Sub34 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6904();
			if (local11 == 0) {
				return;
			}
			this.method3603(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBLclient!ud;)V")
	private void method3603(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub34 arg1) {
		if (arg0 == 1) {
			this.anInt4337 = arg1.method6884();
		} else if (arg0 == 2) {
			this.aBoolean363 = true;
		} else if (arg0 == 3) {
			this.anInt4344 = arg1.method6856();
			this.anInt4342 = arg1.method6856();
			this.anInt4340 = arg1.method6856();
		} else if (arg0 == 4) {
			this.anInt4336 = arg1.method6904();
		} else if (arg0 == 5) {
			this.anInt4346 = arg1.method6884();
			return;
		} else if (arg0 == 6) {
			this.anInt4339 = arg1.method6870();
			return;
		}
	}
}
