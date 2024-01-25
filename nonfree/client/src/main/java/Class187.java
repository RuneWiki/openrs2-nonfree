import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class187 {

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "Lclient!pca;")
	private Class1 aClass1_132;

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "J")
	private long aLong144;

	@OriginalMember(owner = "client!kea", name = "t", descriptor = "Lclient!pca;")
	private Class1 aClass1_133;

	@OriginalMember(owner = "client!kea", name = "s", descriptor = "I")
	private int anInt4702 = 0;

	@OriginalMember(owner = "client!kea", name = "m", descriptor = "I")
	public final int anInt4697;

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "[Lclient!pca;")
	public final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(I)V")
	public Class187(@OriginalArg(0) int arg0) {
		this.anInt4697 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_286 = local23;
			local23.aClass1_285 = local23;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLclient!pca;J)V")
	public void method3795(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_286 != null) {
			arg0.method7859();
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt4697 - 1) & arg1)];
		arg0.aClass1_286 = local21.aClass1_286;
		arg0.aClass1_285 = local21;
		arg0.aClass1_286.aClass1_285 = arg0;
		arg0.aLong301 = arg1;
		arg0.aClass1_285.aClass1_286 = arg0;
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(B)I")
	public int method3796() {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt4697; local17++) {
			@Pc(24) Class1 local24 = this.aClass1Array1[local17];
			@Pc(27) Class1 local27 = local24.aClass1_285;
			while (local24 != local27) {
				local27 = local27.aClass1_285;
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(JB)Lclient!pca;")
	public Class1 method3797(@OriginalArg(0) long arg0) {
		this.aLong144 = arg0;
		@Pc(26) Class1 local26 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt4697 - 1))];
		for (this.aClass1_132 = local26.aClass1_285; this.aClass1_132 != local26; this.aClass1_132 = this.aClass1_132.aClass1_285) {
			if (arg0 == this.aClass1_132.aLong301) {
				@Pc(45) Class1 local45 = this.aClass1_132;
				this.aClass1_132 = this.aClass1_132.aClass1_285;
				return local45;
			}
		}
		this.aClass1_132 = null;
		return null;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)Lclient!pca;")
	public Class1 method3799() {
		this.anInt4702 = 0;
		return this.method3805();
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(B)I")
	public int method3800() {
		return this.anInt4697;
	}

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "(B)V")
	public void method3801() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4697; local3++) {
			@Pc(10) Class1 local10 = this.aClass1Array1[local3];
			while (true) {
				@Pc(13) Class1 local13 = local10.aClass1_285;
				if (local10 == local13) {
					break;
				}
				local13.method7859();
			}
		}
		this.aClass1_132 = null;
		this.aClass1_133 = null;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "([Lclient!pca;B)I")
	public int method3802(@OriginalArg(0) Class1[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt4697; local16++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local16];
			for (@Pc(26) Class1 local26 = local23.aClass1_285; local26 != local23; local26 = local26.aClass1_285) {
				arg0[local7++] = local26;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "(B)Lclient!pca;")
	public Class1 method3803() {
		if (this.aClass1_132 == null) {
			return null;
		}
		@Pc(28) Class1 local28 = this.aClass1Array1[(int) ((long) (this.anInt4697 - 1) & this.aLong144)];
		while (this.aClass1_132 != local28) {
			if (this.aClass1_132.aLong301 == this.aLong144) {
				@Pc(44) Class1 local44 = this.aClass1_132;
				this.aClass1_132 = this.aClass1_132.aClass1_285;
				return local44;
			}
			this.aClass1_132 = this.aClass1_132.aClass1_285;
		}
		this.aClass1_132 = null;
		return null;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Z)Lclient!pca;")
	public Class1 method3805() {
		@Pc(27) Class1 local27;
		if (this.anInt4702 > 0 && this.aClass1Array1[this.anInt4702 - 1] != this.aClass1_133) {
			local27 = this.aClass1_133;
			this.aClass1_133 = local27.aClass1_285;
			return local27;
		}
		while (this.anInt4697 > this.anInt4702) {
			local27 = this.aClass1Array1[this.anInt4702++].aClass1_285;
			if (this.aClass1Array1[this.anInt4702 - 1] != local27) {
				this.aClass1_133 = local27.aClass1_285;
				return local27;
			}
		}
		return null;
	}
}
