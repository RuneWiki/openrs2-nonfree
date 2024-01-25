import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class1_Sub6_Sub1 extends Class1_Sub6 {

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "[B")
	public static final byte[] aByteArray42 = new byte[32896];

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "Lclient!eb;")
	public final Class42 aClass42_12 = new Class42();

	@OriginalMember(owner = "client!gf", name = "I", descriptor = "Lclient!n;")
	public final Class1_Sub6_Sub3 aClass1_Sub6_Sub3_1 = new Class1_Sub6_Sub3();

	@OriginalMember(owner = "client!gf", name = "E", descriptor = "Lclient!nr;")
	private final Class1_Sub6_Sub4 aClass1_Sub6_Sub4_3;

	static {
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < 256; local31++) {
			for (@Pc(34) int local34 = 0; local34 <= local31; local34++) {
				aByteArray42[local29++] = (byte) (255.0D / Math.sqrt((double) ((float) (local34 * local34 + local31 * local31 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!nr;)V")
	public Class1_Sub6_Sub1(@OriginalArg(0) Class1_Sub6_Sub4 arg0) {
		this.aClass1_Sub6_Sub4_3 = arg0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B[IILclient!wh;II)V")
	private void method2185(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub43 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub6_Sub4_3.anIntArray353[arg2.anInt6874] & 0x4) != 0 && arg2.anInt6876 < 0) {
			@Pc(33) int local33 = this.aClass1_Sub6_Sub4_3.anIntArray355[arg2.anInt6874] / Static14.anInt4962;
			while (true) {
				@Pc(43) int local43 = (local33 + 1048575 - arg2.anInt6884) / local33;
				if (local43 > arg4) {
					arg2.anInt6884 += local33 * arg4;
					break;
				}
				arg2.aClass1_Sub6_Sub2_3.method4055(arg0, arg3, local43);
				arg4 -= local43;
				arg3 += local43;
				arg2.anInt6884 += local43 * local33 - 1048576;
				@Pc(74) int local74 = Static14.anInt4962 / 100;
				@Pc(78) int local78 = 262144 / local33;
				if (local78 < local74) {
					local74 = local78;
				}
				@Pc(86) Class1_Sub6_Sub2 local86 = arg2.aClass1_Sub6_Sub2_3;
				if (this.aClass1_Sub6_Sub4_3.anIntArray361[arg2.anInt6874] == 0) {
					arg2.aClass1_Sub6_Sub2_3 = Static372.method2508(arg2.aClass1_Sub39_Sub1_1, local86.method2516(), local86.method2520(), local86.method2523());
				} else {
					arg2.aClass1_Sub6_Sub2_3 = Static372.method2508(arg2.aClass1_Sub39_Sub1_1, local86.method2516(), 0, local86.method2523());
					this.aClass1_Sub6_Sub4_3.method4089(arg2.aClass1_Sub10_1.aShortArray14[arg2.anInt6866] < 0, arg2);
					arg2.aClass1_Sub6_Sub2_3.method2517(local74, local86.method2520());
				}
				if (arg2.aClass1_Sub10_1.aShortArray14[arg2.anInt6866] < 0) {
					arg2.aClass1_Sub6_Sub2_3.method2529(-1);
				}
				local86.method2527(local74);
				local86.method4055(arg0, arg3, arg1 - arg3);
				if (local86.method2496()) {
					this.aClass1_Sub6_Sub3_1.method3785(local86);
				}
			}
		}
		arg2.aClass1_Sub6_Sub2_3.method4055(arg0, arg3, arg4);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "()Lclient!ar;")
	@Override
	public Class1_Sub6 method4054() {
		@Pc(9) Class1_Sub43 local9 = (Class1_Sub43) this.aClass42_12.method1543();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub6_Sub2_3 == null) {
			return this.method4056();
		} else {
			return local9.aClass1_Sub6_Sub2_3;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!wh;BI)V")
	private void method2186(@OriginalArg(0) Class1_Sub43 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub6_Sub4_3.anIntArray353[arg0.anInt6874] & 0x4) != 0 && arg0.anInt6876 < 0) {
			@Pc(20) int local20 = this.aClass1_Sub6_Sub4_3.anIntArray355[arg0.anInt6874] / Static14.anInt4962;
			@Pc(30) int local30 = (local20 + 1048575 - arg0.anInt6884) / local20;
			arg0.anInt6884 = local20 * arg1 + arg0.anInt6884 & 0xFFFFF;
			if (local30 <= arg1) {
				if (this.aClass1_Sub6_Sub4_3.anIntArray361[arg0.anInt6874] == 0) {
					arg0.aClass1_Sub6_Sub2_3 = Static372.method2508(arg0.aClass1_Sub39_Sub1_1, arg0.aClass1_Sub6_Sub2_3.method2516(), arg0.aClass1_Sub6_Sub2_3.method2520(), arg0.aClass1_Sub6_Sub2_3.method2523());
				} else {
					arg0.aClass1_Sub6_Sub2_3 = Static372.method2508(arg0.aClass1_Sub39_Sub1_1, arg0.aClass1_Sub6_Sub2_3.method2516(), 0, arg0.aClass1_Sub6_Sub2_3.method2523());
					this.aClass1_Sub6_Sub4_3.method4089(arg0.aClass1_Sub10_1.aShortArray14[arg0.anInt6866] < 0, arg0);
				}
				if (arg0.aClass1_Sub10_1.aShortArray14[arg0.anInt6866] < 0) {
					arg0.aClass1_Sub6_Sub2_3.method2529(-1);
				}
				arg1 = arg0.anInt6884 / local20;
			}
		}
		arg0.aClass1_Sub6_Sub2_3.method4051(arg1);
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "()I")
	@Override
	public int method4057() {
		return 0;
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V")
	@Override
	public void method4051(@OriginalArg(0) int arg0) {
		this.aClass1_Sub6_Sub3_1.method4051(arg0);
		for (@Pc(15) Class1_Sub43 local15 = (Class1_Sub43) this.aClass42_12.method1543(); local15 != null; local15 = (Class1_Sub43) this.aClass42_12.method1551()) {
			if (!this.aClass1_Sub6_Sub4_3.method4092(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt6887 >= local25) {
						this.method2186(local15, local25);
						local15.anInt6887 -= local25;
						break;
					}
					this.method2186(local15, local15.anInt6887);
					local25 -= local15.anInt6887;
				} while (!this.aClass1_Sub6_Sub4_3.method4078(0, local15, local25, null));
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "([III)V")
	@Override
	public void method4055(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub6_Sub3_1.method4055(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub43 local17 = (Class1_Sub43) this.aClass42_12.method1543(); local17 != null; local17 = (Class1_Sub43) this.aClass42_12.method1551()) {
			if (!this.aClass1_Sub6_Sub4_3.method4092(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt6887) {
						this.method2185(arg0, local27 + local29, local17, local27, local29);
						local17.anInt6887 -= local29;
						break;
					}
					this.method2185(arg0, local29 + local27, local17, local27, local17.anInt6887);
					local27 += local17.anInt6887;
					local29 -= local17.anInt6887;
				} while (!this.aClass1_Sub6_Sub4_3.method4078(local27, local17, local29, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "()Lclient!ar;")
	@Override
	public Class1_Sub6 method4056() {
		@Pc(9) Class1_Sub43 local9;
		do {
			local9 = (Class1_Sub43) this.aClass42_12.method1551();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub6_Sub2_3 == null);
		return local9.aClass1_Sub6_Sub2_3;
	}
}
