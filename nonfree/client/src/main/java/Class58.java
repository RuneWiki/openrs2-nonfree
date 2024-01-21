import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class58 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Lclient!nj;")
	private Class2 aClass2_103;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "J")
	private long aLong81;

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "Lclient!nj;")
	private Class2 aClass2_104;

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
	private int anInt2432 = 0;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "[Lclient!nj;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
	private final int anInt2431;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V")
	public Class58(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt2431 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_209 = local23;
			local23.aClass2_210 = local23;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IJ)Lclient!nj;")
	public Class2 method1704(@OriginalArg(1) long arg0) {
		this.aLong81 = arg0;
		@Pc(18) Class2 local18 = this.aClass2Array1[(int) ((long) (this.anInt2431 - 1) & arg0)];
		for (this.aClass2_103 = local18.aClass2_209; this.aClass2_103 != local18; this.aClass2_103 = this.aClass2_103.aClass2_209) {
			if (this.aClass2_103.aLong148 == arg0) {
				@Pc(32) Class2 local32 = this.aClass2_103;
				this.aClass2_103 = this.aClass2_103.aClass2_209;
				return local32;
			}
		}
		this.aClass2_103 = null;
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Lclient!nj;")
	public Class2 method1705() {
		@Pc(22) Class2 local22;
		if (this.anInt2432 > 0 && this.aClass2_104 != this.aClass2Array1[this.anInt2432 - 1]) {
			local22 = this.aClass2_104;
			this.aClass2_104 = local22.aClass2_209;
			return local22;
		}
		while (this.anInt2432 < this.anInt2431) {
			local22 = this.aClass2Array1[this.anInt2432++].aClass2_209;
			if (local22 != this.aClass2Array1[this.anInt2432 - 1]) {
				this.aClass2_104 = local22.aClass2_209;
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!nj;")
	public Class2 method1706() {
		if (this.aClass2_103 == null) {
			return null;
		}
		@Pc(26) Class2 local26 = this.aClass2Array1[(int) (this.aLong81 & (long) (this.anInt2431 - 1))];
		while (this.aClass2_103 != local26) {
			if (this.aLong81 == this.aClass2_103.aLong148) {
				@Pc(37) Class2 local37 = this.aClass2_103;
				this.aClass2_103 = this.aClass2_103.aClass2_209;
				return local37;
			}
			this.aClass2_103 = this.aClass2_103.aClass2_209;
		}
		this.aClass2_103 = null;
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!nj;JI)V")
	public void method1708(@OriginalArg(0) Class2 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass2_210 != null) {
			arg0.method3183();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt2431 - 1) & arg1)];
		arg0.aLong148 = arg1;
		arg0.aClass2_209 = local21;
		arg0.aClass2_210 = local21.aClass2_210;
		arg0.aClass2_210.aClass2_209 = arg0;
		arg0.aClass2_209.aClass2_210 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Lclient!nj;")
	public Class2 method1709() {
		this.anInt2432 = 0;
		return this.method1705();
	}
}
