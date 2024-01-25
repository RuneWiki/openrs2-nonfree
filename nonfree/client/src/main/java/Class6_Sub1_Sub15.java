import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class6_Sub1_Sub15 extends Class6_Sub1 {

	@OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
	private int anInt3827;

	@OriginalMember(owner = "client!hp", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!hp", name = "S", descriptor = "I")
	private int anInt3830;

	@OriginalMember(owner = "client!hp", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!hp", name = "U", descriptor = "I")
	private int anInt3831;

	@OriginalMember(owner = "client!hp", name = "X", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
	private int anInt3819 = 1024;

	@OriginalMember(owner = "client!hp", name = "K", descriptor = "I")
	private int anInt3825 = 81;

	@OriginalMember(owner = "client!hp", name = "M", descriptor = "I")
	private int anInt3826 = 4;

	@OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
	private int anInt3824 = 1024;

	@OriginalMember(owner = "client!hp", name = "W", descriptor = "I")
	private int anInt3833 = 409;

	@OriginalMember(owner = "client!hp", name = "Q", descriptor = "I")
	private int anInt3828 = 204;

	@OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
	private int anInt3822 = 0;

	@OriginalMember(owner = "client!hp", name = "Z", descriptor = "I")
	private int anInt3835 = 8;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = this.anInt3822 + Static230.anIntArray222[arg0]; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (this.anInt3835 > local17 && this.anIntArray216[local17] <= local24) {
				local17++;
			}
			@Pc(55) int local55 = local17 - 1;
			@Pc(66) boolean local66 = (local17 & 0x1) == 0;
			@Pc(71) int local71 = this.anIntArray216[local17];
			@Pc(78) int local78 = this.anIntArray216[local17 - 1];
			if (local78 + this.anInt3831 < local24 && local71 - this.anInt3831 > local24) {
				for (@Pc(100) int local100 = 0; local100 < Static479.anInt8231; local100++) {
					@Pc(111) int local111 = local66 ? this.anInt3824 : -this.anInt3824;
					@Pc(113) int local113 = 0;
					@Pc(124) int local124;
					for (local124 = Static205.anIntArray199[local100] + (local111 * this.anInt3830 >> 12); local124 < 0; local124 += 4096) {
					}
					while (local124 > 4096) {
						local124 -= 4096;
					}
					while (this.anInt3826 > local113 && this.anIntArrayArray24[local55][local113] <= local124) {
						local113++;
					}
					@Pc(167) int local167 = local113 - 1;
					@Pc(174) int local174 = this.anIntArrayArray24[local55][local167];
					@Pc(181) int local181 = this.anIntArrayArray24[local55][local113];
					if (local174 + this.anInt3831 < local124 && local181 - this.anInt3831 > local124) {
						local11[local100] = this.anIntArrayArray25[local55][local167];
					} else {
						local11[local100] = 0;
					}
				}
			} else {
				Static679.method1566(local11, 0, Static479.anInt8231, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V")
	private void method3270() {
		@Pc(12) Random local12 = new Random((long) this.anInt3835);
		this.anInt3831 = this.anInt3825 / 2;
		this.anInt3830 = 4096 / this.anInt3826;
		this.anInt3827 = 4096 / this.anInt3835;
		@Pc(35) int local35 = this.anInt3830 / 2;
		@Pc(40) int local40 = this.anInt3827 / 2;
		this.anIntArray216 = new int[this.anInt3835 + 1];
		this.anIntArrayArray25 = new int[this.anInt3835][this.anInt3826];
		this.anIntArrayArray24 = new int[this.anInt3835][this.anInt3826 + 1];
		this.anIntArray216[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt3835; local70++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local70 > 0) {
				local85 = this.anInt3827;
				local97 = (Static316.method4556(local12, 4096) - 2048) * this.anInt3828 >> 12;
				@Pc(105) int local105 = local85 + (local97 * local40 >> 12);
				this.anIntArray216[local70] = local105 + this.anIntArray216[local70 - 1];
			}
			this.anIntArrayArray24[local70][0] = 0;
			for (local85 = 0; local85 < this.anInt3826; local85++) {
				if (local85 > 0) {
					local97 = this.anInt3830;
					@Pc(148) int local148 = (Static316.method4556(local12, 4096) - 2048) * this.anInt3833 >> 12;
					local97 += local35 * local148 >> 12;
					this.anIntArrayArray24[local70][local85] = local97 + this.anIntArrayArray24[local70][local85 - 1];
				}
				this.anIntArrayArray25[local70][local85] = this.anInt3819 <= 0 ? 4096 : 4096 - Static316.method4556(local12, this.anInt3819);
			}
			this.anIntArrayArray24[local70][this.anInt3826] = 4096;
		}
		this.anIntArray216[this.anInt3835] = 4096;
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(B)V")
	@Override
	public void method8964() {
		this.method3270();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3826 = arg0.method8374();
		} else if (arg1 == 1) {
			this.anInt3835 = arg0.method8374();
		} else if (arg1 == 2) {
			this.anInt3833 = arg0.method8363();
		} else if (arg1 == 3) {
			this.anInt3828 = arg0.method8363();
		} else if (arg1 == 4) {
			this.anInt3824 = arg0.method8363();
		} else if (arg1 == 5) {
			this.anInt3822 = arg0.method8363();
		} else if (arg1 == 6) {
			this.anInt3825 = arg0.method8363();
		} else if (arg1 == 7) {
			this.anInt3819 = arg0.method8363();
		}
	}
}
