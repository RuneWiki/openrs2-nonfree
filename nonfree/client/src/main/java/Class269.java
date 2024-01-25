import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class269 {

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Lclient!ku;")
	private Class9_Sub8 aClass9_Sub8_10;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Lclient!ku;")
	public final Class9_Sub8 aClass9_Sub8_9 = new Class9_Sub8();

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class269() {
		this.aClass9_Sub8_9.aClass9_Sub8_7 = this.aClass9_Sub8_9;
		this.aClass9_Sub8_9.aClass9_Sub8_8 = this.aClass9_Sub8_9;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)Lclient!ku;")
	public Class9_Sub8 method6013() {
		@Pc(13) Class9_Sub8 local13 = this.aClass9_Sub8_9.aClass9_Sub8_8;
		if (local13 == this.aClass9_Sub8_9) {
			this.aClass9_Sub8_10 = null;
			return null;
		} else {
			this.aClass9_Sub8_10 = local13.aClass9_Sub8_8;
			return local13;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ku;B)V")
	public void method6014(@OriginalArg(0) Class9_Sub8 arg0) {
		if (arg0.aClass9_Sub8_7 != null) {
			arg0.method5336();
		}
		arg0.aClass9_Sub8_7 = this.aClass9_Sub8_9.aClass9_Sub8_7;
		arg0.aClass9_Sub8_8 = this.aClass9_Sub8_9;
		arg0.aClass9_Sub8_7.aClass9_Sub8_8 = arg0;
		arg0.aClass9_Sub8_8.aClass9_Sub8_7 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)I")
	public int method6016() {
		@Pc(5) int local5 = 0;
		@Pc(9) Class9_Sub8 local9 = this.aClass9_Sub8_9.aClass9_Sub8_8;
		while (this.aClass9_Sub8_9 != local9) {
			local9 = local9.aClass9_Sub8_8;
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	public void method6017() {
		while (true) {
			@Pc(13) Class9_Sub8 local13 = this.aClass9_Sub8_9.aClass9_Sub8_8;
			if (local13 == this.aClass9_Sub8_9) {
				this.aClass9_Sub8_10 = null;
				return;
			}
			local13.method5336();
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)Lclient!ku;")
	public Class9_Sub8 method6019() {
		@Pc(6) Class9_Sub8 local6 = this.aClass9_Sub8_10;
		if (local6 == this.aClass9_Sub8_9) {
			this.aClass9_Sub8_10 = null;
			return null;
		} else {
			this.aClass9_Sub8_10 = local6.aClass9_Sub8_8;
			return local6;
		}
	}
}
