import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class19 {

	@OriginalMember(owner = "client!au", name = "a", descriptor = "Lclient!ah;")
	private Class3 aClass3_9;

	@OriginalMember(owner = "client!au", name = "c", descriptor = "I")
	private int anInt217 = 0;

	@OriginalMember(owner = "client!au", name = "e", descriptor = "Lclient!cp;")
	private final Class44 aClass44_2;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!cp;)V")
	public Class19(@OriginalArg(0) Class44 arg0) {
		this.aClass44_2 = arg0;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)Lclient!ah;")
	public Class3 method220() {
		@Pc(23) Class3 local23;
		if (this.anInt217 > 0 && this.aClass3_9 != this.aClass44_2.aClass3Array1[this.anInt217 - 1]) {
			local23 = this.aClass3_9;
			this.aClass3_9 = local23.aClass3_243;
			return local23;
		}
		while (this.aClass44_2.anInt1091 > this.anInt217) {
			local23 = this.aClass44_2.aClass3Array1[this.anInt217++].aClass3_243;
			if (this.aClass44_2.aClass3Array1[this.anInt217 - 1] != local23) {
				this.aClass3_9 = local23.aClass3_243;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)Lclient!ah;")
	public Class3 method222() {
		this.anInt217 = 0;
		return this.method220();
	}
}
