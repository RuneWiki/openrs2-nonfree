import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class3_Sub4_Sub32 extends Class3_Sub4 {

	@OriginalMember(owner = "client!qu", name = "P", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!qu", name = "Y", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!qu", name = "M", descriptor = "I")
	public int anInt5851 = 4;

	@OriginalMember(owner = "client!qu", name = "S", descriptor = "I")
	public int anInt5855 = 4;

	@OriginalMember(owner = "client!qu", name = "W", descriptor = "I")
	public int anInt5858 = 1638;

	@OriginalMember(owner = "client!qu", name = "X", descriptor = "Z")
	public boolean aBoolean411 = true;

	@OriginalMember(owner = "client!qu", name = "V", descriptor = "[B")
	private byte[] aByteArray97 = new byte[512];

	@OriginalMember(owner = "client!qu", name = "ab", descriptor = "I")
	public int anInt5860 = 0;

	@OriginalMember(owner = "client!qu", name = "U", descriptor = "I")
	public int anInt5857 = 4;

	static {
		new Class174("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "(I)V")
	private void method4857() {
		@Pc(21) int local21;
		if (this.anInt5858 > 0) {
			this.aShortArray73 = new short[this.anInt5855];
			this.aShortArray72 = new short[this.anInt5855];
			for (local21 = 0; local21 < this.anInt5855; local21++) {
				this.aShortArray72[local21] = (short) (Math.pow((double) ((float) this.anInt5858 / 4096.0F), (double) local21) * 4096.0D);
				this.aShortArray73[local21] = (short) Math.pow(2.0D, (double) local21);
			}
		} else if (this.aShortArray72 != null && this.anInt5855 == this.aShortArray72.length) {
			this.aShortArray73 = new short[this.anInt5855];
			for (local21 = 0; local21 < this.anInt5855; local21++) {
				this.aShortArray73[local21] = (short) Math.pow(2.0D, (double) local21);
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZ[I)V")
	public void method4858(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt5857 * Static317.anIntArray337[arg0];
		@Pc(120) int local120;
		@Pc(134) int local134;
		@Pc(46) int local46;
		@Pc(31) short local31;
		@Pc(111) int local111;
		@Pc(66) int local66;
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(109) int local109;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(105) int local105;
		@Pc(96) int local96;
		if (this.anInt5855 == 1) {
			local46 = this.aShortArray73[0] << 12;
			local31 = this.aShortArray72[0];
			local53 = local46 * this.anInt5851 >> 12;
			local66 = local12 * local46 >> 12;
			local60 = this.anInt5857 * local46 >> 12;
			local70 = local66 >> 12;
			local74 = local70 + 1;
			if (local60 <= local74) {
				local74 = 0;
			}
			local66 &= 0xFFF;
			local105 = this.aByteArray97[local70 & 0xFF] & 0xFF;
			local109 = Class3_Sub39.anIntArray359[local66];
			local96 = this.aByteArray97[local74 & 0xFF] & 0xFF;
			if (this.aBoolean411) {
				for (local111 = 0; local111 < Static148.anInt2687; local111++) {
					local120 = Static401.anIntArray419[local111] * this.anInt5851;
					local134 = this.method4859(local53, local105, local96, local109, local120 * local46 >> 12, local66);
					local134 = local31 * local134 >> 12;
					arg1[local111] = (local134 >> 1) + 2048;
				}
			} else {
				for (local111 = 0; local111 < Static148.anInt2687; local111++) {
					local120 = Static401.anIntArray419[local111] * this.anInt5851;
					local134 = this.method4859(local53, local105, local96, local109, local120 * local46 >> 12, local66);
					arg1[local111] = local31 * local134 >> 12;
				}
			}
			return;
		}
		local31 = this.aShortArray72[0];
		if (local31 > 8 || local31 < -8) {
			local46 = this.aShortArray73[0] << 12;
			local53 = this.anInt5851 * local46 >> 12;
			local60 = this.anInt5857 * local46 >> 12;
			local66 = local46 * local12 >> 12;
			local70 = local66 >> 12;
			local74 = local70 + 1;
			local66 &= 0xFFF;
			if (local74 >= local60) {
				local74 = 0;
			}
			local96 = this.aByteArray97[local74 & 0xFF] & 0xFF;
			local105 = this.aByteArray97[local70 & 0xFF] & 0xFF;
			local109 = Class3_Sub39.anIntArray359[local66];
			for (local111 = 0; local111 < Static148.anInt2687; local111++) {
				local120 = this.anInt5851 * Static401.anIntArray419[local111];
				local134 = this.method4859(local53, local105, local96, local109, local46 * local120 >> 12, local66);
				arg1[local111] = local134 * local31 >> 12;
			}
		}
		for (@Pc(148) int local148 = 1; local148 < this.anInt5855; local148++) {
			local31 = this.aShortArray72[local148];
			if (local31 > 8 || local31 < -8) {
				local46 = this.aShortArray73[local148] << 12;
				local60 = local46 * this.anInt5857 >> 12;
				local53 = local46 * this.anInt5851 >> 12;
				local66 = local12 * local46 >> 12;
				local70 = local66 >> 12;
				local74 = local70 + 1;
				if (local74 >= local60) {
					local74 = 0;
				}
				local66 &= 0xFFF;
				local96 = this.aByteArray97[local74 & 0xFF] & 0xFF;
				local105 = this.aByteArray97[local70 & 0xFF] & 0xFF;
				local109 = Class3_Sub39.anIntArray359[local66];
				if (this.aBoolean411 && local148 == this.anInt5855 - 1) {
					for (local111 = 0; local111 < Static148.anInt2687; local111++) {
						local120 = Static401.anIntArray419[local111] * this.anInt5851;
						local134 = this.method4859(local53, local105, local96, local109, local120 * local46 >> 12, local66);
						local134 = arg1[local111] + (local134 * local31 >> 12);
						arg1[local111] = (local134 >> 1) + 2048;
					}
				} else {
					for (local111 = 0; local111 < Static148.anInt2687; local111++) {
						local120 = this.anInt5851 * Static401.anIntArray419[local111];
						local134 = this.method4859(local53, local105, local96, local109, local46 * local120 >> 12, local66);
						arg1[local111] += local134 * local31 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean411 = arg0.method4096() == 1;
		} else if (arg1 == 1) {
			this.anInt5855 = arg0.method4096();
		} else if (arg1 == 2) {
			this.anInt5858 = arg0.method4065();
			if (this.anInt5858 < 0) {
				this.aShortArray72 = new short[this.anInt5855];
				for (@Pc(72) int local72 = 0; local72 < this.anInt5855; local72++) {
					this.aShortArray72[local72] = (short) arg0.method4065();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt5851 = this.anInt5857 = arg0.method4096();
			return;
		} else if (arg1 == 4) {
			this.anInt5860 = arg0.method4096();
			return;
		} else if (arg1 == 5) {
			this.anInt5851 = arg0.method4096();
			return;
		} else if (arg1 == 6) {
			this.anInt5857 = arg0.method4096();
			return;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIIB)I")
	private int method4859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		@Pc(21) int local21 = arg4 & 0xFFF;
		if (local13 >= arg0) {
			local13 = 0;
		}
		@Pc(30) int local30 = arg5 - 4096;
		@Pc(34) int local34 = local21 - 4096;
		local13 &= 0xFF;
		@Pc(54) int local54 = this.aByteArray97[local17 + arg1] & 0x3;
		@Pc(58) int local58 = Class3_Sub39.anIntArray359[local21];
		@Pc(75) int local75;
		if (local54 > 1) {
			local75 = local54 == 2 ? local21 - arg5 : -local21 - arg5;
		} else {
			local75 = local54 == 0 ? local21 + arg5 : arg5 + -local21;
		}
		local54 = this.aByteArray97[arg1 + local13] & 0x3;
		@Pc(115) int local115;
		if (local54 > 1) {
			local115 = local54 == 2 ? local34 - arg5 : -arg5 + -local34;
		} else {
			local115 = local54 == 0 ? arg5 + local34 : arg5 - local34;
		}
		@Pc(138) int local138 = local75 + (local58 * (local115 - local75) >> 12);
		local54 = this.aByteArray97[arg2 + local17] & 0x3;
		if (local54 <= 1) {
			local75 = local54 == 0 ? local30 + local21 : local30 + -local21;
		} else {
			local75 = local54 == 2 ? local21 - local30 : -local21 + -local30;
		}
		local54 = this.aByteArray97[local13 + arg2] & 0x3;
		if (local54 > 1) {
			local115 = local54 == 2 ? local34 - local30 : -local30 + -local34;
		} else {
			local115 = local54 == 0 ? local30 + local34 : local30 - local34;
		}
		@Pc(234) int local234 = local75 + ((local115 - local75) * local58 >> 12);
		return (arg3 * (local234 - local138) >> 12) + local138;
	}

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "(I)V")
	@Override
	public void method6146() {
		this.aByteArray97 = Static82.method1476(this.anInt5860);
		this.method4857();
		for (@Pc(25) int local25 = this.anInt5855 - 1; local25 >= 1; local25--) {
			@Pc(32) short local32 = this.aShortArray72[local25];
			if (local32 > 8) {
				return;
			}
			if (local32 < -8) {
				return;
			}
			this.anInt5855--;
		}
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			this.method4858(arg0, local14);
		}
		return local14;
	}
}
