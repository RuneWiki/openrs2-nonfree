import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class99 {

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "Ljava/lang/String;")
	public String aString35;

	@OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
	public int anInt2851;

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "Z")
	public boolean aBoolean238 = true;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)Z")
	public boolean method2523() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!iaa;I)V")
	public void method2525(@OriginalArg(0) Class6_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4966();
			if (local5 == 0) {
				return;
			}
			this.method2527(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BILclient!iaa;)V")
	private void method2527(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub26 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static60.method1329(arg1.method4972());
		} else if (arg0 == 2) {
			this.anInt2851 = arg1.method5000();
		} else if (arg0 == 4) {
			this.aBoolean238 = false;
		} else if (arg0 == 5) {
			this.aString35 = arg1.method4941();
			return;
		}
	}
}
