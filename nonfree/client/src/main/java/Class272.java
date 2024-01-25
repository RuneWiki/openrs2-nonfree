import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class272 {

	@OriginalMember(owner = "client!raa", name = "h", descriptor = "Lclient!at;")
	private Class5_Sub1 aClass5_Sub1_10;

	@OriginalMember(owner = "client!raa", name = "f", descriptor = "Lclient!at;")
	public final Class5_Sub1 aClass5_Sub1_9 = new Class5_Sub1();

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V")
	public Class272() {
		this.aClass5_Sub1_9.aClass5_Sub1_7 = this.aClass5_Sub1_9;
		this.aClass5_Sub1_9.aClass5_Sub1_8 = this.aClass5_Sub1_9;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)I")
	public int method6596() {
		@Pc(14) int local14 = 0;
		@Pc(18) Class5_Sub1 local18 = this.aClass5_Sub1_9.aClass5_Sub1_8;
		while (this.aClass5_Sub1_9 != local18) {
			local18 = local18.aClass5_Sub1_8;
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)Lclient!at;")
	public Class5_Sub1 method6597() {
		@Pc(14) Class5_Sub1 local14 = this.aClass5_Sub1_10;
		if (local14 == this.aClass5_Sub1_9) {
			this.aClass5_Sub1_10 = null;
			return null;
		} else {
			this.aClass5_Sub1_10 = local14.aClass5_Sub1_8;
			return local14;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)Lclient!at;")
	public Class5_Sub1 method6599() {
		@Pc(7) Class5_Sub1 local7 = this.aClass5_Sub1_9.aClass5_Sub1_8;
		if (local7 == this.aClass5_Sub1_9) {
			this.aClass5_Sub1_10 = null;
			return null;
		} else {
			this.aClass5_Sub1_10 = local7.aClass5_Sub1_8;
			return local7;
		}
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)V")
	public void method6600() {
		while (true) {
			@Pc(5) Class5_Sub1 local5 = this.aClass5_Sub1_9.aClass5_Sub1_8;
			if (this.aClass5_Sub1_9 == local5) {
				this.aClass5_Sub1_10 = null;
				return;
			}
			local5.method5138();
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILclient!at;)V")
	public void method6601(@OriginalArg(1) Class5_Sub1 arg0) {
		if (arg0.aClass5_Sub1_7 != null) {
			arg0.method5138();
		}
		arg0.aClass5_Sub1_7 = this.aClass5_Sub1_9.aClass5_Sub1_7;
		arg0.aClass5_Sub1_8 = this.aClass5_Sub1_9;
		arg0.aClass5_Sub1_7.aClass5_Sub1_8 = arg0;
		arg0.aClass5_Sub1_8.aClass5_Sub1_7 = arg0;
	}
}
