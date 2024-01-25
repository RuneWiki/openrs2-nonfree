import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class98 {

	@OriginalMember(owner = "client!go", name = "c", descriptor = "Lclient!ge;")
	private Class2_Sub2 aClass2_Sub2_17;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!go", name = "n", descriptor = "I")
	private final int anInt2681;

	@OriginalMember(owner = "client!go", name = "m", descriptor = "[Lclient!ge;")
	private final Class2_Sub2[] aClass2_Sub2Array1;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(I)V")
	public Class98(@OriginalArg(0) int arg0) {
		this.anInt2681 = arg0;
		this.aClass2_Sub2Array1 = new Class2_Sub2[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub2 local20 = this.aClass2_Sub2Array1[local10] = new Class2_Sub2();
			local20.aClass2_Sub2_58 = local20;
			local20.aClass2_Sub2_57 = local20;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(JLclient!ge;I)V")
	public void method1994(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub2 arg1) {
		if (arg1.aClass2_Sub2_57 != null) {
			arg1.method5934();
		}
		@Pc(21) Class2_Sub2 local21 = this.aClass2_Sub2Array1[(int) (arg0 & (long) (this.anInt2681 - 1))];
		arg1.aClass2_Sub2_58 = local21;
		arg1.aClass2_Sub2_57 = local21.aClass2_Sub2_57;
		arg1.aClass2_Sub2_57.aClass2_Sub2_58 = arg1;
		arg1.aLong223 = arg0;
		arg1.aClass2_Sub2_58.aClass2_Sub2_57 = arg1;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IJ)Lclient!ge;")
	public Class2_Sub2 method1995(@OriginalArg(1) long arg0) {
		this.aLong74 = arg0;
		@Pc(25) Class2_Sub2 local25 = this.aClass2_Sub2Array1[(int) ((long) (this.anInt2681 - 1) & arg0)];
		for (this.aClass2_Sub2_17 = local25.aClass2_Sub2_58; this.aClass2_Sub2_17 != local25; this.aClass2_Sub2_17 = this.aClass2_Sub2_17.aClass2_Sub2_58) {
			if (this.aClass2_Sub2_17.aLong223 == arg0) {
				@Pc(44) Class2_Sub2 local44 = this.aClass2_Sub2_17;
				this.aClass2_Sub2_17 = this.aClass2_Sub2_17.aClass2_Sub2_58;
				return local44;
			}
		}
		this.aClass2_Sub2_17 = null;
		return null;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Lclient!ge;")
	public Class2_Sub2 method1997() {
		if (this.aClass2_Sub2_17 == null) {
			return null;
		}
		@Pc(31) Class2_Sub2 local31 = this.aClass2_Sub2Array1[(int) ((long) (this.anInt2681 - 1) & this.aLong74)];
		while (local31 != this.aClass2_Sub2_17) {
			if (this.aLong74 == this.aClass2_Sub2_17.aLong223) {
				@Pc(43) Class2_Sub2 local43 = this.aClass2_Sub2_17;
				this.aClass2_Sub2_17 = this.aClass2_Sub2_17.aClass2_Sub2_58;
				return local43;
			}
			this.aClass2_Sub2_17 = this.aClass2_Sub2_17.aClass2_Sub2_58;
		}
		this.aClass2_Sub2_17 = null;
		return null;
	}
}
