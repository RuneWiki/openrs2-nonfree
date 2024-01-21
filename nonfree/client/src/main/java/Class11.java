import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class11 {

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "Lclient!wd;")
	private Class4 aClass4_26;

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "Lclient!wd;")
	public final Class4 aClass4_25 = new Class4();

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
	public Class11() {
		this.aClass4_25.aClass4_216 = this.aClass4_25;
		this.aClass4_25.aClass4_215 = this.aClass4_25;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!wd;Lclient!wd;B)V")
	public void method270(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1) {
		if (arg1.aClass4_215 != null) {
			arg1.method3173();
		}
		arg1.aClass4_216 = arg0;
		arg1.aClass4_215 = arg0.aClass4_215;
		arg1.aClass4_215.aClass4_216 = arg1;
		arg1.aClass4_216.aClass4_215 = arg1;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)Lclient!wd;")
	public Class4 method271() {
		@Pc(12) Class4 local12 = this.aClass4_26;
		if (local12 == this.aClass4_25) {
			this.aClass4_26 = null;
			return null;
		} else {
			this.aClass4_26 = local12.aClass4_216;
			return local12;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!wd;B)V")
	public void method272(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_215 != null) {
			arg0.method3173();
		}
		arg0.aClass4_215 = this.aClass4_25.aClass4_215;
		arg0.aClass4_216 = this.aClass4_25;
		arg0.aClass4_215.aClass4_216 = arg0;
		arg0.aClass4_216.aClass4_215 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!wd;)V")
	public void method273(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_215 != null) {
			arg0.method3173();
		}
		arg0.aClass4_216 = this.aClass4_25.aClass4_216;
		arg0.aClass4_215 = this.aClass4_25;
		arg0.aClass4_215.aClass4_216 = arg0;
		arg0.aClass4_216.aClass4_215 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)Lclient!wd;")
	public Class4 method274() {
		@Pc(7) Class4 local7 = this.aClass4_25.aClass4_216;
		if (this.aClass4_25 == local7) {
			this.aClass4_26 = null;
			return null;
		} else {
			this.aClass4_26 = local7.aClass4_216;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Lclient!wd;")
	public Class4 method275() {
		@Pc(3) Class4 local3 = this.aClass4_25.aClass4_215;
		if (local3 == this.aClass4_25) {
			this.aClass4_26 = null;
			return null;
		} else {
			this.aClass4_26 = local3.aClass4_215;
			return local3;
		}
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Lclient!wd;")
	public Class4 method276() {
		@Pc(3) Class4 local3 = this.aClass4_25.aClass4_216;
		if (local3 == this.aClass4_25) {
			return null;
		} else {
			local3.method3173();
			return local3;
		}
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)Lclient!wd;")
	public Class4 method278() {
		@Pc(11) Class4 local11 = this.aClass4_26;
		if (this.aClass4_25 == local11) {
			this.aClass4_26 = null;
			return null;
		} else {
			this.aClass4_26 = local11.aClass4_215;
			return local11;
		}
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)V")
	public void method280() {
		while (true) {
			@Pc(12) Class4 local12 = this.aClass4_25.aClass4_216;
			if (local12 == this.aClass4_25) {
				return;
			}
			local12.method3173();
		}
	}
}
