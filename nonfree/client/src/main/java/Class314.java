import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class314 {

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "Lclient!ge;")
	private Class2_Sub13 aClass2_Sub13_60;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "J")
	private long aLong238;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
	private final int anInt9333;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "[Lclient!ge;")
	private final Class2_Sub13[] aClass2_Sub13Array1;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(I)V")
	public Class314(@OriginalArg(0) int arg0) {
		this.anInt9333 = arg0;
		this.aClass2_Sub13Array1 = new Class2_Sub13[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub13 local20 = this.aClass2_Sub13Array1[local10] = new Class2_Sub13();
			local20.aClass2_Sub13_59 = local20;
			local20.aClass2_Sub13_58 = local20;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!ge;JI)V")
	public void method7749(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass2_Sub13_58 != null) {
			arg0.method7527();
		}
		@Pc(21) Class2_Sub13 local21 = this.aClass2_Sub13Array1[(int) (arg1 & (long) (this.anInt9333 - 1))];
		arg0.aClass2_Sub13_59 = local21;
		arg0.aClass2_Sub13_58 = local21.aClass2_Sub13_58;
		arg0.aClass2_Sub13_58.aClass2_Sub13_59 = arg0;
		arg0.aLong230 = arg1;
		arg0.aClass2_Sub13_59.aClass2_Sub13_58 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)Lclient!ge;")
	public Class2_Sub13 method7750() {
		if (this.aClass2_Sub13_60 == null) {
			return null;
		}
		@Pc(28) Class2_Sub13 local28 = this.aClass2_Sub13Array1[(int) ((long) (this.anInt9333 - 1) & this.aLong238)];
		while (this.aClass2_Sub13_60 != local28) {
			if (this.aClass2_Sub13_60.aLong230 == this.aLong238) {
				@Pc(40) Class2_Sub13 local40 = this.aClass2_Sub13_60;
				this.aClass2_Sub13_60 = this.aClass2_Sub13_60.aClass2_Sub13_59;
				return local40;
			}
			this.aClass2_Sub13_60 = this.aClass2_Sub13_60.aClass2_Sub13_59;
		}
		this.aClass2_Sub13_60 = null;
		return null;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IJ)Lclient!ge;")
	public Class2_Sub13 method7754(@OriginalArg(1) long arg0) {
		this.aLong238 = arg0;
		@Pc(20) Class2_Sub13 local20 = this.aClass2_Sub13Array1[(int) (arg0 & (long) (this.anInt9333 - 1))];
		for (this.aClass2_Sub13_60 = local20.aClass2_Sub13_59; this.aClass2_Sub13_60 != local20; this.aClass2_Sub13_60 = this.aClass2_Sub13_60.aClass2_Sub13_59) {
			if (arg0 == this.aClass2_Sub13_60.aLong230) {
				@Pc(41) Class2_Sub13 local41 = this.aClass2_Sub13_60;
				this.aClass2_Sub13_60 = this.aClass2_Sub13_60.aClass2_Sub13_59;
				return local41;
			}
		}
		this.aClass2_Sub13_60 = null;
		return null;
	}
}
