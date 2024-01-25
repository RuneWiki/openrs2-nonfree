import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class149 {

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Lclient!te;")
	public Interface19 anInterface19_1 = null;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "[Lclient!ae;")
	private Interface1[] anInterface1Array1 = null;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "[Lclient!ae;")
	public Interface1[] anInterface1Array2 = null;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Z")
	public boolean aBoolean367;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!fo;)V")
	public Class149(@OriginalArg(0) Class9_Sub3 arg0) {
		this.aBoolean367 = arg0.aBoolean478;
		if (this.aBoolean367 && !arg0.method5515(Static459.aClass333_7, Static336.aClass220_12)) {
			this.aBoolean367 = false;
		}
		if (this.aBoolean367 || arg0.method5567(Static459.aClass333_7, Static336.aClass220_12)) {
			Static393.method6185();
			if (this.aBoolean367) {
				@Pc(48) byte[] local48 = Static439.method6701(false, Static23.anObject1);
				this.anInterface19_1 = arg0.method5573(local48, Static459.aClass333_7);
				@Pc(63) byte[] local63 = Static439.method6701(false, Static497.anObject21);
				arg0.method5573(local63, Static459.aClass333_7);
			} else {
				this.anInterface1Array2 = new Interface1[16];
				for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
					@Pc(89) byte[] local89 = Static4.method206(Static23.anObject1, local79 * 32768);
					this.anInterface1Array2[local79] = arg0.method5572(Static459.aClass333_7, true, local89, 128, 128);
				}
				this.anInterface1Array1 = new Interface1[16];
				for (@Pc(111) int local111 = 0; local111 < 16; local111++) {
					@Pc(121) byte[] local121 = Static4.method206(Static497.anObject21, local111 * 32768);
					this.anInterface1Array1[local111] = arg0.method5572(Static459.aClass333_7, true, local121, 128, 128);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)Z")
	public boolean method3987() {
		if (this.aBoolean367) {
			return this.anInterface19_1 != null;
		} else {
			return this.anInterface1Array2 != null;
		}
	}
}
