import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ria")
public final class Class319 {

	@OriginalMember(owner = "client!ria", name = "l", descriptor = "I")
	public int anInt9232;

	@OriginalMember(owner = "client!ria", name = "d", descriptor = "Ljava/lang/String;")
	public String aString121;

	@OriginalMember(owner = "client!ria", name = "f", descriptor = "C")
	private char aChar7;

	@OriginalMember(owner = "client!ria", name = "e", descriptor = "Z")
	public boolean aBoolean676 = true;

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!rba;I)V")
	public void method7776(@OriginalArg(0) Class3_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5322(-25);
			if (local5 == 0) {
				return;
			}
			this.method7777(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!rba;II)V")
	private void method7777(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar7 = Static265.method4094(arg0.method5288());
		} else if (arg1 == 2) {
			this.anInt9232 = arg0.method5312();
		} else if (arg1 == 4) {
			this.aBoolean676 = false;
		} else if (arg1 == 5) {
			this.aString121 = arg0.method5295();
			return;
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)Z")
	public boolean method7779() {
		return this.aChar7 == 's';
	}
}
