import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class35 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
	public int anInt836;

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
	public int anInt838;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Lclient!pk;")
	public Class249 aClass249_1;

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!jr;II)V")
	private void method722(@OriginalArg(0) Class6_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt840 = arg0.method6044();
		} else if (arg1 == 2) {
			this.anInt836 = arg0.method6019();
			this.anInt838 = arg0.method6019();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)Lclient!kq;")
	public synchronized Class177 method723() {
		@Pc(18) Class177 local18 = (Class177) this.aClass249_1.aClass330_48.method7677((long) this.anInt840);
		if (local18 != null) {
			return local18;
		}
		local18 = Static593.method4148(this.aClass249_1.aClass248_71, this.anInt840, 0);
		if (local18 != null) {
			this.aClass249_1.aClass330_48.method7676(local18, (long) this.anInt840);
		}
		return local18;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!jr;Z)V")
	public void method725(@OriginalArg(0) Class6_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6019();
			if (local9 == 0) {
				return;
			}
			this.method722(arg0, local9);
		}
	}
}
