import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class134 {

	@OriginalMember(owner = "client!km", name = "m", descriptor = "I")
	private int anInt4227 = -1;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "Z")
	public boolean aBoolean266 = true;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	private final int anInt4226;

	@OriginalMember(owner = "client!km", name = "n", descriptor = "Lclient!dg;")
	private final Class48 aClass48_2;

	@OriginalMember(owner = "client!km", name = "r", descriptor = "I")
	private final int anInt4229;

	@OriginalMember(owner = "client!km", name = "j", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_23;

	@OriginalMember(owner = "client!km", name = "q", descriptor = "I")
	private final int anInt4228;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "Lclient!vn;")
	private Interface11 anInterface11_4;

	@OriginalMember(owner = "client!km", name = "o", descriptor = "Lclient!nr;")
	private Class129_Sub2 aClass129_Sub2_1;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "Lclient!uk;")
	private Class62_Sub2 aClass62_Sub2_3;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!bt;Lclient!dg;Lclient!gu;IIIII)V")
	public Class134(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) Class14_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt4226 = arg6;
		this.aClass48_2 = arg1;
		this.anInt4229 = arg7;
		this.aClass30_Sub1_23 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = (local35 + local37) * arg2.anInt2832 + local31;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray2[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt4228 = local27;
		if (local27 <= 0) {
			this.aClass62_Sub2_3 = null;
		} else {
			@Pc(88) Class4_Sub20 local88 = new Class4_Sub20(local27 * 2);
			@Pc(108) int local108;
			@Pc(116) short[] local116;
			@Pc(120) int local120;
			@Pc(106) int local106;
			if (this.aClass30_Sub1_23.aBoolean51) {
				for (local50 = 0; local50 < local25; local50++) {
					local106 = local31 + (local35 + local50) * arg2.anInt2832;
					for (local108 = 0; local108 < local25; local108++) {
						local116 = arg2.aShortArrayArray2[local106++];
						if (local116 != null) {
							for (local120 = 0; local120 < local116.length; local120++) {
								local88.method4558(local116[local120] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local106 = (local50 + local35) * arg2.anInt2832 + local31;
					for (local108 = 0; local108 < local25; local108++) {
						local116 = arg2.aShortArrayArray2[local106++];
						if (local116 != null) {
							for (local120 = 0; local120 < local116.length; local120++) {
								local88.method4604(local116[local120] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface11_4 = this.aClass30_Sub1_23.method723(false, local88.aByteArray77, local88.anInt5526);
			this.aClass129_Sub2_1 = new Class129_Sub2(this.aClass30_Sub1_23, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!vn;I)V")
	private void method3651(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		if (arg0 != 0) {
			this.method3653();
			this.aClass30_Sub1_23.method730(this.aClass62_Sub2_3);
			this.aClass30_Sub1_23.method721(0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II[BI)V")
	public void method3652(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.aClass129_Sub2_1.method4363(arg1, this.aClass30_Sub1_23.method749(5123) * arg0);
		this.method3651(arg0, this.aClass129_Sub2_1);
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
	private void method3653() {
		if (!this.aBoolean266) {
			return;
		}
		this.aBoolean266 = false;
		@Pc(16) byte[] local16 = this.aClass48_2.aByteArray19;
		@Pc(20) byte[] local20 = this.aClass30_Sub1_23.aByteArray3;
		@Pc(22) int local22 = 0;
		@Pc(31) int local31 = this.aClass48_2.anInt1615;
		@Pc(42) int local42 = this.anInt4226 + this.anInt4229 * this.aClass48_2.anInt1615;
		@Pc(55) int local55;
		for (@Pc(44) int local44 = -128; local44 < 0; local44++) {
			local22 = (local22 << 8) - local22;
			for (local55 = -128; local55 < 0; local55++) {
				if (local16[local42++] != 0) {
					local22++;
				}
			}
			local42 += local31 - 128;
		}
		if (this.aClass62_Sub2_3 != null && this.anInt4227 == local22) {
			this.aBoolean266 = false;
			return;
		}
		this.anInt4227 = local22;
		local42 = this.anInt4226 + this.anInt4229 * local31;
		local55 = 0;
		for (@Pc(104) int local104 = -128; local104 < 0; local104++) {
			for (@Pc(108) int local108 = -128; local108 < 0; local108++) {
				if (local16[local42] == 0) {
					@Pc(116) int local116 = 0;
					if (local16[local42 - 1] != 0) {
						local116++;
					}
					if (local16[local42 + 1] != 0) {
						local116++;
					}
					if (local16[local42 - local31] != 0) {
						local116++;
					}
					if (local16[local42 + local31] != 0) {
						local116++;
					}
					local20[local55++] = (byte) (local116 * 17);
				} else {
					local20[local55++] = 68;
				}
				local42++;
			}
			local42 += this.aClass48_2.anInt1615 - 128;
		}
		if (this.aClass62_Sub2_3 == null) {
			this.aClass62_Sub2_3 = new Class62_Sub2(this.aClass30_Sub1_23, 3553, 6406, 128, 128, false, this.aClass30_Sub1_23.aByteArray3, 6406, false);
			this.aClass62_Sub2_3.method2681(false, false);
			this.aClass62_Sub2_3.method5349(true);
		} else {
			this.aClass62_Sub2_3.method2687(128, 6406, false, 128, this.aClass30_Sub1_23.aByteArray3);
		}
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V")
	public void method3654() {
		this.method3651(this.anInt4228, this.anInterface11_4);
	}
}
