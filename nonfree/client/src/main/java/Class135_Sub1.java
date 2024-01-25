import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class135_Sub1 extends Class135 {

	@OriginalMember(owner = "client!p", name = "k", descriptor = "[B")
	private byte[] aByteArray74;

	@OriginalMember(owner = "client!p", name = "x", descriptor = "Lclient!up;")
	private Class234 aClass234_2;

	@OriginalMember(owner = "client!p", name = "L", descriptor = "Z")
	private boolean aBoolean365;

	@OriginalMember(owner = "client!p", name = "h", descriptor = "I")
	private int anInt4906 = 0;

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Lclient!wb;")
	private final Class243 aClass243_19 = new Class243(16);

	@OriginalMember(owner = "client!p", name = "I", descriptor = "I")
	private int anInt4923 = 0;

	@OriginalMember(owner = "client!p", name = "J", descriptor = "Lclient!vf;")
	private final Class238 aClass238_27 = new Class238();

	@OriginalMember(owner = "client!p", name = "N", descriptor = "J")
	private long aLong151 = 0L;

	@OriginalMember(owner = "client!p", name = "t", descriptor = "I")
	private final int anInt4914;

	@OriginalMember(owner = "client!p", name = "w", descriptor = "Lclient!hc;")
	private final Class93 aClass93_1;

	@OriginalMember(owner = "client!p", name = "K", descriptor = "Z")
	private boolean aBoolean364;

	@OriginalMember(owner = "client!p", name = "M", descriptor = "Lclient!vf;")
	private Class238 aClass238_28;

	@OriginalMember(owner = "client!p", name = "O", descriptor = "Z")
	private final boolean aBoolean366;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!tt;")
	private final Class221 aClass221_3;

	@OriginalMember(owner = "client!p", name = "z", descriptor = "Lclient!hc;")
	private final Class93 aClass93_2;

	@OriginalMember(owner = "client!p", name = "G", descriptor = "Lclient!ua;")
	private final Class222 aClass222_2;

	@OriginalMember(owner = "client!p", name = "H", descriptor = "I")
	private final int anInt4922;

	@OriginalMember(owner = "client!p", name = "p", descriptor = "I")
	private final int anInt4910;

	@OriginalMember(owner = "client!p", name = "A", descriptor = "Lclient!si;")
	private Class2_Sub7_Sub17 aClass2_Sub7_Sub17_1;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(ILclient!hc;Lclient!hc;Lclient!ua;Lclient!tt;IIZ)V")
	public Class135_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) Class222 arg3, @OriginalArg(4) Class221 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4914 = arg0;
		this.aClass93_1 = arg1;
		if (this.aClass93_1 == null) {
			this.aBoolean364 = false;
		} else {
			this.aBoolean364 = true;
			this.aClass238_28 = new Class238();
		}
		this.aBoolean366 = arg7;
		this.aClass221_3 = arg4;
		this.aClass93_2 = arg2;
		this.aClass222_2 = arg3;
		this.anInt4922 = arg6;
		this.anInt4910 = arg5;
		if (this.aClass93_2 != null) {
			this.aClass2_Sub7_Sub17_1 = this.aClass221_3.method5503(this.aClass93_2, this.anInt4914);
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)I")
	public int method4412() {
		return this.aClass234_2 == null ? 0 : this.aClass234_2.anInt6524;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public void method4413() {
		if (this.aClass238_28 == null || this.method4409() == null) {
			return;
		}
		for (@Pc(25) Class2 local25 = this.aClass238_27.method5795(); local25 != null; local25 = this.aClass238_27.method5799()) {
			@Pc(31) int local31 = (int) local25.aLong213;
			if (local31 < 0 || local31 >= this.aClass234_2.anInt6528 || this.aClass234_2.anIntArray564[local31] == 0) {
				local25.method6130();
			} else {
				if (this.aByteArray74[local31] == 0) {
					this.method4421(1, local31);
				}
				if (this.aByteArray74[local31] == -1) {
					this.method4421(2, local31);
				}
				if (this.aByteArray74[local31] == 1) {
					local25.method6130();
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)I")
	public int method4414() {
		if (this.method4409() == null) {
			return this.aClass2_Sub7_Sub17_1 == null ? 0 : this.aClass2_Sub7_Sub17_1.method6087();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
	public void method4415() {
		if (this.aClass238_28 != null) {
			if (this.method4409() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class2 local31;
			@Pc(37) int local37;
			@Pc(122) Class2 local122;
			if (this.aBoolean364) {
				local26 = true;
				for (local31 = this.aClass238_28.method5795(); local31 != null; local31 = this.aClass238_28.method5799()) {
					local37 = (int) local31.aLong213;
					if (this.aByteArray74[local37] == 0) {
						this.method4421(1, local37);
					}
					if (this.aByteArray74[local37] == 0) {
						local26 = false;
					} else {
						local31.method6130();
					}
				}
				while (this.anInt4923 < this.aClass234_2.anIntArray564.length) {
					if (this.aClass234_2.anIntArray564[this.anInt4923] == 0) {
						this.anInt4923++;
					} else {
						if (this.aClass221_3.anInt6331 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray74[this.anInt4923] == 0) {
							this.method4421(1, this.anInt4923);
						}
						if (this.aByteArray74[this.anInt4923] == 0) {
							local122 = new Class2();
							local122.aLong213 = this.anInt4923;
							this.aClass238_28.method5796(local122);
							local26 = false;
						}
						this.anInt4923++;
					}
				}
				if (local26) {
					this.anInt4923 = 0;
					this.aBoolean364 = false;
				}
			} else if (this.aBoolean365) {
				local26 = true;
				for (local31 = this.aClass238_28.method5795(); local31 != null; local31 = this.aClass238_28.method5799()) {
					local37 = (int) local31.aLong213;
					if (this.aByteArray74[local37] != 1) {
						this.method4421(2, local37);
					}
					if (this.aByteArray74[local37] == 1) {
						local31.method6130();
					} else {
						local26 = false;
					}
				}
				while (this.aClass234_2.anIntArray564.length > this.anInt4923) {
					if (this.aClass234_2.anIntArray564[this.anInt4923] == 0) {
						this.anInt4923++;
					} else {
						if (this.aClass222_2.method5524()) {
							local26 = false;
							break;
						}
						if (this.aByteArray74[this.anInt4923] != 1) {
							this.method4421(2, this.anInt4923);
						}
						if (this.aByteArray74[this.anInt4923] != 1) {
							local122 = new Class2();
							local122.aLong213 = this.anInt4923;
							this.aClass238_28.method5796(local122);
							local26 = false;
						}
						this.anInt4923++;
					}
				}
				if (local26) {
					this.aBoolean365 = false;
					this.anInt4923 = 0;
				}
			} else {
				this.aClass238_28 = null;
			}
		}
		if (!this.aBoolean366 || this.aLong151 > Static101.method1805()) {
			return;
		}
		for (@Pc(322) Class2_Sub7_Sub17 local322 = (Class2_Sub7_Sub17) this.aClass243_19.method5975(); local322 != null; local322 = (Class2_Sub7_Sub17) this.aClass243_19.method5973()) {
			if (!local322.aBoolean502) {
				if (local322.aBoolean501) {
					if (!local322.aBoolean500) {
						throw new RuntimeException();
					}
					local322.method6130();
				} else {
					local322.aBoolean501 = true;
				}
			}
		}
		this.aLong151 = Static101.method1805() + 1000L;
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)I")
	public int method4416() {
		if (this.aClass234_2 == null) {
			return 0;
		} else if (this.aBoolean364) {
			@Pc(25) Class2 local25 = this.aClass238_28.method5795();
			return local25 == null ? 0 : (int) local25.aLong213;
		} else {
			return this.aClass234_2.anInt6524;
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)Lclient!up;")
	@Override
	public Class234 method4409() {
		if (this.aClass234_2 != null) {
			return this.aClass234_2;
		}
		if (this.aClass2_Sub7_Sub17_1 == null) {
			if (this.aClass222_2.method5520()) {
				return null;
			}
			this.aClass2_Sub7_Sub17_1 = this.aClass222_2.method5529((byte) 0, 255, this.anInt4914, true);
		}
		if (this.aClass2_Sub7_Sub17_1.aBoolean502) {
			return null;
		}
		@Pc(45) byte[] local45 = this.aClass2_Sub7_Sub17_1.method6090();
		if (this.aClass2_Sub7_Sub17_1 instanceof Class2_Sub7_Sub17_Sub1) {
			try {
				if (local45 == null) {
					throw new RuntimeException();
				}
				this.aClass234_2 = new Class234(local45, this.anInt4910);
				if (this.aClass234_2.anInt6526 != this.anInt4922) {
					throw new RuntimeException();
				}
			} catch (@Pc(83) RuntimeException local83) {
				this.aClass234_2 = null;
				if (this.aClass222_2.method5520()) {
					this.aClass2_Sub7_Sub17_1 = null;
				} else {
					this.aClass2_Sub7_Sub17_1 = this.aClass222_2.method5529((byte) 0, 255, this.anInt4914, true);
				}
				return null;
			}
		} else {
			try {
				if (local45 == null) {
					throw new RuntimeException();
				}
				this.aClass234_2 = new Class234(local45, this.anInt4910);
			} catch (@Pc(125) RuntimeException local125) {
				this.aClass222_2.method5523();
				this.aClass234_2 = null;
				if (this.aClass222_2.method5520()) {
					this.aClass2_Sub7_Sub17_1 = null;
				} else {
					this.aClass2_Sub7_Sub17_1 = this.aClass222_2.method5529((byte) 0, 255, this.anInt4914, true);
				}
				return null;
			}
			if (this.aClass93_2 != null) {
				this.aClass221_3.method5505(this.aClass93_2, local45, this.anInt4914);
			}
		}
		this.aClass2_Sub7_Sub17_1 = null;
		if (this.aClass93_1 != null) {
			this.aByteArray74 = new byte[this.aClass234_2.anInt6528];
			this.anInt4906 = 0;
		}
		return this.aClass234_2;
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(I)I")
	public int method4417() {
		return this.anInt4906;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method4410(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub7_Sub17 local14 = this.method4421(0, arg0);
		if (local14 == null) {
			return null;
		} else {
			@Pc(22) byte[] local22 = local14.method6090();
			local14.method6130();
			return local22;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I")
	@Override
	public int method4407(@OriginalArg(1) int arg0) {
		@Pc(17) Class2_Sub7_Sub17 local17 = (Class2_Sub7_Sub17) this.aClass243_19.method5967((long) arg0);
		return local17 == null ? 0 : local17.method6087();
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(II)V")
	@Override
	public void method4411(@OriginalArg(1) int arg0) {
		if (this.aClass93_1 == null) {
			return;
		}
		for (@Pc(12) Class2 local12 = this.aClass238_27.method5795(); local12 != null; local12 = this.aClass238_27.method5799()) {
			if (local12.aLong213 == (long) arg0) {
				return;
			}
		}
		@Pc(38) Class2 local38 = new Class2();
		local38.aLong213 = arg0;
		this.aClass238_27.method5796(local38);
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(B)V")
	public void method4419() {
		if (this.aClass93_1 != null) {
			this.aBoolean365 = true;
			if (this.aClass238_28 == null) {
				this.aClass238_28 = new Class238();
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BII)Lclient!si;")
	private Class2_Sub7_Sub17 method4421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub7_Sub17 local13 = (Class2_Sub7_Sub17) this.aClass243_19.method5967((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean500 && local13.aBoolean502) {
			local13.method6130();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass93_1 == null || this.aByteArray74[arg1] == -1) {
					if (this.aClass222_2.method5520()) {
						return null;
					}
					local13 = this.aClass222_2.method5529((byte) 2, this.anInt4914, arg1, true);
				} else {
					local13 = this.aClass221_3.method5503(this.aClass93_1, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass93_1 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass221_3.method5502(arg1, this.aClass93_1);
			} else if (arg0 == 2) {
				if (this.aClass93_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray74[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass222_2.method5524()) {
					return null;
				}
				local13 = this.aClass222_2.method5529((byte) 2, this.anInt4914, arg1, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass243_19.method5968((long) arg1, local13);
		}
		if (local13.aBoolean502) {
			return null;
		}
		@Pc(161) byte[] local161 = local13.method6090();
		@Pc(190) int local190;
		@Pc(296) Class2_Sub7_Sub17_Sub2 local296;
		if (!(local13 instanceof Class2_Sub7_Sub17_Sub1)) {
			try {
				if (local161 == null || local161.length <= 2) {
					throw new RuntimeException();
				}
				Static257.aCRC32_1.reset();
				Static257.aCRC32_1.update(local161, 0, local161.length - 2);
				local190 = (int) Static257.aCRC32_1.getValue();
				if (this.aClass234_2.anIntArray562[arg1] != local190) {
					throw new RuntimeException();
				}
				this.aClass222_2.anInt6359 = 0;
				this.aClass222_2.anInt6358 = 0;
			} catch (@Pc(356) RuntimeException local356) {
				this.aClass222_2.method5523();
				local13.method6130();
				if (local13.aBoolean500 && !this.aClass222_2.method5520()) {
					local296 = this.aClass222_2.method5529((byte) 2, this.anInt4914, arg1, true);
					this.aClass243_19.method5968((long) arg1, local296);
				}
				return null;
			}
			local161[local161.length - 2] = (byte) (this.aClass234_2.anIntArray561[arg1] >>> 8);
			local161[local161.length - 1] = (byte) this.aClass234_2.anIntArray561[arg1];
			if (this.aClass93_1 != null) {
				this.aClass221_3.method5505(this.aClass93_1, local161, arg1);
				if (this.aByteArray74[arg1] != 1) {
					this.anInt4906++;
					this.aByteArray74[arg1] = 1;
				}
			}
			if (!local13.aBoolean500) {
				local13.method6130();
			}
			return local13;
		}
		try {
			if (local161 == null || local161.length <= 2) {
				throw new RuntimeException();
			}
			Static257.aCRC32_1.reset();
			Static257.aCRC32_1.update(local161, 0, local161.length - 2);
			local190 = (int) Static257.aCRC32_1.getValue();
			if (local190 != this.aClass234_2.anIntArray562[arg1]) {
				throw new RuntimeException();
			}
			@Pc(225) int local225 = (local161[local161.length - 1] & 0xFF) + ((local161[local161.length - 2] & 0xFF) << 8);
			if (local225 != (this.aClass234_2.anIntArray561[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray74[arg1] != 1) {
				this.anInt4906++;
				this.aByteArray74[arg1] = 1;
			}
			if (!local13.aBoolean500) {
				local13.method6130();
			}
			return local13;
		} catch (@Pc(270) Exception local270) {
			this.aByteArray74[arg1] = -1;
			local13.method6130();
			if (local13.aBoolean500 && !this.aClass222_2.method5520()) {
				local296 = this.aClass222_2.method5529((byte) 2, this.anInt4914, arg1, true);
				this.aClass243_19.method5968((long) arg1, local296);
			}
			return null;
		}
	}
}
