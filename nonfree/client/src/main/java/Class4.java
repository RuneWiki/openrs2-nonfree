import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4 {

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "J")
	public static long aLong11 = 0L;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_9 = new Class145(41, 3);

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "[J")
	public static final long[] aLongArray1 = new long[256];

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "[I")
	public static final int[] anIntArray3 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_2;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!ag;")
	private Class2 aClass2_9;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "J")
	private long aLong10;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!ag;")
	private Class2 aClass2_10;

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
	private int anInt104 = 0;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "[Lclient!ag;")
	public final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
	public final int anInt97;

	static {
		for (@Pc(43) int local43 = 0; local43 < 256; local43++) {
			@Pc(47) long local47 = (long) local43;
			for (@Pc(49) int local49 = 0; local49 < 8; local49++) {
				if ((local47 & 0x1L) == 1L) {
					local47 = local47 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local47 >>>= 0x1;
				}
			}
			aLongArray1[local43] = local47;
		}
		aClass79_2 = new Class79("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");
	}

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(I)V", line = 528)
	public Class4(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt97 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_243 = local23;
			local23.aClass2_244 = local23;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)Lclient!ag;", line = 21)
	public Class2 method79() {
		@Pc(24) Class2 local24;
		if (this.anInt104 > 0 && this.aClass2Array1[this.anInt104 - 1] != this.aClass2_10) {
			local24 = this.aClass2_10;
			this.aClass2_10 = local24.aClass2_243;
			return local24;
		}
		while (this.anInt97 > this.anInt104) {
			local24 = this.aClass2Array1[this.anInt104++].aClass2_243;
			if (this.aClass2Array1[this.anInt104 - 1] != local24) {
				this.aClass2_10 = local24.aClass2_243;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Lclient!ag;", line = 52)
	public Class2 method80() {
		this.anInt104 = 0;
		return this.method79();
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 70)
	public void method81() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt97; local3++) {
			@Pc(10) Class2 local10 = this.aClass2Array1[local3];
			while (true) {
				@Pc(13) Class2 local13 = local10.aClass2_243;
				if (local13 == local10) {
					break;
				}
				local13.method6469();
			}
		}
		this.aClass2_10 = null;
		this.aClass2_9 = null;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Lclient!ag;", line = 102)
	public Class2 method82() {
		if (this.aClass2_9 == null) {
			return null;
		}
		@Pc(34) Class2 local34 = this.aClass2Array1[(int) ((long) (this.anInt97 - 1) & this.aLong10)];
		while (local34 != this.aClass2_9) {
			if (this.aClass2_9.aLong232 == this.aLong10) {
				@Pc(46) Class2 local46 = this.aClass2_9;
				this.aClass2_9 = this.aClass2_9.aClass2_243;
				return local46;
			}
			this.aClass2_9 = this.aClass2_9.aClass2_243;
		}
		this.aClass2_9 = null;
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)I", line = 135)
	public int method83() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt97; local14++) {
			@Pc(21) Class2 local21 = this.aClass2Array1[local14];
			for (@Pc(24) Class2 local24 = local21.aClass2_243; local24 != local21; local24 = local24.aClass2_243) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([Lclient!ag;I)I", line = 167)
	public int method84(@OriginalArg(0) Class2[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt97; local9++) {
			@Pc(16) Class2 local16 = this.aClass2Array1[local9];
			for (@Pc(19) Class2 local19 = local16.aClass2_243; local19 != local16; local19 = local19.aClass2_243) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLclient!ag;J)V", line = 308)
	public void method87(@OriginalArg(1) Class2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_244 != null) {
			arg0.method6469();
		}
		@Pc(28) Class2 local28 = this.aClass2Array1[(int) ((long) (this.anInt97 - 1) & arg1)];
		arg0.aClass2_243 = local28;
		arg0.aClass2_244 = local28.aClass2_244;
		arg0.aClass2_244.aClass2_243 = arg0;
		arg0.aLong232 = arg1;
		arg0.aClass2_243.aClass2_244 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)I", line = 518)
	public int method89() {
		return this.anInt97;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(JI)Lclient!ag;", line = 552)
	public Class2 method90(@OriginalArg(0) long arg0) {
		this.aLong10 = arg0;
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt97 - 1))];
		for (this.aClass2_9 = local23.aClass2_243; this.aClass2_9 != local23; this.aClass2_9 = this.aClass2_9.aClass2_243) {
			if (arg0 == this.aClass2_9.aLong232) {
				@Pc(41) Class2 local41 = this.aClass2_9;
				this.aClass2_9 = this.aClass2_9.aClass2_243;
				return local41;
			}
		}
		this.aClass2_9 = null;
		return null;
	}
}
