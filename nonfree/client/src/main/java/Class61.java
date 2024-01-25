import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class61 {

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Z")
	public boolean aBoolean184 = true;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	private int anInt1616 = -1;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
	private final int anInt1619;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
	private final int anInt1620;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "Lclient!ru;")
	private final Class217 aClass217_1;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_12;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
	private final int anInt1613;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "Lclient!fe;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Lclient!dj;")
	private Class56_Sub1 aClass56_Sub1_1;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Lclient!km;")
	private Class10_Sub1 aClass10_Sub1_1;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!ur;Lclient!ru;Lclient!sp;IIIII)V")
	public Class61(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) Class217 arg1, @OriginalArg(2) Class157_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt1619 = arg7;
		this.anInt1620 = arg6;
		this.aClass217_1 = arg1;
		this.aClass34_Sub2_12 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = (local35 + local37) * arg2.anInt6283 + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray10[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt1613 = local27;
		if (local27 <= 0) {
			this.aClass10_Sub1_1 = null;
		} else {
			@Pc(90) Class1_Sub28 local90 = new Class1_Sub28(local27 * 2);
			@Pc(110) int local110;
			@Pc(118) short[] local118;
			@Pc(122) int local122;
			@Pc(108) int local108;
			if (this.aClass34_Sub2_12.aBoolean751) {
				for (local51 = 0; local51 < local25; local51++) {
					local108 = local31 + (local35 + local51) * arg2.anInt6283;
					for (local110 = 0; local110 < local25; local110++) {
						local118 = arg2.aShortArrayArray10[local108++];
						if (local118 != null) {
							for (local122 = 0; local122 < local118.length; local122++) {
								local90.method5393(local118[local122] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local108 = local31 + arg2.anInt6283 * (local35 + local51);
					for (local110 = 0; local110 < local25; local110++) {
						local118 = arg2.aShortArrayArray10[local108++];
						if (local118 != null) {
							for (local122 = 0; local122 < local118.length; local122++) {
								local90.method5383(local118[local122] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface2_2 = this.aClass34_Sub2_12.method5565(false, local90.anInt6812, local90.aByteArray86);
			this.aClass56_Sub1_1 = new Class56_Sub1(this.aClass34_Sub2_12, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public void method1405() {
		this.method1406(this.anInterface2_2, this.anInt1613);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!fe;II)V")
	private void method1406(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method1411();
			this.aClass34_Sub2_12.method5493(this.aClass10_Sub1_1);
			this.aClass34_Sub2_12.method5504(arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z[BII)V")
	public void method1408(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass56_Sub1_1.method3824(this.aClass34_Sub2_12.method5540(5123) * arg1, arg0);
		this.method1406(this.aClass56_Sub1_1, arg1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	private void method1411() {
		if (!this.aBoolean184) {
			return;
		}
		this.aBoolean184 = false;
		@Pc(21) byte[] local21 = this.aClass217_1.aByteArray81;
		@Pc(25) byte[] local25 = this.aClass34_Sub2_12.aByteArray87;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = this.aClass217_1.anInt6106;
		@Pc(41) int local41 = this.anInt1619 * this.aClass217_1.anInt6106 + this.anInt1620;
		@Pc(54) int local54;
		for (@Pc(43) int local43 = -128; local43 < 0; local43++) {
			local27 = (local27 << 8) - local27;
			for (local54 = -128; local54 < 0; local54++) {
				if (local21[local41++] != 0) {
					local27++;
				}
			}
			local41 += local31 - 128;
		}
		if (this.aClass10_Sub1_1 != null && this.anInt1616 == local27) {
			this.aBoolean184 = false;
			return;
		}
		this.anInt1616 = local27;
		local54 = 0;
		local41 = this.anInt1619 * local31 + this.anInt1620;
		for (@Pc(103) int local103 = -128; local103 < 0; local103++) {
			for (@Pc(107) int local107 = -128; local107 < 0; local107++) {
				if (local21[local41] == 0) {
					@Pc(122) int local122 = 0;
					if (local21[local41 - 1] != 0) {
						local122++;
					}
					if (local21[local41 + 1] != 0) {
						local122++;
					}
					if (local21[local41 - local31] != 0) {
						local122++;
					}
					if (local21[local41 + local31] != 0) {
						local122++;
					}
					local25[local54++] = (byte) (local122 * 17);
				} else {
					local25[local54++] = 68;
				}
				local41++;
			}
			local41 += this.aClass217_1.anInt6106 - 128;
		}
		if (this.aClass10_Sub1_1 == null) {
			this.aClass10_Sub1_1 = new Class10_Sub1(this.aClass34_Sub2_12, 3553, 6406, 128, 128, false, this.aClass34_Sub2_12.aByteArray87, 6406, false);
			this.aClass10_Sub1_1.method201(false, false);
			this.aClass10_Sub1_1.method5928(true);
		} else {
			this.aClass10_Sub1_1.method197(this.aClass34_Sub2_12.aByteArray87, 128, 6406, false, 128);
		}
	}
}
