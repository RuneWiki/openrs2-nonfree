import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class88 {

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!nd;")
	private final Class238 aClass238_55;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	private final int anInt2487;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "[Z")
	private final boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "[[I")
	private final int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class88(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_55 = arg2;
		this.aClass238_55.method5592(1);
		@Pc(22) Class2_Sub17 local22 = new Class2_Sub17(this.aClass238_55.method5567(0, 0));
		@Pc(26) int local26 = local22.method2859();
		if (local26 > 3) {
			this.anIntArrayArray21 = new int[0][];
			this.aBooleanArray4 = new boolean[0];
			this.anInt2487 = -1;
		} else {
			@Pc(33) int local33 = local22.method2859();
			@Pc(36) Class151[] local36 = Static231.method3728();
			@Pc(38) boolean local38 = true;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local33 == local36.length) {
				for (local52 = 0; local52 < local36.length; local52++) {
					local58 = local22.method2859();
					if (local58 != local36[local52].anInt4087) {
						local38 = false;
						break;
					}
				}
			} else {
				local38 = false;
			}
			if (local38) {
				local52 = local22.method2859();
				local58 = local22.method2859();
				if (local26 <= 2) {
					this.anInt2487 = -1;
				} else {
					this.anInt2487 = local22.method2836();
				}
				this.aBooleanArray4 = new boolean[local58 + 1];
				this.anIntArrayArray21 = new int[local58 + 1][];
				@Pc(126) int local126;
				for (@Pc(120) int local120 = 0; local120 < local52; local120++) {
					local126 = local22.method2859();
					this.aBooleanArray4[local126] = local22.method2859() == 1;
					@Pc(144) int local144 = local22.method2825();
					@Pc(167) int local167;
					if (this.anInt2487 == -1) {
						this.anIntArrayArray21[local126] = new int[local144];
						for (local167 = 0; local167 < local144; local167++) {
							this.anIntArrayArray21[local126][local167] = local22.method2825();
						}
					} else {
						this.anIntArrayArray21[local126] = new int[local144 + 1];
						this.anIntArrayArray21[local126][0] = this.anInt2487;
						for (local167 = 0; local167 < local144; local167++) {
							this.anIntArrayArray21[local126][local167 + 1] = local22.method2825();
						}
					}
				}
				for (local126 = 0; local126 < local58 + 1; local126++) {
					if (this.anIntArrayArray21[local126] == null) {
						if (this.anInt2487 == -1) {
							this.anIntArrayArray21[local126] = new int[0];
						} else {
							this.anIntArrayArray21[local126] = new int[] { this.anInt2487 };
						}
					}
				}
			} else {
				this.anIntArrayArray21 = new int[0][];
				this.anInt2487 = -1;
				this.aBooleanArray4 = new boolean[0];
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Lclient!jca;")
	public Class173 method2102(@OriginalArg(1) int arg0) {
		@Pc(10) byte[] local10 = this.aClass238_55.method5567(arg0, 1);
		@Pc(14) Class173 local14 = new Class173();
		local14.method4276(new Class2_Sub17(local10));
		return local14;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)Z")
	public boolean method2103() {
		return this.anInt2487 != -1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)[I")
	public int[] method2104(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray21.length) {
			return this.anInt2487 == -1 ? new int[0] : new int[] { this.anInt2487 };
		} else if (this.aBooleanArray4[arg0] && this.anIntArrayArray21[arg0].length > 1) {
			@Pc(65) int local65 = this.anInt2487 == -1 ? 0 : 1;
			@Pc(69) Random local69 = new Random();
			@Pc(76) int[] local76 = new int[this.anIntArrayArray21[arg0].length];
			Static650.method2270(this.anIntArrayArray21[arg0], 0, local76, 0, local76.length);
			for (@Pc(88) int local88 = local65; local88 < local76.length; local88++) {
				@Pc(101) int local101 = local65 + Static142.method2572(local76.length - local65, local69);
				@Pc(105) int local105 = local76[local88];
				local76[local88] = local76[local101];
				local76[local101] = local105;
			}
			return local76;
		} else {
			return this.anIntArrayArray21[arg0];
		}
	}
}
