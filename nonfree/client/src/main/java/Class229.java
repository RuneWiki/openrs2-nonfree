import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class229 {

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!la;")
	private final Class208 aClass208_81;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "[Z")
	private final boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "[[I")
	private final int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	private final int anInt6274;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class229(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_81 = arg2;
		this.aClass208_81.method5005(1);
		@Pc(22) Class5_Sub23 local22 = new Class5_Sub23(this.aClass208_81.method4991(0, 0, -118));
		@Pc(26) int local26 = local22.method8529();
		if (local26 > 3) {
			this.aBooleanArray11 = new boolean[0];
			this.anIntArrayArray41 = new int[0][];
			this.anInt6274 = -1;
		} else {
			@Pc(48) int local48 = local22.method8529();
			@Pc(51) Class361[] local51 = Static521.method7548();
			@Pc(53) boolean local53 = true;
			@Pc(63) int local63;
			@Pc(69) int local69;
			if (local48 == local51.length) {
				for (local63 = 0; local63 < local51.length; local63++) {
					local69 = local22.method8529();
					if (local69 != local51[local63].anInt10185) {
						local53 = false;
						break;
					}
				}
			} else {
				local53 = false;
			}
			if (local53) {
				local63 = local22.method8529();
				local69 = local22.method8529();
				if (local26 <= 2) {
					this.anInt6274 = -1;
				} else {
					this.anInt6274 = local22.method8516();
				}
				this.anIntArrayArray41 = new int[local69 + 1][];
				this.aBooleanArray11 = new boolean[local69 + 1];
				@Pc(162) int local162;
				for (@Pc(156) int local156 = 0; local156 < local63; local156++) {
					local162 = local22.method8529();
					this.aBooleanArray11[local162] = local22.method8529() == 1;
					@Pc(181) int local181 = local22.method8519();
					@Pc(193) int local193;
					if (this.anInt6274 == -1) {
						this.anIntArrayArray41[local162] = new int[local181];
						for (local193 = 0; local193 < local181; local193++) {
							this.anIntArrayArray41[local162][local193] = local22.method8519();
						}
					} else {
						this.anIntArrayArray41[local162] = new int[local181 + 1];
						this.anIntArrayArray41[local162][0] = this.anInt6274;
						for (local193 = 0; local193 < local181; local193++) {
							this.anIntArrayArray41[local162][local193 + 1] = local22.method8519();
						}
					}
				}
				for (local162 = 0; local162 < local69 + 1; local162++) {
					if (this.anIntArrayArray41[local162] == null) {
						if (this.anInt6274 == -1) {
							this.anIntArrayArray41[local162] = new int[0];
						} else {
							this.anIntArrayArray41[local162] = new int[] { this.anInt6274 };
						}
					}
				}
			} else {
				this.anIntArrayArray41 = new int[0][];
				this.aBooleanArray11 = new boolean[0];
				this.anInt6274 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)[I")
	public int[] method5339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0 || this.anIntArrayArray41.length <= arg1) {
			return this.anInt6274 == -1 ? new int[0] : new int[] { this.anInt6274 };
		} else if (this.aBooleanArray11[arg1] && this.anIntArrayArray41[arg1].length > 1) {
			@Pc(63) int local63 = this.anInt6274 == -1 ? 0 : 1;
			@Pc(67) Random local67 = new Random();
			@Pc(74) int[] local74 = new int[this.anIntArrayArray41[arg1].length];
			Static682.method796(this.anIntArrayArray41[arg1], 0, local74, 0, local74.length);
			for (@Pc(86) int local86 = local63; local86 < local74.length; local86++) {
				@Pc(101) int local101 = local63 + Static547.method7966(local74.length - local63, local67);
				@Pc(105) int local105 = local74[local86];
				local74[local86] = local74[local101];
				local74[local101] = local105;
			}
			if (arg0 != 1) {
				this.method5339(-50, 69);
			}
			return local74;
		} else {
			return this.anIntArrayArray41[arg1];
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Lclient!oia;")
	public Class262 method5340(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18 = this.aClass208_81.method4991(1, arg0, -123);
		@Pc(22) Class262 local22 = new Class262();
		local22.method6313(new Class5_Sub23(local18));
		return local22;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)Z")
	public boolean method5341() {
		return this.anInt6274 != -1;
	}
}
