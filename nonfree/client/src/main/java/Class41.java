import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class41 {

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "J")
	private long aLong53;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "Lclient!o;")
	private Class2 aClass2_57;

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "Lclient!o;")
	private Class2 aClass2_58;

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
	private int anInt1793 = 0;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
	private final int anInt1784;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "[Lclient!o;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
	public Class41(@OriginalArg(0) int arg0) {
		this.anInt1784 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_115 = local23;
			local23.aClass2_116 = local23;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BJ)Lclient!o;")
	public Class2 method1056(@OriginalArg(1) long arg0) {
		this.aLong53 = arg0;
		@Pc(26) Class2 local26 = this.aClass2Array1[(int) ((long) (this.anInt1784 - 1) & arg0)];
		for (this.aClass2_57 = local26.aClass2_115; this.aClass2_57 != local26; this.aClass2_57 = this.aClass2_57.aClass2_115) {
			if (arg0 == this.aClass2_57.aLong91) {
				@Pc(44) Class2 local44 = this.aClass2_57;
				this.aClass2_57 = this.aClass2_57.aClass2_115;
				return local44;
			}
		}
		this.aClass2_57 = null;
		return null;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)Lclient!o;")
	public Class2 method1058() {
		@Pc(30) Class2 local30;
		if (this.anInt1793 > 0 && this.aClass2_58 != this.aClass2Array1[this.anInt1793 - 1]) {
			local30 = this.aClass2_58;
			this.aClass2_58 = local30.aClass2_115;
			return local30;
		}
		while (this.anInt1784 > this.anInt1793) {
			local30 = this.aClass2Array1[this.anInt1793++].aClass2_115;
			if (this.aClass2Array1[this.anInt1793 - 1] != local30) {
				this.aClass2_58 = local30.aClass2_115;
				return local30;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)Lclient!o;")
	public Class2 method1060() {
		if (this.aClass2_57 == null) {
			return null;
		}
		@Pc(26) Class2 local26 = this.aClass2Array1[(int) (this.aLong53 & (long) (this.anInt1784 - 1))];
		while (local26 != this.aClass2_57) {
			if (this.aLong53 == this.aClass2_57.aLong91) {
				@Pc(41) Class2 local41 = this.aClass2_57;
				this.aClass2_57 = this.aClass2_57.aClass2_115;
				return local41;
			}
			this.aClass2_57 = this.aClass2_57.aClass2_115;
		}
		this.aClass2_57 = null;
		return null;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)Lclient!o;")
	public Class2 method1061() {
		this.anInt1793 = 0;
		return this.method1058();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!o;JZ)V")
	public void method1063(@OriginalArg(0) Class2 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass2_116 != null) {
			arg0.method1961();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (arg1 & (long) (this.anInt1784 - 1))];
		arg0.aClass2_116 = local21.aClass2_116;
		arg0.aClass2_115 = local21;
		arg0.aLong91 = arg1;
		arg0.aClass2_116.aClass2_115 = arg0;
		arg0.aClass2_115.aClass2_116 = arg0;
	}
}
