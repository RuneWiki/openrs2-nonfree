import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class214 {

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
	public int anInt5468;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
	public int anInt5469;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
	private int anInt5471;

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "Lclient!ad;")
	public Class5 aClass5_1;

	static {
		new Class15(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!fh;)V")
	public void method4430(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5007();
			if (local13 == 0) {
				return;
			}
			this.method4431(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILclient!fh;)V")
	private void method4431(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt5471 = arg1.method5028();
		} else if (arg0 == 2) {
			this.anInt5468 = arg1.method5007();
			this.anInt5469 = arg1.method5007();
			return;
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)Lclient!qv;")
	public synchronized Class216 method4435() {
		@Pc(13) Class216 local13 = (Class216) this.aClass5_1.aClass137_3.method2744((long) this.anInt5471);
		if (local13 != null) {
			return local13;
		}
		local13 = Static465.method4465(this.aClass5_1.aClass211_3, this.anInt5471, 0);
		if (local13 != null) {
			this.aClass5_1.aClass137_3.method2732((long) this.anInt5471, local13);
		}
		return local13;
	}
}
