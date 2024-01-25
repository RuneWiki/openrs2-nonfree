import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class262 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Lclient!am;")
	public Class15 aClass15_4;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	public int anInt6954;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	private int anInt6956;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt6959;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)Lclient!pga;")
	public synchronized Class268 method5797() {
		@Pc(18) Class268 local18 = (Class268) this.aClass15_4.aClass223_6.method4943((long) this.anInt6956);
		if (local18 != null) {
			return local18;
		}
		local18 = Static607.method5872(this.aClass15_4.aClass31_5, this.anInt6956, 0);
		if (local18 != null) {
			this.aClass15_4.aClass223_6.method4938((long) this.anInt6956, local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!eh;)V")
	private void method5798(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt6956 = arg1.method5982();
		} else if (arg0 == 2) {
			this.anInt6954 = arg1.method6015();
			this.anInt6959 = arg1.method6015();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!eh;Z)V")
	public void method5799(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6015();
			if (local9 == 0) {
				return;
			}
			this.method5798(local9, arg0);
		}
	}
}
