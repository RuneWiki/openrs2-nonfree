import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class143 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	public int anInt3541;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "I")
	public int anInt3545;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "Lclient!be;")
	public Class24 aClass24_3;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Z")
	public boolean aBoolean257 = false;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZZLclient!np;)Lclient!tr;")
	public Class110 method3105(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class155 arg2) {
		@Pc(24) long local24 = (long) (arg2.anInt5461 << 19 | (arg1 ? 262144 : 0) | arg0 << 16 | this.anInt3541);
		@Pc(32) Class110 local32 = (Class110) this.aClass24_3.aClass139_4.method3076(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass24_3.aClass20_10.method226(this.anInt3541)) {
			@Pc(54) Class127 local54 = Static402.method2800(this.aClass24_3.aClass20_10, this.anInt3541, 0);
			if (local54 != null) {
				local54.anInt3168 = local54.anInt3170 = local54.anInt3169 = local54.anInt3166 = 0;
				if (arg1) {
					local54.method2801();
				}
				for (@Pc(79) int local79 = 0; local79 < arg0; local79++) {
					local54.method2807();
				}
			}
			local32 = arg2.method4869(local54);
			if (local32 != null) {
				this.aClass24_3.aClass139_4.method3070(local32, local24);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!rp;)V")
	public void method3106(@OriginalArg(1) Class3_Sub5 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2739();
			if (local9 == 0) {
				return;
			}
			this.method3109(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Z")
	public boolean method3107() {
		return this.aClass24_3.aClass20_10.method226(this.anInt3541);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!rp;B)V")
	private void method3109(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt3541 = arg1.method2767();
		} else if (arg0 == 2) {
			this.anInt3545 = arg1.method2786();
		} else if (arg0 == 3) {
			this.aBoolean257 = true;
		} else if (arg0 == 4) {
			this.anInt3541 = -1;
		}
	}
}
