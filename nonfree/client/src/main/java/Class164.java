import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class164 {

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "Lclient!kc;")
	public Interface13 anInterface13_1 = null;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "[Lclient!ica;")
	private Interface9[] anInterface9Array1 = null;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "[Lclient!ica;")
	public Interface9[] anInterface9Array2 = null;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Z")
	public boolean aBoolean349;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!tu;)V")
	public Class164(@OriginalArg(0) Class5_Sub3 arg0) {
		this.aBoolean349 = arg0.aBoolean543;
		if (this.aBoolean349 && !arg0.method6307(Static521.aClass167_15, Static524.aClass310_16)) {
			this.aBoolean349 = false;
		}
		if (this.aBoolean349 || arg0.method6310(Static521.aClass167_15, Static524.aClass310_16)) {
			Static508.method7286();
			if (this.aBoolean349) {
				@Pc(48) byte[] local48 = Static242.method4205(false, Static479.anObject20);
				this.anInterface13_1 = arg0.method6402(Static521.aClass167_15, local48);
				@Pc(63) byte[] local63 = Static242.method4205(false, Static169.anObject7);
				arg0.method6402(Static521.aClass167_15, local63);
			} else {
				this.anInterface9Array2 = new Interface9[16];
				for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
					@Pc(91) byte[] local91 = Static124.method7290(Static479.anObject20, 2 * 16384 * local79);
					this.anInterface9Array2[local79] = arg0.method6374(Static521.aClass167_15, local91, 128, 128, true);
				}
				this.anInterface9Array1 = new Interface9[16];
				for (@Pc(113) int local113 = 0; local113 < 16; local113++) {
					@Pc(125) byte[] local125 = Static124.method7290(Static169.anObject7, local113 * 2 * 16384);
					this.anInterface9Array1[local113] = arg0.method6374(Static521.aClass167_15, local125, 128, 128, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)Z")
	public boolean method4287() {
		if (this.aBoolean349) {
			return this.anInterface13_1 != null;
		} else {
			return this.anInterface9Array2 != null;
		}
	}
}
