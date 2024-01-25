import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public final class Class217 {

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "Lclient!js;")
	public Interface12 anInterface12_1 = null;

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "[Lclient!ak;")
	private Interface2[] anInterface2Array1 = null;

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "[Lclient!ak;")
	public Interface2[] anInterface2Array2 = null;

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "Z")
	public boolean aBoolean428;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lclient!ej;)V")
	public Class217(@OriginalArg(0) Class66_Sub1 arg0) {
		this.aBoolean428 = arg0.aBoolean570;
		if (this.aBoolean428 && !arg0.method6937(Static471.aClass141_13, Static349.aClass239_12)) {
			this.aBoolean428 = false;
		}
		if (this.aBoolean428 || arg0.method6969(Static471.aClass141_13, Static349.aClass239_12)) {
			Static197.method3555();
			if (this.aBoolean428) {
				@Pc(119) byte[] local119 = Static557.method92(false, Static112.anObject13);
				this.anInterface12_1 = arg0.method6928(local119, Static471.aClass141_13);
				@Pc(134) byte[] local134 = Static557.method92(false, Static174.anObject19);
				arg0.method6928(local134, Static471.aClass141_13);
			} else {
				this.anInterface2Array2 = new Interface2[16];
				for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
					@Pc(61) byte[] local61 = Static357.method5255(local49 * 256 * 128, Static112.anObject13);
					this.anInterface2Array2[local49] = arg0.method6958(true, 128, local61, Static471.aClass141_13, 128);
				}
				this.anInterface2Array1 = new Interface2[16];
				for (@Pc(83) int local83 = 0; local83 < 16; local83++) {
					@Pc(95) byte[] local95 = Static357.method5255(2 * 16384 * local83, Static174.anObject19);
					this.anInterface2Array1[local83] = arg0.method6958(true, 128, local95, Static471.aClass141_13, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Z")
	public boolean method4879() {
		if (this.aBoolean428) {
			return this.anInterface12_1 != null;
		} else {
			return this.anInterface2Array2 != null;
		}
	}
}
