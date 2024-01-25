import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class112 {

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "Lclient!bk;")
	private Class8 aClass8_12;

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "Lclient!bk;")
	private final Class8 aClass8_11 = new Class8();

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	public Class112() {
		this.aClass8_11.aClass8_23 = this.aClass8_11;
		this.aClass8_11.aClass8_24 = this.aClass8_11;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Lclient!bk;")
	public Class8 method2544() {
		@Pc(7) Class8 local7 = this.aClass8_11.aClass8_24;
		if (this.aClass8_11 == local7) {
			return null;
		} else {
			local7.method5780();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)Z")
	public boolean method2545() {
		return this.aClass8_11 == this.aClass8_11.aClass8_24;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!bk;)V")
	public void method2546(@OriginalArg(1) Class8 arg0) {
		if (arg0.aClass8_23 != null) {
			arg0.method5780();
		}
		arg0.aClass8_24 = this.aClass8_11;
		arg0.aClass8_23 = this.aClass8_11.aClass8_23;
		arg0.aClass8_23.aClass8_24 = arg0;
		arg0.aClass8_24.aClass8_23 = arg0;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)Lclient!bk;")
	public Class8 method2547() {
		@Pc(14) Class8 local14 = this.aClass8_11.aClass8_23;
		if (local14 == this.aClass8_11) {
			this.aClass8_12 = null;
			return null;
		} else {
			this.aClass8_12 = local14.aClass8_23;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V")
	public void method2549() {
		while (true) {
			@Pc(5) Class8 local5 = this.aClass8_11.aClass8_24;
			if (local5 == this.aClass8_11) {
				this.aClass8_12 = null;
				return;
			}
			local5.method5780();
		}
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)Lclient!bk;")
	public Class8 method2550() {
		@Pc(14) Class8 local14 = this.aClass8_12;
		if (this.aClass8_11 == local14) {
			this.aClass8_12 = null;
			return null;
		} else {
			this.aClass8_12 = local14.aClass8_24;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(I)I")
	public int method2551() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class8 local11 = this.aClass8_11.aClass8_24;
		while (this.aClass8_11 != local11) {
			local11 = local11.aClass8_24;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "(I)Lclient!bk;")
	public Class8 method2553() {
		@Pc(7) Class8 local7 = this.aClass8_11.aClass8_24;
		if (this.aClass8_11 == local7) {
			this.aClass8_12 = null;
			return null;
		} else {
			this.aClass8_12 = local7.aClass8_24;
			return local7;
		}
	}
}
