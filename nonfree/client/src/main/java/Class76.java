import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class76 {

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!wr;")
	private Class380 aClass380_7;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Lclient!gda;")
	private Class6 aClass6_83;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	private int anInt3023 = 0;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	private Class76() {
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!wr;)V")
	public Class76(@OriginalArg(0) Class380 arg0) {
		this.aClass380_7 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!gda;")
	public Class6 method2559() {
		@Pc(29) Class6 local29;
		if (this.anInt3023 > 0 && this.aClass380_7.aClass6Array1[this.anInt3023 - 1] != this.aClass6_83) {
			local29 = this.aClass6_83;
			this.aClass6_83 = local29.aClass6_300;
			return local29;
		}
		while (this.anInt3023 < this.aClass380_7.anInt10726) {
			local29 = this.aClass380_7.aClass6Array1[this.anInt3023++].aClass6_300;
			if (local29 != this.aClass380_7.aClass6Array1[this.anInt3023 - 1]) {
				this.aClass6_83 = local29.aClass6_300;
				return local29;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Lclient!gda;")
	public Class6 method2561() {
		this.anInt3023 = 0;
		return this.method2559();
	}
}
