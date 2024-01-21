import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class45 {

	@OriginalMember(owner = "client!l", name = "g", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "Lclient!lb;")
	private Class1 aClass1_137;

	@OriginalMember(owner = "client!l", name = "z", descriptor = "Lclient!lb;")
	private Class1 aClass1_138;

	@OriginalMember(owner = "client!l", name = "y", descriptor = "I")
	private int anInt2773 = 0;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "[Lclient!lb;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "I")
	private final int anInt2761;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V")
	public Class45(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt2761 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_216 = local23;
			local23.aClass1_215 = local23;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!lb;ZJ)V")
	public void method1981(@OriginalArg(0) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_216 != null) {
			arg0.method3056();
		}
		@Pc(28) Class1 local28 = this.aClass1Array1[(int) ((long) (this.anInt2761 - 1) & arg1)];
		arg0.aClass1_215 = local28;
		arg0.aLong158 = arg1;
		arg0.aClass1_216 = local28.aClass1_216;
		arg0.aClass1_216.aClass1_215 = arg0;
		arg0.aClass1_215.aClass1_216 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Lclient!lb;")
	public Class1 method1982() {
		this.anInt2773 = 0;
		return this.method1986();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)I")
	public int method1984() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2761; local7++) {
			@Pc(13) Class1 local13 = this.aClass1Array1[local7];
			@Pc(16) Class1 local16 = local13.aClass1_215;
			while (local13 != local16) {
				local16 = local16.aClass1_215;
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Lclient!lb;I)I")
	public int method1985(@OriginalArg(0) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2761; local14++) {
			@Pc(21) Class1 local21 = this.aClass1Array1[local14];
			for (@Pc(24) Class1 local24 = local21.aClass1_215; local24 != local21; local24 = local24.aClass1_215) {
				arg0[local7++] = local24;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)Lclient!lb;")
	public Class1 method1986() {
		@Pc(24) Class1 local24;
		if (this.anInt2773 > 0 && this.aClass1_138 != this.aClass1Array1[this.anInt2773 - 1]) {
			local24 = this.aClass1_138;
			this.aClass1_138 = local24.aClass1_215;
			return local24;
		}
		while (this.anInt2761 > this.anInt2773) {
			local24 = this.aClass1Array1[this.anInt2773++].aClass1_215;
			if (local24 != this.aClass1Array1[this.anInt2773 - 1]) {
				this.aClass1_138 = local24.aClass1_215;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(B)Lclient!lb;")
	public Class1 method1987() {
		if (this.aClass1_137 == null) {
			return null;
		}
		@Pc(29) Class1 local29 = this.aClass1Array1[(int) (this.aLong90 & (long) (this.anInt2761 - 1))];
		while (this.aClass1_137 != local29) {
			if (this.aLong90 == this.aClass1_137.aLong158) {
				@Pc(40) Class1 local40 = this.aClass1_137;
				this.aClass1_137 = this.aClass1_137.aClass1_215;
				return local40;
			}
			this.aClass1_137 = this.aClass1_137.aClass1_215;
		}
		this.aClass1_137 = null;
		return null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZJ)Lclient!lb;")
	public Class1 method1988(@OriginalArg(1) long arg0) {
		this.aLong90 = arg0;
		@Pc(14) Class1 local14 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt2761 - 1))];
		for (this.aClass1_137 = local14.aClass1_215; this.aClass1_137 != local14; this.aClass1_137 = this.aClass1_137.aClass1_215) {
			if (this.aClass1_137.aLong158 == arg0) {
				@Pc(32) Class1 local32 = this.aClass1_137;
				this.aClass1_137 = this.aClass1_137.aClass1_215;
				return local32;
			}
		}
		this.aClass1_137 = null;
		return null;
	}
}
