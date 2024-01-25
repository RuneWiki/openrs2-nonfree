import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class144 {

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
	public int anInt3627;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "Ljava/lang/String;")
	public String aString42;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Z")
	public boolean aBoolean277 = true;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!kk;)V")
	public void method3302(@OriginalArg(1) Class2_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5350();
			if (local9 == 0) {
				return;
			}
			this.method3306(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!kk;II)V")
	private void method3306(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static294.method4424(arg0.method5330());
		} else if (arg1 == 2) {
			this.anInt3627 = arg0.method5346();
		} else if (arg1 == 4) {
			this.aBoolean277 = false;
			return;
		} else if (arg1 == 5) {
			this.aString42 = arg0.method5364();
			return;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Z")
	public boolean method3307() {
		return this.aChar1 == 's';
	}
}
