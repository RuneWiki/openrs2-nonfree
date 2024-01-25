import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class112 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "[I")
	private int[] anIntArray355;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "[I")
	private final int[] anIntArray356 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
	public int anInt2882 = -1;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "Z")
	public boolean aBoolean224 = false;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!ec;I)V")
	public void method3084(@OriginalArg(0) Class6_Sub10 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3972();
			if (local9 == 0) {
				return;
			}
			this.method3086(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!ec;IZ)V")
	private void method3086(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2882 = arg0.method3972();
			return;
		}
		@Pc(25) int local25;
		@Pc(31) int local31;
		if (arg1 == 2) {
			local25 = arg0.method3972();
			this.anIntArray355 = new int[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.anIntArray355[local31] = arg0.method4021();
			}
		} else if (arg1 == 3) {
			this.aBoolean224 = true;
		} else if (arg1 == 40) {
			local25 = arg0.method3972();
			this.aShortArray60 = new short[local25];
			this.aShortArray61 = new short[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.aShortArray60[local31] = (short) arg0.method4021();
				this.aShortArray61[local31] = (short) arg0.method4021();
			}
		} else if (arg1 == 41) {
			local25 = arg0.method3972();
			this.aShortArray63 = new short[local25];
			this.aShortArray62 = new short[local25];
			for (local31 = 0; local31 < local25; local31++) {
				this.aShortArray62[local31] = (short) arg0.method4021();
				this.aShortArray63[local31] = (short) arg0.method4021();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray356[arg1 - 60] = arg0.method4021();
			return;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Lclient!eb;")
	public Class57 method3087() {
		if (this.anIntArray355 == null) {
			return null;
		}
		@Pc(15) Class57[] local15 = new Class57[this.anIntArray355.length];
		@Pc(17) Class53 local17 = Static143.aClass53_84;
		synchronized (Static143.aClass53_84) {
			@Pc(21) int local21 = 0;
			while (true) {
				if (this.anIntArray355.length <= local21) {
					break;
				}
				local15[local21] = Static287.method4917(this.anIntArray355[local21], Static143.aClass53_84);
				local21++;
			}
		}
		@Pc(57) Class57 local57;
		if (local15.length == 1) {
			local57 = local15[0];
		} else {
			local57 = new Class57(local15, local15.length);
		}
		if (local57 == null) {
			return null;
		}
		@Pc(71) int local71;
		if (this.aShortArray60 != null) {
			for (local71 = 0; local71 < this.aShortArray60.length; local71++) {
				local57.method1142(this.aShortArray60[local71], this.aShortArray61[local71]);
			}
		}
		if (this.aShortArray62 != null) {
			for (local71 = 0; local71 < this.aShortArray62.length; local71++) {
				local57.method1143(this.aShortArray63[local71], this.aShortArray62[local71]);
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)Lclient!eb;")
	public Class57 method3088() {
		@Pc(15) Class57[] local15 = new Class57[5];
		@Pc(17) int local17 = 0;
		@Pc(19) Class53 local19 = Static143.aClass53_84;
		synchronized (Static143.aClass53_84) {
			for (@Pc(23) int local23 = 0; local23 < 5; local23++) {
				if (this.anIntArray356[local23] != -1) {
					local15[local17++] = Static287.method4917(this.anIntArray356[local23], Static143.aClass53_84);
				}
			}
		}
		@Pc(62) Class57 local62 = new Class57(local15, local17);
		@Pc(67) int local67;
		if (this.aShortArray60 != null) {
			for (local67 = 0; local67 < this.aShortArray60.length; local67++) {
				local62.method1142(this.aShortArray60[local67], this.aShortArray61[local67]);
			}
		}
		if (this.aShortArray62 != null) {
			for (local67 = 0; local67 < this.aShortArray62.length; local67++) {
				local62.method1143(this.aShortArray63[local67], this.aShortArray62[local67]);
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)Z")
	public boolean method3089() {
		if (this.anIntArray355 == null) {
			return true;
		}
		@Pc(18) boolean local18 = true;
		@Pc(20) Class53 local20 = Static143.aClass53_84;
		synchronized (Static143.aClass53_84) {
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray355.length; local24++) {
				if (!Static143.aClass53_84.method1036(this.anIntArray355[local24], 0)) {
					local18 = false;
				}
			}
			return local18;
		}
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)Z")
	public boolean method3093() {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class53 local9 = Static143.aClass53_84;
		synchronized (Static143.aClass53_84) {
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray356[local13] != -1 && !Static143.aClass53_84.method1036(this.anIntArray356[local13], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}
}
