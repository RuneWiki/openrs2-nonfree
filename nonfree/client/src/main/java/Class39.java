import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class39 implements Interface9 {

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Lclient!vg;")
	private Class252 aClass252_6 = new Class252(128);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "[I")
	private final int[] anIntArray47 = new int[Static309.aClass46_1.anInt1286];

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "[I")
	public final int[] anIntArray48 = new int[Static309.aClass46_1.anInt1286];

	static {
		new Class198("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)V")
	public void method960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class47 local8 = Static275.aClass254_1.method5702(arg1);
		@Pc(11) int local11 = local8.anInt1287;
		@Pc(22) int local22 = local8.anInt1289;
		@Pc(25) int local25 = local8.anInt1291;
		@Pc(32) int local32 = Class5_Sub2_Sub6.anIntArray136[local25 - local22];
		if (arg0 < 0 || arg0 > local32) {
			arg0 = 0;
		}
		local32 <<= local22;
		this.method962(local32 & arg0 << local22 | this.anIntArray48[local11] & ~local32, local11);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
	public void method961() {
		for (@Pc(11) int local11 = 0; local11 < Static309.aClass46_1.anInt1286; local11++) {
			@Pc(18) Class148 local18 = Static309.aClass46_1.method1077(local11);
			if (local18 != null && local18.anInt3858 == 0) {
				this.anIntArray47[local11] = 0;
				this.anIntArray48[local11] = 0;
			}
		}
		this.aClass252_6 = new Class252(128);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BI)I")
	@Override
	public int method958(@OriginalArg(1) int arg0) {
		return this.anIntArray48[arg0];
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(III)V")
	public void method962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray48[arg1] = arg0;
		@Pc(16) Class5_Sub30 local16 = (Class5_Sub30) this.aClass252_6.method5659((long) arg1);
		if (local16 == null) {
			local16 = new Class5_Sub30(Static446.method5903() + 500L);
			this.aClass252_6.method5658(local16, (long) arg1);
		} else {
			local16.aLong142 = Static446.method5903() + 500L;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIZ)V")
	public void method965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray47[arg1] = arg0;
		@Pc(16) Class5_Sub30 local16 = (Class5_Sub30) this.aClass252_6.method5659((long) arg1);
		if (local16 == null) {
			local16 = new Class5_Sub30(4611686018427387905L);
			this.aClass252_6.method5658(local16, (long) arg1);
		} else if (local16.aLong142 != 4611686018427387905L) {
			local16.aLong142 = Static446.method5903() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZI)V")
	public void method966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class47 local8 = Static275.aClass254_1.method5702(arg0);
		@Pc(11) int local11 = local8.anInt1287;
		@Pc(14) int local14 = local8.anInt1289;
		@Pc(17) int local17 = local8.anInt1291;
		@Pc(24) int local24 = Class5_Sub2_Sub6.anIntArray136[local17 - local14];
		if (arg1 < 0 || arg1 > local24) {
			arg1 = 0;
		}
		local24 <<= local14;
		this.method965(arg1 << local14 & local24 | this.anIntArray47[local11] & ~local24, local11);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BZ)I")
	public int method967(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static446.method5903();
		for (@Pc(22) Class5_Sub30 local22 = arg0 ? (Class5_Sub30) this.aClass252_6.method5660() : (Class5_Sub30) this.aClass252_6.method5666(); local22 != null; local22 = (Class5_Sub30) this.aClass252_6.method5666()) {
			if ((local22.aLong142 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local22.aLong142 & 0x4000000000000000L) != 0L) {
					@Pc(51) int local51 = (int) local22.aLong234;
					this.anIntArray48[local51] = this.anIntArray47[local51];
					local22.method6003();
					return local51;
				}
				local22.method6003();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)I")
	@Override
	public int method959(@OriginalArg(0) int arg0) {
		@Pc(16) Class47 local16 = Static275.aClass254_1.method5702(arg0);
		@Pc(19) int local19 = local16.anInt1287;
		@Pc(22) int local22 = local16.anInt1289;
		@Pc(25) int local25 = local16.anInt1291;
		@Pc(32) int local32 = Class5_Sub2_Sub6.anIntArray136[local25 - local22];
		return this.anIntArray48[local19] >> local22 & local32;
	}
}
