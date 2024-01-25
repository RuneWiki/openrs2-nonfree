import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class21 {

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "Lclient!qf;")
	private Class2 aClass2_21;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
	private int anInt509 = 0;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "Lclient!va;")
	private final Class199 aClass199_3;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!va;)V")
	public Class21(@OriginalArg(0) Class199 arg0) {
		this.aClass199_3 = arg0;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Lclient!qf;")
	public Class2 method740() {
		this.anInt509 = 0;
		return this.method743();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)Lclient!qf;")
	public Class2 method743() {
		@Pc(20) Class2 local20;
		if (this.anInt509 > 0 && this.aClass199_3.aClass2Array1[this.anInt509 - 1] != this.aClass2_21) {
			local20 = this.aClass2_21;
			this.aClass2_21 = local20.aClass2_250;
			return local20;
		}
		while (this.aClass199_3.anInt6625 > this.anInt509) {
			local20 = this.aClass199_3.aClass2Array1[this.anInt509++].aClass2_250;
			if (this.aClass199_3.aClass2Array1[this.anInt509 - 1] != local20) {
				this.aClass2_21 = local20.aClass2_250;
				return local20;
			}
		}
		return null;
	}
}
