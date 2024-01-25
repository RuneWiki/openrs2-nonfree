import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class14 {

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "Ljava/lang/String;")
	public String aString14;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
	public int anInt534;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "Z")
	public boolean aBoolean43 = true;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Z")
	public boolean method434() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!qh;II)V")
	private void method436(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static88.method1974(arg0.method3096());
		} else if (arg1 == 2) {
			this.anInt534 = arg0.method3116();
		} else if (arg1 == 4) {
			this.aBoolean43 = false;
		} else if (arg1 == 5) {
			this.aString14 = arg0.method3133();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!qh;B)V")
	public void method437(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3118();
			if (local17 == 0) {
				return;
			}
			this.method436(arg0, local17);
		}
	}
}
