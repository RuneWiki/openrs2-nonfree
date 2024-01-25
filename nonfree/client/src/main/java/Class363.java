import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class363 {

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "Lclient!ob;")
	private Class3_Sub7 aClass3_Sub7_67;

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "Lclient!ob;")
	public final Class3_Sub7 aClass3_Sub7_66 = new Class3_Sub7();

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
	public Class363() {
		this.aClass3_Sub7_66.aClass3_Sub7_64 = this.aClass3_Sub7_66;
		this.aClass3_Sub7_66.aClass3_Sub7_63 = this.aClass3_Sub7_66;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!ob;)V")
	public void method8413(@OriginalArg(1) Class3_Sub7 arg0) {
		if (arg0.aClass3_Sub7_64 != null) {
			arg0.method7907();
		}
		arg0.aClass3_Sub7_63 = this.aClass3_Sub7_66;
		arg0.aClass3_Sub7_64 = this.aClass3_Sub7_66.aClass3_Sub7_64;
		arg0.aClass3_Sub7_64.aClass3_Sub7_63 = arg0;
		arg0.aClass3_Sub7_63.aClass3_Sub7_64 = arg0;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)Lclient!ob;")
	public Class3_Sub7 method8414() {
		@Pc(12) Class3_Sub7 local12 = this.aClass3_Sub7_66.aClass3_Sub7_63;
		if (this.aClass3_Sub7_66 == local12) {
			this.aClass3_Sub7_67 = null;
			return null;
		} else {
			this.aClass3_Sub7_67 = local12.aClass3_Sub7_63;
			return local12;
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Lclient!ob;")
	public Class3_Sub7 method8415() {
		@Pc(11) Class3_Sub7 local11 = this.aClass3_Sub7_67;
		if (this.aClass3_Sub7_66 == local11) {
			this.aClass3_Sub7_67 = null;
			return null;
		} else {
			this.aClass3_Sub7_67 = local11.aClass3_Sub7_63;
			return local11;
		}
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)I")
	public int method8417() {
		@Pc(14) int local14 = 0;
		@Pc(18) Class3_Sub7 local18 = this.aClass3_Sub7_66.aClass3_Sub7_63;
		while (local18 != this.aClass3_Sub7_66) {
			local18 = local18.aClass3_Sub7_63;
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "(I)V")
	public void method8419() {
		while (true) {
			@Pc(13) Class3_Sub7 local13 = this.aClass3_Sub7_66.aClass3_Sub7_63;
			if (this.aClass3_Sub7_66 == local13) {
				this.aClass3_Sub7_67 = null;
				return;
			}
			local13.method7907();
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)Lclient!ob;")
	public Class3_Sub7 method8420() {
		@Pc(12) Class3_Sub7 local12 = this.aClass3_Sub7_66.aClass3_Sub7_63;
		if (local12 == this.aClass3_Sub7_66) {
			return null;
		} else {
			local12.method7907();
			return local12;
		}
	}
}
