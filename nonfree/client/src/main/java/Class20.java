import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class20 {

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	public int anInt369;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Ljava/lang/String;")
	public String aString6;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Z")
	public boolean aBoolean39 = true;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!vt;)V")
	public void method273(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5732();
			if (local5 == 0) {
				return;
			}
			this.method278(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!vt;II)V")
	private void method278(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static168.method2964(arg0.method5759());
		} else if (arg1 == 2) {
			this.anInt369 = arg0.method5776();
		} else if (arg1 == 4) {
			this.aBoolean39 = false;
		} else if (arg1 == 5) {
			this.aString6 = arg0.method5744();
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Z")
	public boolean method279() {
		return this.aChar2 == 's';
	}
}
