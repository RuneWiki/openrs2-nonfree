import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class58 {

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "Lclient!je;")
	private Class1 aClass1_65;

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "J")
	private long aLong61;

	@OriginalMember(owner = "client!pc", name = "H", descriptor = "Lclient!je;")
	private Class1 aClass1_66;

	@OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
	private int anInt1921 = 0;

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
	private final int anInt1916;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "[Lclient!je;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I)V")
	public Class58(@OriginalArg(0) int arg0) {
		this.anInt1916 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_105 = local23;
			local23.aClass1_106 = local23;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)Lclient!je;")
	public Class1 method1373() {
		this.anInt1921 = 0;
		return this.method1379();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BJLclient!je;)V")
	public void method1378(@OriginalArg(1) long arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_105 != null) {
			arg1.method2076();
		}
		@Pc(27) Class1 local27 = this.aClass1Array1[(int) ((long) (this.anInt1916 - 1) & arg0)];
		arg1.aLong87 = arg0;
		arg1.aClass1_105 = local27.aClass1_105;
		arg1.aClass1_106 = local27;
		arg1.aClass1_105.aClass1_106 = arg1;
		arg1.aClass1_106.aClass1_105 = arg1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Lclient!je;")
	public Class1 method1379() {
		@Pc(19) Class1 local19;
		if (this.anInt1921 > 0 && this.aClass1_66 != this.aClass1Array1[this.anInt1921 - 1]) {
			local19 = this.aClass1_66;
			this.aClass1_66 = local19.aClass1_106;
			return local19;
		}
		while (this.anInt1916 > this.anInt1921) {
			local19 = this.aClass1Array1[this.anInt1921++].aClass1_106;
			if (this.aClass1Array1[this.anInt1921 - 1] != local19) {
				this.aClass1_66 = local19.aClass1_106;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)Lclient!je;")
	public Class1 method1380(@OriginalArg(1) long arg0) {
		this.aLong61 = arg0;
		@Pc(14) Class1 local14 = this.aClass1Array1[(int) ((long) (this.anInt1916 - 1) & arg0)];
		for (this.aClass1_65 = local14.aClass1_106; this.aClass1_65 != local14; this.aClass1_65 = this.aClass1_65.aClass1_106) {
			if (this.aClass1_65.aLong87 == arg0) {
				@Pc(36) Class1 local36 = this.aClass1_65;
				this.aClass1_65 = this.aClass1_65.aClass1_106;
				return local36;
			}
		}
		this.aClass1_65 = null;
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)Lclient!je;")
	public Class1 method1381() {
		if (this.aClass1_65 == null) {
			return null;
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (this.aLong61 & (long) (this.anInt1916 - 1))];
		while (local21 != this.aClass1_65) {
			if (this.aClass1_65.aLong87 == this.aLong61) {
				@Pc(37) Class1 local37 = this.aClass1_65;
				this.aClass1_65 = this.aClass1_65.aClass1_106;
				return local37;
			}
			this.aClass1_65 = this.aClass1_65.aClass1_106;
		}
		this.aClass1_65 = null;
		return null;
	}
}
