import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class164 {

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public int anInt5972;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Z")
	public boolean aBoolean468 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method4979(@OriginalArg(0) Class6_Sub8 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method8246();
			if (local14 == 0) {
				return;
			}
			this.method4982(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)Z")
	public boolean method4981() {
		return this.aChar3 == 's';
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!ji;I)V")
	private void method4982(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static111.method2501(arg1.method8208());
		} else if (arg0 == 2) {
			this.anInt5972 = arg1.method8236();
		} else if (arg0 == 4) {
			this.aBoolean468 = false;
		} else if (arg0 == 5) {
			this.aString66 = arg1.method8221();
		}
	}
}
