import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class244 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
	public int anInt6650;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
	public int anInt6651;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!wh;")
	public Class263 aClass263_2;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	private int anInt6658;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLclient!si;I)V")
	private void method5263(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6658 = arg0.method5500();
		} else if (arg1 == 2) {
			this.anInt6651 = arg0.method5495();
			this.anInt6650 = arg0.method5495();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)Lclient!ft;")
	public synchronized Class85 method5264() {
		@Pc(13) Class85 local13 = (Class85) this.aClass263_2.aClass171_62.method3941((long) this.anInt6658);
		if (local13 != null) {
			return local13;
		}
		local13 = Static459.method2069(this.aClass263_2.aClass160_90, this.anInt6658, 0);
		if (local13 != null) {
			this.aClass263_2.aClass171_62.method3940((long) this.anInt6658, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLclient!si;)V")
	public void method5265(@OriginalArg(1) Class2_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5495();
			if (local9 == 0) {
				return;
			}
			this.method5263(arg0, local9);
		}
	}
}
