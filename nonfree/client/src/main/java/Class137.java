import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class137 {

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "[I")
	public static final int[] anIntArray211 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "Lclient!ag;")
	private Class2 aClass2_132;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	private int anInt3610 = 0;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "Lclient!ad;")
	private final Class4 aClass4_79;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!ad;)V", line = 80)
	public Class137(@OriginalArg(0) Class4 arg0) {
		this.aClass4_79 = arg0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)Lclient!ag;", line = 31)
	public Class2 method3561() {
		@Pc(23) Class2 local23;
		if (this.anInt3610 > 0 && this.aClass2_132 != this.aClass4_79.aClass2Array1[this.anInt3610 - 1]) {
			local23 = this.aClass2_132;
			this.aClass2_132 = local23.aClass2_243;
			return local23;
		}
		while (this.anInt3610 < this.aClass4_79.anInt97) {
			local23 = this.aClass4_79.aClass2Array1[this.anInt3610++].aClass2_243;
			if (this.aClass4_79.aClass2Array1[this.anInt3610 - 1] != local23) {
				this.aClass2_132 = local23.aClass2_243;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Lclient!ag;", line = 68)
	public Class2 method3562() {
		this.anInt3610 = 0;
		return this.method3561();
	}
}
