import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class211 {

	@OriginalMember(owner = "client!vn", name = "r", descriptor = "Lclient!qs;")
	private Class5 aClass5_236;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "Lclient!qs;")
	public final Class5 aClass5_235 = new Class5();

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public Class211() {
		this.aClass5_235.aClass5_247 = this.aClass5_235;
		this.aClass5_235.aClass5_248 = this.aClass5_235;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Lclient!qs;")
	public Class5 method5596() {
		@Pc(7) Class5 local7 = this.aClass5_235.aClass5_247;
		if (local7 == this.aClass5_235) {
			return null;
		} else {
			local7.method5803();
			return local7;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!vn;B)V")
	public void method5599(@OriginalArg(0) Class211 arg0) {
		this.method5605(this.aClass5_235.aClass5_247, arg0);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	public void method5600() {
		while (true) {
			@Pc(5) Class5 local5 = this.aClass5_235.aClass5_247;
			if (this.aClass5_235 == local5) {
				this.aClass5_236 = null;
				return;
			}
			local5.method5803();
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)Lclient!qs;")
	public Class5 method5601() {
		@Pc(7) Class5 local7 = this.aClass5_235.aClass5_248;
		if (local7 == this.aClass5_235) {
			this.aClass5_236 = null;
			return null;
		} else {
			this.aClass5_236 = local7.aClass5_248;
			return local7;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)Lclient!qs;")
	public Class5 method5603() {
		@Pc(11) Class5 local11 = this.aClass5_236;
		if (this.aClass5_235 == local11) {
			this.aClass5_236 = null;
			return null;
		} else {
			this.aClass5_236 = local11.aClass5_247;
			return local11;
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)Lclient!qs;")
	public Class5 method5604() {
		@Pc(12) Class5 local12 = this.aClass5_236;
		if (local12 == this.aClass5_235) {
			this.aClass5_236 = null;
			return null;
		} else {
			this.aClass5_236 = local12.aClass5_248;
			return local12;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!qs;ZLclient!vn;)V")
	private void method5605(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class211 arg1) {
		@Pc(7) Class5 local7 = this.aClass5_235.aClass5_248;
		this.aClass5_235.aClass5_248 = arg0.aClass5_248;
		arg0.aClass5_248.aClass5_247 = this.aClass5_235;
		if (this.aClass5_235 != arg0) {
			arg0.aClass5_248 = arg1.aClass5_235.aClass5_248;
			arg0.aClass5_248.aClass5_247 = arg0;
			arg1.aClass5_235.aClass5_248 = local7;
			local7.aClass5_247 = arg1.aClass5_235;
		}
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)Z")
	public boolean method5606() {
		return this.aClass5_235 == this.aClass5_235.aClass5_247;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BLclient!qs;)V")
	public void method5607(@OriginalArg(1) Class5 arg0) {
		if (arg0.aClass5_248 != null) {
			arg0.method5803();
		}
		arg0.aClass5_248 = this.aClass5_235;
		arg0.aClass5_247 = this.aClass5_235.aClass5_247;
		arg0.aClass5_248.aClass5_247 = arg0;
		arg0.aClass5_247.aClass5_248 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)Lclient!qs;")
	public Class5 method5608() {
		@Pc(7) Class5 local7 = this.aClass5_235.aClass5_247;
		if (this.aClass5_235 == local7) {
			this.aClass5_236 = null;
			return null;
		} else {
			this.aClass5_236 = local7.aClass5_247;
			return local7;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!qs;)V")
	public void method5609(@OriginalArg(1) Class5 arg0) {
		if (arg0.aClass5_248 != null) {
			arg0.method5803();
		}
		arg0.aClass5_248 = this.aClass5_235.aClass5_248;
		arg0.aClass5_247 = this.aClass5_235;
		arg0.aClass5_248.aClass5_247 = arg0;
		arg0.aClass5_247.aClass5_248 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)I")
	public int method5610() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class5 local16 = this.aClass5_235.aClass5_247;
		while (this.aClass5_235 != local16) {
			local16 = local16.aClass5_247;
			local12++;
		}
		return local12;
	}
}
