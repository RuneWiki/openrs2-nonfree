import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class3_Sub1_Sub16 extends Class3_Sub1 {

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!tg", name = "O", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!tg", name = "W", descriptor = "[I")
	private int[] anIntArray474;

	@OriginalMember(owner = "client!tg", name = "X", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!tg", name = "db", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!tg", name = "L", descriptor = "Z")
	public boolean aBoolean155 = false;

	@OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
	public int anInt3924 = -1;

	@OriginalMember(owner = "client!tg", name = "cb", descriptor = "[I")
	private final int[] anIntArray475 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!mb;Z)V")
	public void method2806(@OriginalArg(0) Class3_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2107();
			if (local9 == 0) {
				return;
			}
			this.method2807(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!mb;BI)V")
	private void method2807(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3924 = arg0.method2107();
			return;
		}
		@Pc(35) int local35;
		@Pc(45) int local45;
		if (arg1 == 2) {
			local35 = arg0.method2107();
			this.anIntArray474 = new int[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.anIntArray474[local45] = arg0.method2111();
			}
		} else if (arg1 == 3) {
			this.aBoolean155 = true;
		} else if (arg1 == 40) {
			local35 = arg0.method2107();
			this.aShortArray49 = new short[local35];
			this.aShortArray51 = new short[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.aShortArray49[local45] = (short) arg0.method2111();
				this.aShortArray51[local45] = (short) arg0.method2111();
			}
		} else if (arg1 == 41) {
			local35 = arg0.method2107();
			this.aShortArray52 = new short[local35];
			this.aShortArray50 = new short[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.aShortArray52[local45] = (short) arg0.method2111();
				this.aShortArray50[local45] = (short) arg0.method2111();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray475[arg1 - 60] = arg0.method2111();
		}
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(B)Z")
	public boolean method2808() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray475[local9] != -1 && !Static169.aClass1_10.method52(this.anIntArray475[local9], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)Z")
	public boolean method2809() {
		if (this.anIntArray474 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray474.length; local14++) {
			if (!Static169.aClass1_10.method52(this.anIntArray474[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)Lclient!ob;")
	public Class3_Sub1_Sub5_Sub5 method2810() {
		@Pc(8) Class3_Sub1_Sub5_Sub5[] local8 = new Class3_Sub1_Sub5_Sub5[5];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray475[local17] != -1) {
				local8[local10++] = Static127.method1911(Static169.aClass1_10, this.anIntArray475[local17]);
			}
		}
		@Pc(46) Class3_Sub1_Sub5_Sub5 local46 = new Class3_Sub1_Sub5_Sub5(local8, local10);
		@Pc(51) int local51;
		if (this.aShortArray49 != null) {
			for (local51 = 0; local51 < this.aShortArray49.length; local51++) {
				local46.method1901(this.aShortArray49[local51], this.aShortArray51[local51]);
			}
		}
		if (this.aShortArray52 != null) {
			for (local51 = 0; local51 < this.aShortArray52.length; local51++) {
				local46.method1899(this.aShortArray52[local51], this.aShortArray50[local51]);
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "(I)Lclient!ob;")
	public Class3_Sub1_Sub5_Sub5 method2814() {
		if (this.anIntArray474 == null) {
			return null;
		}
		@Pc(28) Class3_Sub1_Sub5_Sub5[] local28 = new Class3_Sub1_Sub5_Sub5[this.anIntArray474.length];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray474.length; local30++) {
			local28[local30] = Static127.method1911(Static169.aClass1_10, this.anIntArray474[local30]);
		}
		@Pc(65) Class3_Sub1_Sub5_Sub5 local65;
		if (local28.length == 1) {
			local65 = local28[0];
		} else {
			local65 = new Class3_Sub1_Sub5_Sub5(local28, local28.length);
		}
		@Pc(76) int local76;
		if (this.aShortArray49 != null) {
			for (local76 = 0; local76 < this.aShortArray49.length; local76++) {
				local65.method1901(this.aShortArray49[local76], this.aShortArray51[local76]);
			}
		}
		if (this.aShortArray52 != null) {
			for (local76 = 0; local76 < this.aShortArray52.length; local76++) {
				local65.method1899(this.aShortArray52[local76], this.aShortArray50[local76]);
			}
		}
		return local65;
	}
}
