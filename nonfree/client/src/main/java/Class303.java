import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class303 {

	@OriginalMember(owner = "client!qda", name = "g", descriptor = "Ljava/lang/String;")
	public String aString101;

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
	public int anInt8150;

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "Z")
	public boolean aBoolean548 = true;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)Z")
	public boolean method6975() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BLclient!ika;)V")
	public void method6977(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2048(255);
			if (local9 == 0) {
				return;
			}
			this.method6978(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILclient!ika;I)V")
	private void method6978(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static309.method4582(arg1.method2022());
		} else if (arg0 == 2) {
			this.anInt8150 = arg1.method2036();
		} else if (arg0 == 4) {
			this.aBoolean548 = false;
			return;
		} else if (arg0 == 5) {
			this.aString101 = arg1.method2014();
			return;
		}
	}
}
