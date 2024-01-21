import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class44 {

	@OriginalMember(owner = "client!od", name = "w", descriptor = "Lclient!g;")
	private Class2 aClass2_72;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "Lclient!g;")
	public final Class2 aClass2_71 = new Class2();

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class44() {
		this.aClass2_71.aClass2_93 = this.aClass2_71;
		this.aClass2_71.aClass2_94 = this.aClass2_71;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Lclient!g;")
	public Class2 method1218() {
		@Pc(15) Class2 local15 = this.aClass2_71.aClass2_93;
		if (this.aClass2_71 == local15) {
			return null;
		} else {
			local15.method1677();
			return local15;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Lclient!g;")
	public Class2 method1220() {
		@Pc(3) Class2 local3 = this.aClass2_71.aClass2_94;
		if (this.aClass2_71 == local3) {
			return null;
		} else {
			local3.method1677();
			return local3;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!g;)V")
	public void method1221(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_93 != null) {
			arg0.method1677();
		}
		arg0.aClass2_94 = this.aClass2_71;
		arg0.aClass2_93 = this.aClass2_71.aClass2_93;
		arg0.aClass2_93.aClass2_94 = arg0;
		arg0.aClass2_94.aClass2_93 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	public void method1222() {
		while (true) {
			@Pc(14) Class2 local14 = this.aClass2_71.aClass2_94;
			if (this.aClass2_71 == local14) {
				return;
			}
			local14.method1677();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!g;Lclient!g;)V")
	public void method1223(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_93 != null) {
			arg1.method1677();
		}
		arg1.aClass2_94 = arg0;
		arg1.aClass2_93 = arg0.aClass2_93;
		arg1.aClass2_93.aClass2_94 = arg1;
		arg1.aClass2_94.aClass2_93 = arg1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Lclient!g;")
	public Class2 method1224() {
		@Pc(7) Class2 local7 = this.aClass2_71.aClass2_94;
		if (local7 == this.aClass2_71) {
			this.aClass2_72 = null;
			return null;
		} else {
			this.aClass2_72 = local7.aClass2_94;
			return local7;
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Lclient!g;")
	public Class2 method1225() {
		@Pc(13) Class2 local13 = this.aClass2_72;
		if (local13 == this.aClass2_71) {
			this.aClass2_72 = null;
			return null;
		} else {
			this.aClass2_72 = local13.aClass2_93;
			return local13;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)Lclient!g;")
	public Class2 method1226() {
		@Pc(7) Class2 local7 = this.aClass2_71.aClass2_93;
		if (this.aClass2_71 == local7) {
			this.aClass2_72 = null;
			return null;
		} else {
			this.aClass2_72 = local7.aClass2_93;
			return local7;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(BLclient!g;)V")
	public void method1229(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_93 != null) {
			arg0.method1677();
		}
		arg0.aClass2_93 = this.aClass2_71;
		arg0.aClass2_94 = this.aClass2_71.aClass2_94;
		arg0.aClass2_93.aClass2_94 = arg0;
		arg0.aClass2_94.aClass2_93 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)Lclient!g;")
	public Class2 method1231() {
		@Pc(6) Class2 local6 = this.aClass2_72;
		if (local6 == this.aClass2_71) {
			this.aClass2_72 = null;
			return null;
		} else {
			this.aClass2_72 = local6.aClass2_94;
			return local6;
		}
	}
}
