import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class228 {

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
	private int anInt5684;

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
	private int anInt5686;

	@OriginalMember(owner = "client!mt", name = "k", descriptor = "Lclient!r;")
	private Class2_Sub2_Sub19 aClass2_Sub2_Sub19_3;

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "Lclient!ka;")
	private Class182 aClass182_3;

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "Lclient!pba;")
	public Class13_Sub9 aClass13_Sub9_5;

	@OriginalMember(owner = "client!mt", name = "z", descriptor = "I")
	private int anInt5699;

	@OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
	private int anInt5705;

	@OriginalMember(owner = "client!mt", name = "K", descriptor = "Lclient!ec;")
	private Class81 aClass81_2;

	@OriginalMember(owner = "client!mt", name = "L", descriptor = "[Z")
	private boolean[] aBooleanArray93;

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
	private int anInt5687 = 0;

	@OriginalMember(owner = "client!mt", name = "x", descriptor = "I")
	private int anInt5697 = 0;

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
	private int anInt5693 = -1;

	@OriginalMember(owner = "client!mt", name = "v", descriptor = "I")
	private int anInt5695 = -1;

	@OriginalMember(owner = "client!mt", name = "B", descriptor = "I")
	private int anInt5701 = -1;

	@OriginalMember(owner = "client!mt", name = "j", descriptor = "Z")
	private boolean aBoolean418 = false;

	@OriginalMember(owner = "client!mt", name = "J", descriptor = "Z")
	private boolean aBoolean419 = false;

	@OriginalMember(owner = "client!mt", name = "D", descriptor = "I")
	public final int anInt5703;

	@OriginalMember(owner = "client!mt", name = "F", descriptor = "B")
	private final byte aByte91;

	@OriginalMember(owner = "client!mt", name = "n", descriptor = "B")
	private final byte aByte90;

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "Lclient!ig;")
	private final Class13_Sub1 aClass13_Sub1_3;

	@OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
	public final int anInt5690;

	@OriginalMember(owner = "client!mt", name = "s", descriptor = "I")
	public final int anInt5692;

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "Z")
	private final boolean aBoolean417;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!ha;Lclient!kha;IIIILclient!ig;ZI)V")
	public Class228(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class13_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt5703 = arg3;
		this.aByte91 = (byte) arg4;
		this.aByte90 = (byte) arg5;
		this.aClass13_Sub1_3 = arg6;
		this.anInt5690 = arg2;
		this.anInt5692 = arg1.anInt4815;
		this.aBoolean419 = arg7;
		this.aBoolean417 = arg0.method6926() && arg1.aBoolean344 && !this.aBoolean419;
		if (arg8 != -1) {
			this.aBoolean418 = true;
		}
		this.method4867(arg8);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)I")
	public int method4863(@OriginalArg(0) byte arg0) {
		if (arg0 != -67) {
			this.aBoolean419 = true;
		}
		return this.anInt5687;
	}

	@OriginalMember(owner = "client!mt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass13_Sub9_5 != null) {
			this.aClass13_Sub9_5.method5657();
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZZBLclient!ha;)Lclient!ka;")
	public Class182 method4865(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class95 arg3) {
		@Pc(17) Class191 local17 = Static319.aClass141_4.method2971(this.anInt5692);
		if (local17.anIntArray323 != null) {
			local17 = local17.method4057(Static431.aClass205_1);
		}
		if (local17 == null) {
			this.method4869(arg3);
			this.anInt5695 = -1;
			this.anInt5693 = -1;
			this.anInt5701 = -1;
			return null;
		}
		if (!this.aBoolean418 && local17.anInt4815 != this.anInt5693) {
			this.aClass182_3 = null;
			this.method4867(-1);
		}
		this.method4868(this.aClass13_Sub1_3);
		if (arg1) {
			@Pc(81) boolean local81 = arg1 & this.aBoolean417 & Static234.aClass2_Sub5_48.aClass6_Sub24_1.method7575() != 0;
			arg1 = local81 & (this.anInt5701 != local17.anInt4815 || this.aClass81_2 != null && Static234.aClass2_Sub5_48.aClass6_Sub24_1.method7575() >= 2 && (this.anInt5686 != this.anInt5695 || (this.aClass81_2.aBoolean160 || Static621.aBoolean729) && this.anInt5686 != this.anInt5684));
		}
		if (arg2 && !arg1) {
			this.anInt5693 = local17.anInt4815;
			return null;
		}
		if (arg1) {
			Static575.method7864(this.aClass2_Sub2_Sub19_3, this.aByte90, this.aClass13_Sub1_3.anInt10090, this.aClass13_Sub1_3.anInt10089, this.aBooleanArray93);
			this.anInt5695 = -1;
			this.anInt5701 = -1;
		}
		@Pc(153) Class76 local153 = Static314.aClass76Array2[this.aByte90];
		@Pc(169) Class76 local169;
		if (this.aBoolean419) {
			local169 = Static462.aClass76Array3[0];
		} else {
			local169 = this.aByte90 < 3 ? Static314.aClass76Array2[this.aByte90 + 1] : null;
		}
		@Pc(177) Class182 local177 = null;
		if (this.aClass81_2 != null) {
			if (arg1) {
				arg0 |= 0x40000;
			}
			local177 = local17.method4058(this.anInt5690 == 11 ? this.anInt5703 + 4 : this.anInt5703, this.aClass81_2, local153, local169, this.anInt5690 == 11 ? 10 : this.anInt5690, this.aClass13_Sub1_3.anInt10090, this.anInt5684, this.anInt5705, local153.method7398(this.aClass13_Sub1_3.anInt10090, this.aClass13_Sub1_3.anInt10089), this.aClass13_Sub1_3.anInt10089, arg3, this.anInt5686, arg0);
			if (local177 == null) {
				this.aClass2_Sub2_Sub19_3 = null;
				this.anInt5697 = 0;
				this.anInt5687 = 0;
				this.aBooleanArray93 = null;
			} else {
				if (arg1) {
					if (this.aBooleanArray93 == null) {
						this.aBooleanArray93 = new boolean[4];
					}
					this.aClass2_Sub2_Sub19_3 = local177.ba(this.aClass2_Sub2_Sub19_3);
					Static247.method3407(this.aClass2_Sub2_Sub19_3, this.aByte90, this.aClass13_Sub1_3.anInt10090, this.aClass13_Sub1_3.anInt10089, this.aBooleanArray93);
					this.anInt5701 = local17.anInt4815;
					this.anInt5695 = this.anInt5686;
				}
				this.anInt5697 = local177.fa();
				this.anInt5687 = local177.ma();
			}
			this.aClass182_3 = null;
		} else if (this.aClass182_3 != null && arg0 == (this.aClass182_3.ua() & arg0) && local17.anInt4815 == this.anInt5693) {
			local177 = this.aClass182_3;
		} else {
			if (this.aClass182_3 != null) {
				arg0 |= this.aClass182_3.ua();
			}
			@Pc(383) Class378 local383 = local17.method4064(arg0, this.aClass13_Sub1_3.anInt10089, arg1, this.anInt5690 == 11 ? this.anInt5703 + 4 : this.anInt5703, arg3, this.aClass13_Sub1_3.anInt10090, local153.method7398(this.aClass13_Sub1_3.anInt10090, this.aClass13_Sub1_3.anInt10089), this.anInt5690 == 11 ? 10 : this.anInt5690, local153, local169);
			if (local383 == null) {
				this.aClass2_Sub2_Sub19_3 = null;
				this.aClass182_3 = null;
				this.anInt5697 = 0;
				this.anInt5687 = 0;
				this.aBooleanArray93 = null;
			} else {
				local177 = local383.aClass182_7;
				this.aClass182_3 = local383.aClass182_7;
				if (arg1) {
					this.aClass2_Sub2_Sub19_3 = local383.aClass2_Sub2_Sub19_6;
					this.aBooleanArray93 = null;
					Static247.method3407(this.aClass2_Sub2_Sub19_3, this.aByte90, this.aClass13_Sub1_3.anInt10090, this.aClass13_Sub1_3.anInt10089, null);
					this.anInt5695 = -1;
					this.anInt5701 = local17.anInt4815;
				}
				this.anInt5697 = local177.fa();
				this.anInt5687 = local177.ma();
			}
		}
		this.anInt5693 = local17.anInt4815;
		return local177;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZ)V")
	public void method4866(@OriginalArg(0) int arg0) {
		this.aBoolean418 = true;
		this.method4867(arg0);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)V")
	private void method4867(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0;
		@Pc(14) boolean local14 = false;
		if (arg0 == -1) {
			@Pc(24) Class191 local24 = Static319.aClass141_4.method2971(this.anInt5692);
			@Pc(26) Class191 local26 = local24;
			if (local24.anIntArray323 != null) {
				local24 = local24.method4057(Static431.aClass205_1);
			}
			if (local24 == null) {
				return;
			}
			if (local24 == local26) {
				local26 = null;
			}
			if (local24.anIntArray325 != null) {
				if (this.aClass81_2 != null && local24.method4059(this.aClass81_2.anInt2138)) {
					return;
				}
				local12 = local24.method4051();
				if (this.anInt5693 != local24.anInt4815) {
					local14 = local24.aBoolean340;
				}
			} else if (local24.anInt4781 == -1) {
				if (local26 != null && local26.anIntArray325 != null) {
					if (this.aClass81_2 != null && local26.method4059(this.aClass81_2.anInt2138)) {
						return;
					}
					local12 = local26.method4051();
					if (this.anInt5693 != local26.anInt4815) {
						local14 = local26.aBoolean340;
					}
				} else if (local26 != null && local26.anInt4781 != -1 && local26.anInt4815 != this.anInt5693) {
					local12 = local26.anInt4781;
					local14 = local26.aBoolean340;
				}
			} else if (local24.anInt4815 != this.anInt5693) {
				local12 = local24.anInt4781;
				local14 = local24.aBoolean340;
			}
		}
		if (local12 == -1) {
			this.aClass81_2 = null;
			return;
		}
		this.aClass182_3 = null;
		if (this.aClass81_2 == null || local12 != this.aClass81_2.anInt2138) {
			this.aClass81_2 = Static540.aClass173_2.method3791(local12);
		} else if (this.aClass81_2.anInt2141 == 0) {
			return;
		}
		if (this.aClass81_2.anIntArray149 == null) {
			this.aClass81_2 = null;
			return;
		}
		if (local14) {
			this.anInt5686 = (int) (Math.random() * (double) this.aClass81_2.anIntArray149.length);
			this.anInt5705 = (int) (Math.random() * (double) this.aClass81_2.anIntArray151[this.anInt5686]) + 1;
		} else {
			this.anInt5705 = 1;
			this.anInt5686 = 0;
		}
		this.anInt5684 = this.anInt5686 + 1;
		if (this.anInt5684 < 0 || this.aClass81_2.anIntArray149.length <= this.anInt5684) {
			this.anInt5684 = -1;
		}
		this.anInt5699 = Static262.anInt5597 - this.anInt5705;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILclient!ig;)V")
	private void method4868(@OriginalArg(1) Class13_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass81_2 == null) {
				if (this.aBoolean418) {
					return;
				}
				this.method4867(-1);
				if (this.aClass81_2 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static262.anInt5597 - this.anInt5699;
			if (local34 > 100 && this.aClass81_2.anInt2150 > 0) {
				@Pc(56) int local56 = this.aClass81_2.anIntArray149.length - this.aClass81_2.anInt2150;
				while (this.anInt5686 < local56 && local34 > this.aClass81_2.anIntArray151[this.anInt5686]) {
					local34 -= this.aClass81_2.anIntArray151[this.anInt5686];
					this.anInt5686++;
				}
				if (this.anInt5686 >= local56) {
					@Pc(91) int local91 = 0;
					for (@Pc(93) int local93 = local56; local93 < this.aClass81_2.anIntArray149.length; local93++) {
						local91 += this.aClass81_2.anIntArray151[local93];
					}
					local34 %= local91;
				}
				this.anInt5684 = this.anInt5686 + 1;
				if (this.aClass81_2.anIntArray149.length <= this.anInt5684) {
					this.anInt5684 -= this.aClass81_2.anInt2150;
					if (this.anInt5684 < 0 || this.anInt5684 >= this.aClass81_2.anIntArray149.length) {
						this.anInt5684 = -1;
					}
				}
			}
			while (local34 > this.aClass81_2.anIntArray151[this.anInt5686]) {
				Static589.method8022(this.anInt5686, this.aClass81_2, arg0);
				local34 -= this.aClass81_2.anIntArray151[this.anInt5686];
				this.anInt5686++;
				if (this.aClass81_2.anIntArray149.length <= this.anInt5686) {
					this.anInt5686 -= this.aClass81_2.anInt2150;
					if (this.anInt5686 < 0 || this.anInt5686 >= this.aClass81_2.anIntArray149.length) {
						this.aClass81_2 = null;
						continue label80;
					}
				}
				this.anInt5684 = this.anInt5686 + 1;
				if (this.aClass81_2.anIntArray149.length <= this.anInt5684) {
					this.anInt5684 -= this.aClass81_2.anInt2150;
					if (this.anInt5684 < 0 || this.anInt5684 >= this.aClass81_2.anIntArray149.length) {
						this.anInt5684 = -1;
					}
				}
			}
			this.anInt5705 = local34;
			this.anInt5699 = Static262.anInt5597 - local34;
			return;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method4869(@OriginalArg(0) Class95 arg0) {
		if (this.aClass2_Sub2_Sub19_3 != null) {
			Static575.method7864(this.aClass2_Sub2_Sub19_3, this.aByte90, this.aClass13_Sub1_3.anInt10090, this.aClass13_Sub1_3.anInt10089, this.aBooleanArray93);
			this.aClass2_Sub2_Sub19_3 = null;
			this.aBooleanArray93 = null;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILclient!ka;BIZIILclient!ha;Lclient!uha;)V")
	public void method4870(@OriginalArg(0) int arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class95 arg6, @OriginalArg(8) Class177 arg7) {
		@Pc(10) Class143[] local10 = arg1.method6217();
		@Pc(13) Class255[] local13 = arg1.method6196();
		if ((this.aClass13_Sub9_5 == null || this.aClass13_Sub9_5.aBoolean490) && (local10 != null || local13 != null)) {
			@Pc(30) Class191 local30 = Static319.aClass141_4.method2971(this.anInt5692);
			if (local30.anIntArray323 != null) {
				local30 = local30.method4057(Static431.aClass205_1);
			}
			if (local30 != null) {
				this.aClass13_Sub9_5 = Static423.method5656(Static262.anInt5597, true);
			}
		}
		if (this.aClass13_Sub9_5 == null) {
			return;
		}
		arg1.method6197(arg7);
		if (arg3) {
			this.aClass13_Sub9_5.method5659(arg6, (long) Static262.anInt5597, local10, local13);
		} else {
			this.aClass13_Sub9_5.method5649((long) Static262.anInt5597);
		}
		this.aClass13_Sub9_5.method5655(this.aByte91, arg2, arg0, arg4, arg5);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILclient!ha;)V")
	public void method4872(@OriginalArg(1) Class95 arg0) {
		this.method4865(262144, true, true, arg0);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)Z")
	public boolean method4873() {
		return this.aBoolean417;
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)I")
	public int method4874() {
		return this.anInt5697;
	}
}
