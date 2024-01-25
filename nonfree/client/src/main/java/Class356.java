import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class356 {

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "Lclient!jca;")
	private Class1 aClass1_277;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "J")
	private long aLong417;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "Lclient!jca;")
	private Class1 aClass1_278;

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
	private int anInt9433 = 0;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "[Lclient!jca;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
	public final int anInt9425;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(I)V")
	public Class356(@OriginalArg(0) int arg0) {
		this.aClass1Array1 = new Class1[arg0];
		this.anInt9425 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_285 = local23;
			local23.aClass1_286 = local23;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[Lclient!jca;)I")
	public int method7791(@OriginalArg(1) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt9425; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			for (@Pc(19) Class1 local19 = local16.aClass1_286; local19 != local16; local19 = local19.aClass1_286) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)Lclient!jca;")
	public Class1 method7792() {
		this.anInt9433 = 0;
		return this.method7795();
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)I")
	public int method7793() {
		return this.anInt9425;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)Lclient!jca;")
	public Class1 method7795() {
		@Pc(27) Class1 local27;
		if (this.anInt9433 > 0 && this.aClass1Array1[this.anInt9433 - 1] != this.aClass1_278) {
			local27 = this.aClass1_278;
			this.aClass1_278 = local27.aClass1_286;
			return local27;
		}
		while (this.anInt9425 > this.anInt9433) {
			local27 = this.aClass1Array1[this.anInt9433++].aClass1_286;
			if (local27 != this.aClass1Array1[this.anInt9433 - 1]) {
				this.aClass1_278 = local27.aClass1_286;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IJ)Lclient!jca;")
	public Class1 method7796(@OriginalArg(1) long arg0) {
		this.aLong417 = arg0;
		@Pc(20) Class1 local20 = this.aClass1Array1[(int) ((long) (this.anInt9425 - 1) & arg0)];
		for (this.aClass1_277 = local20.aClass1_286; this.aClass1_277 != local20; this.aClass1_277 = this.aClass1_277.aClass1_286) {
			if (arg0 == this.aClass1_277.aLong425) {
				@Pc(46) Class1 local46 = this.aClass1_277;
				this.aClass1_277 = this.aClass1_277.aClass1_286;
				return local46;
			}
		}
		this.aClass1_277 = null;
		return null;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)I")
	public int method7799() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt9425; local9++) {
			@Pc(16) Class1 local16 = this.aClass1Array1[local9];
			@Pc(19) Class1 local19 = local16.aClass1_286;
			while (local16 != local19) {
				local19 = local19.aClass1_286;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IJLclient!jca;)V")
	public void method7800(@OriginalArg(1) long arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.aClass1_285 != null) {
			arg1.method7878();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt9425 - 1) & arg0)];
		arg1.aClass1_285 = local21.aClass1_285;
		arg1.aClass1_286 = local21;
		arg1.aClass1_285.aClass1_286 = arg1;
		arg1.aLong425 = arg0;
		arg1.aClass1_286.aClass1_285 = arg1;
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)Lclient!jca;")
	public Class1 method7801() {
		if (this.aClass1_277 == null) {
			return null;
		}
		@Pc(23) Class1 local23 = this.aClass1Array1[(int) (this.aLong417 & (long) (this.anInt9425 - 1))];
		while (this.aClass1_277 != local23) {
			if (this.aClass1_277.aLong425 == this.aLong417) {
				@Pc(47) Class1 local47 = this.aClass1_277;
				this.aClass1_277 = this.aClass1_277.aClass1_286;
				return local47;
			}
			this.aClass1_277 = this.aClass1_277.aClass1_286;
		}
		this.aClass1_277 = null;
		return null;
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
	public void method7802() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9425; local3++) {
			@Pc(10) Class1 local10 = this.aClass1Array1[local3];
			while (true) {
				@Pc(13) Class1 local13 = local10.aClass1_286;
				if (local10 == local13) {
					break;
				}
				local13.method7878();
			}
		}
		this.aClass1_278 = null;
		this.aClass1_277 = null;
	}
}
