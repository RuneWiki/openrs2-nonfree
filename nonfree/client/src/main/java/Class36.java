import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bia")
public final class Class36 {

	@OriginalMember(owner = "client!bia", name = "f", descriptor = "[I")
	public static final int[] anIntArray57 = new int[32];

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "Lclient!vd;")
	private final Class353 aClass353_6;

	@OriginalMember(owner = "client!bia", name = "d", descriptor = "[Z")
	private final boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!bia", name = "c", descriptor = "I")
	private final int anInt899;

	@OriginalMember(owner = "client!bia", name = "g", descriptor = "[[I")
	private final int[][] anIntArrayArray10;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray57[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class36(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_6 = arg2;
		this.aClass353_6.method8422(1);
		@Pc(22) Class6_Sub40 local22 = new Class6_Sub40(this.aClass353_6.method8404(0, 0));
		@Pc(26) int local26 = local22.method8604();
		if (local26 > 3) {
			this.aBooleanArray9 = new boolean[0];
			this.anInt899 = -1;
			this.anIntArrayArray10 = new int[0][];
		} else {
			@Pc(45) int local45 = local22.method8604();
			@Pc(48) Class152[] local48 = Static178.method3242();
			@Pc(50) boolean local50 = true;
			@Pc(56) int local56;
			@Pc(62) int local62;
			if (local48.length == local45) {
				for (local56 = 0; local56 < local48.length; local56++) {
					local62 = local22.method8604();
					if (local62 != local48[local56].anInt4837) {
						local50 = false;
						break;
					}
				}
			} else {
				local50 = false;
			}
			if (local50) {
				local56 = local22.method8604();
				local62 = local22.method8604();
				if (local26 > 2) {
					this.anInt899 = local22.method8615();
				} else {
					this.anInt899 = -1;
				}
				this.aBooleanArray9 = new boolean[local62 + 1];
				this.anIntArrayArray10 = new int[local62 + 1][];
				@Pc(146) int local146;
				for (@Pc(140) int local140 = 0; local140 < local56; local140++) {
					local146 = local22.method8604();
					this.aBooleanArray9[local146] = local22.method8604() == 1;
					@Pc(162) int local162 = local22.method8571();
					@Pc(174) int local174;
					if (this.anInt899 == -1) {
						this.anIntArrayArray10[local146] = new int[local162];
						for (local174 = 0; local174 < local162; local174++) {
							this.anIntArrayArray10[local146][local174] = local22.method8571();
						}
					} else {
						this.anIntArrayArray10[local146] = new int[local162 + 1];
						this.anIntArrayArray10[local146][0] = this.anInt899;
						for (local174 = 0; local174 < local162; local174++) {
							this.anIntArrayArray10[local146][local174 + 1] = local22.method8571();
						}
					}
				}
				for (local146 = 0; local146 < local62 + 1; local146++) {
					if (this.anIntArrayArray10[local146] == null) {
						if (this.anInt899 == -1) {
							this.anIntArrayArray10[local146] = new int[0];
						} else {
							this.anIntArrayArray10[local146] = new int[] { this.anInt899 };
						}
					}
				}
			} else {
				this.anIntArrayArray10 = new int[0][];
				this.anInt899 = -1;
				this.aBooleanArray9 = new boolean[0];
			}
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)Z")
	public boolean method846() {
		return this.anInt899 != -1;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(II)[I")
	public int[] method847(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray10.length <= arg0) {
			return this.anInt899 == -1 ? new int[0] : new int[] { this.anInt899 };
		} else if (this.aBooleanArray9[arg0] && this.anIntArrayArray10[arg0].length > 1) {
			@Pc(58) int local58 = this.anInt899 == -1 ? 0 : 1;
			@Pc(62) Random local62 = new Random();
			@Pc(74) int[] local74 = new int[this.anIntArrayArray10[arg0].length];
			Static655.method5830(this.anIntArrayArray10[arg0], 0, local74, 0, local74.length);
			for (@Pc(86) int local86 = local58; local86 < local74.length; local86++) {
				@Pc(101) int local101 = local58 + Static588.method8281(local62, local74.length - local58);
				@Pc(105) int local105 = local74[local86];
				local74[local86] = local74[local101];
				local74[local101] = local105;
			}
			return local74;
		} else {
			return this.anIntArrayArray10[arg0];
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IB)Lclient!f;")
	public Class88 method851(@OriginalArg(0) int arg0) {
		@Pc(10) byte[] local10 = this.aClass353_6.method8404(1, arg0);
		@Pc(14) Class88 local14 = new Class88();
		local14.method2297(new Class6_Sub40(local10));
		return local14;
	}
}
