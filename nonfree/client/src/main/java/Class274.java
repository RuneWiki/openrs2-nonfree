import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class274 {

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "Lclient!ba;")
	private Class17 aClass17_34;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "Lclient!um;")
	private Class1 aClass1_244;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
	private int anInt7716 = 0;

	static {
		new Class306("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	private Class274() {
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!ba;)V")
	public Class274(@OriginalArg(0) Class17 arg0) {
		this.aClass17_34 = arg0;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)Lclient!um;")
	public Class1 method6418() {
		this.anInt7716 = 0;
		return this.method6421();
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)Lclient!um;")
	public Class1 method6421() {
		@Pc(30) Class1 local30;
		if (this.anInt7716 > 0 && this.aClass1_244 != this.aClass17_34.aClass1Array1[this.anInt7716 - 1]) {
			local30 = this.aClass1_244;
			this.aClass1_244 = local30.aClass1_284;
			return local30;
		}
		while (this.aClass17_34.anInt715 > this.anInt7716) {
			local30 = this.aClass17_34.aClass1Array1[this.anInt7716++].aClass1_284;
			if (this.aClass17_34.aClass1Array1[this.anInt7716 - 1] != local30) {
				this.aClass1_244 = local30.aClass1_284;
				return local30;
			}
		}
		return null;
	}
}
