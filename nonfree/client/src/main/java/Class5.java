import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class5 {

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "J")
	private long aLong9;

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "Lclient!o;")
	private Class1 aClass1_17;

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "Lclient!o;")
	private Class1 aClass1_18;

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
	private int anInt180 = 0;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
	private final int anInt169;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "[Lclient!o;")
	private final Class1[] aClass1Array1;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I)V")
	public Class5(@OriginalArg(0) int arg0) {
		this.anInt169 = arg0;
		this.aClass1Array1 = new Class1[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class1 local23 = this.aClass1Array1[local13] = new Class1();
			local23.aClass1_215 = local23;
			local23.aClass1_216 = local23;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)Lclient!o;")
	public Class1 method132() {
		@Pc(24) Class1 local24;
		if (this.anInt180 > 0 && this.aClass1_18 != this.aClass1Array1[this.anInt180 - 1]) {
			local24 = this.aClass1_18;
			this.aClass1_18 = local24.aClass1_215;
			return local24;
		}
		while (this.anInt169 > this.anInt180) {
			local24 = this.aClass1Array1[this.anInt180++].aClass1_215;
			if (local24 != this.aClass1Array1[this.anInt180 - 1]) {
				this.aClass1_18 = local24.aClass1_215;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(JI)Lclient!o;")
	public Class1 method134(@OriginalArg(0) long arg0) {
		this.aLong9 = arg0;
		@Pc(18) Class1 local18 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt169 - 1))];
		for (this.aClass1_17 = local18.aClass1_215; this.aClass1_17 != local18; this.aClass1_17 = this.aClass1_17.aClass1_215) {
			if (arg0 == this.aClass1_17.aLong148) {
				@Pc(32) Class1 local32 = this.aClass1_17;
				this.aClass1_17 = this.aClass1_17.aClass1_215;
				return local32;
			}
		}
		this.aClass1_17 = null;
		return null;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)Lclient!o;")
	public Class1 method135() {
		if (this.aClass1_17 == null) {
			return null;
		}
		@Pc(21) Class1 local21 = this.aClass1Array1[(int) ((long) (this.anInt169 - 1) & this.aLong9)];
		while (this.aClass1_17 != local21) {
			if (this.aClass1_17.aLong148 == this.aLong9) {
				@Pc(40) Class1 local40 = this.aClass1_17;
				this.aClass1_17 = this.aClass1_17.aClass1_215;
				return local40;
			}
			this.aClass1_17 = this.aClass1_17.aClass1_215;
		}
		this.aClass1_17 = null;
		return null;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([Lclient!o;I)I")
	public int method136(@OriginalArg(0) Class1[] arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt169; local5++) {
			@Pc(12) Class1 local12 = this.aClass1Array1[local5];
			for (@Pc(15) Class1 local15 = local12.aClass1_215; local15 != local12; local15 = local15.aClass1_215) {
				arg0[local3++] = local15;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!o;J)V")
	public void method138(@OriginalArg(1) Class1 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass1_216 != null) {
			arg0.method3134();
		}
		@Pc(25) Class1 local25 = this.aClass1Array1[(int) ((long) (this.anInt169 - 1) & arg1)];
		arg0.aClass1_215 = local25;
		arg0.aLong148 = arg1;
		arg0.aClass1_216 = local25.aClass1_216;
		arg0.aClass1_216.aClass1_215 = arg0;
		arg0.aClass1_215.aClass1_216 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)I")
	public int method139() {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt169; local17++) {
			@Pc(24) Class1 local24 = this.aClass1Array1[local17];
			for (@Pc(27) Class1 local27 = local24.aClass1_215; local27 != local24; local27 = local27.aClass1_215) {
				local15++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)Lclient!o;")
	public Class1 method140() {
		this.anInt180 = 0;
		return this.method132();
	}
}
