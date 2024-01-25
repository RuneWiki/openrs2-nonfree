import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class202 {

	@OriginalMember(owner = "client!kea", name = "o", descriptor = "I")
	private int anInt5733 = -1;

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "Z")
	public boolean aBoolean470 = true;

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "Lclient!mq;")
	private final Class244 aClass244_1;

	@OriginalMember(owner = "client!kea", name = "q", descriptor = "I")
	private final int anInt5734;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_22;

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
	private final int anInt5737;

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "I")
	private final int anInt5732;

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "Lclient!ika;")
	private Interface11 anInterface11_3;

	@OriginalMember(owner = "client!kea", name = "n", descriptor = "Lclient!eka;")
	private Class49_Sub1 aClass49_Sub1_2;

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "Lclient!nw;")
	private Class245_Sub2 aClass245_Sub2_6;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lclient!gia;Lclient!mq;Lclient!vr;IIIII)V")
	public Class202(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) Class313_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass244_1 = arg1;
		this.anInt5734 = arg7;
		this.aClass67_Sub2_22 = arg0;
		this.anInt5737 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(52) int local52;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(50) int local50 = local31 + (local37 + local35) * arg2.anInt10875;
			for (local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray6[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		this.anInt5732 = local27;
		if (local27 <= 0) {
			this.aClass245_Sub2_6 = null;
		} else {
			@Pc(96) Class3_Sub28 local96 = new Class3_Sub28(local27 * 2);
			@Pc(115) int local115;
			@Pc(123) short[] local123;
			@Pc(127) int local127;
			@Pc(113) int local113;
			if (this.aClass67_Sub2_22.aBoolean322) {
				for (local52 = 0; local52 < local25; local52++) {
					local113 = local31 + arg2.anInt10875 * (local35 + local52);
					for (local115 = 0; local115 < local25; local115++) {
						local123 = arg2.aShortArrayArray6[local113++];
						if (local123 != null) {
							for (local127 = 0; local127 < local123.length; local127++) {
								local96.method5282(local123[local127] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local25; local52++) {
					local113 = local31 + arg2.anInt10875 * (local35 + local52);
					for (local115 = 0; local115 < local25; local115++) {
						local123 = arg2.aShortArrayArray6[local113++];
						if (local123 != null) {
							for (local127 = 0; local127 < local123.length; local127++) {
								local96.method5280(local123[local127] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface11_3 = this.aClass67_Sub2_22.method3274(local96.aByteArray50, local96.anInt6241, false);
			this.aClass49_Sub1_2 = new Class49_Sub1(this.aClass67_Sub2_22, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V")
	private void method4886() {
		if (!this.aBoolean470) {
			return;
		}
		this.aBoolean470 = false;
		@Pc(22) byte[] local22 = this.aClass244_1.aByteArray57;
		@Pc(26) byte[] local26 = this.aClass67_Sub2_22.aByteArray21;
		@Pc(28) int local28 = 0;
		@Pc(32) int local32 = this.aClass244_1.anInt7175;
		@Pc(42) int local42 = this.anInt5734 * this.aClass244_1.anInt7175 + this.anInt5737;
		@Pc(55) int local55;
		for (@Pc(44) int local44 = -128; local44 < 0; local44++) {
			local28 = (local28 << 8) - local28;
			for (local55 = -128; local55 < 0; local55++) {
				if (local22[local42++] != 0) {
					local28++;
				}
			}
			local42 += local32 - 128;
		}
		if (this.aClass245_Sub2_6 != null && this.anInt5733 == local28) {
			this.aBoolean470 = false;
			return;
		}
		this.anInt5733 = local28;
		local55 = 0;
		local42 = this.anInt5734 * local32 + this.anInt5737;
		for (@Pc(124) int local124 = -128; local124 < 0; local124++) {
			for (@Pc(128) int local128 = -128; local128 < 0; local128++) {
				if (local22[local42] == 0) {
					@Pc(141) int local141 = 0;
					if (local22[local42 - 1] != 0) {
						local141++;
					}
					if (local22[local42 + 1] != 0) {
						local141++;
					}
					if (local22[local42 - local32] != 0) {
						local141++;
					}
					if (local22[local42 + local32] != 0) {
						local141++;
					}
					local26[local55++] = (byte) (local141 * 17);
				} else {
					local26[local55++] = 68;
				}
				local42++;
			}
			local42 += this.aClass244_1.anInt7175 - 128;
		}
		if (this.aClass245_Sub2_6 == null) {
			this.aClass245_Sub2_6 = new Class245_Sub2(this.aClass67_Sub2_22, 3553, 6406, 128, 128, false, this.aClass67_Sub2_22.aByteArray21, 6406, false);
			this.aClass245_Sub2_6.method8473(false, false);
			this.aClass245_Sub2_6.method8672(true);
		} else {
			this.aClass245_Sub2_6.method8468(false, 6406, 128, this.aClass67_Sub2_22.aByteArray21, 128);
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(III[B)V")
	public void method4887(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass49_Sub1_2.method2434(arg1, this.aClass67_Sub2_22.method3222(5123) * arg0);
		this.method4889(this.aClass49_Sub1_2, arg0);
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)V")
	public void method4888() {
		this.method4889(this.anInterface11_3, this.anInt5732);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!ika;ZI)V")
	private void method4889(@OriginalArg(0) Interface11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method4886();
			this.aClass67_Sub2_22.method3234(this.aClass245_Sub2_6);
			this.aClass67_Sub2_22.method3232(arg0, 0, arg1);
		}
	}
}
