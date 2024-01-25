import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class43 {

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
	private int anInt1264;

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "Lclient!hm;")
	public Class106 aClass106_1;

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
	public int anInt1265;

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
	public int anInt1268;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!lh;I)V")
	private void method1073(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1264 = arg0.method4093();
		} else if (arg1 == 2) {
			this.anInt1265 = arg0.method4130();
			this.anInt1268 = arg0.method4130();
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)Lclient!mp;")
	public synchronized Class159 method1074() {
		@Pc(13) Class159 local13 = (Class159) this.aClass106_1.aClass83_23.method1658((long) this.anInt1264);
		if (local13 != null) {
			return local13;
		}
		local13 = Static459.method3755(this.aClass106_1.aClass250_32, this.anInt1264, 0);
		if (local13 != null) {
			this.aClass106_1.aClass83_23.method1675((long) this.anInt1264, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!lh;B)V")
	public void method1075(@OriginalArg(0) Class1_Sub1 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method4130();
			if (local16 == 0) {
				return;
			}
			this.method1073(arg0, local16);
		}
	}
}
