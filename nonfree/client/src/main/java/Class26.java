import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class26 {

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
	private int anInt421;

	@OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
	public int anInt423;

	@OriginalMember(owner = "client!baa", name = "g", descriptor = "Lclient!od;")
	public Class243 aClass243_1;

	@OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
	public int anInt425;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILclient!un;)V")
	public void method366(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4905();
			if (local9 == 0) {
				return;
			}
			this.method369(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)Lclient!pga;")
	public synchronized Class261 method367() {
		@Pc(13) Class261 local13 = (Class261) this.aClass243_1.aClass223_49.method5388((long) this.anInt421);
		if (local13 != null) {
			return local13;
		}
		local13 = Static598.method6312(this.aClass243_1.aClass176_98, this.anInt421, 0);
		if (local13 != null) {
			this.aClass243_1.aClass223_49.method5394(local13, (long) this.anInt421);
		}
		return local13;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILclient!un;I)V")
	private void method369(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt421 = arg0.method4936();
		} else if (arg1 == 2) {
			this.anInt425 = arg0.method4905();
			this.anInt423 = arg0.method4905();
		}
	}
}
