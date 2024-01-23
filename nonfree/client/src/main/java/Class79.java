import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class79 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "I")
	public int anInt2255;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public int anInt2257;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "I")
	public int anInt2260;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "I")
	public int anInt2263;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "I")
	public int anInt2264;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "Z")
	public boolean aBoolean197;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public int anInt2256 = 16777215;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "I")
	public int anInt2265 = 8;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!fh;I)V")
	private void method2021(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2265 = arg1.method1879();
		} else if (arg2 == 2) {
			this.aBoolean197 = true;
		} else if (arg2 == 3) {
			this.anInt2264 = arg1.method1843();
			this.anInt2260 = arg1.method1843();
			this.anInt2257 = arg1.method1843();
		} else if (arg2 == 4) {
			this.anInt2255 = arg1.method1853();
		} else if (arg2 == 5) {
			this.anInt2263 = arg1.method1879();
		} else if (arg2 == 6) {
			this.anInt2256 = arg1.method1878();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!fh;I)V")
	public void method2023(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method1853();
			if (local9 == 0) {
				return;
			}
			this.method2021(arg1, arg0, local9);
		}
	}
}
