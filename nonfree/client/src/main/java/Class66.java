import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class66 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Lclient!k;")
	public Interface11 anInterface11_1 = null;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "[Lclient!hr;")
	public Interface7[] anInterface7Array1 = null;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "[Lclient!hr;")
	private Interface7[] anInterface7Array2 = null;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "Z")
	public boolean aBoolean112;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!gj;)V")
	public Class66(@OriginalArg(0) Class90_Sub3 arg0) {
		this.aBoolean112 = arg0.aBoolean640;
		if (this.aBoolean112 && !arg0.method7628(Static407.aClass254_14, Static102.aClass171_6)) {
			this.aBoolean112 = false;
		}
		if (this.aBoolean112 || arg0.method7556(Static102.aClass171_6, Static407.aClass254_14)) {
			Static566.method7822();
			if (this.aBoolean112) {
				@Pc(119) byte[] local119 = Static210.method3435(Static196.anObject7, false);
				this.anInterface11_1 = arg0.method7538(local119, Static102.aClass171_6);
				@Pc(134) byte[] local134 = Static210.method3435(Static362.anObject15, false);
				arg0.method7538(local134, Static102.aClass171_6);
			} else {
				this.anInterface7Array1 = new Interface7[16];
				for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
					@Pc(61) byte[] local61 = Static367.method5427(Static196.anObject7, local49 * 128 * 256);
					this.anInterface7Array1[local49] = arg0.method7622(local61, 128, true, Static102.aClass171_6, 128);
				}
				this.anInterface7Array2 = new Interface7[16];
				for (@Pc(83) int local83 = 0; local83 < 16; local83++) {
					@Pc(95) byte[] local95 = Static367.method5427(Static362.anObject15, local83 * 128 * 256);
					this.anInterface7Array2[local83] = arg0.method7622(local95, 128, true, Static102.aClass171_6, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Z")
	public boolean method1373() {
		if (this.aBoolean112) {
			return this.anInterface11_1 != null;
		} else {
			return this.anInterface7Array1 != null;
		}
	}
}
