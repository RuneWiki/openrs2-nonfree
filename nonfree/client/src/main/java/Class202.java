import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class202 {

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "Lclient!rv;")
	private Class16_Sub6 aClass16_Sub6_2;

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "Lclient!rv;")
	public final Class16_Sub6 aClass16_Sub6_1 = new Class16_Sub6();

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	public Class202() {
		this.aClass16_Sub6_1.aClass16_Sub6_10 = this.aClass16_Sub6_1;
		this.aClass16_Sub6_1.aClass16_Sub6_9 = this.aClass16_Sub6_1;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
	public void method4750() {
		while (true) {
			@Pc(9) Class16_Sub6 local9 = this.aClass16_Sub6_1.aClass16_Sub6_10;
			if (this.aClass16_Sub6_1 == local9) {
				this.aClass16_Sub6_2 = null;
				return;
			}
			local9.method8603();
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)I")
	public int method4751() {
		@Pc(14) int local14 = 0;
		for (@Pc(18) Class16_Sub6 local18 = this.aClass16_Sub6_1.aClass16_Sub6_10; local18 != this.aClass16_Sub6_1; local18 = local18.aClass16_Sub6_10) {
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLclient!rv;)V")
	public void method4752(@OriginalArg(1) Class16_Sub6 arg0) {
		if (arg0.aClass16_Sub6_9 != null) {
			arg0.method8603();
		}
		arg0.aClass16_Sub6_9 = this.aClass16_Sub6_1.aClass16_Sub6_9;
		arg0.aClass16_Sub6_10 = this.aClass16_Sub6_1;
		arg0.aClass16_Sub6_9.aClass16_Sub6_10 = arg0;
		arg0.aClass16_Sub6_10.aClass16_Sub6_9 = arg0;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)Lclient!rv;")
	public Class16_Sub6 method4753() {
		@Pc(14) Class16_Sub6 local14 = this.aClass16_Sub6_2;
		if (this.aClass16_Sub6_1 == local14) {
			this.aClass16_Sub6_2 = null;
			return null;
		} else {
			this.aClass16_Sub6_2 = local14.aClass16_Sub6_10;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)Lclient!rv;")
	public Class16_Sub6 method4755() {
		@Pc(7) Class16_Sub6 local7 = this.aClass16_Sub6_1.aClass16_Sub6_10;
		if (local7 == this.aClass16_Sub6_1) {
			this.aClass16_Sub6_2 = null;
			return null;
		} else {
			this.aClass16_Sub6_2 = local7.aClass16_Sub6_10;
			return local7;
		}
	}
}
