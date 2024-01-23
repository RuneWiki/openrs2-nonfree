import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
	private int anInt733;

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
	private int anInt734;

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
	private int anInt737;

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
	private int anInt740;

	@OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
	private int anInt741;

	@OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
	private int anInt744;

	@OriginalMember(owner = "client!ci", name = "G", descriptor = "I")
	private int anInt746;

	@OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
	private int anInt747;

	@OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
	private int anInt748;

	@OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
	private int anInt749;

	@OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
	public int anInt750;

	@OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
	private int anInt752;

	@OriginalMember(owner = "client!ci", name = "R", descriptor = "I")
	private int anInt753;

	@OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
	private int anInt754;

	@OriginalMember(owner = "client!ci", name = "T", descriptor = "I")
	private int anInt755;

	@OriginalMember(owner = "client!ci", name = "U", descriptor = "I")
	public int anInt756;

	@OriginalMember(owner = "client!ci", name = "V", descriptor = "I")
	private int anInt757;

	@OriginalMember(owner = "client!ci", name = "W", descriptor = "I")
	public int anInt758;

	@OriginalMember(owner = "client!ci", name = "X", descriptor = "I")
	private int anInt759;

	@OriginalMember(owner = "client!ci", name = "ab", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "Z")
	public boolean aBoolean77 = false;

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
	private int anInt738 = 0;

	@OriginalMember(owner = "client!ci", name = "bb", descriptor = "Z")
	public boolean aBoolean78 = true;

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "Lclient!rh;")
	public Class146 aClass146_1;

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "Lclient!dh;")
	public Class22_Sub3 aClass22_Sub3_1;

	@OriginalMember(owner = "client!ci", name = "M", descriptor = "Lclient!uh;")
	public Class174 aClass174_1;

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "Lclient!aa;")
	public Class2 aClass2_1;

	@OriginalMember(owner = "client!ci", name = "A", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!rh;Lclient!dh;J)V")
	public Class22_Sub2(@OriginalArg(0) Class146 arg0, @OriginalArg(1) Class22_Sub3 arg1, @OriginalArg(2) long arg2) {
		this.aClass146_1 = arg0;
		this.aClass22_Sub3_1 = arg1;
		this.aClass174_1 = new Class174();
		this.aClass2_1 = this.aClass146_1.aClass2_2;
		this.aLong25 = arg2;
		this.anInt738 = (int) ((double) this.anInt738 + Math.random() * 64.0D);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BIIIIIIIII)V")
	public void method677(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		this.anInt733 = arg3;
		this.anInt752 = arg2;
		this.anInt754 = arg4;
		this.anInt746 = arg6;
		this.anInt740 = arg8;
		this.anInt747 = arg0;
		this.anInt737 = arg1;
		this.anInt734 = arg7;
		@Pc(44) int local44 = (this.anInt747 + this.anInt733 + this.anInt734) / 3 + this.aClass22_Sub3_1.anInt1146;
		@Pc(59) int local59 = this.aClass22_Sub3_1.anInt1143 + (this.anInt746 + this.anInt740 + this.anInt737) / 3;
		this.anInt748 = arg5;
		@Pc(86) int local86 = (this.anInt754 + this.anInt752 + this.anInt748) / 3 + this.aClass22_Sub3_1.anInt1144;
		if (local44 != this.anInt756 || this.anInt758 != local86 || this.anInt762 != local59) {
			this.anInt758 = local86;
			this.anInt756 = local44;
			this.anInt762 = local59;
			this.aBoolean78 = true;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZIIJI)V")
	public void method679(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4) {
		@Pc(78) int local78;
		if (this.aBoolean77) {
			arg0 = false;
		} else if (Static52.anInt1136 < this.aClass2_1.anInt91) {
			arg0 = false;
		} else if (Static217.anIntArray458[Static52.anInt1136] < Static52.anInt1127) {
			arg0 = false;
		} else if (this.anInt747 == this.anInt733 && this.anInt734 == this.anInt747 && this.anInt752 == this.anInt748 && this.anInt748 == this.anInt754 && this.anInt737 == this.anInt740 && this.anInt740 == this.anInt746) {
			arg0 = false;
		} else if (this.aClass2_1.anInt90 != -1) {
			local78 = (int) (arg3 - this.aLong25);
			if (this.aClass2_1.aBoolean8 || this.aClass2_1.anInt90 >= local78) {
				local78 %= this.aClass2_1.anInt90;
			} else {
				arg0 = false;
			}
			if (!this.aClass2_1.aBoolean9 && local78 < this.aClass2_1.anInt84) {
				arg0 = false;
			}
			if (this.aClass2_1.aBoolean9 && this.aClass2_1.anInt84 <= local78) {
				arg0 = false;
			}
		}
		if (arg0) {
			this.anInt738 += (int) ((double) arg2 * (Math.random() * (double) (this.aClass2_1.anInt65 - this.aClass2_1.anInt72) + (double) this.aClass2_1.anInt72));
			if (this.anInt738 > 63) {
				local78 = this.anInt738 >> 6;
				this.anInt738 &= 0x3F;
				@Pc(201) int local201;
				@Pc(208) int local208;
				@Pc(222) int local222;
				@Pc(215) int local215;
				@Pc(229) int local229;
				@Pc(236) int local236;
				@Pc(334) int local334;
				@Pc(394) int local394;
				@Pc(450) int local450;
				if (this.aBoolean78) {
					local201 = this.anInt747 - this.anInt733;
					local208 = this.anInt748 - this.anInt752;
					local215 = this.anInt734 - this.anInt733;
					local222 = this.anInt740 - this.anInt737;
					local229 = this.anInt754 - this.anInt752;
					local236 = this.anInt746 - this.anInt737;
					this.anInt744 = local208 * local236 - local222 * local229;
					this.anInt755 = local201 * local229 - local215 * local208;
					this.anInt753 = local215 * local222 - local236 * local201;
					while (true) {
						if (this.anInt744 <= 32767 && this.anInt753 <= 32767 && this.anInt755 <= 32767 && this.anInt744 >= -32767 && this.anInt753 >= -32767 && this.anInt755 >= -32767) {
							local334 = (int) Math.sqrt((double) (this.anInt755 * this.anInt755 + this.anInt753 * this.anInt753 + this.anInt744 * this.anInt744));
							if (local334 <= 0) {
								local334 = 1;
							}
							this.anInt753 = this.anInt753 * 32767 / local334;
							this.anInt744 = this.anInt744 * 32767 / local334;
							this.anInt755 = this.anInt755 * 32767 / local334;
							if (this.aClass2_1.aShort4 > 0 || this.aClass2_1.aShort3 > 0) {
								local394 = (int) (Math.atan2((double) this.anInt755, (double) this.anInt744) * 2047.0D / 6.283185307179586D);
								local450 = (int) (Math.atan2((double) this.anInt753, Math.sqrt((double) (this.anInt744 * this.anInt744 + this.anInt755 * this.anInt755))) * 2047.0D / 6.283185307179586D);
								@Pc(456) int local456 = local394 - this.aClass22_Sub3_1.anInt1139;
								this.anInt741 = this.aClass2_1.aShort3 - this.aClass2_1.aShort1;
								this.anInt749 = local450 + this.aClass2_1.aShort1 - this.anInt741 / 2;
								this.anInt757 = this.aClass2_1.aShort4 - this.aClass2_1.aShort2;
								this.anInt759 = local456 + this.aClass2_1.aShort2 - this.anInt757 / 2;
							} else if (this.aClass22_Sub3_1.anInt1139 != 0) {
								local394 = this.anInt755 * arg1 + this.anInt744 * arg4 >> 16;
								this.anInt755 = arg4 * this.anInt755 - this.anInt744 * arg1 >> 16;
								this.anInt744 = local394;
							}
							this.aBoolean78 = false;
							break;
						}
						this.anInt744 >>= 0x1;
						this.anInt753 >>= 0x1;
						this.anInt755 >>= 0x1;
					}
				}
				for (local215 = 0; local215 < local78; local215++) {
					@Pc(589) int local589;
					if (this.aClass2_1.aShort4 <= 0 && this.aClass2_1.aShort3 <= 0) {
						local208 = this.anInt753;
						local222 = this.anInt755;
						local201 = this.anInt744;
					} else {
						local229 = this.anInt759 + (int) ((double) this.anInt757 * Math.random());
						local229 &= 0x7FF;
						local236 = Class87.anIntArray173[local229] >> 1;
						local334 = Class87.anIntArray177[local229] >> 1;
						local394 = (int) (Math.random() * (double) this.anInt741) + this.anInt749;
						local394 &= 0x3FF;
						local450 = Class87.anIntArray173[local394] >> 1;
						local589 = Class87.anIntArray177[local394] >> 1;
						local201 = local450 * local334 >> 15;
						local208 = local589 * -1;
						local222 = local236 * local450 >> 15;
					}
					local236 = (int) (Math.random() * 255.0D);
					local229 = (int) (Math.random() * 255.0D);
					local334 = local236 * (255 - local229) >> 8;
					local394 = 255 - local229 - local334;
					local450 = this.anInt747 * local334 + this.anInt733 * local229 + local394 * this.anInt734 >> 8;
					local589 = local394 * this.anInt754 + local229 * this.anInt752 + local334 * this.anInt748 >> 8;
					@Pc(683) int local683 = this.anInt737 * local229 + local334 * this.anInt740 + local394 * this.anInt746 >> 8;
					@Pc(701) int local701;
					if (this.aClass22_Sub3_1.anInt1139 != 0) {
						local701 = arg1 * local683 + arg4 * local450 >> 16;
						local683 = arg4 * local683 - arg1 * local450 >> 16;
						local450 = local701;
					}
					local701 = this.aClass2_1.anInt60 + (int) ((double) (this.aClass2_1.anInt64 - this.aClass2_1.anInt60) * Math.random());
					@Pc(794) int local794;
					if (this.aClass2_1.aBoolean11) {
						@Pc(736) double local736 = Math.random();
						local794 = (int) (local736 * (double) this.aClass2_1.anInt59 + (double) this.aClass2_1.anInt56) | (int) ((double) this.aClass2_1.anInt101 + local736 * (double) this.aClass2_1.anInt78) << 16 | (int) ((double) this.aClass2_1.anInt95 + (double) this.aClass2_1.anInt93 * local736) << 8 | (int) (local736 * (double) this.aClass2_1.anInt66 + (double) this.aClass2_1.anInt70) << 24;
					} else {
						local794 = (int) (Math.random() * (double) this.aClass2_1.anInt59 + (double) this.aClass2_1.anInt56) | (int) (Math.random() * (double) this.aClass2_1.anInt93 + (double) this.aClass2_1.anInt95) << 8 | (int) ((double) this.aClass2_1.anInt101 + Math.random() * (double) this.aClass2_1.anInt78) << 16 | (int) (Math.random() * (double) this.aClass2_1.anInt66 + (double) this.aClass2_1.anInt70) << 24;
					}
					@Pc(871) int local871 = this.aClass2_1.anInt88 + (int) ((double) (this.aClass2_1.anInt100 - this.aClass2_1.anInt88) * Math.random());
					if (Static52.anInt1132 == Static52.anInt1129) {
						new Class22_Sub1_Sub1(this, this.aClass22_Sub3_1.anInt1146 + local450, local589 + this.aClass22_Sub3_1.anInt1144, this.aClass22_Sub3_1.anInt1143 + local683, local201, local208, local222, local701, local871, local794);
					} else {
						@Pc(882) Class22_Sub1_Sub1 local882 = Static52.aClass22_Sub1_Sub1Array1[Static52.anInt1132];
						Static52.anInt1132 = Static52.anInt1132 + 1 & 0x3FF;
						local882.method602(this, local450 + this.aClass22_Sub3_1.anInt1146, local589 + this.aClass22_Sub3_1.anInt1144, local683 + this.aClass22_Sub3_1.anInt1143, local201, local208, local222, local701, local871, local794);
					}
				}
			}
		}
		this.anInt750 = 0;
		for (@Pc(957) Class22_Sub1_Sub1 local957 = (Class22_Sub1_Sub1) this.aClass174_1.method4281(); local957 != null; local957 = (Class22_Sub1_Sub1) this.aClass174_1.method4278()) {
			local957.method603(arg3, arg2);
			this.anInt750++;
		}
		Static52.anInt1130 += this.anInt750;
	}
}
