import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class159 {

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "Lclient!qr;")
	private Class306 aClass306_16;

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "Lclient!ac;")
	private Class5 aClass5_127;

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
	private int anInt3864 = 0;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
	private Class159() {
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!qr;)V")
	public Class159(@OriginalArg(0) Class306 arg0) {
		this.aClass306_16 = arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)Lclient!ac;")
	public Class5 method3548() {
		this.anInt3864 = 0;
		return this.method3550();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)Lclient!ac;")
	public Class5 method3550() {
		@Pc(24) Class5 local24;
		if (this.anInt3864 > 0 && this.aClass5_127 != this.aClass306_16.aClass5Array1[this.anInt3864 - 1]) {
			local24 = this.aClass5_127;
			this.aClass5_127 = local24.aClass5_338;
			return local24;
		}
		while (this.anInt3864 < this.aClass306_16.anInt8020) {
			local24 = this.aClass306_16.aClass5Array1[this.anInt3864++].aClass5_338;
			if (this.aClass306_16.aClass5Array1[this.anInt3864 - 1] != local24) {
				this.aClass5_127 = local24.aClass5_338;
				return local24;
			}
		}
		return null;
	}
}
