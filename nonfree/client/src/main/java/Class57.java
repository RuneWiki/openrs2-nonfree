import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class57 {

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Lclient!cd;")
	private Class2 aClass2_79;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "J")
	private long aLong68;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Lclient!cd;")
	private Class2 aClass2_80;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	private int anInt2355 = 0;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "[Lclient!cd;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	private final int anInt2350;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V")
	public Class57(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt2350 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_96 = local23;
			local23.aClass2_95 = local23;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(JZLclient!cd;)V")
	public void method1671(@OriginalArg(0) long arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_96 != null) {
			arg1.method2045();
		}
		@Pc(17) Class2 local17 = this.aClass2Array1[(int) ((long) (this.anInt2350 - 1) & arg0)];
		arg1.aLong82 = arg0;
		arg1.aClass2_96 = local17.aClass2_96;
		arg1.aClass2_95 = local17;
		arg1.aClass2_96.aClass2_95 = arg1;
		arg1.aClass2_95.aClass2_96 = arg1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)Lclient!cd;")
	public Class2 method1673() {
		this.anInt2355 = 0;
		return this.method1674();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)Lclient!cd;")
	private Class2 method1674() {
		@Pc(21) Class2 local21;
		if (this.anInt2355 > 0 && this.aClass2_80 != this.aClass2Array1[this.anInt2355 - 1]) {
			local21 = this.aClass2_80;
			this.aClass2_80 = local21.aClass2_95;
			return local21;
		}
		while (this.anInt2355 < this.anInt2350) {
			local21 = this.aClass2Array1[this.anInt2355++].aClass2_95;
			if (this.aClass2Array1[this.anInt2355 - 1] != local21) {
				this.aClass2_80 = local21.aClass2_95;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)Lclient!cd;")
	public Class2 method1676() {
		if (this.aClass2_79 == null) {
			return null;
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt2350 - 1) & this.aLong68)];
		while (this.aClass2_79 != local21) {
			if (this.aClass2_79.aLong82 == this.aLong68) {
				@Pc(44) Class2 local44 = this.aClass2_79;
				this.aClass2_79 = this.aClass2_79.aClass2_95;
				return local44;
			}
			this.aClass2_79 = this.aClass2_79.aClass2_95;
		}
		this.aClass2_79 = null;
		return null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(JI)Lclient!cd;")
	public Class2 method1678(@OriginalArg(0) long arg0) {
		this.aLong68 = arg0;
		@Pc(18) Class2 local18 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt2350 - 1))];
		for (this.aClass2_79 = local18.aClass2_95; this.aClass2_79 != local18; this.aClass2_79 = this.aClass2_79.aClass2_95) {
			if (this.aClass2_79.aLong82 == arg0) {
				@Pc(37) Class2 local37 = this.aClass2_79;
				this.aClass2_79 = this.aClass2_79.aClass2_95;
				return local37;
			}
		}
		this.aClass2_79 = null;
		return null;
	}
}
