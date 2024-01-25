import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class39 {

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "[I")
	public static final int[] anIntArray86 = new int[4096];

	@OriginalMember(owner = "client!cp", name = "q", descriptor = "Lclient!km;")
	private Class32 aClass32_6;

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "Lclient!km;")
	private final Class32 aClass32_5 = new Class32();

	static {
		for (@Pc(32) int local32 = 0; local32 < 4096; local32++) {
			anIntArray86[local32] = Static314.method5475(local32);
		}
	}

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
	public Class39() {
		this.aClass32_5.aClass32_23 = this.aClass32_5;
		this.aClass32_5.aClass32_24 = this.aClass32_5;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)Z")
	public boolean method798() {
		return this.aClass32_5 == this.aClass32_5.aClass32_24;
	}

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "(B)V")
	public void method802() {
		while (true) {
			@Pc(10) Class32 local10 = this.aClass32_5.aClass32_24;
			if (this.aClass32_5 == local10) {
				this.aClass32_6 = null;
				return;
			}
			local10.method5578();
		}
	}

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "(B)Lclient!km;")
	public Class32 method804() {
		@Pc(7) Class32 local7 = this.aClass32_5.aClass32_23;
		if (local7 == this.aClass32_5) {
			this.aClass32_6 = null;
			return null;
		} else {
			this.aClass32_6 = local7.aClass32_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Lclient!km;")
	public Class32 method805() {
		@Pc(12) Class32 local12 = this.aClass32_5.aClass32_24;
		if (local12 == this.aClass32_5) {
			return null;
		} else {
			local12.method5578();
			return local12;
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)Lclient!km;")
	public Class32 method806() {
		@Pc(7) Class32 local7 = this.aClass32_5.aClass32_24;
		if (this.aClass32_5 == local7) {
			this.aClass32_6 = null;
			return null;
		} else {
			this.aClass32_6 = local7.aClass32_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)I")
	public int method807() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class32 local16 = this.aClass32_5.aClass32_24;
		while (this.aClass32_5 != local16) {
			local16 = local16.aClass32_24;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)Lclient!km;")
	public Class32 method808() {
		@Pc(6) Class32 local6 = this.aClass32_6;
		if (this.aClass32_5 == local6) {
			this.aClass32_6 = null;
			return null;
		} else {
			this.aClass32_6 = local6.aClass32_24;
			return local6;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!km;I)V")
	public void method809(@OriginalArg(0) Class32 arg0) {
		if (arg0.aClass32_23 != null) {
			arg0.method5578();
		}
		arg0.aClass32_23 = this.aClass32_5.aClass32_23;
		arg0.aClass32_24 = this.aClass32_5;
		arg0.aClass32_23.aClass32_24 = arg0;
		arg0.aClass32_24.aClass32_23 = arg0;
	}
}
