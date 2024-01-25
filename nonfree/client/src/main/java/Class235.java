import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class235 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
	public int anInt6975;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "Lclient!pf;")
	public Class231 aClass231_1;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
	public int anInt6981;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
	private int anInt6983;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!co;I)V")
	private void method5672(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt6983 = arg1.method4227();
		} else if (arg0 == 2) {
			this.anInt6975 = arg1.method4220();
			this.anInt6981 = arg1.method4220();
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)Lclient!fba;")
	public synchronized Class96 method5673() {
		@Pc(13) Class96 local13 = (Class96) this.aClass231_1.aClass288_48.method6745((long) this.anInt6983);
		if (local13 != null) {
			return local13;
		}
		local13 = Static551.method2427(this.aClass231_1.aClass117_160, this.anInt6983, 0);
		if (local13 != null) {
			this.aClass231_1.aClass288_48.method6746(local13, (long) this.anInt6983);
		}
		return local13;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!co;I)V")
	public void method5674(@OriginalArg(0) Class5_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4220();
			if (local5 == 0) {
				return;
			}
			this.method5672(local5, arg0);
		}
	}
}
