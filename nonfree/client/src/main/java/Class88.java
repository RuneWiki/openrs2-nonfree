import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class88 {

	@OriginalMember(owner = "client!ft", name = "t", descriptor = "Lclient!ol;")
	private Class6 aClass6_74;

	@OriginalMember(owner = "client!ft", name = "r", descriptor = "Lclient!ol;")
	public final Class6 aClass6_73 = new Class6();

	static {
		new Class231("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
	public Class88() {
		this.aClass6_73.aClass6_251 = this.aClass6_73;
		this.aClass6_73.aClass6_252 = this.aClass6_73;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!ol;)V")
	public void method1878(@OriginalArg(1) Class6 arg0) {
		if (arg0.aClass6_251 != null) {
			arg0.method5977();
		}
		arg0.aClass6_251 = this.aClass6_73.aClass6_251;
		arg0.aClass6_252 = this.aClass6_73;
		arg0.aClass6_251.aClass6_252 = arg0;
		arg0.aClass6_252.aClass6_251 = arg0;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ft;Lclient!ol;B)V")
	private void method1879(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class6 arg1) {
		@Pc(14) Class6 local14 = this.aClass6_73.aClass6_251;
		this.aClass6_73.aClass6_251 = arg1.aClass6_251;
		arg1.aClass6_251.aClass6_252 = this.aClass6_73;
		if (this.aClass6_73 != arg1) {
			arg1.aClass6_251 = arg0.aClass6_73.aClass6_251;
			arg1.aClass6_251.aClass6_252 = arg1;
			local14.aClass6_252 = arg0.aClass6_73;
			arg0.aClass6_73.aClass6_251 = local14;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)I")
	public int method1880() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class6 local11 = this.aClass6_73.aClass6_252;
		while (this.aClass6_73 != local11) {
			local11 = local11.aClass6_252;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)Lclient!ol;")
	public Class6 method1881() {
		@Pc(7) Class6 local7 = this.aClass6_73.aClass6_252;
		if (this.aClass6_73 == local7) {
			return null;
		} else {
			local7.method5977();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)Lclient!ol;")
	public Class6 method1882() {
		@Pc(7) Class6 local7 = this.aClass6_73.aClass6_252;
		if (local7 == this.aClass6_73) {
			this.aClass6_74 = null;
			return null;
		} else {
			this.aClass6_74 = local7.aClass6_252;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)Lclient!ol;")
	public Class6 method1883() {
		@Pc(13) Class6 local13 = this.aClass6_73.aClass6_251;
		if (local13 == this.aClass6_73) {
			this.aClass6_74 = null;
			return null;
		} else {
			this.aClass6_74 = local13.aClass6_251;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Lclient!ol;")
	public Class6 method1884() {
		@Pc(13) Class6 local13 = this.aClass6_74;
		if (this.aClass6_73 == local13) {
			this.aClass6_74 = null;
			return null;
		} else {
			this.aClass6_74 = local13.aClass6_251;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(ILclient!ol;)V")
	public void method1885(@OriginalArg(1) Class6 arg0) {
		if (arg0.aClass6_251 != null) {
			arg0.method5977();
		}
		arg0.aClass6_251 = this.aClass6_73;
		arg0.aClass6_252 = this.aClass6_73.aClass6_252;
		arg0.aClass6_251.aClass6_252 = arg0;
		arg0.aClass6_252.aClass6_251 = arg0;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ft;I)V")
	public void method1886(@OriginalArg(0) Class88 arg0) {
		this.method1879(arg0, this.aClass6_73.aClass6_252);
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(Z)V")
	public void method1887() {
		while (true) {
			@Pc(9) Class6 local9 = this.aClass6_73.aClass6_252;
			if (this.aClass6_73 == local9) {
				this.aClass6_74 = null;
				return;
			}
			local9.method5977();
		}
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)Z")
	public boolean method1888() {
		return this.aClass6_73 == this.aClass6_73.aClass6_252;
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(B)Lclient!ol;")
	public Class6 method1891() {
		@Pc(6) Class6 local6 = this.aClass6_74;
		if (this.aClass6_73 == local6) {
			this.aClass6_74 = null;
			return null;
		} else {
			this.aClass6_74 = local6.aClass6_252;
			return local6;
		}
	}
}
