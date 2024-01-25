import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class12 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	public int anInt419;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!qn;")
	public Class273 aClass273_1;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	public int anInt424;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!es;)V")
	public void method242(@OriginalArg(1) Class2_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4325();
			if (local9 == 0) {
				return;
			}
			this.method243(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!es;II)V")
	private void method243(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt420 = arg0.method4294();
		} else if (arg1 == 2) {
			this.anInt424 = arg0.method4325();
			this.anInt419 = arg0.method4325();
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)Lclient!aga;")
	public synchronized Class13 method245() {
		@Pc(13) Class13 local13 = (Class13) this.aClass273_1.aClass313_45.method6989((long) this.anInt420);
		if (local13 != null) {
			return local13;
		}
		local13 = Static596.method247(this.aClass273_1.aClass259_138, this.anInt420, 0);
		if (local13 != null) {
			this.aClass273_1.aClass313_45.method6980((long) this.anInt420, local13);
		}
		return local13;
	}
}
