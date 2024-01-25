import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class244 {

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Lclient!ii;")
	private Class4 aClass4_186;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!ii;")
	public final Class4 aClass4_185 = new Class4();

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class244() {
		this.aClass4_185.aClass4_286 = this.aClass4_185;
		this.aClass4_185.aClass4_285 = this.aClass4_185;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!ii;I)V")
	public void method5960(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_286 != null) {
			arg0.method8379();
		}
		arg0.aClass4_285 = this.aClass4_185;
		arg0.aClass4_286 = this.aClass4_185.aClass4_286;
		arg0.aClass4_286.aClass4_285 = arg0;
		arg0.aClass4_285.aClass4_286 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)Z")
	public boolean method5961() {
		return this.aClass4_185 == this.aClass4_185.aClass4_285;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
	public void method5962() {
		while (true) {
			@Pc(13) Class4 local13 = this.aClass4_185.aClass4_285;
			if (this.aClass4_185 == local13) {
				this.aClass4_186 = null;
				return;
			}
			local13.method8379();
		}
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)Lclient!ii;")
	public Class4 method5963() {
		@Pc(15) Class4 local15 = this.aClass4_185.aClass4_285;
		if (local15 == this.aClass4_185) {
			this.aClass4_186 = null;
			return null;
		} else {
			this.aClass4_186 = local15.aClass4_285;
			return local15;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lclient!ii;I)V")
	public void method5964(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_286 != null) {
			arg0.method8379();
		}
		arg0.aClass4_286 = this.aClass4_185;
		arg0.aClass4_285 = this.aClass4_185.aClass4_285;
		arg0.aClass4_286.aClass4_285 = arg0;
		arg0.aClass4_285.aClass4_286 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Lclient!ii;")
	public Class4 method5965() {
		@Pc(13) Class4 local13 = this.aClass4_186;
		if (this.aClass4_185 == local13) {
			this.aClass4_186 = null;
			return null;
		} else {
			this.aClass4_186 = local13.aClass4_285;
			return local13;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!oe;BLclient!ii;)V")
	private void method5967(@OriginalArg(0) Class244 arg0, @OriginalArg(2) Class4 arg1) {
		@Pc(7) Class4 local7 = this.aClass4_185.aClass4_286;
		this.aClass4_185.aClass4_286 = arg1.aClass4_286;
		arg1.aClass4_286.aClass4_285 = this.aClass4_185;
		if (this.aClass4_185 != arg1) {
			arg1.aClass4_286 = arg0.aClass4_185.aClass4_286;
			arg1.aClass4_286.aClass4_285 = arg1;
			arg0.aClass4_185.aClass4_286 = local7;
			local7.aClass4_285 = arg0.aClass4_185;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Lclient!ii;")
	public Class4 method5968() {
		@Pc(13) Class4 local13 = this.aClass4_185.aClass4_285;
		if (local13 == this.aClass4_185) {
			return null;
		} else {
			local13.method8379();
			return local13;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!oe;)V")
	public void method5969(@OriginalArg(1) Class244 arg0) {
		this.method5967(arg0, this.aClass4_185.aClass4_285);
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)Lclient!ii;")
	public Class4 method5970() {
		@Pc(11) Class4 local11 = this.aClass4_186;
		if (local11 == this.aClass4_185) {
			this.aClass4_186 = null;
			return null;
		} else {
			this.aClass4_186 = local11.aClass4_286;
			return local11;
		}
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Lclient!ii;")
	public Class4 method5971() {
		@Pc(14) Class4 local14 = this.aClass4_185.aClass4_286;
		if (local14 == this.aClass4_185) {
			this.aClass4_186 = null;
			return null;
		} else {
			this.aClass4_186 = local14.aClass4_286;
			return local14;
		}
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)I")
	public int method5973() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class4 local17 = this.aClass4_185.aClass4_285;
		while (this.aClass4_185 != local17) {
			local17 = local17.aClass4_285;
			local13++;
		}
		return local13;
	}
}
