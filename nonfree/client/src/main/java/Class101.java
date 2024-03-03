import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class101 {

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
	public static int anInt2691 = 0;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "Lclient!h;")
	public static final Class89 aClass89_112 = new Class89(38, 14);

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public int anInt2683;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
	public int anInt2689;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
	public int anInt2690;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	public int anInt2692;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Z")
	public boolean aBoolean191;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
	public int anInt2695;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
	public int anInt2687 = 8;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public int anInt2684 = 16777215;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!bt;II)V", line = 3)
	private void method2691(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2687 = arg0.method4830();
		} else if (arg1 == 2) {
			this.aBoolean191 = true;
		} else if (arg1 == 3) {
			this.anInt2692 = arg0.method4824();
			this.anInt2695 = arg0.method4824();
			this.anInt2690 = arg0.method4824();
		} else if (arg1 == 4) {
			this.anInt2689 = arg0.method4816();
		} else if (arg1 == 5) {
			this.anInt2683 = arg0.method4830();
		} else if (arg1 == 6) {
			this.anInt2684 = arg0.method4834();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!bt;)V", line = 153)
	public void method2696(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4816();
			if (local17 == 0) {
				return;
			}
			this.method2691(arg0, local17);
		}
	}
}
