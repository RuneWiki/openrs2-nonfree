import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class12_Sub9 extends Class12 {

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
	public int anInt7857;

	@OriginalMember(owner = "client!ss", name = "v", descriptor = "I")
	private int anInt7860;

	@OriginalMember(owner = "client!ss", name = "w", descriptor = "I")
	private int anInt7861;

	@OriginalMember(owner = "client!ss", name = "x", descriptor = "I")
	private int anInt7862;

	@OriginalMember(owner = "client!ss", name = "y", descriptor = "I")
	private int anInt7863;

	@OriginalMember(owner = "client!ss", name = "z", descriptor = "I")
	private int anInt7864;

	@OriginalMember(owner = "client!ss", name = "A", descriptor = "I")
	private int anInt7865;

	@OriginalMember(owner = "client!ss", name = "C", descriptor = "I")
	private int anInt7866;

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
	private int anInt7856 = 0;

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "Z")
	public boolean aBoolean667 = false;

	@OriginalMember(owner = "client!ss", name = "m", descriptor = "Lclient!ur;")
	public Class342 aClass342_1 = new Class342();

	@OriginalMember(owner = "client!ss", name = "s", descriptor = "Lclient!ur;")
	private Class342 aClass342_2 = new Class342();

	@OriginalMember(owner = "client!ss", name = "u", descriptor = "Z")
	private boolean aBoolean668 = false;

	@OriginalMember(owner = "client!ss", name = "k", descriptor = "Lclient!rca;")
	public final Class293 aClass293_2;

	@OriginalMember(owner = "client!ss", name = "r", descriptor = "J")
	private final long aLong228;

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "Lclient!kv;")
	public final Class12_Sub4 aClass12_Sub4_6;

	@OriginalMember(owner = "client!ss", name = "p", descriptor = "Lclient!th;")
	public Class326 aClass326_1;

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "Lclient!mb;")
	public final Class220 aClass220_10;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!r;Lclient!rca;Lclient!kv;J)V")
	public Class12_Sub9(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class293 arg1, @OriginalArg(2) Class12_Sub4 arg2, @OriginalArg(3) long arg3) {
		this.aClass293_2 = arg1;
		this.aLong228 = arg3;
		this.aClass12_Sub4_6 = arg2;
		this.aClass326_1 = this.aClass293_2.method5933();
		if (!arg0.method6835() && this.aClass326_1.anInt8170 != -1) {
			this.aClass326_1 = Static470.method6059(this.aClass326_1.anInt8170);
		}
		this.aClass220_10 = new Class220();
		this.anInt7856 = (int) ((double) this.anInt7856 + Math.random() * 64.0D);
		this.method6343();
		this.aClass342_2.anInt8942 = this.aClass342_1.anInt8942;
		this.aClass342_2.anInt8937 = this.aClass342_1.anInt8937;
		this.aClass342_2.anInt8933 = this.aClass342_1.anInt8933;
		this.aClass342_2.anInt8931 = this.aClass342_1.anInt8931;
		this.aClass342_2.anInt8939 = this.aClass342_1.anInt8939;
		this.aClass342_2.anInt8936 = this.aClass342_1.anInt8936;
		this.aClass342_2.anInt8941 = this.aClass342_1.anInt8941;
		this.aClass342_2.anInt8930 = this.aClass342_1.anInt8930;
		this.aClass342_2.anInt8938 = this.aClass342_1.anInt8938;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!r;IJ)V")
	public void method6341(@OriginalArg(0) Class162 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(16) Class12_Sub1_Sub1_Sub1 local16 = (Class12_Sub1_Sub1_Sub1) this.aClass220_10.method4661(); local16 != null; local16 = (Class12_Sub1_Sub1_Sub1) this.aClass220_10.method4660()) {
			local16.method4064(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZJILclient!r;I)V")
	public void method6342(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class162 arg3) {
		@Pc(45) int local45;
		if (this.aBoolean667) {
			arg0 = false;
		} else if (Static313.anInt5212 < this.aClass326_1.anInt8176) {
			arg0 = false;
		} else if (Static138.anIntArray187[Static313.anInt5212] < Static111.anInt1964) {
			arg0 = false;
		} else if (this.aBoolean668) {
			arg0 = false;
		} else if (this.aClass326_1.anInt8155 != -1) {
			local45 = (int) (arg1 - this.aLong228);
			if (this.aClass326_1.aBoolean684 || this.aClass326_1.anInt8155 >= local45) {
				local45 %= this.aClass326_1.anInt8155;
			} else {
				arg0 = false;
			}
			if (!this.aClass326_1.aBoolean686 && local45 < this.aClass326_1.anInt8186) {
				arg0 = false;
			}
			if (this.aClass326_1.aBoolean686 && local45 >= this.aClass326_1.anInt8186) {
				arg0 = false;
			}
		}
		if (arg0) {
			Static420.anInt7088++;
			local45 = (this.aClass342_1.anInt8930 + this.aClass342_1.anInt8942 + this.aClass342_1.anInt8931) / 3;
			@Pc(132) int local132 = (this.aClass342_1.anInt8939 + this.aClass342_1.anInt8937 + this.aClass342_1.anInt8936) / 3;
			@Pc(146) int local146 = (this.aClass342_1.anInt8938 + this.aClass342_1.anInt8941 + this.aClass342_1.anInt8933) / 3;
			@Pc(189) int local189;
			@Pc(198) int local198;
			@Pc(207) int local207;
			@Pc(216) int local216;
			@Pc(224) int local224;
			@Pc(233) int local233;
			@Pc(335) int local335;
			@Pc(385) int local385;
			@Pc(406) int local406;
			if (this.aClass342_1.anInt8929 != local45 || local132 != this.aClass342_1.anInt8935 || this.aClass342_1.anInt8934 != local146) {
				this.aClass342_1.anInt8934 = local146;
				this.aClass342_1.anInt8929 = local45;
				this.aClass342_1.anInt8935 = local132;
				local189 = this.aClass342_1.anInt8942 - this.aClass342_1.anInt8931;
				local198 = this.aClass342_1.anInt8937 - this.aClass342_1.anInt8936;
				local207 = this.aClass342_1.anInt8933 - this.aClass342_1.anInt8941;
				local216 = this.aClass342_1.anInt8930 - this.aClass342_1.anInt8931;
				local224 = this.aClass342_1.anInt8939 - this.aClass342_1.anInt8936;
				local233 = this.aClass342_1.anInt8938 - this.aClass342_1.anInt8941;
				this.anInt7866 = local207 * local216 - local233 * local189;
				this.anInt7861 = local189 * local224 - local198 * local216;
				this.anInt7862 = local233 * local198 - local207 * local224;
				while (true) {
					if (this.anInt7862 <= 32767 && this.anInt7866 <= 32767 && this.anInt7861 <= 32767 && this.anInt7862 >= -32767 && this.anInt7866 >= -32767 && this.anInt7861 >= -32767) {
						local335 = (int) Math.sqrt((double) (this.anInt7861 * this.anInt7861 + this.anInt7866 * this.anInt7866 + this.anInt7862 * this.anInt7862));
						if (local335 <= 0) {
							local335 = 1;
						}
						this.anInt7866 = this.anInt7866 * 32767 / local335;
						this.anInt7862 = this.anInt7862 * 32767 / local335;
						this.anInt7861 = this.anInt7861 * 32767 / local335;
						if (this.aClass326_1.aShort110 > 0 || this.aClass326_1.aShort111 > 0) {
							local385 = (int) (Math.atan2((double) this.anInt7861, (double) this.anInt7862) * 2607.5945876176133D);
							local406 = (int) (Math.atan2((double) this.anInt7866, Math.sqrt((double) (this.anInt7861 * this.anInt7861 + this.anInt7862 * this.anInt7862))) * 2607.5945876176133D);
							this.anInt7865 = this.aClass326_1.aShort110 - this.aClass326_1.aShort108;
							this.anInt7864 = this.aClass326_1.aShort111 - this.aClass326_1.aShort109;
							this.anInt7863 = this.aClass326_1.aShort108 + local385 - (this.anInt7865 >> 1);
							this.anInt7860 = this.aClass326_1.aShort109 + local406 - (this.anInt7864 >> 1);
						}
						break;
					}
					this.anInt7866 >>= 0x1;
					this.anInt7862 >>= 0x1;
					this.anInt7861 >>= 0x1;
				}
			}
			this.anInt7856 += (int) ((Math.random() * (double) (this.aClass326_1.anInt8165 - this.aClass326_1.anInt8181) + (double) this.aClass326_1.anInt8181) * (double) arg2);
			if (this.anInt7856 > 63) {
				local189 = this.anInt7856 >> 6;
				this.anInt7856 &= 0x3F;
				for (local224 = 0; local224 < local189; local224++) {
					@Pc(547) int local547;
					@Pc(551) int local551;
					if (this.aClass326_1.aShort110 <= 0 && this.aClass326_1.aShort111 <= 0) {
						local198 = this.anInt7862;
						local207 = this.anInt7866;
						local216 = this.anInt7861;
					} else {
						local233 = this.anInt7863 + (int) ((double) this.anInt7865 * Math.random());
						local233 &= 0x3FFF;
						local335 = Class285.anIntArray476[local233];
						local385 = Class285.anIntArray475[local233];
						local406 = (int) ((double) this.anInt7864 * Math.random()) + this.anInt7860;
						local406 &= 0x1FFF;
						local547 = Class285.anIntArray476[local406];
						local551 = Class285.anIntArray475[local406];
						local198 = local547 * local385 >> 13;
						local207 = (local551 << 1) * -1;
						local216 = local335 * local547 >> 13;
					}
					@Pc(585) float local585 = (float) Math.random();
					@Pc(588) float local588 = (float) Math.random();
					if (local588 + local585 > 1.0F) {
						local585 = 1.0F - local585;
						local588 = 1.0F - local588;
					}
					@Pc(610) float local610 = 1.0F - local585 - local588;
					local406 = (int) (local610 * (float) this.aClass342_1.anInt8930 + local588 * (float) this.aClass342_1.anInt8942 + (float) this.aClass342_1.anInt8931 * local585);
					local547 = (int) ((float) this.aClass342_1.anInt8939 * local610 + (float) this.aClass342_1.anInt8937 * local588 + local585 * (float) this.aClass342_1.anInt8936);
					local551 = (int) (local610 * (float) this.aClass342_1.anInt8938 + (float) this.aClass342_1.anInt8933 * local588 + (float) this.aClass342_1.anInt8941 * local585);
					@Pc(698) int local698 = (int) (local585 * (float) this.aClass342_2.anInt8931 + local588 * (float) this.aClass342_2.anInt8942 + (float) this.aClass342_2.anInt8930 * local610);
					@Pc(720) int local720 = (int) (local610 * (float) this.aClass342_2.anInt8939 + (float) this.aClass342_2.anInt8937 * local588 + (float) this.aClass342_2.anInt8936 * local585);
					@Pc(742) int local742 = (int) ((float) this.aClass342_2.anInt8938 * local610 + local588 * (float) this.aClass342_2.anInt8933 + (float) this.aClass342_2.anInt8941 * local585);
					@Pc(747) int local747 = local406 - local698;
					@Pc(752) int local752 = local547 - local720;
					@Pc(756) int local756 = local551 - local742;
					@Pc(765) int local765 = (int) ((double) local698 + (double) local747 * Math.random());
					@Pc(774) int local774 = (int) ((double) local720 + Math.random() * (double) local752);
					@Pc(783) int local783 = (int) ((double) local756 * Math.random() + (double) local742);
					@Pc(800) int local800 = (int) ((double) (this.aClass326_1.anInt8174 - this.aClass326_1.anInt8184) * Math.random()) + this.aClass326_1.anInt8184;
					@Pc(817) int local817 = (int) ((double) (this.aClass326_1.anInt8166 - this.aClass326_1.anInt8190) * Math.random()) + this.aClass326_1.anInt8190;
					@Pc(834) int local834 = (int) (Math.random() * (double) (this.aClass326_1.anInt8173 - this.aClass326_1.anInt8143)) + this.aClass326_1.anInt8143;
					@Pc(898) int local898;
					if (this.aClass326_1.aBoolean690) {
						@Pc(840) double local840 = Math.random();
						local898 = (int) ((double) this.aClass326_1.anInt8157 * Math.random() + (double) this.aClass326_1.anInt8167) << 24 | (int) ((double) this.aClass326_1.anInt8195 + (double) this.aClass326_1.anInt8169 * local840) << 16 | (int) ((double) this.aClass326_1.anInt8172 + local840 * (double) this.aClass326_1.anInt8159) << 8 | (int) (local840 * (double) this.aClass326_1.anInt8151 + (double) this.aClass326_1.anInt8189);
					} else {
						local898 = (int) (Math.random() * (double) this.aClass326_1.anInt8157 + (double) this.aClass326_1.anInt8167) << 24 | (int) (Math.random() * (double) this.aClass326_1.anInt8151 + (double) this.aClass326_1.anInt8189) | (int) (Math.random() * (double) this.aClass326_1.anInt8159 + (double) this.aClass326_1.anInt8172) << 8 | (int) (Math.random() * (double) this.aClass326_1.anInt8169 + (double) this.aClass326_1.anInt8195) << 16;
					}
					@Pc(962) int local962 = this.aClass326_1.anInt8194;
					if (!arg3.method6835() && !this.aClass326_1.aBoolean692) {
						local962 = -1;
					}
					if (Static466.anInt7442 == Static217.anInt3142) {
						new Class12_Sub1_Sub1_Sub1(this, local765, local774, local783, local198, local207, local216, local800, local817, local898, local834, local962, this.aClass326_1.aBoolean685, this.aClass326_1.aBoolean687);
					} else {
						@Pc(1002) Class12_Sub1_Sub1_Sub1 local1002 = Static83.aClass12_Sub1_Sub1_Sub1Array1[Static466.anInt7442];
						Static466.anInt7442 = Static466.anInt7442 + 1 & 0x3FF;
						local1002.method4067(this, local765, local774, local783, local198, local207, local216, local800, local817, local898, local834, local962, this.aClass326_1.aBoolean685, this.aClass326_1.aBoolean687);
					}
				}
			}
		}
		if (!this.aClass342_1.method7114(this.aClass342_2)) {
			@Pc(1048) Class342 local1048 = this.aClass342_2;
			this.aClass342_2 = this.aClass342_1;
			this.aClass342_1 = local1048;
			this.aClass342_1.anInt8941 = this.aClass293_2.anInt7317;
			this.aClass342_1.anInt8942 = this.aClass293_2.anInt7318;
			this.aClass342_1.anInt8933 = this.aClass293_2.anInt7316;
			this.aClass342_1.anInt8939 = this.aClass293_2.anInt7302;
			this.aClass342_1.anInt8937 = this.aClass293_2.anInt7315;
			this.aClass342_1.anInt8930 = this.aClass293_2.anInt7305;
			this.aClass342_1.anInt8936 = this.aClass293_2.anInt7310;
			this.aClass342_1.anInt8931 = this.aClass293_2.anInt7306;
			this.aClass342_1.anInt8938 = this.aClass293_2.anInt7312;
		}
		this.anInt7857 = 0;
		for (@Pc(1120) Class12_Sub1_Sub1_Sub1 local1120 = (Class12_Sub1_Sub1_Sub1) this.aClass220_10.method4661(); local1120 != null; local1120 = (Class12_Sub1_Sub1_Sub1) this.aClass220_10.method4660()) {
			local1120.method4066(arg1, arg2);
			this.anInt7857++;
		}
		Static94.anInt1652 += this.anInt7857;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
	public void method6343() {
		this.aClass342_1.anInt8941 = this.aClass293_2.anInt7317;
		this.aClass342_1.anInt8933 = this.aClass293_2.anInt7316;
		this.aClass342_1.anInt8937 = this.aClass293_2.anInt7315;
		this.aClass342_1.anInt8938 = this.aClass293_2.anInt7312;
		this.aClass342_1.anInt8931 = this.aClass293_2.anInt7306;
		this.aClass342_1.anInt8939 = this.aClass293_2.anInt7302;
		this.aClass342_1.anInt8930 = this.aClass293_2.anInt7305;
		this.aClass342_1.anInt8942 = this.aClass293_2.anInt7318;
		this.aClass342_1.anInt8936 = this.aClass293_2.anInt7310;
		if (this.aClass342_1.anInt8942 == this.aClass342_1.anInt8931 && this.aClass342_1.anInt8930 == this.aClass342_1.anInt8942 && this.aClass342_1.anInt8936 == this.aClass342_1.anInt8937 && this.aClass342_1.anInt8939 == this.aClass342_1.anInt8937 && this.aClass342_1.anInt8941 == this.aClass342_1.anInt8933 && this.aClass342_1.anInt8938 == this.aClass342_1.anInt8933) {
			this.aBoolean668 = true;
		} else if (this.aBoolean668) {
			this.aClass342_2.anInt8936 = this.aClass342_1.anInt8936;
			this.aClass342_2.anInt8937 = this.aClass342_1.anInt8937;
			this.aClass342_2.anInt8942 = this.aClass342_1.anInt8942;
			this.aBoolean668 = false;
			this.aClass342_2.anInt8931 = this.aClass342_1.anInt8931;
			this.aClass342_2.anInt8941 = this.aClass342_1.anInt8941;
			this.aClass342_2.anInt8933 = this.aClass342_1.anInt8933;
			this.aClass342_2.anInt8930 = this.aClass342_1.anInt8930;
			this.aClass342_2.anInt8939 = this.aClass342_1.anInt8939;
			this.aClass342_2.anInt8938 = this.aClass342_1.anInt8938;
		}
	}
}
