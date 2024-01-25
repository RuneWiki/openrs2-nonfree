import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class39 {

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!bo;")
	private Class3_Sub4 aClass3_Sub4_12;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Lclient!bo;")
	private final Class3_Sub4 aClass3_Sub4_11 = new Class3_Sub4();

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class39() {
		this.aClass3_Sub4_11.aClass3_Sub4_61 = this.aClass3_Sub4_11;
		this.aClass3_Sub4_11.aClass3_Sub4_62 = this.aClass3_Sub4_11;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Lclient!bo;")
	public Class3_Sub4 method1270() {
		@Pc(12) Class3_Sub4 local12 = this.aClass3_Sub4_11.aClass3_Sub4_61;
		if (this.aClass3_Sub4_11 == local12) {
			this.aClass3_Sub4_12 = null;
			return null;
		} else {
			this.aClass3_Sub4_12 = local12.aClass3_Sub4_61;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!bo;)V")
	public void method1272(@OriginalArg(1) Class3_Sub4 arg0) {
		if (arg0.aClass3_Sub4_62 != null) {
			arg0.method8309();
		}
		arg0.aClass3_Sub4_61 = this.aClass3_Sub4_11.aClass3_Sub4_61;
		arg0.aClass3_Sub4_62 = this.aClass3_Sub4_11;
		arg0.aClass3_Sub4_62.aClass3_Sub4_61 = arg0;
		arg0.aClass3_Sub4_61.aClass3_Sub4_62 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(BLclient!bo;)V")
	public void method1273(@OriginalArg(1) Class3_Sub4 arg0) {
		if (arg0.aClass3_Sub4_62 != null) {
			arg0.method8309();
		}
		arg0.aClass3_Sub4_62 = this.aClass3_Sub4_11.aClass3_Sub4_62;
		arg0.aClass3_Sub4_61 = this.aClass3_Sub4_11;
		arg0.aClass3_Sub4_62.aClass3_Sub4_61 = arg0;
		arg0.aClass3_Sub4_61.aClass3_Sub4_62 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)Lclient!bo;")
	public Class3_Sub4 method1275() {
		@Pc(13) Class3_Sub4 local13 = this.aClass3_Sub4_12;
		if (this.aClass3_Sub4_11 == local13) {
			this.aClass3_Sub4_12 = null;
			return null;
		} else {
			this.aClass3_Sub4_12 = local13.aClass3_Sub4_61;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)Lclient!bo;")
	public Class3_Sub4 method1276() {
		@Pc(7) Class3_Sub4 local7 = this.aClass3_Sub4_11.aClass3_Sub4_61;
		if (local7 == this.aClass3_Sub4_11) {
			return null;
		} else {
			local7.method8309();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)Lclient!bo;")
	public Class3_Sub4 method1277() {
		@Pc(7) Class3_Sub4 local7 = this.aClass3_Sub4_11.aClass3_Sub4_62;
		if (this.aClass3_Sub4_11 == local7) {
			return null;
		} else {
			local7.method8309();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)I")
	public int method1278() {
		@Pc(5) int local5 = 0;
		for (@Pc(9) Class3_Sub4 local9 = this.aClass3_Sub4_11.aClass3_Sub4_61; local9 != this.aClass3_Sub4_11; local9 = local9.aClass3_Sub4_61) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
	public void method1279() {
		while (true) {
			@Pc(3) Class3_Sub4 local3 = this.aClass3_Sub4_11.aClass3_Sub4_61;
			if (this.aClass3_Sub4_11 == local3) {
				this.aClass3_Sub4_12 = null;
				return;
			}
			local3.method8309();
		}
	}
}
