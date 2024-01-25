import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class108 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Ljava/lang/String;")
	public String aString42;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "C")
	private char aChar4;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	public int anInt2527;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Z")
	public boolean aBoolean204 = true;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z")
	public boolean method2254() {
		return this.aChar4 == 's';
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!ti;)V")
	public void method2258(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4548();
			if (local9 == 0) {
				return;
			}
			this.method2259(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BILclient!ti;)V")
	private void method2259(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static375.method5900(arg1.method4529());
		} else if (arg0 == 2) {
			this.anInt2527 = arg1.method4500();
		} else if (arg0 == 4) {
			this.aBoolean204 = false;
		} else if (arg0 == 5) {
			this.aString42 = arg1.method4509();
		}
	}
}
