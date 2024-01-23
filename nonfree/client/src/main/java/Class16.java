import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class16 {

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
	public int anInt535;

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
	public int anInt538;

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
	public int anInt539;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!fh;II)V")
	private void method503(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt535 = arg0.method1879();
			this.anInt538 = arg0.method1853();
			this.anInt539 = arg0.method1853();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLclient!fh;)V")
	public void method504(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1853();
			if (local13 == 0) {
				return;
			}
			this.method503(arg0, local13);
		}
	}
}
