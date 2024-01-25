import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class193 {

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "Lclient!sh;")
	private Class57 aClass57_22;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Lclient!sh;")
	private final Class57 aClass57_21 = new Class57();

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
	public Class193() {
		this.aClass57_21.aClass57_24 = this.aClass57_21;
		this.aClass57_21.aClass57_23 = this.aClass57_21;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
	public void method5218() {
		while (true) {
			@Pc(9) Class57 local9 = this.aClass57_21.aClass57_24;
			if (this.aClass57_21 == local9) {
				this.aClass57_22 = null;
				return;
			}
			local9.method5452();
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)I")
	public int method5219() {
		@Pc(14) int local14 = 0;
		for (@Pc(18) Class57 local18 = this.aClass57_21.aClass57_24; local18 != this.aClass57_21; local18 = local18.aClass57_24) {
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)Z")
	public boolean method5220() {
		return this.aClass57_21.aClass57_24 == this.aClass57_21;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)Lclient!sh;")
	public Class57 method5221() {
		@Pc(7) Class57 local7 = this.aClass57_21.aClass57_23;
		if (this.aClass57_21 == local7) {
			this.aClass57_22 = null;
			return null;
		} else {
			this.aClass57_22 = local7.aClass57_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!sh;I)V")
	public void method5222(@OriginalArg(0) Class57 arg0) {
		if (arg0.aClass57_23 != null) {
			arg0.method5452();
		}
		arg0.aClass57_24 = this.aClass57_21;
		arg0.aClass57_23 = this.aClass57_21.aClass57_23;
		arg0.aClass57_23.aClass57_24 = arg0;
		arg0.aClass57_24.aClass57_23 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)Lclient!sh;")
	public Class57 method5223() {
		@Pc(11) Class57 local11 = this.aClass57_22;
		if (local11 == this.aClass57_21) {
			this.aClass57_22 = null;
			return null;
		} else {
			this.aClass57_22 = local11.aClass57_24;
			return local11;
		}
	}

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)Lclient!sh;")
	public Class57 method5224() {
		@Pc(7) Class57 local7 = this.aClass57_21.aClass57_24;
		if (local7 == this.aClass57_21) {
			this.aClass57_22 = null;
			return null;
		} else {
			this.aClass57_22 = local7.aClass57_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "(I)Lclient!sh;")
	public Class57 method5225() {
		@Pc(7) Class57 local7 = this.aClass57_21.aClass57_24;
		if (local7 == this.aClass57_21) {
			return null;
		} else {
			local7.method5452();
			return local7;
		}
	}
}
