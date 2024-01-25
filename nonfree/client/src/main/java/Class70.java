import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class70 {

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "Lclient!du;")
	private Class2 aClass2_40;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!du;")
	public final Class2 aClass2_39 = new Class2();

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class70() {
		this.aClass2_39.aClass2_286 = this.aClass2_39;
		this.aClass2_39.aClass2_285 = this.aClass2_39;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!dc;Lclient!du;I)V")
	private void method1258(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class2 arg1) {
		@Pc(13) Class2 local13 = this.aClass2_39.aClass2_285;
		this.aClass2_39.aClass2_285 = arg1.aClass2_285;
		arg1.aClass2_285.aClass2_286 = this.aClass2_39;
		if (this.aClass2_39 != arg1) {
			arg1.aClass2_285 = arg0.aClass2_39.aClass2_285;
			arg1.aClass2_285.aClass2_286 = arg1;
			local13.aClass2_286 = arg0.aClass2_39;
			arg0.aClass2_39.aClass2_285 = local13;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Lclient!du;")
	public Class2 method1261() {
		@Pc(13) Class2 local13 = this.aClass2_40;
		if (this.aClass2_39 == local13) {
			this.aClass2_40 = null;
			return null;
		} else {
			this.aClass2_40 = local13.aClass2_286;
			return local13;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Lclient!du;")
	public Class2 method1262() {
		@Pc(12) Class2 local12 = this.aClass2_39.aClass2_286;
		if (this.aClass2_39 == local12) {
			return null;
		} else {
			local12.method7657();
			return local12;
		}
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)Z")
	public boolean method1263() {
		return this.aClass2_39 == this.aClass2_39.aClass2_286;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(Z)Lclient!du;")
	public Class2 method1264() {
		@Pc(14) Class2 local14 = this.aClass2_39.aClass2_286;
		if (local14 == this.aClass2_39) {
			this.aClass2_40 = null;
			return null;
		} else {
			this.aClass2_40 = local14.aClass2_286;
			return local14;
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	public void method1265() {
		while (true) {
			@Pc(12) Class2 local12 = this.aClass2_39.aClass2_286;
			if (this.aClass2_39 == local12) {
				this.aClass2_40 = null;
				return;
			}
			local12.method7657();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)Lclient!du;")
	public Class2 method1266() {
		@Pc(13) Class2 local13 = this.aClass2_39.aClass2_285;
		if (this.aClass2_39 == local13) {
			this.aClass2_40 = null;
			return null;
		} else {
			this.aClass2_40 = local13.aClass2_285;
			return local13;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)I")
	public int method1267() {
		@Pc(5) int local5 = 0;
		for (@Pc(9) Class2 local9 = this.aClass2_39.aClass2_286; local9 != this.aClass2_39; local9 = local9.aClass2_286) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!du;)V")
	public void method1268(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_285 != null) {
			arg0.method7657();
		}
		arg0.aClass2_286 = this.aClass2_39.aClass2_286;
		arg0.aClass2_285 = this.aClass2_39;
		arg0.aClass2_285.aClass2_286 = arg0;
		arg0.aClass2_286.aClass2_285 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!du;B)V")
	public void method1269(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_285 != null) {
			arg0.method7657();
		}
		arg0.aClass2_285 = this.aClass2_39.aClass2_285;
		arg0.aClass2_286 = this.aClass2_39;
		arg0.aClass2_285.aClass2_286 = arg0;
		arg0.aClass2_286.aClass2_285 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!dc;B)V")
	public void method1270(@OriginalArg(0) Class70 arg0) {
		this.method1258(arg0, this.aClass2_39.aClass2_286);
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)Lclient!du;")
	public Class2 method1271() {
		@Pc(11) Class2 local11 = this.aClass2_40;
		if (this.aClass2_39 == local11) {
			this.aClass2_40 = null;
			return null;
		} else {
			this.aClass2_40 = local11.aClass2_285;
			return local11;
		}
	}
}
