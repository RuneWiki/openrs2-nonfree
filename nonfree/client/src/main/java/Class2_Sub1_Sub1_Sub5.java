import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class2_Sub1_Sub1_Sub5 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
	private int anInt1751 = -32768;

	@OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
	private final int anInt1750;

	@OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
	private final int anInt1752;

	@OriginalMember(owner = "client!ff", name = "lb", descriptor = "I")
	private final int anInt1761;

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
	private final int anInt1747;

	@OriginalMember(owner = "client!ff", name = "ib", descriptor = "I")
	private final int anInt1759;

	@OriginalMember(owner = "client!ff", name = "jb", descriptor = "I")
	private final int anInt1760;

	@OriginalMember(owner = "client!ff", name = "mb", descriptor = "Lclient!ce;")
	private Class2_Sub1_Sub5 aClass2_Sub1_Sub5_2;

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
	private int anInt1754;

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
	private int anInt1753;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIIIIIIZLclient!aa;)V")
	public Class2_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class2_Sub1_Sub1 arg8) {
		this.anInt1750 = arg5;
		this.anInt1752 = arg0;
		this.anInt1761 = arg4;
		this.anInt1747 = arg3;
		this.anInt1759 = arg1;
		this.anInt1760 = arg2;
		if (arg6 != -1) {
			this.aClass2_Sub1_Sub5_2 = Static103.method2357(arg6);
			this.anInt1754 = Static20.anInt580 - 1;
			this.anInt1753 = 0;
			if (this.aClass2_Sub1_Sub5_2.anInt794 == 0 && arg8 != null && arg8 instanceof Class2_Sub1_Sub1_Sub5) {
				@Pc(54) Class2_Sub1_Sub1_Sub5 local54 = (Class2_Sub1_Sub1_Sub5) arg8;
				if (local54.aClass2_Sub1_Sub5_2 == this.aClass2_Sub1_Sub5_2) {
					this.anInt1754 = local54.anInt1754;
					this.anInt1753 = local54.anInt1753;
					return;
				}
			}
			if (arg7 && this.aClass2_Sub1_Sub5_2.anInt795 != -1) {
				this.anInt1753 = (int) ((double) this.aClass2_Sub1_Sub5_2.anIntArray84.length * Math.random());
				this.anInt1754 -= (int) ((double) this.aClass2_Sub1_Sub5_2.anIntArray83[this.anInt1753] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "()I")
	@Override
	public int method3179() {
		return this.anInt1751;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Lclient!aa;")
	private Class2_Sub1_Sub1 method1321() {
		@Pc(10) Class2_Sub1_Sub9 local10 = Static158.method3037(this.anInt1752);
		if (local10.anIntArray162 != null) {
			local10 = local10.method1262();
		}
		if (local10 == null) {
			return null;
		}
		@Pc(30) int local30;
		@Pc(49) int local49;
		@Pc(92) int local92;
		@Pc(94) int local94;
		if (this.aClass2_Sub1_Sub5_2 != null) {
			local30 = Static20.anInt580 - this.anInt1754;
			if (local30 > 100 && this.aClass2_Sub1_Sub5_2.anInt795 > 0) {
				local49 = this.aClass2_Sub1_Sub5_2.anIntArray84.length - this.aClass2_Sub1_Sub5_2.anInt795;
				while (local49 > this.anInt1753 && local30 > this.aClass2_Sub1_Sub5_2.anIntArray83[this.anInt1753]) {
					local30 -= this.aClass2_Sub1_Sub5_2.anIntArray83[this.anInt1753];
					this.anInt1753++;
				}
				if (this.anInt1753 >= local49) {
					local92 = 0;
					for (local94 = local49; local94 < this.aClass2_Sub1_Sub5_2.anIntArray84.length; local94++) {
						local92 += this.aClass2_Sub1_Sub5_2.anIntArray83[local94];
					}
					local30 %= local92;
				}
			}
			label79: {
				do {
					do {
						if (this.aClass2_Sub1_Sub5_2.anIntArray83[this.anInt1753] >= local30) {
							break label79;
						}
						local30 -= this.aClass2_Sub1_Sub5_2.anIntArray83[this.anInt1753];
						this.anInt1753++;
					} while (this.anInt1753 < this.aClass2_Sub1_Sub5_2.anIntArray84.length);
					this.anInt1753 -= this.aClass2_Sub1_Sub5_2.anInt795;
				} while (this.anInt1753 >= 0 && this.anInt1753 < this.aClass2_Sub1_Sub5_2.anIntArray84.length);
				this.aClass2_Sub1_Sub5_2 = null;
			}
			this.anInt1754 = Static20.anInt580 - local30;
		}
		if (this.anInt1760 == 1 || this.anInt1760 == 3) {
			local30 = local10.anInt1683;
			local49 = local10.anInt1688;
		} else {
			local30 = local10.anInt1688;
			local49 = local10.anInt1683;
		}
		local92 = this.anInt1761 + (local30 >> 1);
		local94 = (local30 + 1 >> 1) + this.anInt1761;
		@Pc(238) int[][] local238 = Static32.anIntArrayArrayArray4[this.anInt1747];
		@Pc(245) int local245 = (local49 >> 1) + this.anInt1750;
		@Pc(254) int local254 = (local49 + 1 >> 1) + this.anInt1750;
		@Pc(263) int local263 = (local30 << 6) + (this.anInt1761 << 7);
		@Pc(296) int local296 = local238[local94][local254] + local238[local92][local254] + local238[local92][local245] + local238[local94][local245] >> 2;
		@Pc(305) int local305 = (this.anInt1750 << 7) + (local49 << 6);
		@Pc(324) Class2_Sub1_Sub16 local324;
		if (this.aClass2_Sub1_Sub5_2 == null) {
			local324 = local10.method1261(local263, this.anInt1759, false, this.anInt1760, local296, local305, local238);
		} else {
			local324 = local10.method1259(local305, this.anInt1760, this.anInt1753, local263, local238, local296, this.anInt1759, this.aClass2_Sub1_Sub5_2);
		}
		return local324 == null ? null : local324.aClass2_Sub1_Sub1_8;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class2_Sub1_Sub1 local7 = this.method1321();
		if (local7 != null) {
			local7.method3173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt1751 = local7.method3179();
		}
	}
}
