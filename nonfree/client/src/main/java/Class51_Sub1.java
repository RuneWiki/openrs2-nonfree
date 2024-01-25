import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!s", name = "L", descriptor = "Lclient!op;")
	private Class156 aClass156_1;

	@OriginalMember(owner = "client!s", name = "Q", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!s", name = "X", descriptor = "Z")
	private boolean aBoolean550;

	@OriginalMember(owner = "client!s", name = "A", descriptor = "I")
	private int anInt5690 = 0;

	@OriginalMember(owner = "client!s", name = "z", descriptor = "Lclient!tm;")
	private final Class197 aClass197_26 = new Class197(16);

	@OriginalMember(owner = "client!s", name = "U", descriptor = "I")
	private int anInt5702 = 0;

	@OriginalMember(owner = "client!s", name = "T", descriptor = "Lclient!bb;")
	private final Class16 aClass16_33 = new Class16();

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "J")
	private long aLong163 = 0L;

	@OriginalMember(owner = "client!s", name = "E", descriptor = "I")
	private final int anInt5694;

	@OriginalMember(owner = "client!s", name = "I", descriptor = "Lclient!pp;")
	private final Class166 aClass166_4;

	@OriginalMember(owner = "client!s", name = "V", descriptor = "Z")
	private boolean aBoolean549;

	@OriginalMember(owner = "client!s", name = "W", descriptor = "Lclient!bb;")
	private Class16 aClass16_34;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "Lclient!pp;")
	private final Class166 aClass166_3;

	@OriginalMember(owner = "client!s", name = "K", descriptor = "I")
	private final int anInt5699;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "Lclient!sa;")
	private final Class186 aClass186_2;

	@OriginalMember(owner = "client!s", name = "S", descriptor = "Lclient!vm;")
	private final Class211 aClass211_3;

	@OriginalMember(owner = "client!s", name = "r", descriptor = "I")
	private final int anInt5682;

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "Z")
	private final boolean aBoolean551;

	@OriginalMember(owner = "client!s", name = "R", descriptor = "Lclient!fm;")
	private Class1_Sub4_Sub5 aClass1_Sub4_Sub5_1;

	static {
		new Class34("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(ILclient!pp;Lclient!pp;Lclient!sa;Lclient!vm;IIZ)V")
	public Class51_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(2) Class166 arg2, @OriginalArg(3) Class186 arg3, @OriginalArg(4) Class211 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt5694 = arg0;
		this.aClass166_4 = arg1;
		if (this.aClass166_4 == null) {
			this.aBoolean549 = false;
		} else {
			this.aBoolean549 = true;
			this.aClass16_34 = new Class16();
		}
		this.aClass166_3 = arg2;
		this.anInt5699 = arg5;
		this.aClass186_2 = arg3;
		this.aClass211_3 = arg4;
		this.anInt5682 = arg6;
		this.aBoolean551 = arg7;
		if (this.aClass166_3 != null) {
			this.aClass1_Sub4_Sub5_1 = this.aClass211_3.method5435(this.aClass166_3, this.anInt5694);
		}
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
	public void method4868() {
		if (this.aClass166_4 != null) {
			this.aBoolean550 = true;
			if (this.aClass16_34 == null) {
				this.aClass16_34 = new Class16();
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Lclient!op;")
	@Override
	public Class156 method4857() {
		if (this.aClass156_1 != null) {
			return this.aClass156_1;
		}
		if (this.aClass1_Sub4_Sub5_1 == null) {
			if (this.aClass186_2.method4899()) {
				return null;
			}
			this.aClass1_Sub4_Sub5_1 = this.aClass186_2.method4893(this.anInt5694, (byte) 0, 255, true);
		}
		if (this.aClass1_Sub4_Sub5_1.aBoolean519) {
			return null;
		}
		@Pc(51) byte[] local51 = this.aClass1_Sub4_Sub5_1.method4679();
		if (this.aClass1_Sub4_Sub5_1 instanceof Class1_Sub4_Sub5_Sub1) {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass156_1 = new Class156(local51, this.anInt5699);
				if (this.aClass156_1.anInt4723 != this.anInt5682) {
					throw new RuntimeException();
				}
			} catch (@Pc(147) RuntimeException local147) {
				this.aClass156_1 = null;
				if (this.aClass186_2.method4899()) {
					this.aClass1_Sub4_Sub5_1 = null;
				} else {
					this.aClass1_Sub4_Sub5_1 = this.aClass186_2.method4893(this.anInt5694, (byte) 0, 255, true);
				}
				return null;
			}
		} else {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass156_1 = new Class156(local51, this.anInt5699);
			} catch (@Pc(71) RuntimeException local71) {
				this.aClass186_2.method4896();
				this.aClass156_1 = null;
				if (this.aClass186_2.method4899()) {
					this.aClass1_Sub4_Sub5_1 = null;
				} else {
					this.aClass1_Sub4_Sub5_1 = this.aClass186_2.method4893(this.anInt5694, (byte) 0, 255, true);
				}
				return null;
			}
			if (this.aClass166_3 != null) {
				this.aClass211_3.method5438(this.anInt5694, local51, this.aClass166_3);
			}
		}
		if (this.aClass166_4 != null) {
			this.aByteArray85 = new byte[this.aClass156_1.anInt4725];
			this.anInt5690 = 0;
		}
		this.aClass1_Sub4_Sub5_1 = null;
		return this.aClass156_1;
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
	public void method4870() {
		if (this.aClass16_34 == null || this.method4857() == null) {
			return;
		}
		for (@Pc(25) Class1 local25 = this.aClass16_33.method410(); local25 != null; local25 = this.aClass16_33.method419()) {
			@Pc(31) int local31 = (int) local25.aLong213;
			if (local31 < 0 || local31 >= this.aClass156_1.anInt4725 || this.aClass156_1.anIntArray424[local31] == 0) {
				local25.method5628();
			} else {
				if (this.aByteArray85[local31] == 0) {
					this.method4879(1, local31);
				}
				if (this.aByteArray85[local31] == -1) {
					this.method4879(2, local31);
				}
				if (this.aByteArray85[local31] == 1) {
					local25.method5628();
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
	public void method4872() {
		if (this.aClass16_34 != null) {
			if (this.method4857() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class1 local31;
			@Pc(37) int local37;
			@Pc(125) Class1 local125;
			if (this.aBoolean549) {
				local26 = true;
				for (local31 = this.aClass16_34.method410(); local31 != null; local31 = this.aClass16_34.method419()) {
					local37 = (int) local31.aLong213;
					if (this.aByteArray85[local37] == 0) {
						this.method4879(1, local37);
					}
					if (this.aByteArray85[local37] == 0) {
						local26 = false;
					} else {
						local31.method5628();
					}
				}
				while (this.anInt5702 < this.aClass156_1.anIntArray424.length) {
					if (this.aClass156_1.anIntArray424[this.anInt5702] == 0) {
						this.anInt5702++;
					} else {
						if (this.aClass211_3.anInt6444 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray85[this.anInt5702] == 0) {
							this.method4879(1, this.anInt5702);
						}
						if (this.aByteArray85[this.anInt5702] == 0) {
							local125 = new Class1();
							local125.aLong213 = this.anInt5702;
							local26 = false;
							this.aClass16_34.method416(local125);
						}
						this.anInt5702++;
					}
				}
				if (local26) {
					this.anInt5702 = 0;
					this.aBoolean549 = false;
				}
			} else if (this.aBoolean550) {
				local26 = true;
				for (local31 = this.aClass16_34.method410(); local31 != null; local31 = this.aClass16_34.method419()) {
					local37 = (int) local31.aLong213;
					if (this.aByteArray85[local37] != 1) {
						this.method4879(2, local37);
					}
					if (this.aByteArray85[local37] == 1) {
						local31.method5628();
					} else {
						local26 = false;
					}
				}
				while (this.anInt5702 < this.aClass156_1.anIntArray424.length) {
					if (this.aClass156_1.anIntArray424[this.anInt5702] == 0) {
						this.anInt5702++;
					} else {
						if (this.aClass186_2.method4892()) {
							local26 = false;
							break;
						}
						if (this.aByteArray85[this.anInt5702] != 1) {
							this.method4879(2, this.anInt5702);
						}
						if (this.aByteArray85[this.anInt5702] != 1) {
							local125 = new Class1();
							local125.aLong213 = this.anInt5702;
							local26 = false;
							this.aClass16_34.method416(local125);
						}
						this.anInt5702++;
					}
				}
				if (local26) {
					this.anInt5702 = 0;
					this.aBoolean550 = false;
				}
			} else {
				this.aClass16_34 = null;
			}
		}
		if (!this.aBoolean551 || this.aLong163 > Static162.method3252()) {
			return;
		}
		for (@Pc(326) Class1_Sub4_Sub5 local326 = (Class1_Sub4_Sub5) this.aClass197_26.method5161(); local326 != null; local326 = (Class1_Sub4_Sub5) this.aClass197_26.method5154()) {
			if (!local326.aBoolean519) {
				if (local326.aBoolean517) {
					if (!local326.aBoolean518) {
						throw new RuntimeException();
					}
					local326.method5628();
				} else {
					local326.aBoolean517 = true;
				}
			}
		}
		this.aLong163 = Static162.method3252() + 1000L;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)V")
	@Override
	public void method4859(@OriginalArg(1) int arg0) {
		if (this.aClass166_4 == null) {
			return;
		}
		for (@Pc(20) Class1 local20 = this.aClass16_33.method410(); local20 != null; local20 = this.aClass16_33.method419()) {
			if ((long) arg0 == local20.aLong213) {
				return;
			}
		}
		@Pc(40) Class1 local40 = new Class1();
		local40.aLong213 = arg0;
		this.aClass16_33.method416(local40);
	}

	@OriginalMember(owner = "client!s", name = "i", descriptor = "(I)I")
	public int method4875() {
		if (this.aClass156_1 == null) {
			return 0;
		} else if (this.aBoolean549) {
			@Pc(26) Class1 local26 = this.aClass16_34.method410();
			return local26 == null ? 0 : (int) local26.aLong213;
		} else {
			return this.aClass156_1.anInt4720;
		}
	}

	@OriginalMember(owner = "client!s", name = "k", descriptor = "(I)I")
	public int method4878() {
		return this.anInt5690;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method4866(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub4_Sub5 local15 = this.method4879(0, arg0);
		if (local15 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local15.method4679();
			local15.method5628();
			return local23;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lclient!fm;")
	private Class1_Sub4_Sub5 method4879(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class1_Sub4_Sub5 local18 = (Class1_Sub4_Sub5) this.aClass197_26.method5157((long) arg1);
		if (local18 != null && arg0 == 0 && !local18.aBoolean518 && local18.aBoolean519) {
			local18.method5628();
			local18 = null;
		}
		if (local18 == null) {
			if (arg0 == 0) {
				if (this.aClass166_4 == null || this.aByteArray85[arg1] == -1) {
					if (this.aClass186_2.method4899()) {
						return null;
					}
					local18 = this.aClass186_2.method4893(arg1, (byte) 2, this.anInt5694, true);
				} else {
					local18 = this.aClass211_3.method5435(this.aClass166_4, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass166_4 == null) {
					throw new RuntimeException();
				}
				local18 = this.aClass211_3.method5432(this.aClass166_4, arg1);
			} else if (arg0 == 2) {
				if (this.aClass166_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray85[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass186_2.method4892()) {
					return null;
				}
				local18 = this.aClass186_2.method4893(arg1, (byte) 2, this.anInt5694, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass197_26.method5166(local18, (long) arg1);
		}
		if (local18.aBoolean519) {
			return null;
		}
		@Pc(158) byte[] local158 = local18.method4679();
		@Pc(185) int local185;
		@Pc(292) Class1_Sub4_Sub5_Sub2 local292;
		if (!(local18 instanceof Class1_Sub4_Sub5_Sub1)) {
			try {
				if (local158 == null || local158.length <= 2) {
					throw new RuntimeException();
				}
				Static253.aCRC32_1.reset();
				Static253.aCRC32_1.update(local158, 0, local158.length - 2);
				local185 = (int) Static253.aCRC32_1.getValue();
				if (local185 != this.aClass156_1.anIntArray423[arg1]) {
					throw new RuntimeException();
				}
				this.aClass186_2.anInt5720 = 0;
				this.aClass186_2.anInt5721 = 0;
			} catch (@Pc(352) RuntimeException local352) {
				this.aClass186_2.method4896();
				local18.method5628();
				if (local18.aBoolean518 && !this.aClass186_2.method4899()) {
					local292 = this.aClass186_2.method4893(arg1, (byte) 2, this.anInt5694, true);
					this.aClass197_26.method5166(local292, (long) arg1);
				}
				return null;
			}
			local158[local158.length - 2] = (byte) (this.aClass156_1.anIntArray421[arg1] >>> 8);
			local158[local158.length - 1] = (byte) this.aClass156_1.anIntArray421[arg1];
			if (this.aClass166_4 != null) {
				this.aClass211_3.method5438(arg1, local158, this.aClass166_4);
				if (this.aByteArray85[arg1] != 1) {
					this.anInt5690++;
					this.aByteArray85[arg1] = 1;
				}
			}
			if (!local18.aBoolean518) {
				local18.method5628();
			}
			return local18;
		}
		try {
			if (local158 == null || local158.length <= 2) {
				throw new RuntimeException();
			}
			Static253.aCRC32_1.reset();
			Static253.aCRC32_1.update(local158, 0, local158.length - 2);
			local185 = (int) Static253.aCRC32_1.getValue();
			if (this.aClass156_1.anIntArray423[arg1] != local185) {
				throw new RuntimeException();
			}
			@Pc(221) int local221 = ((local158[local158.length - 2] & 0xFF) << 8) + (local158[local158.length - 1] & 0xFF);
			if (local221 != (this.aClass156_1.anIntArray421[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray85[arg1] != 1) {
				this.anInt5690++;
				this.aByteArray85[arg1] = 1;
			}
			if (!local18.aBoolean518) {
				local18.method5628();
			}
			return local18;
		} catch (@Pc(266) Exception local266) {
			this.aByteArray85[arg1] = -1;
			local18.method5628();
			if (local18.aBoolean518 && !this.aClass186_2.method4899()) {
				local292 = this.aClass186_2.method4893(arg1, (byte) 2, this.anInt5694, true);
				this.aClass197_26.method5166(local292, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!s", name = "l", descriptor = "(I)I")
	public int method4880() {
		return this.aClass156_1 == null ? 0 : this.aClass156_1.anInt4720;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZ)I")
	@Override
	public int method4858(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub4_Sub5 local11 = (Class1_Sub4_Sub5) this.aClass197_26.method5157((long) arg0);
		return local11 == null ? 0 : local11.method4677();
	}

	@OriginalMember(owner = "client!s", name = "m", descriptor = "(I)I")
	public int method4881() {
		if (this.method4857() == null) {
			return this.aClass1_Sub4_Sub5_1 == null ? 0 : this.aClass1_Sub4_Sub5_1.method4677();
		} else {
			return 100;
		}
	}
}
