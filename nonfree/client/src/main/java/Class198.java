import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class198 {

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Lclient!kp;")
	private Class1 aClass1_194;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	private int anInt5289 = 0;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!wa;")
	private final Class257 aClass257_23;

	static {
		new Class151("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!wa;)V")
	public Class198(@OriginalArg(0) Class257 arg0) {
		this.aClass257_23 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(B)Lclient!kp;")
	public Class1 method4121() {
		this.anInt5289 = 0;
		return this.method4123();
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(B)Lclient!kp;")
	public Class1 method4123() {
		@Pc(28) Class1 local28;
		if (this.anInt5289 > 0 && this.aClass1_194 != this.aClass257_23.aClass1Array1[this.anInt5289 - 1]) {
			local28 = this.aClass1_194;
			this.aClass1_194 = local28.aClass1_262;
			return local28;
		}
		while (this.anInt5289 < this.aClass257_23.anInt7279) {
			local28 = this.aClass257_23.aClass1Array1[this.anInt5289++].aClass1_262;
			if (local28 != this.aClass257_23.aClass1Array1[this.anInt5289 - 1]) {
				this.aClass1_194 = local28.aClass1_262;
				return local28;
			}
		}
		return null;
	}
}
