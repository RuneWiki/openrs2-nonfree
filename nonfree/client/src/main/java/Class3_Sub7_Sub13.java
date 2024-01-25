import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class3_Sub7_Sub13 extends Class3_Sub7 {

	@OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
	public int anInt5349 = 0;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZILclient!ie;)V")
	private void method4297(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 2) {
			this.anInt5349 = arg1.method6811();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLclient!ie;)V")
	public void method4299(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6814();
			if (local13 == 0) {
				return;
			}
			this.method4297(local13, arg0);
		}
	}
}
