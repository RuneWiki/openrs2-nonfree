import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class11 {

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "Lclient!eq;")
	private Class99 aClass99_5;

	@OriginalMember(owner = "client!aga", name = "g", descriptor = "Lclient!eh;")
	private Class2 aClass2_5;

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "I")
	private int anInt162 = 0;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "()V")
	private Class11() {
	}

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!eq;)V")
	public Class11(@OriginalArg(0) Class99 arg0) {
		this.aClass99_5 = arg0;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)Lclient!eh;")
	public Class2 method218() {
		this.anInt162 = 0;
		return this.method220();
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(B)Lclient!eh;")
	public Class2 method220() {
		@Pc(28) Class2 local28;
		if (this.anInt162 > 0 && this.aClass99_5.aClass2Array1[this.anInt162 - 1] != this.aClass2_5) {
			local28 = this.aClass2_5;
			this.aClass2_5 = local28.aClass2_299;
			return local28;
		}
		while (this.aClass99_5.anInt3326 > this.anInt162) {
			local28 = this.aClass99_5.aClass2Array1[this.anInt162++].aClass2_299;
			if (this.aClass99_5.aClass2Array1[this.anInt162 - 1] != local28) {
				this.aClass2_5 = local28.aClass2_299;
				return local28;
			}
		}
		return null;
	}
}
