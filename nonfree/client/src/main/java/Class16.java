import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class16 {

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!qb;")
	private final Class2_Sub2 aClass2_Sub2_21 = new Class2_Sub2();

	@OriginalMember(owner = "client!e", name = "u", descriptor = "Lclient!oc;")
	private final Class56 aClass56_1 = new Class56();

	@OriginalMember(owner = "client!e", name = "w", descriptor = "I")
	private int anInt657;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "I")
	private final int anInt656;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "Lclient!oe;")
	private final Class58 aClass58_20;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I)V")
	public Class16(@OriginalArg(0) int arg0) {
		this.anInt657 = arg0;
		this.anInt656 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass58_20 = new Class58(local19);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public void method485() {
		while (true) {
			@Pc(10) Class2_Sub2 local10 = this.aClass56_1.method1286();
			if (local10 == null) {
				this.anInt657 = this.anInt656;
				return;
			}
			local10.method1930();
			local10.method1935();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(JB)V")
	public void method486(@OriginalArg(0) long arg0) {
		@Pc(16) Class2_Sub2 local16 = (Class2_Sub2) this.aClass58_20.method1307(arg0);
		if (local16 != null) {
			local16.method1930();
			local16.method1935();
			this.anInt657++;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IJ)Lclient!qb;")
	public Class2_Sub2 method490(@OriginalArg(1) long arg0) {
		@Pc(17) Class2_Sub2 local17 = (Class2_Sub2) this.aClass58_20.method1307(arg0);
		if (local17 != null) {
			this.aClass56_1.method1287(local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!qb;IJ)V")
	public void method492(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt657 == 0) {
			@Pc(7) Class2_Sub2 local7 = this.aClass56_1.method1286();
			local7.method1930();
			local7.method1935();
			if (this.aClass2_Sub2_21 == local7) {
				local7 = this.aClass56_1.method1286();
				local7.method1930();
				local7.method1935();
			}
		} else {
			this.anInt657--;
		}
		this.aClass58_20.method1301(arg1, arg0);
		this.aClass56_1.method1287(arg0);
	}
}
