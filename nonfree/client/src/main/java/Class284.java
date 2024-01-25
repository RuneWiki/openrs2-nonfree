import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class284 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Lclient!pl;")
	public Interface15 anInterface15_1 = null;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "[Lclient!hc;")
	private Interface8[] anInterface8Array1 = null;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "[Lclient!hc;")
	public Interface8[] anInterface8Array2 = null;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "Z")
	public boolean aBoolean618;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class284(@OriginalArg(0) Class39_Sub2 arg0) {
		this.aBoolean618 = arg0.aBoolean540;
		if (this.aBoolean618 && !arg0.method6186(Static268.aClass171_10, Static189.aClass150_4)) {
			this.aBoolean618 = false;
		}
		if (this.aBoolean618 || arg0.method6103(Static268.aClass171_10, Static189.aClass150_4)) {
			Static4.method267();
			if (this.aBoolean618) {
				@Pc(119) byte[] local119 = Static50.method898(Static468.anObject17, false);
				this.anInterface15_1 = arg0.method6137(Static189.aClass150_4, local119);
				@Pc(134) byte[] local134 = Static50.method898(Static48.anObject3, false);
				arg0.method6137(Static189.aClass150_4, local134);
			} else {
				this.anInterface8Array2 = new Interface8[16];
				for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
					@Pc(61) byte[] local61 = Static502.method7394(Static468.anObject17, local49 * 256 * 128);
					this.anInterface8Array2[local49] = arg0.method6198(true, local61, 128, 128, Static189.aClass150_4);
				}
				this.anInterface8Array1 = new Interface8[16];
				for (@Pc(83) int local83 = 0; local83 < 16; local83++) {
					@Pc(97) byte[] local97 = Static502.method7394(Static48.anObject3, 2 * 128 * local83 * 128);
					this.anInterface8Array1[local83] = arg0.method6198(true, local97, 128, 128, Static189.aClass150_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Z")
	public boolean method7212() {
		if (this.aBoolean618) {
			return this.anInterface15_1 != null;
		} else {
			return this.anInterface8Array2 != null;
		}
	}
}
