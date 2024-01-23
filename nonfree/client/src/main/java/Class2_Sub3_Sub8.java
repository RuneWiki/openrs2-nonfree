import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class2_Sub3_Sub8 extends Class2_Sub3 {

	@OriginalMember(owner = "client!i", name = "I", descriptor = "I")
	public int anInt2217;

	@OriginalMember(owner = "client!i", name = "J", descriptor = "Ljava/lang/String;")
	public String aString111;

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(I)Z")
	public boolean method1911() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!wm;)V")
	public void method1912(@OriginalArg(1) Class2_Sub26 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4261();
			if (local13 == 0) {
				return;
			}
			this.method1913(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!wm;I)V")
	private void method1913(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub26 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static184.method3157(arg1.method4220());
		} else if (arg0 == 2) {
			this.anInt2217 = arg1.method4228();
		} else if (arg0 == 5) {
			this.aString111 = arg1.method4265();
		}
	}
}
