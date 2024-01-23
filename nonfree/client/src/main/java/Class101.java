import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class101 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Lclient!qk;")
	private Class2 aClass2_127;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "J")
	private long aLong114;

	@OriginalMember(owner = "client!l", name = "s", descriptor = "Lclient!qk;")
	private Class2 aClass2_128;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "I")
	private int anInt3499 = 0;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "[Lclient!qk;")
	public Class2[] aClass2Array1;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "I")
	public int anInt3494;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V")
	public Class101(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt3494 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(29) Class2 local29 = this.aClass2Array1[local13] = new Class2();
			local29.aClass2_232 = local29;
			local29.aClass2_233 = local29;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Lclient!qk;Z)I")
	public int method2857(@OriginalArg(0) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt3494; local16++) {
			@Pc(25) Class2 local25 = this.aClass2Array1[local16];
			for (@Pc(28) Class2 local28 = local25.aClass2_232; local28 != local25; local28 = local28.aClass2_232) {
				arg0[local7++] = local28;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)Lclient!qk;")
	public Class2 method2858() {
		if (this.aClass2_127 == null) {
			return null;
		}
		@Pc(32) Class2 local32 = this.aClass2Array1[(int) (this.aLong114 & (long) (this.anInt3494 - 1))];
		while (this.aClass2_127 != local32) {
			if (this.aLong114 == this.aClass2_127.aLong214) {
				@Pc(50) Class2 local50 = this.aClass2_127;
				this.aClass2_127 = this.aClass2_127.aClass2_232;
				return local50;
			}
			this.aClass2_127 = this.aClass2_127.aClass2_232;
		}
		this.aClass2_127 = null;
		return null;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)Lclient!qk;")
	public Class2 method2859() {
		@Pc(24) Class2 local24;
		if (this.anInt3499 > 0 && this.aClass2_128 != this.aClass2Array1[this.anInt3499 - 1]) {
			local24 = this.aClass2_128;
			this.aClass2_128 = local24.aClass2_232;
			return local24;
		}
		do {
			if (this.anInt3494 <= this.anInt3499) {
				return null;
			}
			local24 = this.aClass2Array1[this.anInt3499++].aClass2_232;
		} while (local24 == this.aClass2Array1[this.anInt3499 - 1]);
		this.aClass2_128 = local24.aClass2_232;
		return local24;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!qk;IJ)V")
	public void method2860(@OriginalArg(0) Class2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_233 != null) {
			arg0.method4743();
		}
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) ((long) (this.anInt3494 - 1) & arg1)];
		arg0.aLong214 = arg1;
		arg0.aClass2_233 = local23.aClass2_233;
		arg0.aClass2_232 = local23;
		arg0.aClass2_233.aClass2_232 = arg0;
		arg0.aClass2_232.aClass2_233 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)I")
	public int method2863() {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt3494; local10++) {
			@Pc(19) Class2 local19 = this.aClass2Array1[local10];
			for (@Pc(22) Class2 local22 = local19.aClass2_232; local22 != local19; local22 = local22.aClass2_232) {
				local8++;
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)I")
	public int method2864() {
		return this.anInt3494;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IJ)Lclient!qk;")
	public Class2 method2867(@OriginalArg(1) long arg0) {
		this.aLong114 = arg0;
		@Pc(20) Class2 local20 = this.aClass2Array1[(int) ((long) (this.anInt3494 - 1) & arg0)];
		for (this.aClass2_127 = local20.aClass2_232; this.aClass2_127 != local20; this.aClass2_127 = this.aClass2_127.aClass2_232) {
			if (this.aClass2_127.aLong214 == arg0) {
				@Pc(42) Class2 local42 = this.aClass2_127;
				this.aClass2_127 = this.aClass2_127.aClass2_232;
				return local42;
			}
		}
		this.aClass2_127 = null;
		return null;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(B)Lclient!qk;")
	public Class2 method2868() {
		this.anInt3499 = 0;
		return this.method2859();
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(B)V")
	public void method2869() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3494; local11++) {
			@Pc(20) Class2 local20 = this.aClass2Array1[local11];
			while (true) {
				@Pc(23) Class2 local23 = local20.aClass2_232;
				if (local23 == local20) {
					break;
				}
				local23.method4743();
			}
		}
		this.aClass2_128 = null;
		this.aClass2_127 = null;
	}
}
