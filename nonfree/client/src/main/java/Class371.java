import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class371 {

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "Lclient!gk;")
	private Class28 aClass28_62;

	@OriginalMember(owner = "client!vl", name = "j", descriptor = "Lclient!gk;")
	private final Class28 aClass28_61 = new Class28();

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	public Class371() {
		this.aClass28_61.aClass28_67 = this.aClass28_61;
		this.aClass28_61.aClass28_68 = this.aClass28_61;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!gk;B)V")
	public void method8908(@OriginalArg(0) Class28 arg0) {
		if (arg0.aClass28_67 != null) {
			arg0.method9276();
		}
		arg0.aClass28_68 = this.aClass28_61;
		arg0.aClass28_67 = this.aClass28_61.aClass28_67;
		arg0.aClass28_67.aClass28_68 = arg0;
		arg0.aClass28_68.aClass28_67 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Lclient!gk;")
	public Class28 method8911() {
		@Pc(7) Class28 local7 = this.aClass28_61.aClass28_68;
		if (this.aClass28_61 == local7) {
			this.aClass28_62 = null;
			return null;
		} else {
			this.aClass28_62 = local7.aClass28_68;
			return local7;
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)Z")
	public boolean method8912() {
		return this.aClass28_61.aClass28_68 == this.aClass28_61;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Lclient!gk;")
	public Class28 method8913() {
		@Pc(13) Class28 local13 = this.aClass28_61.aClass28_68;
		if (this.aClass28_61 == local13) {
			return null;
		} else {
			local13.method9276();
			return local13;
		}
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)I")
	public int method8914() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class28 local16 = this.aClass28_61.aClass28_68;
		while (this.aClass28_61 != local16) {
			local16 = local16.aClass28_68;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
	public void method8915() {
		while (true) {
			@Pc(12) Class28 local12 = this.aClass28_61.aClass28_68;
			if (local12 == this.aClass28_61) {
				this.aClass28_62 = null;
				return;
			}
			local12.method9276();
		}
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)Lclient!gk;")
	public Class28 method8917() {
		@Pc(6) Class28 local6 = this.aClass28_62;
		if (this.aClass28_61 == local6) {
			this.aClass28_62 = null;
			return null;
		} else {
			this.aClass28_62 = local6.aClass28_68;
			return local6;
		}
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(B)Lclient!gk;")
	public Class28 method8918() {
		@Pc(15) Class28 local15 = this.aClass28_61.aClass28_67;
		if (this.aClass28_61 == local15) {
			this.aClass28_62 = null;
			return null;
		} else {
			this.aClass28_62 = local15.aClass28_67;
			return local15;
		}
	}
}
