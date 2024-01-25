import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class42 {

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "[I")
	public static final int[] anIntArray85 = new int[4096];

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "Lclient!vf;")
	private Class238 aClass238_5;

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "Lclient!pt;")
	private Class2 aClass2_23;

	static {
		for (@Pc(10) int local10 = 0; local10 < 4096; local10++) {
			anIntArray85[local10] = Static347.method5538(local10);
		}
	}

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class42() {
	}

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class42(@OriginalArg(0) Class238 arg0) {
		this.aClass238_5 = arg0;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)Lclient!pt;")
	public Class2 method840() {
		@Pc(6) Class2 local6 = this.aClass2_23;
		if (local6 == this.aClass238_5.aClass2_225) {
			this.aClass2_23 = null;
			return null;
		} else {
			this.aClass2_23 = local6.aClass2_244;
			return local6;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Lclient!pt;")
	public Class2 method841() {
		@Pc(12) Class2 local12 = this.aClass238_5.aClass2_225.aClass2_244;
		if (local12 == this.aClass238_5.aClass2_225) {
			this.aClass2_23 = null;
			return null;
		} else {
			this.aClass2_23 = local12.aClass2_244;
			return local12;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLclient!vf;)V")
	public void method842(@OriginalArg(1) Class238 arg0) {
		this.aClass238_5 = arg0;
	}
}
