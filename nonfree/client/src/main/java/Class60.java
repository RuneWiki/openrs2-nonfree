import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class60 {

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "Lclient!fi;")
	private Class1 aClass1_45;

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
	private int anInt1438 = 0;

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "Lclient!fa;")
	private final Class77 aClass77_8;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class60(@OriginalArg(0) Class77 arg0) {
		this.aClass77_8 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Lclient!fi;")
	public Class1 method1159() {
		@Pc(20) Class1 local20;
		if (this.anInt1438 > 0 && this.aClass77_8.aClass1Array1[this.anInt1438 - 1] != this.aClass1_45) {
			local20 = this.aClass1_45;
			this.aClass1_45 = local20.aClass1_243;
			return local20;
		}
		while (this.anInt1438 < this.aClass77_8.anInt1687) {
			local20 = this.aClass77_8.aClass1Array1[this.anInt1438++].aClass1_243;
			if (this.aClass77_8.aClass1Array1[this.anInt1438 - 1] != local20) {
				this.aClass1_45 = local20.aClass1_243;
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)Lclient!fi;")
	public Class1 method1160() {
		this.anInt1438 = 0;
		return this.method1159();
	}
}
