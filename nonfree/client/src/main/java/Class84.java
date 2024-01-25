import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class84 {

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "Lclient!md;")
	private Class3 aClass3_10;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "Lclient!md;")
	private final Class3 aClass3_9 = new Class3();

	static {
		new Class83("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	public Class84() {
		this.aClass3_9.aClass3_23 = this.aClass3_9;
		this.aClass3_9.aClass3_24 = this.aClass3_9;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!md;)V")
	public void method2305(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_24 != null) {
			arg0.method5676();
		}
		arg0.aClass3_23 = this.aClass3_9;
		arg0.aClass3_24 = this.aClass3_9.aClass3_24;
		arg0.aClass3_24.aClass3_23 = arg0;
		arg0.aClass3_23.aClass3_24 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)Lclient!md;")
	public Class3 method2306() {
		@Pc(12) Class3 local12 = this.aClass3_9.aClass3_23;
		if (local12 == this.aClass3_9) {
			return null;
		} else {
			local12.method5676();
			return local12;
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)I")
	public int method2307() {
		@Pc(7) int local7 = 0;
		@Pc(19) Class3 local19 = this.aClass3_9.aClass3_23;
		while (local19 != this.aClass3_9) {
			local19 = local19.aClass3_23;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(B)Lclient!md;")
	public Class3 method2308() {
		@Pc(7) Class3 local7 = this.aClass3_9.aClass3_24;
		if (this.aClass3_9 == local7) {
			this.aClass3_10 = null;
			return null;
		} else {
			this.aClass3_10 = local7.aClass3_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(B)Lclient!md;")
	public Class3 method2309() {
		@Pc(13) Class3 local13 = this.aClass3_10;
		if (local13 == this.aClass3_9) {
			this.aClass3_10 = null;
			return null;
		} else {
			this.aClass3_10 = local13.aClass3_23;
			return local13;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	public void method2310() {
		while (true) {
			@Pc(9) Class3 local9 = this.aClass3_9.aClass3_23;
			if (local9 == this.aClass3_9) {
				this.aClass3_10 = null;
				return;
			}
			local9.method5676();
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)Lclient!md;")
	public Class3 method2312() {
		@Pc(14) Class3 local14 = this.aClass3_9.aClass3_23;
		if (this.aClass3_9 == local14) {
			this.aClass3_10 = null;
			return null;
		} else {
			this.aClass3_10 = local14.aClass3_23;
			return local14;
		}
	}

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "(B)Z")
	public boolean method2313() {
		return this.aClass3_9 == this.aClass3_9.aClass3_23;
	}
}
