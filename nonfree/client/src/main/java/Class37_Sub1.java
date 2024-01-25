import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bja")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!bja", name = "i", descriptor = "Lclient!vw;")
	private Class364 aClass364_1;

	@OriginalMember(owner = "client!bja", name = "r", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!bja", name = "L", descriptor = "Z")
	private boolean aBoolean152;

	@OriginalMember(owner = "client!bja", name = "B", descriptor = "I")
	private int anInt1773 = 0;

	@OriginalMember(owner = "client!bja", name = "A", descriptor = "Lclient!eq;")
	private final Class99 aClass99_15 = new Class99(16);

	@OriginalMember(owner = "client!bja", name = "N", descriptor = "I")
	private int anInt1779 = 0;

	@OriginalMember(owner = "client!bja", name = "J", descriptor = "Lclient!uh;")
	private final Class341 aClass341_19 = new Class341();

	@OriginalMember(owner = "client!bja", name = "O", descriptor = "J")
	private long aLong37 = 0L;

	@OriginalMember(owner = "client!bja", name = "q", descriptor = "I")
	private final int anInt1766;

	@OriginalMember(owner = "client!bja", name = "F", descriptor = "Lclient!nw;")
	private final Class233 aClass233_2;

	@OriginalMember(owner = "client!bja", name = "I", descriptor = "Z")
	private boolean aBoolean151;

	@OriginalMember(owner = "client!bja", name = "M", descriptor = "Lclient!uh;")
	private Class341 aClass341_20;

	@OriginalMember(owner = "client!bja", name = "k", descriptor = "I")
	private final int anInt1762;

	@OriginalMember(owner = "client!bja", name = "m", descriptor = "[B")
	private final byte[] aByteArray28;

	@OriginalMember(owner = "client!bja", name = "s", descriptor = "I")
	private final int anInt1767;

	@OriginalMember(owner = "client!bja", name = "E", descriptor = "Lclient!nw;")
	private final Class233 aClass233_1;

	@OriginalMember(owner = "client!bja", name = "P", descriptor = "Z")
	private final boolean aBoolean153;

	@OriginalMember(owner = "client!bja", name = "n", descriptor = "Lclient!tha;")
	private final Class329 aClass329_1;

	@OriginalMember(owner = "client!bja", name = "u", descriptor = "Lclient!aca;")
	private final Class5 aClass5_1;

	@OriginalMember(owner = "client!bja", name = "v", descriptor = "Lclient!ffa;")
	private Class2_Sub6_Sub8 aClass2_Sub6_Sub8_1;

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(ILclient!nw;Lclient!nw;Lclient!tha;Lclient!aca;I[BIZ)V")
	public Class37_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class233 arg1, @OriginalArg(2) Class233 arg2, @OriginalArg(3) Class329 arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt1766 = arg0;
		this.aClass233_2 = arg1;
		if (this.aClass233_2 == null) {
			this.aBoolean151 = false;
		} else {
			this.aBoolean151 = true;
			this.aClass341_20 = new Class341();
		}
		this.anInt1762 = arg5;
		this.aByteArray28 = arg6;
		this.anInt1767 = arg7;
		this.aClass233_1 = arg2;
		this.aBoolean153 = arg8;
		this.aClass329_1 = arg3;
		this.aClass5_1 = arg4;
		if (this.aClass233_1 != null) {
			this.aClass2_Sub6_Sub8_1 = this.aClass5_1.method114(this.aClass233_1, this.anInt1766);
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)I")
	public int method1663() {
		if (this.aClass364_1 == null) {
			return 0;
		} else if (this.aBoolean151) {
			@Pc(29) Class2 local29 = this.aClass341_20.method8524();
			return local29 == null ? 0 : (int) local29.aLong278;
		} else {
			return this.aClass364_1.anInt10770;
		}
	}

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "(I)V")
	public void method1664() {
		if (this.aClass341_20 == null || this.method1662() == null) {
			return;
		}
		for (@Pc(24) Class2 local24 = this.aClass341_19.method8524(); local24 != null; local24 = this.aClass341_19.method8519()) {
			@Pc(30) int local30 = (int) local24.aLong278;
			if (local30 < 0 || local30 >= this.aClass364_1.anInt10773 || this.aClass364_1.anIntArray694[local30] == 0) {
				local24.method9253();
			} else {
				if (this.aByteArray29[local30] == 0) {
					this.method1672(local30, 1);
				}
				if (this.aByteArray29[local30] == -1) {
					this.method1672(local30, 2);
				}
				if (this.aByteArray29[local30] == 1) {
					local24.method9253();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bja", name = "c", descriptor = "(I)V")
	public void method1665() {
		if (this.aClass341_20 != null) {
			if (this.method1662() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class2 local23;
			@Pc(29) int local29;
			@Pc(114) Class2 local114;
			if (this.aBoolean151) {
				local18 = true;
				for (local23 = this.aClass341_20.method8524(); local23 != null; local23 = this.aClass341_20.method8519()) {
					local29 = (int) local23.aLong278;
					if (this.aByteArray29[local29] == 0) {
						this.method1672(local29, 1);
					}
					if (this.aByteArray29[local29] == 0) {
						local18 = false;
					} else {
						local23.method9253();
					}
				}
				while (this.anInt1779 < this.aClass364_1.anIntArray694.length) {
					if (this.aClass364_1.anIntArray694[this.anInt1779] == 0) {
						this.anInt1779++;
					} else {
						if (this.aClass5_1.anInt79 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray29[this.anInt1779] == 0) {
							this.method1672(this.anInt1779, 1);
						}
						if (this.aByteArray29[this.anInt1779] == 0) {
							local114 = new Class2();
							local114.aLong278 = this.anInt1779;
							this.aClass341_20.method8528(local114);
							local18 = false;
						}
						this.anInt1779++;
					}
				}
				if (local18) {
					this.anInt1779 = 0;
					this.aBoolean151 = false;
				}
			} else if (this.aBoolean152) {
				local18 = true;
				for (local23 = this.aClass341_20.method8524(); local23 != null; local23 = this.aClass341_20.method8519()) {
					local29 = (int) local23.aLong278;
					if (this.aByteArray29[local29] != 1) {
						this.method1672(local29, 2);
					}
					if (this.aByteArray29[local29] == 1) {
						local23.method9253();
					} else {
						local18 = false;
					}
				}
				while (this.anInt1779 < this.aClass364_1.anIntArray694.length) {
					if (this.aClass364_1.anIntArray694[this.anInt1779] == 0) {
						this.anInt1779++;
					} else {
						if (this.aClass329_1.method8124()) {
							local18 = false;
							break;
						}
						if (this.aByteArray29[this.anInt1779] != 1) {
							this.method1672(this.anInt1779, 2);
						}
						if (this.aByteArray29[this.anInt1779] != 1) {
							local114 = new Class2();
							local114.aLong278 = this.anInt1779;
							local18 = false;
							this.aClass341_20.method8528(local114);
						}
						this.anInt1779++;
					}
				}
				if (local18) {
					this.anInt1779 = 0;
					this.aBoolean152 = false;
				}
			} else {
				this.aClass341_20 = null;
			}
		}
		if (!this.aBoolean153 || Static277.method5091() < this.aLong37) {
			return;
		}
		for (@Pc(322) Class2_Sub6_Sub8 local322 = (Class2_Sub6_Sub8) this.aClass99_15.method3060(); local322 != null; local322 = (Class2_Sub6_Sub8) this.aClass99_15.method3058()) {
			if (!local322.aBoolean601) {
				if (local322.aBoolean602) {
					if (!local322.aBoolean600) {
						throw new RuntimeException();
					}
					local322.method9253();
				} else {
					local322.aBoolean602 = true;
				}
			}
		}
		this.aLong37 = Static277.method5091() + 1000L;
	}

	@OriginalMember(owner = "client!bja", name = "e", descriptor = "(I)I")
	public int method1667() {
		return this.aClass364_1 == null ? 0 : this.aClass364_1.anInt10770;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method1661(@OriginalArg(0) int arg0) {
		@Pc(17) Class2_Sub6_Sub8 local17 = this.method1672(arg0, 0);
		if (local17 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local17.method7144();
			local17.method9253();
			return local25;
		}
	}

	@OriginalMember(owner = "client!bja", name = "f", descriptor = "(I)V")
	public void method1668() {
		if (this.aClass233_2 != null) {
			this.aBoolean152 = true;
			if (this.aClass341_20 == null) {
				this.aClass341_20 = new Class341();
			}
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(BI)V")
	@Override
	public void method1660(@OriginalArg(1) int arg0) {
		if (this.aClass233_2 == null) {
			return;
		}
		for (@Pc(22) Class2 local22 = this.aClass341_19.method8524(); local22 != null; local22 = this.aClass341_19.method8519()) {
			if ((long) arg0 == local22.aLong278) {
				return;
			}
		}
		@Pc(42) Class2 local42 = new Class2();
		local42.aLong278 = arg0;
		this.aClass341_19.method8528(local42);
	}

	@OriginalMember(owner = "client!bja", name = "h", descriptor = "(I)I")
	public int method1671() {
		if (this.method1662() == null) {
			return this.aClass2_Sub6_Sub8_1 == null ? 0 : this.aClass2_Sub6_Sub8_1.method7142();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(II)I")
	@Override
	public int method1657(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub6_Sub8 local11 = (Class2_Sub6_Sub8) this.aClass99_15.method3056((long) arg0);
		return local11 == null ? 0 : local11.method7142();
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(IBI)Lclient!ffa;")
	private Class2_Sub6_Sub8 method1672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class2_Sub6_Sub8 local19 = (Class2_Sub6_Sub8) this.aClass99_15.method3056((long) arg0);
		if (local19 != null && arg1 == 0 && !local19.aBoolean600 && local19.aBoolean601) {
			local19.method9253();
			local19 = null;
		}
		if (local19 == null) {
			if (arg1 == 0) {
				if (this.aClass233_2 == null || this.aByteArray29[arg0] == -1) {
					if (this.aClass329_1.method8125()) {
						return null;
					}
					local19 = this.aClass329_1.method8131((byte) 2, true, arg0, this.anInt1766);
				} else {
					local19 = this.aClass5_1.method114(this.aClass233_2, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass233_2 == null) {
					throw new RuntimeException();
				}
				local19 = this.aClass5_1.method113(this.aClass233_2, arg0);
			} else if (arg1 == 2) {
				if (this.aClass233_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray29[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass329_1.method8124()) {
					return null;
				}
				local19 = this.aClass329_1.method8131((byte) 2, false, arg0, this.anInt1766);
			} else {
				throw new RuntimeException();
			}
			this.aClass99_15.method3059((long) arg0, local19);
		}
		if (local19.aBoolean601) {
			return null;
		}
		@Pc(157) byte[] local157 = local19.method7144();
		@Pc(184) int local184;
		@Pc(215) byte[] local215;
		@Pc(226) byte[] local226;
		@Pc(228) int local228;
		@Pc(288) Class2_Sub6_Sub8_Sub1 local288;
		if (!(local19 instanceof Class2_Sub6_Sub8_Sub2)) {
			try {
				if (local157 == null || local157.length <= 2) {
					throw new RuntimeException();
				}
				Static609.aCRC32_1.reset();
				Static609.aCRC32_1.update(local157, 0, local157.length - 2);
				local184 = (int) Static609.aCRC32_1.getValue();
				if (local184 != this.aClass364_1.anIntArray696[arg0]) {
					throw new RuntimeException();
				}
				if (this.aClass364_1.aByteArrayArray25 != null && this.aClass364_1.aByteArrayArray25[arg0] != null) {
					local215 = this.aClass364_1.aByteArrayArray25[arg0];
					local226 = Static98.method2590(0, local157, local157.length - 2);
					for (local228 = 0; local228 < 64; local228++) {
						if (local226[local228] != local215[local228]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass329_1.anInt9761 = 0;
				this.aClass329_1.anInt9762 = 0;
			} catch (@Pc(261) RuntimeException local261) {
				this.aClass329_1.method8129();
				local19.method9253();
				if (local19.aBoolean600 && !this.aClass329_1.method8125()) {
					local288 = this.aClass329_1.method8131((byte) 2, true, arg0, this.anInt1766);
					this.aClass99_15.method3059((long) arg0, local288);
				}
				return null;
			}
			local157[local157.length - 2] = (byte) (this.aClass364_1.anIntArray692[arg0] >>> 8);
			local157[local157.length - 1] = (byte) this.aClass364_1.anIntArray692[arg0];
			if (this.aClass233_2 != null) {
				this.aClass5_1.method108(local157, this.aClass233_2, arg0);
				if (this.aByteArray29[arg0] != 1) {
					this.anInt1773++;
					this.aByteArray29[arg0] = 1;
				}
			}
			if (!local19.aBoolean600) {
				local19.method9253();
			}
			return local19;
		}
		try {
			if (local157 == null || local157.length <= 2) {
				throw new RuntimeException();
			}
			Static609.aCRC32_1.reset();
			Static609.aCRC32_1.update(local157, 0, local157.length - 2);
			local184 = (int) Static609.aCRC32_1.getValue();
			if (this.aClass364_1.anIntArray696[arg0] != local184) {
				throw new RuntimeException();
			}
			if (this.aClass364_1.aByteArrayArray25 != null && this.aClass364_1.aByteArrayArray25[arg0] != null) {
				local215 = this.aClass364_1.aByteArrayArray25[arg0];
				local226 = Static98.method2590(0, local157, local157.length - 2);
				for (local228 = 0; local228 < 64; local228++) {
					if (local215[local228] != local226[local228]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(475) int local475 = ((local157[local157.length - 2] & 0xFF) << 8) + (local157[local157.length - 1] & 0xFF);
			if ((this.aClass364_1.anIntArray692[arg0] & 0xFFFF) != local475) {
				throw new RuntimeException();
			}
			if (this.aByteArray29[arg0] != 1) {
				this.anInt1773++;
				this.aByteArray29[arg0] = 1;
			}
			if (!local19.aBoolean600) {
				local19.method9253();
			}
			return local19;
		} catch (@Pc(514) Exception local514) {
			this.aByteArray29[arg0] = -1;
			local19.method9253();
			if (local19.aBoolean600 && !this.aClass329_1.method8125()) {
				local288 = this.aClass329_1.method8131((byte) 2, true, arg0, this.anInt1766);
				this.aClass99_15.method3059((long) arg0, local288);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!bja", name = "i", descriptor = "(I)I")
	public int method1673() {
		return this.anInt1773;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(B)Lclient!vw;")
	@Override
	public Class364 method1662() {
		if (this.aClass364_1 != null) {
			return this.aClass364_1;
		}
		if (this.aClass2_Sub6_Sub8_1 == null) {
			if (this.aClass329_1.method8125()) {
				return null;
			}
			this.aClass2_Sub6_Sub8_1 = this.aClass329_1.method8131((byte) 0, true, this.anInt1766, 255);
		}
		if (this.aClass2_Sub6_Sub8_1.aBoolean601) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass2_Sub6_Sub8_1.method7144();
		if (this.aClass2_Sub6_Sub8_1 instanceof Class2_Sub6_Sub8_Sub2) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass364_1 = new Class364(local48, this.anInt1762, this.aByteArray28);
				if (this.aClass364_1.anInt10772 != this.anInt1767) {
					throw new RuntimeException();
				}
			} catch (@Pc(83) RuntimeException local83) {
				this.aClass364_1 = null;
				if (this.aClass329_1.method8125()) {
					this.aClass2_Sub6_Sub8_1 = null;
				} else {
					this.aClass2_Sub6_Sub8_1 = this.aClass329_1.method8131((byte) 0, true, this.anInt1766, 255);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass364_1 = new Class364(local48, this.anInt1762, this.aByteArray28);
			} catch (@Pc(129) RuntimeException local129) {
				this.aClass329_1.method8129();
				this.aClass364_1 = null;
				if (this.aClass329_1.method8125()) {
					this.aClass2_Sub6_Sub8_1 = null;
				} else {
					this.aClass2_Sub6_Sub8_1 = this.aClass329_1.method8131((byte) 0, true, this.anInt1766, 255);
				}
				return null;
			}
			if (this.aClass233_1 != null) {
				this.aClass5_1.method108(local48, this.aClass233_1, this.anInt1766);
			}
		}
		this.aClass2_Sub6_Sub8_1 = null;
		if (this.aClass233_2 != null) {
			this.anInt1773 = 0;
			this.aByteArray29 = new byte[this.aClass364_1.anInt10773];
		}
		return this.aClass364_1;
	}
}
