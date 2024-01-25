import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class164 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
	public int anInt5791;

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
	public int anInt5796;

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "Lclient!ln;")
	public Class204 aClass204_4;

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "Z")
	public boolean aBoolean504 = false;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!tn;I)V")
	private void method4906(@OriginalArg(1) Class3_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5796 = arg0.method8414();
		} else if (arg1 == 2) {
			this.anInt5791 = arg0.method8421();
		} else if (arg1 == 3) {
			this.aBoolean504 = true;
		} else if (arg1 == 4) {
			this.anInt5796 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZZILclient!ha;)Lclient!ac;")
	public Class5 method4907(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(24) long local24 = (long) (arg2.anInt7410 << 19 | (arg0 ? 262144 : 0) | this.anInt5796 | arg1 << 16);
		@Pc(38) Class5 local38 = (Class5) this.aClass204_4.aClass112_37.method3640(local24);
		if (local38 != null) {
			return local38;
		} else if (this.aClass204_4.aClass181_61.method5040(this.anInt5796)) {
			@Pc(60) Class28 local60 = Static649.method613(this.aClass204_4.aClass181_61, this.anInt5796, 0);
			if (local60 != null) {
				local60.anInt615 = local60.anInt617 = local60.anInt619 = local60.anInt614 = 0;
				if (arg0) {
					local60.method606();
				}
				for (@Pc(80) int local80 = 0; local80 < arg1; local80++) {
					local60.method615();
				}
			}
			local38 = arg2.method6161(local60, true);
			if (local38 != null) {
				this.aClass204_4.aClass112_37.method3636(local24, local38);
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Z")
	public boolean method4910() {
		return this.aClass204_4.aClass181_61.method5040(this.anInt5796);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!tn;I)V")
	public void method4911(@OriginalArg(0) Class3_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8401();
			if (local13 == 0) {
				return;
			}
			this.method4906(arg0, local13);
		}
	}
}
