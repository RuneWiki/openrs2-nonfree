import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class82 {

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Ljava/lang/String;")
	public String aString33;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	public int anInt3023;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Z")
	public boolean aBoolean230 = true;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!ig;)V")
	public void method2611(@OriginalArg(1) Class8_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8525();
			if (local9 == 0) {
				return;
			}
			this.method2614(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Z")
	public boolean method2612() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ig;II)V")
	private void method2614(@OriginalArg(0) Class8_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static303.method4962(arg0.method8550());
		} else if (arg1 == 2) {
			this.anInt3023 = arg0.method8540();
		} else if (arg1 == 4) {
			this.aBoolean230 = false;
		} else if (arg1 == 5) {
			this.aString33 = arg0.method8570();
			return;
		}
	}
}
