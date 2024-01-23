import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class17 {

	@OriginalMember(owner = "client!c", name = "m", descriptor = "[I")
	public static int[] anIntArray82 = new int[4096];

	@OriginalMember(owner = "client!c", name = "s", descriptor = "Lclient!te;")
	private Class4 aClass4_34;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Lclient!te;")
	public Class4 aClass4_33 = new Class4();

	static {
		for (@Pc(8) int local8 = 0; local8 < 4096; local8++) {
			anIntArray82[local8] = Static250.method3847(local8);
		}
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class17() {
		this.aClass4_33.aClass4_232 = this.aClass4_33;
		this.aClass4_33.aClass4_233 = this.aClass4_33;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)Lclient!te;")
	public Class4 method607() {
		@Pc(2) Class4 local2 = this.aClass4_34;
		if (local2 == this.aClass4_33) {
			this.aClass4_34 = null;
			return null;
		} else {
			this.aClass4_34 = local2.aClass4_233;
			return local2;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)Lclient!te;")
	public Class4 method609() {
		@Pc(7) Class4 local7 = this.aClass4_33.aClass4_232;
		if (this.aClass4_33 == local7) {
			this.aClass4_34 = null;
			return null;
		} else {
			this.aClass4_34 = local7.aClass4_232;
			return local7;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!te;B)V")
	public void method611(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_232 != null) {
			arg0.method4690();
		}
		arg0.aClass4_232 = this.aClass4_33;
		arg0.aClass4_233 = this.aClass4_33.aClass4_233;
		arg0.aClass4_232.aClass4_233 = arg0;
		arg0.aClass4_233.aClass4_232 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)Z")
	public boolean method612() {
		return this.aClass4_33.aClass4_233 == this.aClass4_33;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Lclient!te;")
	public Class4 method613() {
		@Pc(14) Class4 local14 = this.aClass4_33.aClass4_233;
		if (this.aClass4_33 == local14) {
			this.aClass4_34 = null;
			return null;
		} else {
			this.aClass4_34 = local14.aClass4_233;
			return local14;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Lclient!te;")
	public Class4 method614() {
		@Pc(14) Class4 local14 = this.aClass4_34;
		if (this.aClass4_33 == local14) {
			this.aClass4_34 = null;
			return null;
		} else {
			this.aClass4_34 = local14.aClass4_232;
			return local14;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)Lclient!te;")
	public Class4 method617() {
		@Pc(3) Class4 local3 = this.aClass4_33.aClass4_233;
		if (local3 == this.aClass4_33) {
			return null;
		} else {
			local3.method4690();
			return local3;
		}
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
	public void method618() {
		while (true) {
			@Pc(13) Class4 local13 = this.aClass4_33.aClass4_233;
			if (this.aClass4_33 == local13) {
				this.aClass4_34 = null;
				return;
			}
			local13.method4690();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLclient!te;)V")
	public void method619(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_232 != null) {
			arg0.method4690();
		}
		arg0.aClass4_232 = this.aClass4_33.aClass4_232;
		arg0.aClass4_233 = this.aClass4_33;
		arg0.aClass4_232.aClass4_233 = arg0;
		arg0.aClass4_233.aClass4_232 = arg0;
	}
}
