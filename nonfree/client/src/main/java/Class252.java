import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class252 {

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
	private int anInt6932;

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
	public int anInt6938;

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
	public int anInt6940;

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "Lclient!ml;")
	public Class165 aClass165_2;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!nn;BI)V")
	private void method5447(@OriginalArg(0) Class10_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6932 = arg0.method2485();
		} else if (arg1 == 2) {
			this.anInt6940 = arg0.method2502();
			this.anInt6938 = arg0.method2502();
			return;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILclient!nn;)V")
	public void method5449(@OriginalArg(1) Class10_Sub8 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method2502();
			if (local12 == 0) {
				return;
			}
			this.method5447(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)Lclient!ef;")
	public synchronized Class66 method5450() {
		@Pc(15) Class66 local15 = (Class66) this.aClass165_2.aClass267_45.method6014((long) this.anInt6932);
		if (local15 != null) {
			return local15;
		}
		local15 = Static463.method1657(this.aClass165_2.aClass187_79, this.anInt6932, 0);
		if (local15 != null) {
			this.aClass165_2.aClass267_45.method6008(local15, (long) this.anInt6932);
		}
		return local15;
	}
}
