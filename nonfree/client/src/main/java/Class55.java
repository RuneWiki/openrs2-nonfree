import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class55 {

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "Z")
	public boolean aBoolean122 = false;

	@OriginalMember(owner = "client!fj", name = "r", descriptor = "[I")
	private int[] anIntArray116 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
	public int anInt1724 = -1;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)Z")
	public boolean method1281() {
		if (this.anIntArray115 == null) {
			return true;
		}
		@Pc(21) boolean local21 = true;
		for (@Pc(23) int local23 = 0; local23 < this.anIntArray115.length; local23++) {
			if (!Static232.aClass132_80.method3180(0, this.anIntArray115[local23])) {
				local21 = false;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!aj;II)V")
	private void method1282(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1724 = arg0.method2334();
			return;
		}
		@Pc(61) int local61;
		@Pc(71) int local71;
		if (arg1 == 2) {
			local61 = arg0.method2334();
			this.anIntArray115 = new int[local61];
			for (local71 = 0; local71 < local61; local71++) {
				this.anIntArray115[local71] = arg0.method2375();
			}
		} else if (arg1 == 3) {
			this.aBoolean122 = true;
		} else if (arg1 == 40) {
			local61 = arg0.method2334();
			this.aShortArray14 = new short[local61];
			this.aShortArray16 = new short[local61];
			for (local71 = 0; local71 < local61; local71++) {
				this.aShortArray16[local71] = (short) arg0.method2375();
				this.aShortArray14[local71] = (short) arg0.method2375();
			}
		} else if (arg1 == 41) {
			local61 = arg0.method2334();
			this.aShortArray13 = new short[local61];
			this.aShortArray15 = new short[local61];
			for (local71 = 0; local71 < local61; local71++) {
				this.aShortArray15[local71] = (short) arg0.method2375();
				this.aShortArray13[local71] = (short) arg0.method2375();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray116[arg1 - 60] = arg0.method2375();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLclient!aj;)V")
	public void method1285(@OriginalArg(1) Class8_Sub2 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2334();
			if (local15 == 0) {
				return;
			}
			this.method1282(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)Lclient!vi;")
	public Class36_Sub7 method1286() {
		if (this.anIntArray115 == null) {
			return null;
		}
		@Pc(16) Class36_Sub7[] local16 = new Class36_Sub7[this.anIntArray115.length];
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray115.length; local18++) {
			local16[local18] = Static281.method4202(Static232.aClass132_80, this.anIntArray115[local18]);
		}
		@Pc(51) Class36_Sub7 local51;
		if (local16.length == 1) {
			local51 = local16[0];
		} else {
			local51 = new Class36_Sub7(local16, local16.length);
		}
		@Pc(62) int local62;
		if (this.aShortArray16 != null) {
			for (local62 = 0; local62 < this.aShortArray16.length; local62++) {
				local51.method4200(this.aShortArray16[local62], this.aShortArray14[local62]);
			}
		}
		if (this.aShortArray15 != null) {
			for (local62 = 0; local62 < this.aShortArray15.length; local62++) {
				local51.method4183(this.aShortArray15[local62], this.aShortArray13[local62]);
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)Z")
	public boolean method1287() {
		@Pc(15) boolean local15 = true;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray116[local17] != -1 && !Static232.aClass132_80.method3180(0, this.anIntArray116[local17])) {
				local15 = false;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)Lclient!vi;")
	public Class36_Sub7 method1288() {
		@Pc(10) Class36_Sub7[] local10 = new Class36_Sub7[5];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			if (this.anIntArray116[local18] != -1) {
				local10[local16++] = Static281.method4202(Static232.aClass132_80, this.anIntArray116[local18]);
			}
		}
		@Pc(51) Class36_Sub7 local51 = new Class36_Sub7(local10, local16);
		@Pc(56) int local56;
		if (this.aShortArray16 != null) {
			for (local56 = 0; local56 < this.aShortArray16.length; local56++) {
				local51.method4200(this.aShortArray16[local56], this.aShortArray14[local56]);
			}
		}
		if (this.aShortArray15 != null) {
			for (local56 = 0; local56 < this.aShortArray15.length; local56++) {
				local51.method4183(this.aShortArray15[local56], this.aShortArray13[local56]);
			}
		}
		return local51;
	}
}
