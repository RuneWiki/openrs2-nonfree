import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class155 {

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "[Lclient!jb;")
	private Interface5[] anInterface5Array1 = null;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "[Lclient!jb;")
	public Interface5[] anInterface5Array2 = null;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "Lclient!vi;")
	public Interface18 anInterface18_1 = null;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "Z")
	public boolean aBoolean280;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!cb;)V")
	public Class155(@OriginalArg(0) Class9_Sub1 arg0) {
		this.aBoolean280 = arg0.aBoolean629;
		if (this.aBoolean280 && !arg0.method7663(Static300.aClass16_14, Static489.aClass289_13)) {
			this.aBoolean280 = false;
		}
		if (this.aBoolean280 || arg0.method7713(Static489.aClass289_13, Static300.aClass16_14)) {
			Static189.method3546();
			if (this.aBoolean280) {
				@Pc(46) byte[] local46 = Static390.method5877(Static377.anObject10, false);
				this.anInterface18_1 = arg0.method7648(Static300.aClass16_14, local46);
				@Pc(61) byte[] local61 = Static390.method5877(Static197.anObject8, false);
				arg0.method7648(Static300.aClass16_14, local61);
			} else {
				this.anInterface5Array2 = new Interface5[16];
				for (@Pc(77) int local77 = 0; local77 < 16; local77++) {
					@Pc(90) byte[] local90 = Static14.method719(2 * 128 * 128 * local77, Static377.anObject10);
					this.anInterface5Array2[local77] = arg0.method7702(true, 128, local90, 128, Static300.aClass16_14);
				}
				this.anInterface5Array1 = new Interface5[16];
				for (@Pc(114) int local114 = 0; local114 < 16; local114++) {
					@Pc(127) byte[] local127 = Static14.method719(2 * 128 * 128 * local114, Static197.anObject8);
					this.anInterface5Array1[local114] = arg0.method7702(true, 128, local127, 128, Static300.aClass16_14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)Z")
	public boolean method4029() {
		if (this.aBoolean280) {
			return this.anInterface18_1 != null;
		} else {
			return this.anInterface5Array2 != null;
		}
	}
}
