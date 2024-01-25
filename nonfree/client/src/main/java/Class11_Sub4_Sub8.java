import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class11_Sub4_Sub8 extends Class11_Sub4 {

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	public int anInt2986 = 1;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!kh;BI)V")
	private void method2514(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static35.method516(arg0.method5175());
		} else if (arg1 == 2) {
			this.anInt2986 = 0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!kh;Z)V")
	public void method2515(@OriginalArg(0) Class11_Sub25 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5185();
			if (local13 == 0) {
				return;
			}
			this.method2514(arg0, local13);
		}
	}
}
