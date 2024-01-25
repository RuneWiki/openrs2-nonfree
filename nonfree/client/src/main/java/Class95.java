import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class95 {

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
	public int anInt2248;

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
	public int anInt2250;

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "I")
	public int anInt2252;

	@OriginalMember(owner = "client!eca", name = "i", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZLclient!et;I)V")
	private void method1978(@OriginalArg(1) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static639.method8672(arg0.method8536());
		} else if (arg1 == 2) {
			this.anInt2252 = arg0.method8575();
			this.anInt2248 = arg0.method8581(-17416);
			this.anInt2250 = arg0.method8581(-17416);
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILclient!et;)V")
	public void method1979(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8581(-17416);
			if (local17 == 0) {
				return;
			}
			this.method1978(arg0, local17);
		}
	}
}
