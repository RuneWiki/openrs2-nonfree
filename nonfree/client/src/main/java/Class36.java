import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class36 {

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "Lclient!ss;")
	private Class12 aClass12_10;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "Lclient!ss;")
	private final Class12 aClass12_9 = new Class12();

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 339)
	public Class36() {
		this.aClass12_9.aClass12_24 = this.aClass12_9;
		this.aClass12_9.aClass12_23 = this.aClass12_9;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Z", line = 4)
	public boolean method1416() {
		return this.aClass12_9.aClass12_24 == this.aClass12_9;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Lclient!ss;", line = 20)
	public Class12 method1417() {
		@Pc(15) Class12 local15 = this.aClass12_9.aClass12_24;
		if (local15 == this.aClass12_9) {
			this.aClass12_10 = null;
			return null;
		} else {
			this.aClass12_10 = local15.aClass12_24;
			return local15;
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V", line = 41)
	public void method1418() {
		while (true) {
			@Pc(9) Class12 local9 = this.aClass12_9.aClass12_24;
			if (this.aClass12_9 == local9) {
				this.aClass12_10 = null;
				return;
			}
			local9.method5685();
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Lclient!ss;", line = 64)
	public Class12 method1419() {
		@Pc(7) Class12 local7 = this.aClass12_9.aClass12_23;
		if (this.aClass12_9 == local7) {
			this.aClass12_10 = null;
			return null;
		} else {
			this.aClass12_10 = local7.aClass12_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!ss;)V", line = 85)
	public void method1420(@OriginalArg(1) Class12 arg0) {
		if (arg0.aClass12_23 != null) {
			arg0.method5685();
		}
		arg0.aClass12_23 = this.aClass12_9.aClass12_23;
		arg0.aClass12_24 = this.aClass12_9;
		arg0.aClass12_23.aClass12_24 = arg0;
		arg0.aClass12_24.aClass12_23 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)I", line = 107)
	public int method1421() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class12 local16 = this.aClass12_9.aClass12_24; local16 != this.aClass12_9; local16 = local16.aClass12_24) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)Lclient!ss;", line = 128)
	public Class12 method1422() {
		@Pc(6) Class12 local6 = this.aClass12_10;
		if (this.aClass12_9 == local6) {
			this.aClass12_10 = null;
			return null;
		} else {
			this.aClass12_10 = local6.aClass12_24;
			return local6;
		}
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(B)Lclient!ss;", line = 308)
	public Class12 method1426() {
		@Pc(13) Class12 local13 = this.aClass12_9.aClass12_24;
		if (this.aClass12_9 == local13) {
			return null;
		} else {
			local13.method5685();
			return local13;
		}
	}
}
