import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class352 {

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
	public int anInt9310;

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "Ljava/lang/String;")
	public String aString99;

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "Z")
	public boolean aBoolean714 = true;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IILclient!es;)V")
	private void method7722(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub15 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static128.method2158(arg1.method4304());
		} else if (arg0 == 2) {
			this.anInt9310 = arg1.method4307();
		} else if (arg0 == 4) {
			this.aBoolean714 = false;
		} else if (arg0 == 5) {
			this.aString99 = arg1.method4324();
			return;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)Z")
	public boolean method7723() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLclient!es;)V")
	public void method7725(@OriginalArg(1) Class2_Sub15 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method4325();
			if (local12 == 0) {
				return;
			}
			this.method7722(local12, arg0);
		}
	}
}
