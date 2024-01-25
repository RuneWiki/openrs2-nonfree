import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class200 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	public int anInt5511;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Ljava/lang/String;")
	public String aString154;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Z")
	public boolean aBoolean410 = true;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!sv;I)V")
	private void method4355(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static336.method4491(arg0.method3605());
		} else if (arg1 == 2) {
			this.anInt5511 = arg0.method3574();
		} else if (arg1 == 4) {
			this.aBoolean410 = false;
		} else if (arg1 == 5) {
			this.aString154 = arg0.method3582();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)Z")
	public boolean method4356() {
		return this.aChar3 == 's';
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!sv;)V")
	public void method4357(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3580();
			if (local9 == 0) {
				return;
			}
			this.method4355(arg0, local9);
		}
	}
}
