import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class177 {

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
	public int anInt5061 = 1;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!si;)V")
	public void method4063(@OriginalArg(1) Class2_Sub23 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5495();
			if (local14 == 0) {
				return;
			}
			this.method4064(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!si;IZ)V")
	private void method4064(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static283.method1319(arg0.method5484());
		} else if (arg1 == 2) {
			this.anInt5061 = 0;
		}
	}
}
