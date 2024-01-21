import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class70 {

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "Lclient!ue;")
	private Class1 aClass1_111;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "J")
	private long aLong92;

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "Lclient!ue;")
	private Class1 aClass1_112;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	private int anInt2807 = 0;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "[Lclient!ue;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
	private final int anInt2799;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I)V")
	public Class70(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt2799 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_120 = local23;
			local23.aClass1_119 = local23;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!ue;J)V")
	public void method1955(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_120 != null) {
			arg0.method2128();
		}
		@Pc(29) Class1 local29 = this.aClass1Array1[(int) (arg1 & (long) (this.anInt2799 - 1))];
		arg0.aClass1_119 = local29;
		arg0.aClass1_120 = local29.aClass1_120;
		arg0.aLong98 = arg1;
		arg0.aClass1_120.aClass1_119 = arg0;
		arg0.aClass1_119.aClass1_120 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)Lclient!ue;")
	public Class1 method1956() {
		@Pc(30) Class1 local30;
		if (this.anInt2807 > 0 && this.aClass1_112 != this.aClass1Array1[this.anInt2807 - 1]) {
			local30 = this.aClass1_112;
			this.aClass1_112 = local30.aClass1_119;
			return local30;
		}
		while (this.anInt2807 < this.anInt2799) {
			local30 = this.aClass1Array1[this.anInt2807++].aClass1_119;
			if (local30 != this.aClass1Array1[this.anInt2807 - 1]) {
				this.aClass1_112 = local30.aClass1_119;
				return local30;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)Lclient!ue;")
	public Class1 method1958() {
		this.anInt2807 = 0;
		return this.method1956();
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IJ)Lclient!ue;")
	public Class1 method1961(@OriginalArg(1) long arg0) {
		this.aLong92 = arg0;
		@Pc(19) Class1 local19 = this.aClass1Array1[(int) ((long) (this.anInt2799 - 1) & arg0)];
		for (this.aClass1_111 = local19.aClass1_119; this.aClass1_111 != local19; this.aClass1_111 = this.aClass1_111.aClass1_119) {
			if (this.aClass1_111.aLong98 == arg0) {
				@Pc(41) Class1 local41 = this.aClass1_111;
				this.aClass1_111 = this.aClass1_111.aClass1_119;
				return local41;
			}
		}
		this.aClass1_111 = null;
		return null;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)Lclient!ue;")
	public Class1 method1963() {
		if (this.aClass1_111 == null) {
			return null;
		}
		@Pc(26) Class1 local26 = this.aClass1Array1[(int) (this.aLong92 & (long) (this.anInt2799 - 1))];
		while (local26 != this.aClass1_111) {
			if (this.aLong92 == this.aClass1_111.aLong98) {
				@Pc(41) Class1 local41 = this.aClass1_111;
				this.aClass1_111 = this.aClass1_111.aClass1_119;
				return local41;
			}
			this.aClass1_111 = this.aClass1_111.aClass1_119;
		}
		this.aClass1_111 = null;
		return null;
	}
}
