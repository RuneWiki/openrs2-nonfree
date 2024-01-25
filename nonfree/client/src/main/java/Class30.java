import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class30 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	private int anInt536;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
	public int anInt537;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
	public int anInt538;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Lclient!hm;")
	public Class141 aClass141_1;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!mo;)V")
	public void method478(@OriginalArg(1) Class1_Sub35 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method5750();
			if (local16 == 0) {
				return;
			}
			this.method481(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Lclient!fg;")
	public synchronized Class102 method479() {
		@Pc(18) Class102 local18 = (Class102) this.aClass141_1.aClass222_22.method4430((long) this.anInt536);
		if (local18 != null) {
			return local18;
		}
		local18 = Static601.method2070(this.aClass141_1.aClass270_41, this.anInt536, 0);
		if (local18 != null) {
			this.aClass141_1.aClass222_22.method4434(local18, (long) this.anInt536);
		}
		return local18;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!mo;II)V")
	private void method481(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt536 = arg0.method5771();
		} else if (arg1 == 2) {
			this.anInt537 = arg0.method5750();
			this.anInt538 = arg0.method5750();
		}
	}
}
