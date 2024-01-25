import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class139 {

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "Lclient!mt;")
	private final Class162 aClass162_8 = new Class162();

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
	private final int anInt3509;

	@OriginalMember(owner = "client!ku", name = "s", descriptor = "I")
	private int anInt3524;

	@OriginalMember(owner = "client!ku", name = "u", descriptor = "Lclient!cp;")
	private final Class44 aClass44_20;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(I)V")
	public Class139(@OriginalArg(0) int arg0) {
		this.anInt3509 = arg0;
		this.anInt3524 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass44_20 = new Class44(local14);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)I")
	public int method3069() {
		return this.anInt3509;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
	public void method3070(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method3078(arg1, arg0);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	public void method3072() {
		for (@Pc(16) Class3_Sub7_Sub4 local16 = (Class3_Sub7_Sub4) this.aClass162_8.method3734(); local16 != null; local16 = (Class3_Sub7_Sub4) this.aClass162_8.method3730()) {
			if (local16.method2647()) {
				local16.method5700();
				local16.method5673();
				this.anInt3524 += local16.anInt2996;
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method3074() {
		@Pc(16) Class3_Sub7_Sub4 local16 = (Class3_Sub7_Sub4) this.aClass44_20.method949();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method2648();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class3_Sub7_Sub4 local28 = local16;
			local16 = (Class3_Sub7_Sub4) this.aClass44_20.method949();
			local28.method5700();
			local28.method5673();
			this.anInt3524 += local16.anInt2996;
		}
		return null;
	}

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "(B)V")
	public void method3075() {
		this.aClass162_8.method3733();
		this.aClass44_20.method952();
		this.anInt3524 = this.anInt3509;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method3076(@OriginalArg(1) long arg0) {
		@Pc(14) Class3_Sub7_Sub4 local14 = (Class3_Sub7_Sub4) this.aClass44_20.method942(arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Object local22 = local14.method2648();
		if (local22 == null) {
			local14.method5700();
			local14.method5673();
			this.anInt3524 += local14.anInt2996;
			return null;
		}
		if (local14.method2647()) {
			@Pc(60) Class3_Sub7_Sub4_Sub2 local60 = new Class3_Sub7_Sub4_Sub2(local22, local14.anInt2996);
			this.aClass44_20.method948(local14.aLong240, local60);
			this.aClass162_8.method3729(local60);
			local60.aLong231 = 0L;
			local14.method5700();
			local14.method5673();
		} else {
			this.aClass162_8.method3729(local14);
			local14.aLong231 = 0L;
		}
		return local22;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(IJ)V")
	private void method3077(@OriginalArg(1) long arg0) {
		@Pc(17) Class3_Sub7_Sub4 local17 = (Class3_Sub7_Sub4) this.aClass44_20.method942(arg0);
		this.method3082(local17);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(JIILjava/lang/Object;)V")
	private void method3078(@OriginalArg(0) long arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt3509 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3077(arg0);
		this.anInt3524--;
		while (this.anInt3524 < 0) {
			@Pc(38) Class3_Sub7_Sub4 local38 = (Class3_Sub7_Sub4) this.aClass162_8.method3735();
			this.method3082(local38);
		}
		@Pc(51) Class3_Sub7_Sub4_Sub2 local51 = new Class3_Sub7_Sub4_Sub2(arg1, 1);
		this.aClass44_20.method948(arg0, local51);
		this.aClass162_8.method3729(local51);
		local51.aLong231 = 0L;
	}

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "(B)I")
	public int method3079() {
		@Pc(13) int local13 = 0;
		for (@Pc(19) Class3_Sub7_Sub4 local19 = (Class3_Sub7_Sub4) this.aClass162_8.method3734(); local19 != null; local19 = (Class3_Sub7_Sub4) this.aClass162_8.method3730()) {
			if (!local19.method2647()) {
				local13++;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method3080() {
		@Pc(16) Class3_Sub7_Sub4 local16 = (Class3_Sub7_Sub4) this.aClass44_20.method950();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method2648();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class3_Sub7_Sub4 local26 = local16;
			local16 = (Class3_Sub7_Sub4) this.aClass44_20.method949();
			local26.method5700();
			local26.method5673();
			this.anInt3524 += local16.anInt2996;
		}
		return null;
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)I")
	public int method3081() {
		return this.anInt3524;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!er;B)V")
	private void method3082(@OriginalArg(0) Class3_Sub7_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method5700();
			arg0.method5673();
			this.anInt3524 += arg0.anInt2996;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)V")
	public void method3083(@OriginalArg(1) int arg0) {
		if (Static164.aClass175_1 == null) {
			return;
		}
		for (@Pc(13) Class3_Sub7_Sub4 local13 = (Class3_Sub7_Sub4) this.aClass162_8.method3734(); local13 != null; local13 = (Class3_Sub7_Sub4) this.aClass162_8.method3730()) {
			if (local13.method2647()) {
				if (local13.method2648() == null) {
					local13.method5700();
					local13.method5673();
					this.anInt3524++;
				}
			} else if ((long) arg0 < ++local13.aLong231) {
				@Pc(59) Class3_Sub7_Sub4 local59 = Static164.aClass175_1.method4049(local13);
				this.aClass44_20.method948(local13.aLong240, local59);
				Static201.method3138(local13, local59);
				local13.method5700();
				local13.method5673();
			}
		}
	}
}
