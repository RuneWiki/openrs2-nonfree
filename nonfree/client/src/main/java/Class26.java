import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class26 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Lclient!fs;")
	private Class2_Sub11 aClass2_Sub11_1;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	private final int anInt595;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "[Lclient!fs;")
	private final Class2_Sub11[] aClass2_Sub11Array1;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I)V")
	public Class26(@OriginalArg(0) int arg0) {
		this.anInt595 = arg0;
		this.aClass2_Sub11Array1 = new Class2_Sub11[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub11 local20 = this.aClass2_Sub11Array1[local10] = new Class2_Sub11();
			local20.aClass2_Sub11_61 = local20;
			local20.aClass2_Sub11_62 = local20;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IJ)Lclient!fs;")
	public Class2_Sub11 method799(@OriginalArg(1) long arg0) {
		this.aLong18 = arg0;
		@Pc(25) Class2_Sub11 local25 = this.aClass2_Sub11Array1[(int) ((long) (this.anInt595 - 1) & arg0)];
		for (this.aClass2_Sub11_1 = local25.aClass2_Sub11_62; this.aClass2_Sub11_1 != local25; this.aClass2_Sub11_1 = this.aClass2_Sub11_1.aClass2_Sub11_62) {
			if (arg0 == this.aClass2_Sub11_1.aLong212) {
				@Pc(40) Class2_Sub11 local40 = this.aClass2_Sub11_1;
				this.aClass2_Sub11_1 = this.aClass2_Sub11_1.aClass2_Sub11_62;
				return local40;
			}
		}
		this.aClass2_Sub11_1 = null;
		return null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Lclient!fs;")
	public Class2_Sub11 method800() {
		if (this.aClass2_Sub11_1 == null) {
			return null;
		}
		@Pc(29) Class2_Sub11 local29 = this.aClass2_Sub11Array1[(int) ((long) (this.anInt595 - 1) & this.aLong18)];
		while (this.aClass2_Sub11_1 != local29) {
			if (this.aLong18 == this.aClass2_Sub11_1.aLong212) {
				@Pc(41) Class2_Sub11 local41 = this.aClass2_Sub11_1;
				this.aClass2_Sub11_1 = this.aClass2_Sub11_1.aClass2_Sub11_62;
				return local41;
			}
			this.aClass2_Sub11_1 = this.aClass2_Sub11_1.aClass2_Sub11_62;
		}
		this.aClass2_Sub11_1 = null;
		return null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!fs;IJ)V")
	public void method801(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_Sub11_61 != null) {
			arg0.method5914();
		}
		@Pc(28) Class2_Sub11 local28 = this.aClass2_Sub11Array1[(int) ((long) (this.anInt595 - 1) & arg1)];
		arg0.aClass2_Sub11_62 = local28;
		arg0.aClass2_Sub11_61 = local28.aClass2_Sub11_61;
		arg0.aClass2_Sub11_61.aClass2_Sub11_62 = arg0;
		arg0.aLong212 = arg1;
		arg0.aClass2_Sub11_62.aClass2_Sub11_61 = arg0;
	}
}
