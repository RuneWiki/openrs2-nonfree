import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class136 {

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "Lclient!ol;")
	private Class10_Sub1 aClass10_Sub1_25;

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "Lclient!ol;")
	private final Class10_Sub1 aClass10_Sub1_24 = new Class10_Sub1();

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
	public Class136() {
		this.aClass10_Sub1_24.aClass10_Sub1_56 = this.aClass10_Sub1_24;
		this.aClass10_Sub1_24.aClass10_Sub1_57 = this.aClass10_Sub1_24;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!ol;)V")
	public void method3197(@OriginalArg(1) Class10_Sub1 arg0) {
		if (arg0.aClass10_Sub1_57 != null) {
			arg0.method5897();
		}
		arg0.aClass10_Sub1_56 = this.aClass10_Sub1_24;
		arg0.aClass10_Sub1_57 = this.aClass10_Sub1_24.aClass10_Sub1_57;
		arg0.aClass10_Sub1_57.aClass10_Sub1_56 = arg0;
		arg0.aClass10_Sub1_56.aClass10_Sub1_57 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)Lclient!ol;")
	public Class10_Sub1 method3198() {
		@Pc(7) Class10_Sub1 local7 = this.aClass10_Sub1_24.aClass10_Sub1_56;
		if (local7 == this.aClass10_Sub1_24) {
			return null;
		} else {
			local7.method5897();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)Lclient!ol;")
	public Class10_Sub1 method3200() {
		@Pc(7) Class10_Sub1 local7 = this.aClass10_Sub1_24.aClass10_Sub1_56;
		if (local7 == this.aClass10_Sub1_24) {
			this.aClass10_Sub1_25 = null;
			return null;
		} else {
			this.aClass10_Sub1_25 = local7.aClass10_Sub1_56;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)Lclient!ol;")
	public Class10_Sub1 method3201() {
		@Pc(11) Class10_Sub1 local11 = this.aClass10_Sub1_25;
		if (local11 == this.aClass10_Sub1_24) {
			this.aClass10_Sub1_25 = null;
			return null;
		} else {
			this.aClass10_Sub1_25 = local11.aClass10_Sub1_56;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)I")
	public int method3202() {
		@Pc(14) int local14 = 0;
		for (@Pc(18) Class10_Sub1 local18 = this.aClass10_Sub1_24.aClass10_Sub1_56; local18 != this.aClass10_Sub1_24; local18 = local18.aClass10_Sub1_56) {
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(B)V")
	public void method3204() {
		while (true) {
			@Pc(11) Class10_Sub1 local11 = this.aClass10_Sub1_24.aClass10_Sub1_56;
			if (local11 == this.aClass10_Sub1_24) {
				this.aClass10_Sub1_25 = null;
				return;
			}
			local11.method5897();
		}
	}
}
