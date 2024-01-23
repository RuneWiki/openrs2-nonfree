import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class2_Sub3_Sub26 extends Class2_Sub3 {

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
	private int anInt3807;

	@OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
	public int anInt3811;

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "Lclient!ui;")
	private Class103 aClass103_19;

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
	public int anInt3813;

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "Lclient!qe;")
	private Class78 aClass78_673 = Static84.aClass78_412;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I")
	public int method2993(@OriginalArg(1) int arg0) {
		if (this.aClass103_19 == null) {
			return this.anInt3807;
		} else {
			@Pc(17) Class2_Sub7 local17 = (Class2_Sub7) this.aClass103_19.method3659((long) arg0);
			return local17 == null ? this.anInt3807 : local17.anInt534;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!nh;B)V")
	private void method2994(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt3813 = arg1.method2122();
		} else if (arg0 == 2) {
			this.anInt3811 = arg1.method2122();
		} else if (arg0 == 3) {
			this.aClass78_673 = arg1.method2115();
		} else if (arg0 == 4) {
			this.anInt3807 = arg1.method2133();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(39) int local39 = arg1.method2095();
			this.aClass103_19 = new Class103(Static185.method3424(local39));
			for (@Pc(49) int local49 = 0; local49 < local39; local49++) {
				@Pc(54) int local54 = arg1.method2133();
				@Pc(64) Class2 local64;
				if (arg0 == 5) {
					local64 = new Class2_Sub15(arg1.method2115());
				} else {
					local64 = new Class2_Sub7(arg1.method2133());
				}
				this.aClass103_19.method3665((long) local54, local64);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)Lclient!qe;")
	public Class78 method2995(@OriginalArg(0) int arg0) {
		if (this.aClass103_19 == null) {
			return this.aClass78_673;
		} else {
			@Pc(17) Class2_Sub15 local17 = (Class2_Sub15) this.aClass103_19.method3659((long) arg0);
			return local17 == null ? this.aClass78_673 : local17.aClass78_305;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!nh;I)V")
	public void method2997(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2122();
			if (local7 == 0) {
				return;
			}
			this.method2994(local7, arg0);
		}
	}
}
