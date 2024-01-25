import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class300 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
	public int anInt8686;

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "Ljava/lang/String;")
	public String aString98;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "Z")
	public boolean aBoolean614 = true;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!sl;I)V")
	private void method7428(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static242.method3969(arg1.method4254());
		} else if (arg0 == 2) {
			this.anInt8686 = arg1.method4207();
		} else if (arg0 == 4) {
			this.aBoolean614 = false;
		} else if (arg0 == 5) {
			this.aString98 = arg1.method4233();
			return;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLclient!sl;)V")
	public void method7430(@OriginalArg(1) Class3_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4225();
			if (local5 == 0) {
				return;
			}
			this.method7428(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)Z")
	public boolean method7433() {
		return this.aChar3 == 's';
	}
}
