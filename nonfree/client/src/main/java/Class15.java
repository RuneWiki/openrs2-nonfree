import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class15 {

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
	public int anInt209 = 2048;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
	public int anInt210 = 2048;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
	public int anInt205 = 0;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
	public int anInt207 = 0;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IILclient!rp;)V")
	private void method201(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt207 = arg1.method2739();
		} else if (arg0 == 2) {
			this.anInt209 = arg1.method2767();
		} else if (arg0 == 3) {
			this.anInt210 = arg1.method2767();
		} else if (arg0 == 4) {
			this.anInt205 = arg1.method2740();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!rp;B)V")
	public void method203(@OriginalArg(0) Class3_Sub5 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2739();
			if (local5 == 0) {
				return;
			}
			this.method201(local5, arg0);
		}
	}
}
