import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class8 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
	private int anInt136 = -1;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Z")
	public boolean aBoolean6 = true;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
	private final int anInt138;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
	private final int anInt139;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!sn;")
	private final Class299 aClass299_1;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_3;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	private final int anInt142;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "Lclient!dga;")
	private Class52_Sub1 aClass52_Sub1_1;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!vh;")
	private Interface23 anInterface23_1;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!hd;")
	private Class14_Sub2 aClass14_Sub2_1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!ag;Lclient!sn;Lclient!al;IIIII)V")
	public Class8(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) Class17_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt138 = arg7;
		this.anInt139 = arg6;
		this.aClass299_1 = arg1;
		this.aClass12_Sub1_3 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + (local35 + local37) * arg2.anInt7983;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray1[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt142 = local27;
		if (local27 <= 0) {
			this.aClass52_Sub1_1 = null;
		} else {
			@Pc(92) Class1_Sub20 local92 = new Class1_Sub20(local27 * 2);
			@Pc(111) int local111;
			@Pc(119) short[] local119;
			@Pc(123) int local123;
			@Pc(109) int local109;
			if (this.aClass12_Sub1_3.aBoolean23) {
				for (local50 = 0; local50 < local25; local50++) {
					local109 = local31 + (local50 + local35) * arg2.anInt7983;
					for (local111 = 0; local111 < local25; local111++) {
						local119 = arg2.aShortArrayArray1[local109++];
						if (local119 != null) {
							for (local123 = 0; local123 < local119.length; local123++) {
								local92.method4381(local119[local123] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local109 = arg2.anInt7983 * (local50 + local35) + local31;
					for (local111 = 0; local111 < local25; local111++) {
						local119 = arg2.aShortArrayArray1[local109++];
						if (local119 != null) {
							for (local123 = 0; local123 < local119.length; local123++) {
								local92.method4376(local119[local123] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface23_1 = this.aClass12_Sub1_3.method405(false, local92.anInt5238, local92.aByteArray52);
			this.aClass14_Sub2_1 = new Class14_Sub2(this.aClass12_Sub1_3, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!vh;B)V")
	private void method125(@OriginalArg(0) int arg0, @OriginalArg(1) Interface23 arg1) {
		if (arg0 != 0) {
			this.method128();
			this.aClass12_Sub1_3.method378(this.aClass52_Sub1_1);
			this.aClass12_Sub1_3.method425(0, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBI[B)V")
	public void method126(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass14_Sub2_1.method7764(arg0 * this.aClass12_Sub1_3.method417(5123), arg1);
		this.method125(arg0, this.aClass14_Sub2_1);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public void method127() {
		this.method125(this.anInt142, this.anInterface23_1);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	private void method128() {
		if (!this.aBoolean6) {
			return;
		}
		this.aBoolean6 = false;
		@Pc(21) byte[] local21 = this.aClass299_1.aByteArray84;
		@Pc(25) byte[] local25 = this.aClass12_Sub1_3.aByteArray2;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = this.aClass299_1.anInt8214;
		@Pc(42) int local42 = this.anInt139 + this.aClass299_1.anInt8214 * this.anInt138;
		@Pc(55) int local55;
		for (@Pc(44) int local44 = -128; local44 < 0; local44++) {
			local27 = (local27 << 8) - local27;
			for (local55 = -128; local55 < 0; local55++) {
				if (local21[local42++] != 0) {
					local27++;
				}
			}
			local42 += local31 - 128;
		}
		if (this.aClass52_Sub1_1 != null && local27 == this.anInt136) {
			this.aBoolean6 = false;
			return;
		}
		this.anInt136 = local27;
		local42 = this.anInt138 * local31 + this.anInt139;
		local55 = 0;
		for (@Pc(107) int local107 = -128; local107 < 0; local107++) {
			for (@Pc(111) int local111 = -128; local111 < 0; local111++) {
				if (local21[local42] == 0) {
					@Pc(126) int local126 = 0;
					if (local21[local42 - 1] != 0) {
						local126++;
					}
					if (local21[local42 + 1] != 0) {
						local126++;
					}
					if (local21[local42 - local31] != 0) {
						local126++;
					}
					if (local21[local31 + local42] != 0) {
						local126++;
					}
					local25[local55++] = (byte) (local126 * 17);
				} else {
					local25[local55++] = 68;
				}
				local42++;
			}
			local42 += this.aClass299_1.anInt8214 - 128;
		}
		if (this.aClass52_Sub1_1 == null) {
			this.aClass52_Sub1_1 = new Class52_Sub1(this.aClass12_Sub1_3, 3553, 6406, 128, 128, false, this.aClass12_Sub1_3.aByteArray2, 6406, false);
			this.aClass52_Sub1_1.method1504(false, false);
			this.aClass52_Sub1_1.method5644(true);
		} else {
			this.aClass52_Sub1_1.method1501(128, this.aClass12_Sub1_3.aByteArray2, 6406, false, 128);
		}
	}
}
