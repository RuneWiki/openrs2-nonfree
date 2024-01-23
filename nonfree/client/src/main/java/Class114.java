import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class114 {

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "Lclient!ni;")
	private Class4 aClass4_118;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "Lclient!ni;")
	public Class4 aClass4_117 = new Class4();

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
	public Class114() {
		this.aClass4_117.aClass4_235 = this.aClass4_117;
		this.aClass4_117.aClass4_234 = this.aClass4_117;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	public void method2619() {
		while (true) {
			@Pc(9) Class4 local9 = this.aClass4_117.aClass4_235;
			if (this.aClass4_117 == local9) {
				this.aClass4_118 = null;
				return;
			}
			local9.method4854();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!ni;B)V")
	public void method2620(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_234 != null) {
			arg0.method4854();
		}
		arg0.aClass4_234 = this.aClass4_117;
		arg0.aClass4_235 = this.aClass4_117.aClass4_235;
		arg0.aClass4_234.aClass4_235 = arg0;
		arg0.aClass4_235.aClass4_234 = arg0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)Lclient!ni;")
	public Class4 method2621() {
		@Pc(7) Class4 local7 = this.aClass4_117.aClass4_235;
		if (local7 == this.aClass4_117) {
			return null;
		} else {
			local7.method4854();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)Z")
	public boolean method2622() {
		return this.aClass4_117.aClass4_235 == this.aClass4_117;
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)Lclient!ni;")
	public Class4 method2623() {
		@Pc(7) Class4 local7 = this.aClass4_117.aClass4_235;
		if (local7 == this.aClass4_117) {
			this.aClass4_118 = null;
			return null;
		} else {
			this.aClass4_118 = local7.aClass4_235;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLclient!ni;)V")
	public void method2625(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_234 != null) {
			arg0.method4854();
		}
		arg0.aClass4_234 = this.aClass4_117.aClass4_234;
		arg0.aClass4_235 = this.aClass4_117;
		arg0.aClass4_234.aClass4_235 = arg0;
		arg0.aClass4_235.aClass4_234 = arg0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)Lclient!ni;")
	public Class4 method2626() {
		@Pc(7) Class4 local7 = this.aClass4_117.aClass4_234;
		if (local7 == this.aClass4_117) {
			this.aClass4_118 = null;
			return null;
		} else {
			this.aClass4_118 = local7.aClass4_234;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)Lclient!ni;")
	public Class4 method2628() {
		@Pc(8) Class4 local8 = this.aClass4_118;
		if (local8 == this.aClass4_117) {
			this.aClass4_118 = null;
			return null;
		} else {
			this.aClass4_118 = local8.aClass4_234;
			return local8;
		}
	}

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)Lclient!ni;")
	public Class4 method2629() {
		@Pc(13) Class4 local13 = this.aClass4_118;
		if (this.aClass4_117 == local13) {
			this.aClass4_118 = null;
			return null;
		} else {
			this.aClass4_118 = local13.aClass4_235;
			return local13;
		}
	}
}
