import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
	private int anInt185 = 5;

	@OriginalMember(owner = "client!ag", name = "fb", descriptor = "I")
	private int anInt187 = 0;

	@OriginalMember(owner = "client!ag", name = "ib", descriptor = "[S")
	private short[] aShortArray1 = new short[512];

	@OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
	private int anInt181 = 1;

	@OriginalMember(owner = "client!ag", name = "jb", descriptor = "I")
	private int anInt189 = 2048;

	@OriginalMember(owner = "client!ag", name = "kb", descriptor = "[B")
	private byte[] aByteArray1 = new byte[512];

	@OriginalMember(owner = "client!ag", name = "lb", descriptor = "I")
	private int anInt190 = 2;

	@OriginalMember(owner = "client!ag", name = "mb", descriptor = "I")
	private int anInt191 = 5;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V")
	@Override
	public void method3474() {
		this.aByteArray1 = Static27.method394(this.anInt187);
		this.method150();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt185 = this.anInt191 = arg1.method2142();
		} else if (arg0 == 1) {
			this.anInt187 = arg1.method2142();
		} else if (arg0 == 2) {
			this.anInt189 = arg1.method2178();
		} else if (arg0 == 3) {
			this.anInt190 = arg1.method2142();
		} else if (arg0 == 4) {
			this.anInt181 = arg1.method2142();
		} else if (arg0 == 5) {
			this.anInt185 = arg1.method2142();
		} else if (arg0 == 6) {
			this.anInt191 = arg1.method2142();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(30) int local30 = this.anInt191 * Static23.anIntArray47[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static76.anInt1531; local40++) {
				Static20.anInt412 = Integer.MAX_VALUE;
				Static195.anInt3966 = Integer.MAX_VALUE;
				Static28.anInt543 = Integer.MAX_VALUE;
				Static102.anInt2060 = Integer.MAX_VALUE;
				@Pc(59) int local59 = this.anInt185 * Static106.anIntArray202[local40] + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(152) int local152;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(96) int local96 = this.aByteArray1[(local71 < this.anInt191 ? local71 : local71 - this.anInt191) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local63 - 1; local100 <= local67; local100++) {
						@Pc(125) int local125 = (this.aByteArray1[(this.anInt185 <= local100 ? local100 - this.anInt185 : local100) + local96 & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = local100 << 12;
						@Pc(133) int local133 = local125 + 1;
						@Pc(137) int local137 = local59 - local129 - this.aShortArray1[local125];
						@Pc(149) int local149 = local30 - (local71 << 12) - this.aShortArray1[local133];
						local152 = this.anInt181;
						@Pc(184) int local184;
						if (local152 == 1) {
							local184 = local137 * local137 + local149 * local149 >> 12;
						} else if (local152 == 3) {
							local149 = local149 < 0 ? -local149 : local149;
							local137 = local137 >= 0 ? local137 : -local137;
							local184 = local137 > local149 ? local137 : local149;
						} else if (local152 == 4) {
							local137 = (int) (Math.sqrt((double) ((float) (local137 < 0 ? -local137 : local137) / 4096.0F)) * 4096.0D);
							local149 = (int) (Math.sqrt((double) ((float) (local149 < 0 ? -local149 : local149) / 4096.0F)) * 4096.0D);
							local184 = local137 + local149;
							local184 = local184 * local184 >> 12;
						} else if (local152 == 5) {
							local137 *= local137;
							local149 *= local149;
							local184 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local137 + local149) / 1.6777216E7F))) * 4096.0D);
						} else if (local152 == 2) {
							local184 = (local149 < 0 ? -local149 : local149) + (local137 >= 0 ? local137 : -local137);
						} else {
							local184 = (int) (Math.sqrt((double) ((float) (local149 * local149 + local137 * local137) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static102.anInt2060 > local184) {
							Static20.anInt412 = Static195.anInt3966;
							Static195.anInt3966 = Static28.anInt543;
							Static28.anInt543 = Static102.anInt2060;
							Static102.anInt2060 = local184;
						} else if (Static28.anInt543 > local184) {
							Static20.anInt412 = Static195.anInt3966;
							Static195.anInt3966 = Static28.anInt543;
							Static28.anInt543 = local184;
						} else if (Static195.anInt3966 > local184) {
							Static20.anInt412 = Static195.anInt3966;
							Static195.anInt3966 = local184;
						} else if (Static20.anInt412 > local184) {
							Static20.anInt412 = local184;
						}
					}
				}
				local152 = this.anInt190;
				if (local152 == 0) {
					local17[local40] = Static102.anInt2060;
				} else if (local152 == 1) {
					local17[local40] = Static28.anInt543;
				} else if (local152 == 3) {
					local17[local40] = Static195.anInt3966;
				} else if (local152 == 4) {
					local17[local40] = Static20.anInt412;
				} else if (local152 == 2) {
					local17[local40] = Static28.anInt543 - Static102.anInt2060;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V")
	private void method150() {
		@Pc(8) Random local8 = new Random((long) this.anInt187);
		this.aShortArray1 = new short[512];
		if (this.anInt189 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray1[local24] = (short) Static131.method2214(this.anInt189, local8);
			}
		}
	}
}
