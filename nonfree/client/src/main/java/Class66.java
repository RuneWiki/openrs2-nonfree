import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class66 {

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "Lclient!bfa;")
	private Class19 aClass19_10;

	@OriginalMember(owner = "client!dda", name = "m", descriptor = "Lclient!bfa;")
	private final Class19 aClass19_9 = new Class19();

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "()V")
	public Class66() {
		this.aClass19_9.aClass19_68 = this.aClass19_9;
		this.aClass19_9.aClass19_67 = this.aClass19_9;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILclient!bfa;)V")
	public void method1375(@OriginalArg(1) Class19 arg0) {
		if (arg0.aClass19_67 != null) {
			arg0.method9359();
		}
		arg0.aClass19_68 = this.aClass19_9;
		arg0.aClass19_67 = this.aClass19_9.aClass19_67;
		arg0.aClass19_67.aClass19_68 = arg0;
		arg0.aClass19_68.aClass19_67 = arg0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)Lclient!bfa;")
	public Class19 method1376() {
		@Pc(7) Class19 local7 = this.aClass19_9.aClass19_68;
		if (this.aClass19_9 == local7) {
			return null;
		} else {
			local7.method9359();
			return local7;
		}
	}

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "(I)Lclient!bfa;")
	public Class19 method1377() {
		@Pc(14) Class19 local14 = this.aClass19_9.aClass19_67;
		if (this.aClass19_9 == local14) {
			this.aClass19_10 = null;
			return null;
		} else {
			this.aClass19_10 = local14.aClass19_67;
			return local14;
		}
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(I)I")
	public int method1378() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class19 local11 = this.aClass19_9.aClass19_68; local11 != this.aClass19_9; local11 = local11.aClass19_68) {
			local7++;
		}
		return -43 < -94 ? 83 : local7;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)V")
	public void method1379() {
		while (true) {
			@Pc(5) Class19 local5 = this.aClass19_9.aClass19_68;
			if (this.aClass19_9 == local5) {
				this.aClass19_10 = null;
				return;
			}
			local5.method9359();
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)Lclient!bfa;")
	public Class19 method1380() {
		@Pc(13) Class19 local13 = this.aClass19_10;
		if (this.aClass19_9 == local13) {
			this.aClass19_10 = null;
			return null;
		} else {
			this.aClass19_10 = local13.aClass19_68;
			return local13;
		}
	}

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "(I)Lclient!bfa;")
	public Class19 method1381() {
		@Pc(7) Class19 local7 = this.aClass19_9.aClass19_68;
		if (this.aClass19_9 == local7) {
			this.aClass19_10 = null;
			return null;
		} else {
			this.aClass19_10 = local7.aClass19_68;
			return local7;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)Z")
	public boolean method1382() {
		return this.aClass19_9 == this.aClass19_9.aClass19_68;
	}
}
