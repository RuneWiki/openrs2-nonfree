import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class257 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "Z")
	public boolean aBoolean518;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
	public int anInt7416;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
	public int anInt7420;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	public int anInt7421;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
	public int anInt7423;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
	public int anInt7425;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	public int anInt7422 = 16777215;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
	public int anInt7424 = 8;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!ie;II)V")
	private void method5791(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt7424 = arg0.method6811();
		} else if (arg1 == 2) {
			this.aBoolean518 = true;
		} else if (arg1 == 3) {
			this.anInt7425 = arg0.method6789();
			this.anInt7416 = arg0.method6789();
			this.anInt7423 = arg0.method6789();
		} else if (arg1 == 4) {
			this.anInt7420 = arg0.method6814();
		} else if (arg1 == 5) {
			this.anInt7421 = arg0.method6811();
		} else if (arg1 == 6) {
			this.anInt7422 = arg0.method6830();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLclient!ie;)V")
	public void method5792(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6814();
			if (local13 == 0) {
				return;
			}
			this.method5791(arg0, local13);
		}
	}
}
