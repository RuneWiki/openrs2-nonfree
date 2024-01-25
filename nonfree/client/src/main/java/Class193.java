import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class193 {

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
	public int anInt5180 = 2048;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
	public int anInt5182 = 0;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
	public int anInt5184 = 2048;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
	public int anInt5185 = 0;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLclient!dh;)V")
	public void method4043(@OriginalArg(1) Class1_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4463();
			if (local5 == 0) {
				return;
			}
			this.method4046(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BILclient!dh;)V")
	private void method4046(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt5185 = arg1.method4463();
		} else if (arg0 == 2) {
			this.anInt5184 = arg1.method4485();
		} else if (arg0 == 3) {
			this.anInt5180 = arg1.method4485();
		} else if (arg0 == 4) {
			this.anInt5182 = arg1.method4482();
		}
	}
}
