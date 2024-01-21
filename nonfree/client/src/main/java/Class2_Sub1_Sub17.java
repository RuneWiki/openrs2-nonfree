import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!we", name = "X", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!we", name = "kb", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!we", name = "rb", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!we", name = "vb", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!we", name = "wb", descriptor = "[I")
	private int[] anIntArray379;

	@OriginalMember(owner = "client!we", name = "Y", descriptor = "[I")
	private final int[] anIntArray378 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!we", name = "V", descriptor = "Z")
	public boolean aBoolean251 = false;

	@OriginalMember(owner = "client!we", name = "ob", descriptor = "I")
	public int anInt3076 = -1;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)Lclient!wc;")
	public Class2_Sub1_Sub1_Sub7 method2217() {
		if (this.anIntArray379 == null) {
			return null;
		}
		@Pc(15) Class2_Sub1_Sub1_Sub7[] local15 = new Class2_Sub1_Sub1_Sub7[this.anIntArray379.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray379.length; local17++) {
			local15[local17] = Static131.method2175(Static38.aClass24_11, this.anIntArray379[local17]);
		}
		@Pc(53) Class2_Sub1_Sub1_Sub7 local53;
		if (local15.length == 1) {
			local53 = local15[0];
		} else {
			local53 = new Class2_Sub1_Sub1_Sub7(local15, local15.length);
		}
		@Pc(67) int local67;
		if (this.aShortArray36 != null) {
			for (local67 = 0; local67 < this.aShortArray36.length; local67++) {
				local53.method2184(this.aShortArray36[local67], this.aShortArray38[local67]);
			}
		}
		if (this.aShortArray37 != null) {
			for (local67 = 0; local67 < this.aShortArray37.length; local67++) {
				local53.method2191(this.aShortArray37[local67], this.aShortArray39[local67]);
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(I)Z")
	public boolean method2218() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray378[local9] != -1 && !Static38.aClass24_11.method1924(this.anIntArray378[local9], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!na;II)V")
	private void method2222(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3076 = arg0.method640();
			return;
		}
		@Pc(35) int local35;
		@Pc(45) int local45;
		if (arg1 == 2) {
			local35 = arg0.method640();
			this.anIntArray379 = new int[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.anIntArray379[local45] = arg0.method632();
			}
		} else if (arg1 == 3) {
			this.aBoolean251 = true;
		} else if (arg1 == 40) {
			local35 = arg0.method640();
			this.aShortArray36 = new short[local35];
			this.aShortArray38 = new short[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.aShortArray36[local45] = (short) arg0.method632();
				this.aShortArray38[local45] = (short) arg0.method632();
			}
		} else if (arg1 == 41) {
			local35 = arg0.method640();
			this.aShortArray39 = new short[local35];
			this.aShortArray37 = new short[local35];
			for (local45 = 0; local45 < local35; local45++) {
				this.aShortArray37[local45] = (short) arg0.method632();
				this.aShortArray39[local45] = (short) arg0.method632();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray378[arg1 - 60] = arg0.method632();
		}
	}

	@OriginalMember(owner = "client!we", name = "g", descriptor = "(I)Lclient!wc;")
	public Class2_Sub1_Sub1_Sub7 method2227() {
		@Pc(8) Class2_Sub1_Sub1_Sub7[] local8 = new Class2_Sub1_Sub1_Sub7[5];
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			if (this.anIntArray378[local18] != -1) {
				local8[local10++] = Static131.method2175(Static38.aClass24_11, this.anIntArray378[local18]);
			}
		}
		@Pc(48) Class2_Sub1_Sub1_Sub7 local48 = new Class2_Sub1_Sub1_Sub7(local8, local10);
		@Pc(53) int local53;
		if (this.aShortArray36 != null) {
			for (local53 = 0; local53 < this.aShortArray36.length; local53++) {
				local48.method2184(this.aShortArray36[local53], this.aShortArray38[local53]);
			}
		}
		if (this.aShortArray37 != null) {
			for (local53 = 0; local53 < this.aShortArray37.length; local53++) {
				local48.method2191(this.aShortArray37[local53], this.aShortArray39[local53]);
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)Z")
	public boolean method2228() {
		if (this.anIntArray379 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray379.length; local14++) {
			if (!Static38.aClass24_11.method1924(this.anIntArray379[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BLclient!na;)V")
	public void method2229(@OriginalArg(1) Class2_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method640();
			if (local9 == 0) {
				return;
			}
			this.method2222(arg0, local9);
		}
	}
}
