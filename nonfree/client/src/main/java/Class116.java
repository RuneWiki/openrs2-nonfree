import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class116 {

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Lclient!rg;")
	private final Class310 aClass310_37;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "[Z")
	private final boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
	private final int anInt2492;

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "[[I")
	private final int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class116(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_37 = arg2;
		this.aClass310_37.method7773(1);
		@Pc(22) Class14_Sub21 local22 = new Class14_Sub21(this.aClass310_37.method7803(0, 0));
		@Pc(26) int local26 = local22.method7695(112);
		if (local26 > 3) {
			this.aBooleanArray4 = new boolean[0];
			this.anInt2492 = -1;
			this.anIntArrayArray17 = new int[0][];
		} else {
			@Pc(46) int local46 = local22.method7695(123);
			@Pc(49) Class51[] local49 = Static195.method2933();
			@Pc(51) boolean local51 = true;
			@Pc(65) int local65;
			@Pc(71) int local71;
			if (local49.length == local46) {
				for (local65 = 0; local65 < local49.length; local65++) {
					local71 = local22.method7695(100);
					if (local71 != local49[local65].anInt986) {
						local51 = false;
						break;
					}
				}
			} else {
				local51 = false;
			}
			if (local51) {
				local65 = local22.method7695(114);
				local71 = local22.method7695(106);
				if (local26 <= 2) {
					this.anInt2492 = -1;
				} else {
					this.anInt2492 = local22.method7752();
				}
				this.aBooleanArray4 = new boolean[local71 + 1];
				this.anIntArrayArray17 = new int[local71 + 1][];
				@Pc(141) int local141;
				for (@Pc(135) int local135 = 0; local135 < local65; local135++) {
					local141 = local22.method7695(100);
					this.aBooleanArray4[local141] = local22.method7695(101) == 1;
					@Pc(160) int local160 = local22.method7717(-1978450544);
					@Pc(172) int local172;
					if (this.anInt2492 == -1) {
						this.anIntArrayArray17[local141] = new int[local160];
						for (local172 = 0; local172 < local160; local172++) {
							this.anIntArrayArray17[local141][local172] = local22.method7717(-1978450544);
						}
					} else {
						this.anIntArrayArray17[local141] = new int[local160 + 1];
						this.anIntArrayArray17[local141][0] = this.anInt2492;
						for (local172 = 0; local172 < local160; local172++) {
							this.anIntArrayArray17[local141][local172 + 1] = local22.method7717(-1978450544);
						}
					}
				}
				for (local141 = 0; local141 < local71 + 1; local141++) {
					if (this.anIntArrayArray17[local141] == null) {
						if (this.anInt2492 == -1) {
							this.anIntArrayArray17[local141] = new int[0];
						} else {
							this.anIntArrayArray17[local141] = new int[] { this.anInt2492 };
						}
					}
				}
			} else {
				this.anInt2492 = -1;
				this.anIntArrayArray17 = new int[0][];
				this.aBooleanArray4 = new boolean[0];
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)Z")
	public boolean method2330() {
		return this.anInt2492 != -1;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)Lclient!ff;")
	public Class115 method2331(@OriginalArg(0) int arg0) {
		@Pc(16) byte[] local16 = this.aClass310_37.method7803(arg0, 1);
		@Pc(20) Class115 local20 = new Class115();
		local20.method2266(new Class14_Sub21(local16));
		return local20;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)[I")
	public int[] method2332(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray17.length <= arg0) {
			return this.anInt2492 == -1 ? new int[0] : new int[] { this.anInt2492 };
		} else if (this.aBooleanArray4[arg0] && this.anIntArrayArray17[arg0].length > 1) {
			@Pc(68) int local68 = this.anInt2492 == -1 ? 0 : 1;
			@Pc(72) Random local72 = new Random();
			@Pc(79) int[] local79 = new int[this.anIntArrayArray17[arg0].length];
			Static691.method84(this.anIntArrayArray17[arg0], 0, local79, 0, local79.length);
			for (@Pc(91) int local91 = local68; local91 < local79.length; local91++) {
				@Pc(106) int local106 = local68 + Static645.method9067(local79.length - local68, local72);
				@Pc(110) int local110 = local79[local91];
				local79[local91] = local79[local106];
				local79[local106] = local110;
			}
			if (false) {
				Static162.aBoolean173 = true;
			}
			return local79;
		} else {
			return this.anIntArrayArray17[arg0];
		}
	}
}
