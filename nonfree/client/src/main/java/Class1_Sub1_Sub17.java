import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vd", name = "hb", descriptor = "[I")
	private int[] anIntArray391;

	@OriginalMember(owner = "client!vd", name = "ab", descriptor = "[I")
	private final int[] anIntArray388 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!vd", name = "fb", descriptor = "[I")
	private final int[] anIntArray390 = new int[6];

	@OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
	public int anInt2795 = -1;

	@OriginalMember(owner = "client!vd", name = "db", descriptor = "[I")
	private final int[] anIntArray389 = new int[6];

	@OriginalMember(owner = "client!vd", name = "mb", descriptor = "Z")
	public boolean aBoolean129 = false;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method1835() {
		if (this.anIntArray391 == null) {
			return null;
		}
		@Pc(21) Class1_Sub1_Sub2_Sub6[] local21 = new Class1_Sub1_Sub2_Sub6[this.anIntArray391.length];
		for (@Pc(23) int local23 = 0; local23 < this.anIntArray391.length; local23++) {
			local21[local23] = Static81.method1442(Static73.aClass55_31, this.anIntArray391[local23]);
		}
		@Pc(48) Class1_Sub1_Sub2_Sub6 local48;
		if (local21.length == 1) {
			local48 = local21[0];
		} else {
			local48 = new Class1_Sub1_Sub2_Sub6(local21, local21.length);
		}
		for (@Pc(58) int local58 = 0; local58 < 6 && this.anIntArray390[local58] != 0; local58++) {
			local48.method1427(this.anIntArray390[local58], this.anIntArray389[local58]);
		}
		return local48;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!rc;)V")
	public void method1836(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method716();
			if (local12 == 0) {
				return;
			}
			this.method1845(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method1843() {
		@Pc(7) int local7 = 0;
		@Pc(10) Class1_Sub1_Sub2_Sub6[] local10 = new Class1_Sub1_Sub2_Sub6[5];
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray388[local12] != -1) {
				local10[local7++] = Static81.method1442(Static73.aClass55_31, this.anIntArray388[local12]);
			}
		}
		@Pc(42) Class1_Sub1_Sub2_Sub6 local42 = new Class1_Sub1_Sub2_Sub6(local10, local7);
		for (@Pc(44) int local44 = 0; local44 < 6 && this.anIntArray390[local44] != 0; local44++) {
			local42.method1427(this.anIntArray390[local44], this.anIntArray389[local44]);
		}
		return local42;
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)Z")
	public boolean method1844() {
		if (this.anIntArray391 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray391.length; local12++) {
			if (!Static73.aClass55_31.method1886(this.anIntArray391[local12], 0)) {
				local10 = false;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!rc;)V")
	private void method1845(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt2795 = arg1.method716();
		} else if (arg0 == 2) {
			@Pc(29) int local29 = arg1.method716();
			this.anIntArray391 = new int[local29];
			for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
				this.anIntArray391[local35] = arg1.method715();
			}
		} else if (arg0 == 3) {
			this.aBoolean129 = true;
		} else if (arg0 >= 40 && arg0 < 50) {
			this.anIntArray390[arg0 - 40] = arg1.method715();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.anIntArray389[arg0 - 50] = arg1.method715();
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray388[arg0 - 60] = arg1.method715();
		}
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)Z")
	public boolean method1846() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray388[local9] != -1 && !Static73.aClass55_31.method1886(this.anIntArray388[local9], 0)) {
				local7 = false;
			}
		}
		return local7;
	}
}
