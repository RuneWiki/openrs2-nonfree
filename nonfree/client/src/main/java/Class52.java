import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class52 {

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
	private int anInt1837;

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "Lclient!kl;")
	public Class138 aClass138_1;

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
	public int anInt1841;

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
	public int anInt1842;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!tl;B)V")
	public void method1392(@OriginalArg(0) Class4_Sub30 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4864();
			if (local17 == 0) {
				return;
			}
			this.method1395(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)Lclient!rl;")
	public synchronized Class205 method1394() {
		@Pc(13) Class205 local13 = (Class205) this.aClass138_1.aClass69_38.method1591((long) this.anInt1837);
		if (local13 != null) {
			return local13;
		}
		local13 = Static464.method4782(this.aClass138_1.aClass166_154, this.anInt1837, 0);
		if (local13 != null) {
			this.aClass138_1.aClass69_38.method1590((long) this.anInt1837, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!tl;I)V")
	private void method1395(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub30 arg1) {
		if (arg0 == 1) {
			this.anInt1837 = arg1.method4877();
		} else if (arg0 == 2) {
			this.anInt1841 = arg1.method4864();
			this.anInt1842 = arg1.method4864();
		}
	}
}
