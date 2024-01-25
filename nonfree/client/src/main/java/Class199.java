import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class199 {

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!qf;")
	private Class2 aClass2_237;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "J")
	private long aLong203;

	@OriginalMember(owner = "client!va", name = "z", descriptor = "Lclient!qf;")
	private Class2 aClass2_238;

	@OriginalMember(owner = "client!va", name = "w", descriptor = "I")
	private int anInt6639 = 0;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "[Lclient!qf;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "I")
	public final int anInt6625;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V")
	public Class199(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt6625 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_249 = local23;
			local23.aClass2_250 = local23;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)I")
	public int method5743() {
		return this.anInt6625;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B[Lclient!qf;)I")
	public int method5745(@OriginalArg(1) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt6625; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_250; local19 != local16; local19 = local19.aClass2_250) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Lclient!qf;")
	public Class2 method5746() {
		if (this.aClass2_237 == null) {
			return null;
		}
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) ((long) (this.anInt6625 - 1) & this.aLong203)];
		while (local23 != this.aClass2_237) {
			if (this.aLong203 == this.aClass2_237.aLong213) {
				@Pc(39) Class2 local39 = this.aClass2_237;
				this.aClass2_237 = this.aClass2_237.aClass2_250;
				return local39;
			}
			this.aClass2_237 = this.aClass2_237.aClass2_250;
		}
		this.aClass2_237 = null;
		return null;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)Lclient!qf;")
	public Class2 method5747() {
		this.anInt6639 = 0;
		return this.method5753();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!qf;JI)V")
	public void method5749(@OriginalArg(0) Class2 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass2_249 != null) {
			arg0.method5945();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (arg1 & (long) (this.anInt6625 - 1))];
		arg0.aClass2_250 = local21;
		arg0.aClass2_249 = local21.aClass2_249;
		arg0.aClass2_249.aClass2_250 = arg0;
		arg0.aClass2_250.aClass2_249 = arg0;
		arg0.aLong213 = arg1;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
	public void method5750() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6625; local7++) {
			@Pc(14) Class2 local14 = this.aClass2Array1[local7];
			while (true) {
				@Pc(17) Class2 local17 = local14.aClass2_250;
				if (local14 == local17) {
					break;
				}
				local17.method5945();
			}
		}
		this.aClass2_237 = null;
		this.aClass2_238 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(JB)Lclient!qf;")
	public Class2 method5751(@OriginalArg(0) long arg0) {
		this.aLong203 = arg0;
		@Pc(25) Class2 local25 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt6625 - 1))];
		for (this.aClass2_237 = local25.aClass2_250; this.aClass2_237 != local25; this.aClass2_237 = this.aClass2_237.aClass2_250) {
			if (this.aClass2_237.aLong213 == arg0) {
				@Pc(44) Class2 local44 = this.aClass2_237;
				this.aClass2_237 = this.aClass2_237.aClass2_250;
				return local44;
			}
		}
		this.aClass2_237 = null;
		return null;
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)Lclient!qf;")
	public Class2 method5753() {
		@Pc(25) Class2 local25;
		if (this.anInt6639 > 0 && this.aClass2_238 != this.aClass2Array1[this.anInt6639 - 1]) {
			local25 = this.aClass2_238;
			this.aClass2_238 = local25.aClass2_250;
			return local25;
		}
		while (this.anInt6639 < this.anInt6625) {
			local25 = this.aClass2Array1[this.anInt6639++].aClass2_250;
			if (this.aClass2Array1[this.anInt6639 - 1] != local25) {
				this.aClass2_238 = local25.aClass2_250;
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)I")
	public int method5755() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt6625; local14++) {
			@Pc(21) Class2 local21 = this.aClass2Array1[local14];
			for (@Pc(24) Class2 local24 = local21.aClass2_250; local24 != local21; local24 = local24.aClass2_250) {
				local12++;
			}
		}
		return local12;
	}
}
