import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class12_Sub5 extends Class12 {

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
	private int anInt1870 = -32768;

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
	private int anInt1881;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
	private int anInt1869;

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
	private int anInt1876;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
	private int anInt1867;

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
	private int anInt1878;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	private int anInt1868;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "Lclient!k;")
	private Class2_Sub2_Sub9 aClass2_Sub2_Sub9_3;

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
	private int anInt1883;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
	private int anInt1873;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIZLclient!nc;)V")
	public Class12_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class12 arg8) {
		this.anInt1881 = arg0;
		this.anInt1869 = arg2;
		this.anInt1876 = arg3;
		this.anInt1867 = arg5;
		this.anInt1878 = arg1;
		this.anInt1868 = arg4;
		if (arg6 != -1) {
			this.aClass2_Sub2_Sub9_3 = Static14.method299(arg6);
			this.anInt1883 = 0;
			this.anInt1873 = Static103.anInt2511 - 1;
			if (this.aClass2_Sub2_Sub9_3.anInt2338 == 0 && arg8 != null && arg8 instanceof Class12_Sub5) {
				@Pc(51) Class12_Sub5 local51 = (Class12_Sub5) arg8;
				if (this.aClass2_Sub2_Sub9_3 == local51.aClass2_Sub2_Sub9_3) {
					this.anInt1883 = local51.anInt1883;
					this.anInt1873 = local51.anInt1873;
					return;
				}
			}
			if (arg7 && this.aClass2_Sub2_Sub9_3.anInt2342 != -1) {
				this.anInt1883 = (int) ((double) this.aClass2_Sub2_Sub9_3.anIntArray233.length * Math.random());
				this.anInt1873 -= (int) (Math.random() * (double) this.aClass2_Sub2_Sub9_3.anIntArray235[this.anInt1883]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "()I")
	@Override
	public int method2718() {
		return this.anInt1870;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Lclient!nc;")
	private Class12 method1300() {
		@Pc(8) boolean local8 = Static130.anIntArrayArrayArray19 != Static56.anIntArrayArrayArray7;
		@Pc(17) Class2_Sub2_Sub14 local17 = Static168.method2705(this.anInt1881);
		if (local17.anIntArray324 != null) {
			local17 = local17.method2120();
		}
		if (local17 == null) {
			return null;
		}
		@Pc(41) int local41;
		@Pc(44) int local44;
		if (this.anInt1869 == 1 || this.anInt1869 == 3) {
			local44 = local17.anInt3040;
			local41 = local17.anInt3050;
		} else {
			local41 = local17.anInt3040;
			local44 = local17.anInt3050;
		}
		@Pc(61) int local61 = (local41 + 1 >> 1) + this.anInt1868;
		@Pc(68) int local68 = (local41 >> 1) + this.anInt1868;
		@Pc(76) int local76 = this.anInt1867 + (local44 >> 1);
		@Pc(85) int local85 = this.anInt1867 + (local44 + 1 >> 1);
		this.method2717(local68 * 128, local76 * 128);
		@Pc(99) int[][] local99 = Static56.anIntArrayArrayArray7[this.anInt1876];
		@Pc(125) int local125 = local99[local61][local85] + local99[local68][local85] + local99[local68][local76] + local99[local61][local76] >> 2;
		@Pc(135) int local135 = (this.anInt1868 << 7) + (local41 << 6);
		@Pc(145) int[][] local145 = null;
		@Pc(154) int local154 = (this.anInt1867 << 7) + (local44 << 6);
		if (local8) {
			local145 = Static130.anIntArrayArrayArray19[0];
		} else if (this.anInt1876 < 3) {
			local145 = Static56.anIntArrayArrayArray7[this.anInt1876 + 1];
		}
		@Pc(191) Class2_Sub2_Sub21 local191;
		if (this.aClass2_Sub2_Sub9_3 == null) {
			local191 = local17.method2119(this.anInt1878, local145, local99, local135, false, local154, this.anInt1869, local125);
		} else {
			local191 = local17.method2126(local125, local135, this.anInt1878, local154, this.anInt1883, this.aClass2_Sub2_Sub9_3, local99, local145, this.anInt1869);
		}
		return local191 == null ? null : local191.aClass12_8;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class12 local7 = this.method1300();
		if (local7 != null) {
			local7.method2715(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt1870 = local7.method2718();
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)V")
	@Override
	public void method2717(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub2_Sub9_3 == null) {
			return;
		}
		@Pc(14) int local14 = Static103.anInt2511 - this.anInt1873;
		if (local14 > 100 && this.aClass2_Sub2_Sub9_3.anInt2342 > 0) {
			@Pc(33) int local33 = this.aClass2_Sub2_Sub9_3.anIntArray233.length - this.aClass2_Sub2_Sub9_3.anInt2342;
			while (this.anInt1883 < local33 && local14 > this.aClass2_Sub2_Sub9_3.anIntArray235[this.anInt1883]) {
				local14 -= this.aClass2_Sub2_Sub9_3.anIntArray235[this.anInt1883];
				this.anInt1883++;
			}
			if (local33 <= this.anInt1883) {
				@Pc(76) int local76 = 0;
				for (@Pc(78) int local78 = local33; local78 < this.aClass2_Sub2_Sub9_3.anIntArray233.length; local78++) {
					local76 += this.aClass2_Sub2_Sub9_3.anIntArray235[local78];
				}
				local14 %= local76;
			}
		}
		label56: {
			do {
				do {
					if (local14 <= this.aClass2_Sub2_Sub9_3.anIntArray235[this.anInt1883]) {
						break label56;
					}
					Static55.method1083(false, arg1, this.anInt1883, arg0, this.aClass2_Sub2_Sub9_3);
					local14 -= this.aClass2_Sub2_Sub9_3.anIntArray235[this.anInt1883];
					this.anInt1883++;
				} while (this.aClass2_Sub2_Sub9_3.anIntArray233.length > this.anInt1883);
				this.anInt1883 -= this.aClass2_Sub2_Sub9_3.anInt2342;
			} while (this.anInt1883 >= 0 && this.aClass2_Sub2_Sub9_3.anIntArray233.length > this.anInt1883);
			this.aClass2_Sub2_Sub9_3 = null;
		}
		this.anInt1873 = Static103.anInt2511 - local14;
	}
}
