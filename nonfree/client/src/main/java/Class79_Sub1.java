import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class79_Sub1 extends Class79 {

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "Lclient!tn;")
	private Class284 aClass284_1;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "Z")
	private boolean aBoolean151;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	private int anInt2426 = 0;

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "Lclient!cb;")
	private final Class42 aClass42_5 = new Class42(16);

	@OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
	private int anInt2431 = 0;

	@OriginalMember(owner = "client!ef", name = "O", descriptor = "Lclient!fea;")
	private final Class99 aClass99_19 = new Class99();

	@OriginalMember(owner = "client!ef", name = "R", descriptor = "J")
	private long aLong82 = 0L;

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "Lclient!gg;")
	private final Class112 aClass112_3;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
	private final int anInt2415;

	@OriginalMember(owner = "client!ef", name = "K", descriptor = "Z")
	private boolean aBoolean150;

	@OriginalMember(owner = "client!ef", name = "L", descriptor = "Lclient!fea;")
	private Class99 aClass99_18;

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "Lclient!cq;")
	private final Class55 aClass55_1;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
	private final int anInt2416;

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "[B")
	private final byte[] aByteArray35;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "Lclient!gg;")
	private final Class112 aClass112_2;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
	private final int anInt2413;

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "Lclient!pt;")
	private final Class237 aClass237_1;

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "Z")
	private final boolean aBoolean152;

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "Lclient!au;")
	private Class5_Sub2_Sub2 aClass5_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(ILclient!gg;Lclient!gg;Lclient!cq;Lclient!pt;I[BIZ)V")
	public Class79_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) Class55 arg3, @OriginalArg(4) Class237 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass112_3 = arg1;
		this.anInt2415 = arg0;
		if (this.aClass112_3 == null) {
			this.aBoolean150 = false;
		} else {
			this.aBoolean150 = true;
			this.aClass99_18 = new Class99();
		}
		this.aClass55_1 = arg3;
		this.anInt2416 = arg7;
		this.aByteArray35 = arg6;
		this.aClass112_2 = arg2;
		this.anInt2413 = arg5;
		this.aClass237_1 = arg4;
		this.aBoolean152 = arg8;
		if (this.aClass112_2 != null) {
			this.aClass5_Sub2_Sub2_1 = this.aClass237_1.method5696(this.anInt2415, this.aClass112_2);
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)I")
	public int method2219() {
		return this.anInt2426;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)V")
	@Override
	public void method2218(@OriginalArg(1) int arg0) {
		if (this.aClass112_3 == null) {
			return;
		}
		for (@Pc(18) Class5 local18 = this.aClass99_19.method2526(); local18 != null; local18 = this.aClass99_19.method2519()) {
			if ((long) arg0 == local18.aLong253) {
				return;
			}
		}
		@Pc(42) Class5 local42 = new Class5();
		local42.aLong253 = arg0;
		this.aClass99_19.method2513(local42);
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
	public void method2220() {
		if (this.aClass112_3 != null) {
			this.aBoolean151 = true;
			if (this.aClass99_18 == null) {
				this.aClass99_18 = new Class99();
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method2217(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub2_Sub2 local9 = this.method2224(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(26) byte[] local26 = local9.method3373();
			local9.method7425();
			return local26;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Lclient!tn;")
	@Override
	public Class284 method2216() {
		if (this.aClass284_1 != null) {
			return this.aClass284_1;
		}
		if (this.aClass5_Sub2_Sub2_1 == null) {
			if (this.aClass55_1.method1335()) {
				return null;
			}
			this.aClass5_Sub2_Sub2_1 = this.aClass55_1.method1345((byte) 0, true, 255, this.anInt2415);
		}
		if (this.aClass5_Sub2_Sub2_1.aBoolean234) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass5_Sub2_Sub2_1.method3373();
		if (this.aClass5_Sub2_Sub2_1 instanceof Class5_Sub2_Sub2_Sub1) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass284_1 = new Class284(local43, this.anInt2413, this.aByteArray35);
				if (this.anInt2416 != this.aClass284_1.anInt8223) {
					throw new RuntimeException();
				}
			} catch (@Pc(137) RuntimeException local137) {
				this.aClass284_1 = null;
				if (this.aClass55_1.method1335()) {
					this.aClass5_Sub2_Sub2_1 = null;
				} else {
					this.aClass5_Sub2_Sub2_1 = this.aClass55_1.method1345((byte) 0, true, 255, this.anInt2415);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass284_1 = new Class284(local43, this.anInt2413, this.aByteArray35);
			} catch (@Pc(65) RuntimeException local65) {
				this.aClass55_1.method1338();
				this.aClass284_1 = null;
				if (this.aClass55_1.method1335()) {
					this.aClass5_Sub2_Sub2_1 = null;
				} else {
					this.aClass5_Sub2_Sub2_1 = this.aClass55_1.method1345((byte) 0, true, 255, this.anInt2415);
				}
				return null;
			}
			if (this.aClass112_2 != null) {
				this.aClass237_1.method5697(local43, this.aClass112_2, this.anInt2415);
			}
		}
		if (this.aClass112_3 != null) {
			this.aByteArray34 = new byte[this.aClass284_1.anInt8224];
			this.anInt2426 = 0;
		}
		this.aClass5_Sub2_Sub2_1 = null;
		return this.aClass284_1;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
	public void method2222() {
		if (this.aClass99_18 != null) {
			if (this.method2216() == null) {
				return;
			}
			@Pc(34) boolean local34;
			@Pc(39) Class5 local39;
			@Pc(45) int local45;
			@Pc(135) Class5 local135;
			if (this.aBoolean150) {
				local34 = true;
				for (local39 = this.aClass99_18.method2526(); local39 != null; local39 = this.aClass99_18.method2519()) {
					local45 = (int) local39.aLong253;
					if (this.aByteArray34[local45] == 0) {
						this.method2224(1, local45);
					}
					if (this.aByteArray34[local45] == 0) {
						local34 = false;
					} else {
						local39.method7425();
					}
				}
				while (this.aClass284_1.anIntArray641.length > this.anInt2431) {
					if (this.aClass284_1.anIntArray641[this.anInt2431] == 0) {
						this.anInt2431++;
					} else {
						if (this.aClass237_1.anInt7019 >= 250) {
							local34 = false;
							break;
						}
						if (this.aByteArray34[this.anInt2431] == 0) {
							this.method2224(1, this.anInt2431);
						}
						if (this.aByteArray34[this.anInt2431] == 0) {
							local135 = new Class5();
							local135.aLong253 = this.anInt2431;
							this.aClass99_18.method2513(local135);
							local34 = false;
						}
						this.anInt2431++;
					}
				}
				if (local34) {
					this.anInt2431 = 0;
					this.aBoolean150 = false;
				}
			} else if (this.aBoolean151) {
				local34 = true;
				for (local39 = this.aClass99_18.method2526(); local39 != null; local39 = this.aClass99_18.method2519()) {
					local45 = (int) local39.aLong253;
					if (this.aByteArray34[local45] != 1) {
						this.method2224(2, local45);
					}
					if (this.aByteArray34[local45] == 1) {
						local39.method7425();
					} else {
						local34 = false;
					}
				}
				while (this.aClass284_1.anIntArray641.length > this.anInt2431) {
					if (this.aClass284_1.anIntArray641[this.anInt2431] == 0) {
						this.anInt2431++;
					} else {
						if (this.aClass55_1.method1332()) {
							local34 = false;
							break;
						}
						if (this.aByteArray34[this.anInt2431] != 1) {
							this.method2224(2, this.anInt2431);
						}
						if (this.aByteArray34[this.anInt2431] != 1) {
							local135 = new Class5();
							local135.aLong253 = this.anInt2431;
							this.aClass99_18.method2513(local135);
							local34 = false;
						}
						this.anInt2431++;
					}
				}
				if (local34) {
					this.aBoolean151 = false;
					this.anInt2431 = 0;
				}
			} else {
				this.aClass99_18 = null;
			}
		}
		if (!this.aBoolean152 || this.aLong82 > Static105.method2132()) {
			return;
		}
		for (@Pc(315) Class5_Sub2_Sub2 local315 = (Class5_Sub2_Sub2) this.aClass42_5.method1103(); local315 != null; local315 = (Class5_Sub2_Sub2) this.aClass42_5.method1105()) {
			if (!local315.aBoolean234) {
				if (local315.aBoolean235) {
					if (!local315.aBoolean233) {
						throw new RuntimeException();
					}
					local315.method7425();
				} else {
					local315.aBoolean235 = true;
				}
			}
		}
		this.aLong82 = Static105.method2132() + 1000L;
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)I")
	public int method2223() {
		if (this.method2216() == null) {
			return this.aClass5_Sub2_Sub2_1 == null ? 0 : this.aClass5_Sub2_Sub2_1.method3371();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BII)Lclient!au;")
	private Class5_Sub2_Sub2 method2224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub2_Sub2 local13 = (Class5_Sub2_Sub2) this.aClass42_5.method1109((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean233 && local13.aBoolean234) {
			local13.method7425();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass112_3 == null || this.aByteArray34[arg1] == -1) {
					if (this.aClass55_1.method1335()) {
						return null;
					}
					local13 = this.aClass55_1.method1345((byte) 2, true, this.anInt2415, arg1);
				} else {
					local13 = this.aClass237_1.method5696(arg1, this.aClass112_3);
				}
			} else if (arg0 == 1) {
				if (this.aClass112_3 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass237_1.method5698(arg1, this.aClass112_3);
			} else if (arg0 == 2) {
				if (this.aClass112_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray34[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass55_1.method1332()) {
					return null;
				}
				local13 = this.aClass55_1.method1345((byte) 2, false, this.anInt2415, arg1);
			} else {
				throw new RuntimeException();
			}
			this.aClass42_5.method1106((long) arg1, local13);
		}
		if (local13.aBoolean234) {
			return null;
		}
		@Pc(158) byte[] local158 = local13.method3373();
		@Pc(185) int local185;
		@Pc(216) byte[] local216;
		@Pc(227) byte[] local227;
		@Pc(229) int local229;
		@Pc(287) Class5_Sub2_Sub2_Sub2 local287;
		if (!(local13 instanceof Class5_Sub2_Sub2_Sub1)) {
			try {
				if (local158 == null || local158.length <= 2) {
					throw new RuntimeException();
				}
				Static154.aCRC32_1.reset();
				Static154.aCRC32_1.update(local158, 0, local158.length - 2);
				local185 = (int) Static154.aCRC32_1.getValue();
				if (this.aClass284_1.anIntArray644[arg1] != local185) {
					throw new RuntimeException();
				}
				if (this.aClass284_1.aByteArrayArray45 != null && this.aClass284_1.aByteArrayArray45[arg1] != null) {
					local216 = this.aClass284_1.aByteArrayArray45[arg1];
					local227 = Static263.method4382(local158.length - 2, local158, 0);
					for (local229 = 0; local229 < 64; local229++) {
						if (local216[local229] != local227[local229]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass55_1.anInt1461 = 0;
				this.aClass55_1.anInt1462 = 0;
			} catch (@Pc(260) RuntimeException local260) {
				this.aClass55_1.method1338();
				local13.method7425();
				if (local13.aBoolean233 && !this.aClass55_1.method1335()) {
					local287 = this.aClass55_1.method1345((byte) 2, true, this.anInt2415, arg1);
					this.aClass42_5.method1106((long) arg1, local287);
				}
				return null;
			}
			local158[local158.length - 2] = (byte) (this.aClass284_1.anIntArray638[arg1] >>> 8);
			local158[local158.length - 1] = (byte) this.aClass284_1.anIntArray638[arg1];
			if (this.aClass112_3 != null) {
				this.aClass237_1.method5697(local158, this.aClass112_3, arg1);
				if (this.aByteArray34[arg1] != 1) {
					this.anInt2426++;
					this.aByteArray34[arg1] = 1;
				}
			}
			if (!local13.aBoolean233) {
				local13.method7425();
			}
			return local13;
		}
		try {
			if (local158 == null || local158.length <= 2) {
				throw new RuntimeException();
			}
			Static154.aCRC32_1.reset();
			Static154.aCRC32_1.update(local158, 0, local158.length - 2);
			local185 = (int) Static154.aCRC32_1.getValue();
			if (this.aClass284_1.anIntArray644[arg1] != local185) {
				throw new RuntimeException();
			}
			if (this.aClass284_1.aByteArrayArray45 != null && this.aClass284_1.aByteArrayArray45[arg1] != null) {
				local216 = this.aClass284_1.aByteArrayArray45[arg1];
				local227 = Static263.method4382(local158.length - 2, local158, 0);
				for (local229 = 0; local229 < 64; local229++) {
					if (local216[local229] != local227[local229]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(462) int local462 = ((local158[local158.length - 2] & 0xFF) << 8) + (local158[local158.length - 1] & 0xFF);
			if (local462 != (this.aClass284_1.anIntArray638[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray34[arg1] != 1) {
				this.anInt2426++;
				this.aByteArray34[arg1] = 1;
			}
			if (!local13.aBoolean233) {
				local13.method7425();
			}
			return local13;
		} catch (@Pc(505) Exception local505) {
			this.aByteArray34[arg1] = -1;
			local13.method7425();
			if (local13.aBoolean233 && !this.aClass55_1.method1335()) {
				local287 = this.aClass55_1.method1345((byte) 2, true, this.anInt2415, arg1);
				this.aClass42_5.method1106((long) arg1, local287);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)I")
	public int method2225() {
		return this.aClass284_1 == null ? 0 : this.aClass284_1.anInt8226;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
	public void method2227() {
		if (this.aClass99_18 == null || this.method2216() == null) {
			return;
		}
		for (@Pc(27) Class5 local27 = this.aClass99_19.method2526(); local27 != null; local27 = this.aClass99_19.method2519()) {
			@Pc(33) int local33 = (int) local27.aLong253;
			if (local33 < 0 || local33 >= this.aClass284_1.anInt8224 || this.aClass284_1.anIntArray641[local33] == 0) {
				local27.method7425();
			} else {
				if (this.aByteArray34[local33] == 0) {
					this.method2224(1, local33);
				}
				if (this.aByteArray34[local33] == -1) {
					this.method2224(2, local33);
				}
				if (this.aByteArray34[local33] == 1) {
					local27.method7425();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
	@Override
	public int method2213(@OriginalArg(0) int arg0) {
		@Pc(11) Class5_Sub2_Sub2 local11 = (Class5_Sub2_Sub2) this.aClass42_5.method1109((long) arg0);
		return local11 == null ? 0 : local11.method3371();
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)I")
	public int method2229() {
		if (this.aClass284_1 == null) {
			return 0;
		} else if (this.aBoolean150) {
			@Pc(20) Class5 local20 = this.aClass99_18.method2526();
			return local20 == null ? 0 : (int) local20.aLong253;
		} else {
			return this.aClass284_1.anInt8226;
		}
	}
}
