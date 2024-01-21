import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class1_Sub3_Sub20 extends Class1_Sub3 {

	@OriginalMember(owner = "client!re", name = "Z", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!re", name = "bb", descriptor = "[I")
	private int[] anIntArray297;

	@OriginalMember(owner = "client!re", name = "db", descriptor = "[I")
	public int[] anIntArray298;

	@OriginalMember(owner = "client!re", name = "eb", descriptor = "[I")
	public int[] anIntArray299;

	@OriginalMember(owner = "client!re", name = "lb", descriptor = "[I")
	public int[] anIntArray300;

	@OriginalMember(owner = "client!re", name = "O", descriptor = "I")
	public int anInt3387 = -1;

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
	public int anInt3388 = -1;

	@OriginalMember(owner = "client!re", name = "M", descriptor = "I")
	public int anInt3386 = 5;

	@OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
	public int anInt3395 = -1;

	@OriginalMember(owner = "client!re", name = "R", descriptor = "I")
	public int anInt3389 = 99;

	@OriginalMember(owner = "client!re", name = "S", descriptor = "I")
	public int anInt3390 = -1;

	@OriginalMember(owner = "client!re", name = "kb", descriptor = "Z")
	public boolean aBoolean190 = false;

	@OriginalMember(owner = "client!re", name = "jb", descriptor = "I")
	public int anInt3402 = -1;

	@OriginalMember(owner = "client!re", name = "ob", descriptor = "I")
	public int anInt3405 = 2;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!ee;Lclient!re;II)Lclient!ee;")
	public Class8_Sub5 method2547(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub5 arg1, @OriginalArg(2) Class1_Sub3_Sub20 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray300[arg0];
		@Pc(25) Class1_Sub3_Sub10 local25 = Static163.method2688(local8 >> 16);
		@Pc(29) int local29 = local8 & 0xFFFF;
		if (local25 == null) {
			return arg2.method2556(arg3, arg1);
		}
		@Pc(42) int local42 = arg2.anIntArray300[arg3];
		@Pc(48) Class1_Sub3_Sub10 local48 = Static163.method2688(local42 >> 16);
		@Pc(52) int local52 = local42 & 0xFFFF;
		@Pc(65) Class8_Sub5 local65;
		if (local48 == null) {
			local65 = arg1.method2052(!local25.method1301(local29));
			local65.method2040(local25, local29);
			return local65;
		} else {
			local65 = arg1.method2052(!local25.method1301(local29) & !local48.method1301(local52));
			local65.method2037(local25, local29, local48, local52, this.anIntArray297);
			return local65;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ka;I)V")
	public void method2548(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3010();
			if (local5 == 0) {
				return;
			}
			this.method2554(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
	public void method2549() {
		if (this.anInt3387 == -1) {
			if (this.anIntArray297 == null) {
				this.anInt3387 = 0;
			} else {
				this.anInt3387 = 2;
			}
		}
		if (this.anInt3395 != -1) {
			return;
		}
		if (this.anIntArray297 == null) {
			this.anInt3395 = 0;
		} else {
			this.anInt3395 = 2;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILclient!ee;)Lclient!ee;")
	public Class8_Sub5 method2550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class8_Sub5 arg2) {
		@Pc(10) int local10 = this.anIntArray300[arg1];
		@Pc(16) Class1_Sub3_Sub10 local16 = Static163.method2688(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg2.method2052(true);
		}
		@Pc(30) int local30 = arg0 & 0x3;
		@Pc(41) Class8_Sub5 local41 = arg2.method2052(!local16.method1301(local20));
		if (local30 == 1) {
			local41.method2051();
		} else if (local30 == 2) {
			local41.method2053();
		} else if (local30 == 3) {
			local41.method2047();
		}
		local41.method2040(local16, local20);
		if (local30 == 1) {
			local41.method2047();
		} else if (local30 == 2) {
			local41.method2053();
		} else if (local30 == 3) {
			local41.method2051();
		}
		return local41;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ee;II)Lclient!ee;")
	public Class8_Sub5 method2551(@OriginalArg(0) Class8_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray300[arg1];
		@Pc(16) Class1_Sub3_Sub10 local16 = Static163.method2688(local4 >> 16);
		@Pc(20) int local20 = local4 & 0xFFFF;
		if (local16 == null) {
			return arg0.method2043(true);
		} else {
			@Pc(43) Class8_Sub5 local43 = arg0.method2043(!local16.method1301(local20));
			local43.method2040(local16, local20);
			return local43;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ka;II)V")
	private void method2554(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		@Pc(33) int local33;
		if (arg1 == 1) {
			local8 = arg0.method3023();
			this.anIntArray298 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray298[local14] = arg0.method3023();
			}
			this.anIntArray300 = new int[local8];
			for (local33 = 0; local33 < local8; local33++) {
				this.anIntArray300[local33] = arg0.method3023();
			}
			for (@Pc(48) int local48 = 0; local48 < local8; local48++) {
				this.anIntArray300[local48] = (arg0.method3023() << 16) + this.anIntArray300[local48];
			}
		} else if (arg1 == 2) {
			this.anInt3390 = arg0.method3023();
		} else if (arg1 == 3) {
			local8 = arg0.method3010();
			this.anIntArray297 = new int[local8 + 1];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray297[local14] = arg0.method3010();
			}
			this.anIntArray297[local8] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean190 = true;
		} else if (arg1 == 5) {
			this.anInt3386 = arg0.method3010();
		} else if (arg1 == 6) {
			this.anInt3402 = arg0.method3023();
		} else if (arg1 == 7) {
			this.anInt3388 = arg0.method3023();
		} else if (arg1 == 8) {
			this.anInt3389 = arg0.method3010();
		} else if (arg1 == 9) {
			this.anInt3387 = arg0.method3010();
		} else if (arg1 == 10) {
			this.anInt3395 = arg0.method3010();
		} else if (arg1 == 11) {
			this.anInt3405 = arg0.method3010();
		} else if (arg1 == 12) {
			local8 = arg0.method3010();
			this.anIntArray296 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray296[local14] = arg0.method3023();
			}
			for (local33 = 0; local33 < local8; local33++) {
				this.anIntArray296[local33] = (arg0.method3023() << 16) + this.anIntArray296[local33];
			}
		} else if (arg1 == 13) {
			local8 = arg0.method3010();
			this.anIntArray299 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray299[local14] = arg0.method3049();
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BILclient!ee;)Lclient!ee;")
	public Class8_Sub5 method2555(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub5 arg1) {
		@Pc(13) int local13 = this.anIntArray300[arg0];
		@Pc(19) Class1_Sub3_Sub10 local19 = Static163.method2688(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg1.method2052(true);
		}
		@Pc(31) int local31 = 0;
		@Pc(33) Class1_Sub3_Sub10 local33 = null;
		if (this.anIntArray296 != null && arg0 < this.anIntArray296.length) {
			local31 = this.anIntArray296[arg0];
			local33 = Static163.method2688(local31 >> 16);
			local31 &= 0xFFFF;
		}
		@Pc(74) Class8_Sub5 local74;
		if (local33 == null || local31 == 65535) {
			local74 = arg1.method2052(!local19.method1301(local23));
			local74.method2040(local19, local23);
			return local74;
		} else {
			local74 = arg1.method2052(!local19.method1301(local23) & !local33.method1301(local31));
			local74.method2040(local19, local23);
			local74.method2040(local33, local31);
			return local74;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!ee;I)Lclient!ee;")
	public Class8_Sub5 method2556(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub5 arg1) {
		@Pc(9) int local9 = this.anIntArray300[arg0];
		@Pc(15) Class1_Sub3_Sub10 local15 = Static163.method2688(local9 >> 16);
		@Pc(23) int local23 = local9 & 0xFFFF;
		if (local15 == null) {
			return arg1.method2052(true);
		} else {
			@Pc(40) Class8_Sub5 local40 = arg1.method2052(!local15.method1301(local23));
			local40.method2040(local15, local23);
			return local40;
		}
	}
}
