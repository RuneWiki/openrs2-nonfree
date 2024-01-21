import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class97 {

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "Lclient!md;")
	private Class1 aClass1_209;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "J")
	private long aLong245;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Lclient!md;")
	private Class1 aClass1_210;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	private int anInt4459 = 0;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	private final int anInt4452;

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "[Lclient!md;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class97(@OriginalArg(0) int arg0) {
		this.anInt4452 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_214 = local23;
			local23.aClass1_213 = local23;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Lclient!md;")
	public Class1 method3372() {
		this.anInt4459 = 0;
		return this.method3377();
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lclient!md;")
	public Class1 method3373() {
		if (this.aClass1_209 == null) {
			return null;
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) (this.aLong245 & (long) (this.anInt4452 - 1))];
		while (this.aClass1_209 != local21) {
			if (this.aLong245 == this.aClass1_209.aLong251) {
				@Pc(36) Class1 local36 = this.aClass1_209;
				this.aClass1_209 = this.aClass1_209.aClass1_213;
				return local36;
			}
			this.aClass1_209 = this.aClass1_209.aClass1_213;
		}
		this.aClass1_209 = null;
		return null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLclient!md;J)V")
	public void method3374(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_214 != null) {
			arg0.method3414();
		}
		@Pc(17) Class1 local17 = this.aClass1Array1[(int) ((long) (this.anInt4452 - 1) & arg1)];
		arg0.aLong251 = arg1;
		arg0.aClass1_213 = local17;
		arg0.aClass1_214 = local17.aClass1_214;
		arg0.aClass1_214.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_214 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(JI)Lclient!md;")
	public Class1 method3375(@OriginalArg(0) long arg0) {
		this.aLong245 = arg0;
		@Pc(20) Class1 local20 = this.aClass1Array1[(int) ((long) (this.anInt4452 - 1) & arg0)];
		for (this.aClass1_209 = local20.aClass1_213; this.aClass1_209 != local20; this.aClass1_209 = this.aClass1_209.aClass1_213) {
			if (this.aClass1_209.aLong251 == arg0) {
				@Pc(38) Class1 local38 = this.aClass1_209;
				this.aClass1_209 = this.aClass1_209.aClass1_213;
				return local38;
			}
		}
		this.aClass1_209 = null;
		return null;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Lclient!md;")
	public Class1 method3377() {
		@Pc(22) Class1 local22;
		if (this.anInt4459 > 0 && this.aClass1Array1[this.anInt4459 - 1] != this.aClass1_210) {
			local22 = this.aClass1_210;
			this.aClass1_210 = local22.aClass1_213;
			return local22;
		}
		while (this.anInt4459 < this.anInt4452) {
			local22 = this.aClass1Array1[this.anInt4459++].aClass1_213;
			if (this.aClass1Array1[this.anInt4459 - 1] != local22) {
				this.aClass1_210 = local22.aClass1_213;
				return local22;
			}
		}
		return null;
	}
}
