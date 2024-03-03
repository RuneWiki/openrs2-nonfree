import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class66 {

	@OriginalMember(owner = "client!et", name = "d", descriptor = "Lclient!bt;")
	public static final Class2_Sub4 aClass2_Sub4_2 = new Class2_Sub4(new byte[5000]);

	@OriginalMember(owner = "client!et", name = "i", descriptor = "Lclient!h;")
	public static final Class89 aClass89_74 = new Class89(40, 1);

	@OriginalMember(owner = "client!et", name = "k", descriptor = "I")
	public static int anInt1883 = 0;

	@OriginalMember(owner = "client!et", name = "n", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_67 = new Class145(80, 7);

	@OriginalMember(owner = "client!et", name = "a", descriptor = "I")
	public int anInt1875 = 0;

	@OriginalMember(owner = "client!et", name = "c", descriptor = "I")
	public int anInt1877 = 2048;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "I")
	public int anInt1878 = 0;

	@OriginalMember(owner = "client!et", name = "h", descriptor = "I")
	public int anInt1881 = 2048;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!bt;I)V", line = 12)
	public void method1938(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4816();
			if (local9 == 0) {
				return;
			}
			this.method1940(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!bt;IZ)V", line = 51)
	private void method1940(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1875 = arg0.method4816();
		} else if (arg1 == 2) {
			this.anInt1881 = arg0.method4830();
		} else if (arg1 == 3) {
			this.anInt1877 = arg0.method4830();
		} else if (arg1 == 4) {
			this.anInt1878 = arg0.method4824();
			return;
		}
	}
}
