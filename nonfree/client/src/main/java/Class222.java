import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class222 {

	@OriginalMember(owner = "client!om", name = "c", descriptor = "Lclient!ve;")
	public Interface17 anInterface17_1 = null;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "[Lclient!dea;")
	public Interface3[] anInterface3Array2 = null;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "[Lclient!dea;")
	private Interface3[] anInterface3Array1 = null;

	@OriginalMember(owner = "client!om", name = "e", descriptor = "Z")
	public boolean aBoolean476;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!nd;)V")
	public Class222(@OriginalArg(0) Class62_Sub1 arg0) {
		this.aBoolean476 = arg0.aBoolean379;
		if (this.aBoolean476 && !arg0.method4660(Static167.aClass174_5, Static523.aClass306_15)) {
			this.aBoolean476 = false;
		}
		if (this.aBoolean476 || arg0.method4739(Static523.aClass306_15, Static167.aClass174_5)) {
			Static474.method2672();
			if (this.aBoolean476) {
				@Pc(121) byte[] local121 = Static278.method4542(false, Static415.anObject17);
				this.anInterface17_1 = arg0.method4682(local121, Static167.aClass174_5);
				@Pc(136) byte[] local136 = Static278.method4542(false, Static465.anObject18);
				arg0.method4682(local136, Static167.aClass174_5);
			} else {
				this.anInterface3Array2 = new Interface3[16];
				for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
					@Pc(63) byte[] local63 = Static492.method6832(128 * 128 * local49 * 2, Static415.anObject17);
					this.anInterface3Array2[local49] = arg0.method4707(128, 128, true, local63, Static167.aClass174_5);
				}
				this.anInterface3Array1 = new Interface3[16];
				for (@Pc(87) int local87 = 0; local87 < 16; local87++) {
					@Pc(99) byte[] local99 = Static492.method6832(local87 * 256 * 128, Static465.anObject18);
					this.anInterface3Array1[local87] = arg0.method4707(128, 128, true, local99, Static167.aClass174_5);
				}
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Z")
	public boolean method5524() {
		if (this.aBoolean476) {
			return this.anInterface17_1 != null;
		} else {
			return this.anInterface3Array2 != null;
		}
	}
}
