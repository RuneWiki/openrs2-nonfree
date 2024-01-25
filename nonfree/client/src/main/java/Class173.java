import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class173 {

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "[Lclient!eea;")
	private Interface5[] anInterface5Array1 = null;

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "[Lclient!eea;")
	public Interface5[] anInterface5Array2 = null;

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "Lclient!aw;")
	public Interface3 anInterface3_1 = null;

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "Z")
	public boolean aBoolean380;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lclient!bda;)V")
	public Class173(@OriginalArg(0) Class4_Sub2 arg0) {
		this.aBoolean380 = arg0.aBoolean603;
		if (this.aBoolean380 && !arg0.method7237(Static533.aClass110_25, Static517.aClass308_15)) {
			this.aBoolean380 = false;
		}
		if (this.aBoolean380 || arg0.method7308(Static517.aClass308_15, Static533.aClass110_25)) {
			Static312.method5402();
			if (this.aBoolean380) {
				@Pc(123) byte[] local123 = Static542.method8243(false, Static124.anObject4);
				this.anInterface3_1 = arg0.method7305(Static533.aClass110_25, local123);
				@Pc(138) byte[] local138 = Static542.method8243(false, Static431.anObject13);
				arg0.method7305(Static533.aClass110_25, local138);
			} else {
				this.anInterface5Array2 = new Interface5[16];
				for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
					@Pc(63) byte[] local63 = Static503.method5017(Static124.anObject4, local49 * 128 * 128 * 2);
					this.anInterface5Array2[local49] = arg0.method7347(128, local63, true, Static533.aClass110_25, 128);
				}
				this.anInterface5Array1 = new Interface5[16];
				for (@Pc(87) int local87 = 0; local87 < 16; local87++) {
					@Pc(99) byte[] local99 = Static503.method5017(Static431.anObject13, local87 * 2 * 16384);
					this.anInterface5Array1[local87] = arg0.method7347(128, local99, true, Static533.aClass110_25, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Z)Z")
	public boolean method4735() {
		if (this.aBoolean380) {
			return this.anInterface3_1 != null;
		} else {
			return this.anInterface5Array2 != null;
		}
	}
}
