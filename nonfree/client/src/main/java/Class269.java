import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class269 {

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "[Lclient!sd;")
	public Interface20[] anInterface20Array2 = null;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "[Lclient!sd;")
	private Interface20[] anInterface20Array1 = null;

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "Lclient!gp;")
	public Interface12 anInterface12_1 = null;

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "Z")
	public boolean aBoolean523;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!sv;)V")
	public Class269(@OriginalArg(0) Class121_Sub2 arg0) {
		this.aBoolean523 = arg0.aBoolean617;
		if (this.aBoolean523 && !arg0.method7259(Static316.aClass214_10, Static108.aClass82_8)) {
			this.aBoolean523 = false;
		}
		if (this.aBoolean523 || arg0.method7169(Static316.aClass214_10, Static108.aClass82_8)) {
			Static508.method7021();
			if (this.aBoolean523) {
				@Pc(119) byte[] local119 = Static143.method6505(Static78.anObject8, false);
				this.anInterface12_1 = arg0.method7276(Static316.aClass214_10, local119);
				@Pc(134) byte[] local134 = Static143.method6505(Static361.anObject21, false);
				arg0.method7276(Static316.aClass214_10, local134);
			} else {
				this.anInterface20Array2 = new Interface20[16];
				for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
					@Pc(61) byte[] local61 = Static369.method5425(local49 * 256 * 128, Static78.anObject8);
					this.anInterface20Array2[local49] = arg0.method7251(128, local61, 128, true, Static316.aClass214_10);
				}
				this.anInterface20Array1 = new Interface20[16];
				for (@Pc(85) int local85 = 0; local85 < 16; local85++) {
					@Pc(97) byte[] local97 = Static369.method5425(256 * 128 * local85, Static361.anObject21);
					this.anInterface20Array1[local85] = arg0.method7251(128, local97, 128, true, Static316.aClass214_10);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)Z")
	public boolean method6276() {
		if (this.aBoolean523) {
			return this.anInterface12_1 != null;
		} else {
			return this.anInterface20Array2 != null;
		}
	}
}
