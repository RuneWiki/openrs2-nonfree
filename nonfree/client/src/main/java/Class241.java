import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class241 {

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "Lclient!nf;")
	public Interface9 anInterface9_1 = null;

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "[Lclient!gq;")
	public Interface3[] anInterface3Array2 = null;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "[Lclient!gq;")
	private Interface3[] anInterface3Array1 = null;

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "Z")
	public boolean aBoolean500;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!re;)V")
	public Class241(@OriginalArg(0) Class122_Sub2 arg0) {
		this.aBoolean500 = arg0.aBoolean472;
		if (this.aBoolean500 && !arg0.method5656(Static431.aClass264_15, Static184.aClass292_13)) {
			this.aBoolean500 = false;
		}
		if (this.aBoolean500 || arg0.method5618(Static431.aClass264_15, Static184.aClass292_13)) {
			Static457.method6477();
			if (this.aBoolean500) {
				@Pc(48) byte[] local48 = Static236.method4130(Static68.anObject3, false);
				this.anInterface9_1 = arg0.method5588(local48, Static184.aClass292_13);
				@Pc(63) byte[] local63 = Static236.method4130(Static66.anObject2, false);
				arg0.method5588(local63, Static184.aClass292_13);
			} else {
				this.anInterface3Array2 = new Interface3[16];
				for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
					@Pc(91) byte[] local91 = Static51.method979(Static68.anObject3, local79 * 256 * 128);
					this.anInterface3Array2[local79] = arg0.method5662(Static184.aClass292_13, local91, true, 128, 128);
				}
				this.anInterface3Array1 = new Interface3[16];
				for (@Pc(113) int local113 = 0; local113 < 16; local113++) {
					@Pc(127) byte[] local127 = Static51.method979(Static66.anObject2, local113 * 2 * 128 * 128);
					this.anInterface3Array1[local113] = arg0.method5662(Static184.aClass292_13, local127, true, 128, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)Z")
	public boolean method5765() {
		if (this.aBoolean500) {
			return this.anInterface9_1 != null;
		} else {
			return this.anInterface3Array2 != null;
		}
	}
}
