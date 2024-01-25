import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class166 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	public int anInt4859 = 1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!fd;I)V")
	private void method4092(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static142.method2866(arg0.method6529());
		} else if (arg1 == 2) {
			this.anInt4859 = 0;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!fd;)V")
	public void method4093(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6538();
			if (local9 == 0) {
				return;
			}
			this.method4092(arg0, local9);
		}
	}
}
