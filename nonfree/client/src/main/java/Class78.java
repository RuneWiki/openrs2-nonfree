import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class78 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
	public int anInt2119;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "Z")
	public boolean aBoolean161;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
	public int anInt2121;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
	public int anInt2126;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	public int anInt2127;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
	public int anInt2132;

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
	public int anInt2128 = 8;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
	public int anInt2131 = 16777215;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBLclient!jj;I)V")
	private void method1776(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub18 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2128 = arg1.method3107();
		} else if (arg2 == 2) {
			this.aBoolean161 = true;
		} else if (arg2 == 3) {
			this.anInt2119 = arg1.method3064();
			this.anInt2121 = arg1.method3064();
			this.anInt2132 = arg1.method3064();
		} else if (arg2 == 4) {
			this.anInt2126 = arg1.method3122();
		} else if (arg2 == 5) {
			this.anInt2127 = arg1.method3107();
		} else if (arg2 == 6) {
			this.anInt2131 = arg1.method3109();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!jj;I)V")
	public void method1780(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18 arg1) {
		while (true) {
			@Pc(17) int local17 = arg1.method3122();
			if (local17 == 0) {
				return;
			}
			this.method1776(arg0, arg1, local17);
		}
	}
}
