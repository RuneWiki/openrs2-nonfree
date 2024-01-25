import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class394 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "Lclient!dba;")
	private Class3 aClass3_336;

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "Lclient!ee;")
	private Class83 aClass83_48;

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
	private int anInt10883 = 0;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "()V")
	private Class394() {
	}

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!ee;)V")
	public Class394(@OriginalArg(0) Class83 arg0) {
		this.aClass83_48 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Lclient!dba;")
	public Class3 method9366() {
		@Pc(31) Class3 local31;
		if (this.anInt10883 > 0 && this.aClass3_336 != this.aClass83_48.aClass3Array1[this.anInt10883 - 1]) {
			local31 = this.aClass3_336;
			this.aClass3_336 = local31.aClass3_337;
			return local31;
		}
		while (this.anInt10883 < this.aClass83_48.anInt2576) {
			local31 = this.aClass83_48.aClass3Array1[this.anInt10883++].aClass3_337;
			if (this.aClass83_48.aClass3Array1[this.anInt10883 - 1] != local31) {
				this.aClass3_336 = local31.aClass3_337;
				return local31;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)Lclient!dba;")
	public Class3 method9370() {
		this.anInt10883 = 0;
		return this.method9366();
	}
}
