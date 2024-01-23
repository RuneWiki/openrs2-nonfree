import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class136 {

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
	public int anInt4056;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
	public int anInt4057;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "Ljava/lang/String;")
	public String aString141;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
	public int anInt4066;

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
	public int anInt4068;

	@OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
	private int anInt4072;

	@OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
	public int anInt4075;

	@OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
	private int anInt4076;

	@OriginalMember(owner = "client!pl", name = "H", descriptor = "I")
	private int anInt4077;

	@OriginalMember(owner = "client!pl", name = "I", descriptor = "[I")
	public int[] anIntArray459;

	@OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
	public int anInt4078;

	@OriginalMember(owner = "client!pl", name = "M", descriptor = "Ljava/lang/String;")
	public String aString142;

	@OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
	private int anInt4081;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
	private int anInt4054 = -1;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
	public int anInt4058 = 0;

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "Z")
	public boolean aBoolean367 = false;

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "Z")
	public boolean aBoolean368 = true;

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
	public int anInt4062 = -1;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
	public int anInt4060 = -1;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	private int anInt4059 = -1;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "Z")
	public boolean aBoolean366 = true;

	@OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
	private int anInt4080 = -1;

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
	public int anInt4067 = -1;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
	private int anInt4055 = -1;

	@OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
	private int anInt4079 = -1;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "Z")
	public boolean aBoolean365 = true;

	@OriginalMember(owner = "client!pl", name = "D", descriptor = "I")
	public int anInt4073 = -1;

	@OriginalMember(owner = "client!pl", name = "y", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray24 = new String[5];

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZI)Lclient!oh;")
	public Class57 method3519(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt4060 : this.anInt4062;
		@Pc(24) Class57 local24 = (Class57) Static111.aClass175_17.method4295((long) ((arg1 ? 65536 : 0) | local11));
		if (local24 != null) {
			return local24;
		} else if (Static228.aClass119_76.method3250(local11)) {
			@Pc(43) Class57_Sub1 local43 = Static197.method3409(Static228.aClass119_76, local11);
			if (Static71.aBoolean165 && !arg0) {
				local24 = new Class57_Sub2(local43);
			} else {
				local24 = local43;
			}
			if (local24 != null) {
				local24.anInt3769 = 0;
				local24.anInt3762 = 0;
				local24.anInt3770 = local24.anInt3768;
				local24.anInt3763 = local24.anInt3766;
				Static111.aClass175_17.method4285(local24, (long) (local11 | (arg1 ? 65536 : 0)));
			}
			return local24;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!fh;B)V")
	public void method3520(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(19) int local19 = arg0.method1853();
			if (local19 == 0) {
				return;
			}
			this.method3527(arg0, local19);
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Z")
	public boolean method3522() {
		if (this.anInt4080 == -1 && this.anInt4059 == -1) {
			return true;
		}
		@Pc(31) int local31;
		if (this.anInt4080 == -1) {
			local31 = Static11.method173(this.anInt4059);
		} else {
			local31 = Static99.anIntArray148[this.anInt4080];
		}
		if (local31 < this.anInt4072 || local31 > this.anInt4081) {
			return false;
		} else if (this.anInt4079 == -1 && this.anInt4054 == -1) {
			return true;
		} else {
			if (this.anInt4079 == -1) {
				local31 = Static11.method173(this.anInt4054);
			} else {
				local31 = Static99.anIntArray148[this.anInt4079];
			}
			return this.anInt4076 <= local31 && this.anInt4077 >= local31;
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)Lclient!fo;")
	public Class57_Sub1 method3523() {
		@Pc(21) Class57_Sub1 local21 = (Class57_Sub1) Static111.aClass175_17.method4295((long) (this.anInt4055 | 0x20000));
		if (local21 != null) {
			return local21;
		}
		Static228.aClass119_76.method3250(this.anInt4055);
		local21 = Static197.method3409(Static228.aClass119_76, this.anInt4055);
		if (local21 != null) {
			local21.anInt3762 = 0;
			local21.anInt3763 = local21.anInt3766;
			local21.anInt3769 = 0;
			local21.anInt3770 = local21.anInt3768;
			Static111.aClass175_17.method4285(local21, (long) (this.anInt4055 | 0x20000));
		}
		return local21;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!fh;I)V")
	private void method3527(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4062 = arg0.method1879();
		} else if (arg1 == 2) {
			this.anInt4060 = arg0.method1879();
		} else if (arg1 == 3) {
			this.aString142 = arg0.method1827();
		} else if (arg1 == 4) {
			this.anInt4068 = arg0.method1878();
		} else if (arg1 == 5) {
			this.anInt4067 = arg0.method1878();
		} else if (arg1 == 6) {
			this.anInt4058 = arg0.method1853();
		} else {
			@Pc(53) int local53;
			if (arg1 == 7) {
				local53 = arg0.method1853();
				if ((local53 & 0x2) == 2) {
					this.aBoolean367 = true;
				}
				if ((local53 & 0x1) == 0) {
					this.aBoolean366 = false;
				}
			} else if (arg1 == 8) {
				this.aBoolean365 = arg0.method1853() == 1;
			} else if (arg1 == 9) {
				this.anInt4059 = arg0.method1879();
				if (this.anInt4059 == 65535) {
					this.anInt4059 = -1;
				}
				this.anInt4080 = arg0.method1879();
				if (this.anInt4080 == 65535) {
					this.anInt4080 = -1;
				}
				this.anInt4072 = arg0.method1860();
				this.anInt4081 = arg0.method1860();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray24[arg1 - 10] = arg0.method1827();
			} else if (arg1 == 15) {
				local53 = arg0.method1853();
				this.anIntArray459 = new int[local53 * 2];
				for (@Pc(163) int local163 = 0; local163 < local53 * 2; local163++) {
					this.anIntArray459[local163] = arg0.method1843();
				}
				this.anInt4057 = arg0.method1860();
				this.anInt4075 = arg0.method1860();
			} else if (arg1 == 16) {
				this.aBoolean368 = false;
			} else if (arg1 == 17) {
				this.aString141 = arg0.method1827();
			} else if (arg1 == 18) {
				this.anInt4055 = arg0.method1879();
			} else if (arg1 == 19) {
				this.anInt4073 = arg0.method1879();
			} else if (arg1 == 20) {
				this.anInt4054 = arg0.method1879();
				if (this.anInt4054 == 65535) {
					this.anInt4054 = -1;
				}
				this.anInt4079 = arg0.method1879();
				if (this.anInt4079 == 65535) {
					this.anInt4079 = -1;
				}
				this.anInt4076 = arg0.method1860();
				this.anInt4077 = arg0.method1860();
			} else if (arg1 == 21) {
				this.anInt4066 = arg0.method1860();
			} else if (arg1 == 22) {
				this.anInt4056 = arg0.method1860();
			}
		}
	}
}
