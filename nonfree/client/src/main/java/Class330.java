import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class330 {

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "Lclient!ds;")
	private Class5 aClass5_258;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Lclient!ds;")
	public final Class5 aClass5_257 = new Class5();

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	public Class330() {
		this.aClass5_257.aClass5_300 = this.aClass5_257;
		this.aClass5_257.aClass5_299 = this.aClass5_257;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Lclient!ds;")
	public Class5 method7908() {
		@Pc(14) Class5 local14 = this.aClass5_257.aClass5_300;
		if (local14 == this.aClass5_257) {
			this.aClass5_258 = null;
			return null;
		} else {
			this.aClass5_258 = local14.aClass5_300;
			return local14;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ds;Lclient!tg;Z)V")
	private void method7909(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class330 arg1) {
		@Pc(7) Class5 local7 = this.aClass5_257.aClass5_299;
		this.aClass5_257.aClass5_299 = arg0.aClass5_299;
		arg0.aClass5_299.aClass5_300 = this.aClass5_257;
		if (arg0 != this.aClass5_257) {
			arg0.aClass5_299 = arg1.aClass5_257.aClass5_299;
			arg0.aClass5_299.aClass5_300 = arg0;
			arg1.aClass5_257.aClass5_299 = local7;
			local7.aClass5_300 = arg1.aClass5_257;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public void method7910() {
		while (true) {
			@Pc(5) Class5 local5 = this.aClass5_257.aClass5_300;
			if (this.aClass5_257 == local5) {
				this.aClass5_258 = null;
				return;
			}
			local5.method9047();
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)Lclient!ds;")
	public Class5 method7911() {
		@Pc(7) Class5 local7 = this.aClass5_257.aClass5_300;
		if (this.aClass5_257 == local7) {
			return null;
		} else {
			local7.method9047();
			return local7;
		}
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)I")
	public int method7912() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class5 local11 = this.aClass5_257.aClass5_300;
		while (this.aClass5_257 != local11) {
			local11 = local11.aClass5_300;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)Lclient!ds;")
	public Class5 method7913() {
		@Pc(12) Class5 local12 = this.aClass5_257.aClass5_299;
		if (local12 == this.aClass5_257) {
			this.aClass5_258 = null;
			return null;
		} else {
			this.aClass5_258 = local12.aClass5_299;
			return local12;
		}
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)Lclient!ds;")
	public Class5 method7914() {
		@Pc(13) Class5 local13 = this.aClass5_258;
		if (this.aClass5_257 == local13) {
			this.aClass5_258 = null;
			return null;
		} else {
			this.aClass5_258 = local13.aClass5_300;
			return local13;
		}
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)Lclient!ds;")
	public Class5 method7915() {
		@Pc(12) Class5 local12 = this.aClass5_258;
		if (local12 == this.aClass5_257) {
			this.aClass5_258 = null;
			return null;
		} else {
			this.aClass5_258 = local12.aClass5_299;
			return local12;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!tg;)V")
	public void method7916(@OriginalArg(1) Class330 arg0) {
		this.method7909(this.aClass5_257.aClass5_300, arg0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!ds;)V")
	public void method7917(@OriginalArg(1) Class5 arg0) {
		if (arg0.aClass5_299 != null) {
			arg0.method9047();
		}
		arg0.aClass5_299 = this.aClass5_257.aClass5_299;
		arg0.aClass5_300 = this.aClass5_257;
		arg0.aClass5_299.aClass5_300 = arg0;
		arg0.aClass5_300.aClass5_299 = arg0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)Z")
	public boolean method7918() {
		return this.aClass5_257 == this.aClass5_257.aClass5_300;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(ILclient!ds;)V")
	public void method7919(@OriginalArg(1) Class5 arg0) {
		if (arg0.aClass5_299 != null) {
			arg0.method9047();
		}
		arg0.aClass5_299 = this.aClass5_257;
		arg0.aClass5_300 = this.aClass5_257.aClass5_300;
		arg0.aClass5_299.aClass5_300 = arg0;
		arg0.aClass5_300.aClass5_299 = arg0;
	}
}
