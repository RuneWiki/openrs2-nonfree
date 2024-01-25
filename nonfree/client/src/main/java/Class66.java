import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class66 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public int anInt1216;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	private int anInt1217;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!ab;")
	public Class3 aClass3_1;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
	public int anInt1222;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!wm;)V")
	public void method1068(@OriginalArg(1) Class1_Sub19 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2915();
			if (local9 == 0) {
				return;
			}
			this.method1072(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Lclient!dd;")
	public synchronized Class52 method1071() {
		@Pc(13) Class52 local13 = (Class52) this.aClass3_1.aClass77_2.method1387((long) this.anInt1217);
		if (local13 != null) {
			return local13;
		}
		local13 = Static467.method891(this.aClass3_1.aClass185_2, this.anInt1217, 0);
		if (local13 != null) {
			this.aClass3_1.aClass77_2.method1396(local13, (long) this.anInt1217);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!wm;II)V")
	private void method1072(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1217 = arg0.method2896();
		} else if (arg1 == 2) {
			this.anInt1216 = arg0.method2915();
			this.anInt1222 = arg0.method2915();
		}
	}
}
