import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class195 {

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "Lclient!sa;")
	private Class32 aClass32_20;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "Lclient!sa;")
	private final Class32 aClass32_19 = new Class32();

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	public Class195() {
		this.aClass32_19.aClass32_23 = this.aClass32_19;
		this.aClass32_19.aClass32_24 = this.aClass32_19;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)Z")
	public boolean method5296() {
		return this.aClass32_19.aClass32_23 == this.aClass32_19;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public void method5297() {
		while (true) {
			@Pc(16) Class32 local16 = this.aClass32_19.aClass32_23;
			if (this.aClass32_19 == local16) {
				this.aClass32_20 = null;
				return;
			}
			local16.method5725();
		}
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)Lclient!sa;")
	public Class32 method5298() {
		@Pc(6) Class32 local6 = this.aClass32_20;
		if (local6 == this.aClass32_19) {
			this.aClass32_20 = null;
			return null;
		} else {
			this.aClass32_20 = local6.aClass32_23;
			return local6;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!sa;)V")
	public void method5300(@OriginalArg(1) Class32 arg0) {
		if (arg0.aClass32_24 != null) {
			arg0.method5725();
		}
		arg0.aClass32_23 = this.aClass32_19;
		arg0.aClass32_24 = this.aClass32_19.aClass32_24;
		arg0.aClass32_24.aClass32_23 = arg0;
		arg0.aClass32_23.aClass32_24 = arg0;
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)Lclient!sa;")
	public Class32 method5301() {
		@Pc(15) Class32 local15 = this.aClass32_19.aClass32_23;
		if (local15 == this.aClass32_19) {
			return null;
		} else {
			local15.method5725();
			return local15;
		}
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)Lclient!sa;")
	public Class32 method5302() {
		@Pc(7) Class32 local7 = this.aClass32_19.aClass32_23;
		if (this.aClass32_19 == local7) {
			this.aClass32_20 = null;
			return null;
		} else {
			this.aClass32_20 = local7.aClass32_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)I")
	public int method5303() {
		@Pc(14) int local14 = 0;
		for (@Pc(18) Class32 local18 = this.aClass32_19.aClass32_23; local18 != this.aClass32_19; local18 = local18.aClass32_23) {
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)Lclient!sa;")
	public Class32 method5304() {
		@Pc(13) Class32 local13 = this.aClass32_19.aClass32_24;
		if (this.aClass32_19 == local13) {
			this.aClass32_20 = null;
			return null;
		} else {
			this.aClass32_20 = local13.aClass32_24;
			return local13;
		}
	}
}
