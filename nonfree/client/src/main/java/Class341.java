import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class341 {

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
	public int anInt9931;

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "Ljava/lang/String;")
	public String aString107;

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "C")
	private char aChar6;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Z")
	public boolean aBoolean704 = true;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!so;I)V")
	private void method8267(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub29 arg1) {
		if (arg0 == 1) {
			this.aChar6 = Static462.method6790(arg1.method5845());
		} else if (arg0 == 2) {
			this.anInt9931 = arg1.method5878();
		} else if (arg0 == 4) {
			this.aBoolean704 = false;
		} else if (arg0 == 5) {
			this.aString107 = arg1.method5898();
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)Z")
	public boolean method8270() {
		return this.aChar6 == 's';
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!so;I)V")
	public void method8271(@OriginalArg(0) Class14_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5866();
			if (local5 == 0) {
				return;
			}
			this.method8267(local5, arg0);
		}
	}
}
