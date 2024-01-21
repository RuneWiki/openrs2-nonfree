import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class10_Sub1_Sub3 extends Class10_Sub1 {

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "[I")
	public int[] anIntArray48;

	@OriginalMember(owner = "client!cc", name = "gb", descriptor = "[I")
	private int[] anIntArray49;

	@OriginalMember(owner = "client!cc", name = "nb", descriptor = "[I")
	private int[] anIntArray50;

	@OriginalMember(owner = "client!cc", name = "qb", descriptor = "I")
	public int anInt389;

	@OriginalMember(owner = "client!cc", name = "Fb", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!cc", name = "Hb", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
	private int anInt375 = 128;

	@OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
	private int anInt374 = -1;

	@OriginalMember(owner = "client!cc", name = "eb", descriptor = "Z")
	public boolean aBoolean14 = true;

	@OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
	public int anInt384 = -1;

	@OriginalMember(owner = "client!cc", name = "cb", descriptor = "[Lclient!va;")
	public final Class61[] aClass61Array3 = new Class61[5];

	@OriginalMember(owner = "client!cc", name = "jb", descriptor = "Z")
	public boolean aBoolean15 = false;

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
	public int anInt370 = -1;

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
	private int anInt372 = -1;

	@OriginalMember(owner = "client!cc", name = "pb", descriptor = "I")
	private int anInt388 = 0;

	@OriginalMember(owner = "client!cc", name = "xb", descriptor = "I")
	private int anInt393 = 0;

	@OriginalMember(owner = "client!cc", name = "sb", descriptor = "I")
	public int anInt390 = -1;

	@OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
	public int anInt379 = -1;

	@OriginalMember(owner = "client!cc", name = "Ab", descriptor = "I")
	private int anInt396 = 128;

	@OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
	public int anInt378 = 32;

	@OriginalMember(owner = "client!cc", name = "Eb", descriptor = "I")
	public int anInt400 = -1;

	@OriginalMember(owner = "client!cc", name = "mb", descriptor = "Z")
	public boolean aBoolean16 = true;

	@OriginalMember(owner = "client!cc", name = "Bb", descriptor = "I")
	public int anInt397 = 1;

	@OriginalMember(owner = "client!cc", name = "kb", descriptor = "I")
	public int anInt386 = -1;

	@OriginalMember(owner = "client!cc", name = "vb", descriptor = "Lclient!va;")
	public Class61 aClass61_107 = Static54.aClass61_612;

	@OriginalMember(owner = "client!cc", name = "wb", descriptor = "I")
	public int anInt392 = -1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ge;ILclient!ge;II)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method274(@OriginalArg(0) Class10_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10_Sub1_Sub6 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray48 != null) {
			@Pc(12) Class10_Sub1_Sub3 local12 = this.method278();
			return local12 == null ? null : local12.method274(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class10_Sub1_Sub5_Sub4 local32 = (Class10_Sub1_Sub5_Sub4) Static93.aClass29_56.method644((long) this.anInt389);
		if (local32 == null) {
			@Pc(42) boolean local42 = false;
			for (@Pc(44) int local44 = 0; local44 < this.anIntArray49.length; local44++) {
				if (!Static10.aClass11_10.method218(this.anIntArray49[local44], 0)) {
					local42 = true;
				}
			}
			if (local42) {
				return null;
			}
			@Pc(76) Class10_Sub1_Sub5_Sub4[] local76 = new Class10_Sub1_Sub5_Sub4[this.anIntArray49.length];
			for (@Pc(78) int local78 = 0; local78 < this.anIntArray49.length; local78++) {
				local76[local78] = Static84.method1335(Static10.aClass11_10, this.anIntArray49[local78]);
			}
			if (local76.length == 1) {
				local32 = local76[0];
			} else {
				local32 = new Class10_Sub1_Sub5_Sub4(local76, local76.length);
			}
			if (this.anIntArray50 != null) {
				for (@Pc(118) int local118 = 0; local118 < this.anIntArray50.length; local118++) {
					local32.method1328(this.anIntArray50[local118], this.anIntArray52[local118]);
				}
			}
			local32.method1310();
			local32.method1324(this.anInt393 + 64, this.anInt388 + 850, -30, -50, -30, true);
			Static93.aClass29_56.method649(local32, (long) this.anInt389);
		}
		@Pc(175) Class10_Sub1_Sub5_Sub4 local175;
		if (arg2 != null && arg0 != null) {
			local175 = arg2.method583(arg3, local32, arg1, arg0);
		} else if (arg2 != null) {
			local175 = arg2.method579(arg3, local32);
		} else if (arg0 == null) {
			local175 = local32.method1337(true);
		} else {
			local175 = arg0.method579(arg1, local32);
		}
		if (this.anInt375 != 128 || this.anInt396 != 128) {
			local175.method1316(this.anInt375, this.anInt396, this.anInt375);
		}
		return local175;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!tc;)V")
	public void method275(@OriginalArg(1) Class10_Sub10 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1111();
			if (local14 == 0) {
				return;
			}
			this.method284(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Z")
	public boolean method276() {
		if (this.anIntArray48 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt372 != -1) {
			local10 = Static69.method1014(this.anInt372);
		} else if (this.anInt374 != -1) {
			local10 = Static74.anIntArray228[this.anInt374];
		}
		return local10 >= 0 && this.anIntArray48.length > local10 && this.anIntArray48[local10] != -1;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)Lclient!cc;")
	public Class10_Sub1_Sub3 method278() {
		@Pc(6) int local6 = -1;
		if (this.anInt372 != -1) {
			local6 = Static69.method1014(this.anInt372);
		} else if (this.anInt374 != -1) {
			local6 = Static74.anIntArray228[this.anInt374];
		}
		return local6 < 0 || local6 >= this.anIntArray48.length || this.anIntArray48[local6] == -1 ? null : Static53.method802(this.anIntArray48[local6]);
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
	public void method281() {
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method282() {
		if (this.anIntArray48 != null) {
			@Pc(12) Class10_Sub1_Sub3 local12 = this.method278();
			return local12 == null ? null : local12.method282();
		} else if (this.anIntArray51 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray51.length; local29++) {
				if (!Static10.aClass11_10.method218(this.anIntArray51[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(59) Class10_Sub1_Sub5_Sub4[] local59 = new Class10_Sub1_Sub5_Sub4[this.anIntArray51.length];
			for (@Pc(61) int local61 = 0; local61 < this.anIntArray51.length; local61++) {
				local59[local61] = Static84.method1335(Static10.aClass11_10, this.anIntArray51[local61]);
			}
			@Pc(90) Class10_Sub1_Sub5_Sub4 local90;
			if (local59.length == 1) {
				local90 = local59[0];
			} else {
				local90 = new Class10_Sub1_Sub5_Sub4(local59, local59.length);
			}
			if (this.anIntArray50 != null) {
				for (@Pc(101) int local101 = 0; local101 < this.anIntArray50.length; local101++) {
					local90.method1328(this.anIntArray50[local101], this.anIntArray52[local101]);
				}
			}
			return local90;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!tc;I)V")
	private void method284(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub10 arg1) {
		@Pc(210) int local210;
		@Pc(218) int local218;
		if (arg0 == 1) {
			local210 = arg1.method1111();
			this.anIntArray49 = new int[local210];
			for (local218 = 0; local218 < local210; local218++) {
				this.anIntArray49[local218] = arg1.method1160();
			}
		} else if (arg0 == 2) {
			this.aClass61_107 = arg1.method1151();
		} else if (arg0 == 12) {
			this.anInt397 = arg1.method1111();
		} else if (arg0 == 13) {
			this.anInt384 = arg1.method1160();
		} else if (arg0 == 14) {
			this.anInt400 = arg1.method1160();
		} else if (arg0 == 17) {
			this.anInt400 = arg1.method1160();
			this.anInt386 = arg1.method1160();
			this.anInt370 = arg1.method1160();
			this.anInt392 = arg1.method1160();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass61Array3[arg0 - 30] = arg1.method1151();
			if (this.aClass61Array3[arg0 - 30].method1594(Static105.aClass61_1068)) {
				this.aClass61Array3[arg0 - 30] = null;
				return;
			}
		} else if (arg0 == 40) {
			local210 = arg1.method1111();
			this.anIntArray52 = new int[local210];
			this.anIntArray50 = new int[local210];
			for (local218 = 0; local218 < local210; local218++) {
				this.anIntArray50[local218] = arg1.method1160();
				this.anIntArray52[local218] = arg1.method1160();
			}
		} else if (arg0 == 60) {
			local210 = arg1.method1111();
			this.anIntArray51 = new int[local210];
			for (local218 = 0; local218 < local210; local218++) {
				this.anIntArray51[local218] = arg1.method1160();
			}
			return;
		} else if (arg0 == 93) {
			this.aBoolean16 = false;
			return;
		} else if (arg0 == 95) {
			this.anInt390 = arg1.method1160();
			return;
		} else if (arg0 == 97) {
			this.anInt375 = arg1.method1160();
			return;
		} else if (arg0 == 98) {
			this.anInt396 = arg1.method1160();
			return;
		} else {
			if (arg0 == 99) {
				this.aBoolean15 = true;
			} else if (arg0 == 100) {
				this.anInt393 = arg1.method1131();
				return;
			} else if (arg0 == 101) {
				this.anInt388 = arg1.method1131() * 5;
				return;
			} else if (arg0 == 102) {
				this.anInt379 = arg1.method1160();
				return;
			} else if (arg0 == 103) {
				this.anInt378 = arg1.method1160();
				return;
			} else if (arg0 == 106) {
				this.anInt372 = arg1.method1160();
				if (this.anInt372 == 65535) {
					this.anInt372 = -1;
				}
				this.anInt374 = arg1.method1160();
				if (this.anInt374 == 65535) {
					this.anInt374 = -1;
				}
				local210 = arg1.method1111();
				this.anIntArray48 = new int[local210 + 1];
				for (local218 = 0; local218 <= local210; local218++) {
					this.anIntArray48[local218] = arg1.method1160();
					if (this.anIntArray48[local218] == 65535) {
						this.anIntArray48[local218] = -1;
					}
				}
				return;
			} else if (arg0 == 107) {
				this.aBoolean14 = false;
				return;
			}
			return;
		}
	}
}
