import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class255 {

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
	public int anInt7133;

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "Ljava/lang/String;")
	public String aString68;

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "Z")
	public boolean aBoolean487 = true;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!ha;I)V")
	private void method5848(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static151.method2480(arg0.method3116());
		} else if (arg1 == 2) {
			this.anInt7133 = arg0.method3109();
		} else if (arg1 == 4) {
			this.aBoolean487 = false;
		} else if (arg1 == 5) {
			this.aString68 = arg0.method3093();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)Z")
	public boolean method5849() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!ha;)V")
	public void method5851(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3111();
			if (local14 == 0) {
				return;
			}
			this.method5848(arg0, local14);
		}
	}
}
