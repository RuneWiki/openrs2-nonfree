import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class200 {

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "[I")
	public static final int[] anIntArray391 = new int[32];

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "Lclient!ev;")
	private Class1 aClass1_185;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
	private int anInt5302 = 0;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "Lclient!qi;")
	private final Class208 aClass208_32;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray391[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!qi;)V")
	public Class200(@OriginalArg(0) Class208 arg0) {
		this.aClass208_32 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Lclient!ev;")
	public Class1 method4223() {
		@Pc(28) Class1 local28;
		if (this.anInt5302 > 0 && this.aClass208_32.aClass1Array1[this.anInt5302 - 1] != this.aClass1_185) {
			local28 = this.aClass1_185;
			this.aClass1_185 = local28.aClass1_267;
			return local28;
		}
		while (this.aClass208_32.anInt5493 > this.anInt5302) {
			local28 = this.aClass208_32.aClass1Array1[this.anInt5302++].aClass1_267;
			if (this.aClass208_32.aClass1Array1[this.anInt5302 - 1] != local28) {
				this.aClass1_185 = local28.aClass1_267;
				return local28;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)Lclient!ev;")
	public Class1 method4225() {
		this.anInt5302 = 0;
		return this.method4223();
	}
}
