import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class128 {

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "Lclient!bt;")
	private final Class34 aClass34_45;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
	private final int anInt3076;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "[[I")
	private final int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "[Z")
	private final boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class128(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_45 = arg2;
		this.aClass34_45.method1233(1);
		@Pc(22) Class4_Sub11 local22 = new Class4_Sub11(this.aClass34_45.method1239(0, 0));
		@Pc(26) int local26 = local22.method8865();
		if (local26 > 3) {
			this.aBooleanArray8 = new boolean[0];
			this.anIntArrayArray18 = new int[0][];
			this.anInt3076 = -1;
		} else {
			@Pc(33) int local33 = local22.method8865();
			@Pc(36) Class210[] local36 = Static661.method8222();
			@Pc(38) boolean local38 = true;
			@Pc(44) int local44;
			@Pc(50) int local50;
			if (local36.length == local33) {
				for (local44 = 0; local44 < local36.length; local44++) {
					local50 = local22.method8865();
					if (local36[local44].anInt5224 != local50) {
						local38 = false;
						break;
					}
				}
			} else {
				local38 = false;
			}
			if (local38) {
				local44 = local22.method8865();
				local50 = local22.method8865();
				if (local26 <= 2) {
					this.anInt3076 = -1;
				} else {
					this.anInt3076 = local22.method8834();
				}
				this.anIntArrayArray18 = new int[local50 + 1][];
				this.aBooleanArray8 = new boolean[local50 + 1];
				@Pc(114) int local114;
				for (@Pc(108) int local108 = 0; local108 < local44; local108++) {
					local114 = local22.method8865();
					this.aBooleanArray8[local114] = local22.method8865() == 1;
					@Pc(130) int local130 = local22.method8859();
					@Pc(143) int local143;
					if (this.anInt3076 == -1) {
						this.anIntArrayArray18[local114] = new int[local130];
						for (local143 = 0; local143 < local130; local143++) {
							this.anIntArrayArray18[local114][local143] = local22.method8859();
						}
					} else {
						this.anIntArrayArray18[local114] = new int[local130 + 1];
						this.anIntArrayArray18[local114][0] = this.anInt3076;
						for (local143 = 0; local143 < local130; local143++) {
							this.anIntArrayArray18[local114][local143 + 1] = local22.method8859();
						}
					}
				}
				for (local114 = 0; local114 < local50 + 1; local114++) {
					if (this.anIntArrayArray18[local114] == null) {
						if (this.anInt3076 == -1) {
							this.anIntArrayArray18[local114] = new int[0];
						} else {
							this.anIntArrayArray18[local114] = new int[] { this.anInt3076 };
						}
					}
				}
			} else {
				this.anInt3076 = -1;
				this.aBooleanArray8 = new boolean[0];
				this.anIntArrayArray18 = new int[0][];
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Lclient!qea;")
	public Class301 method2868(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18 = this.aClass34_45.method1239(1, arg0);
		@Pc(22) Class301 local22 = new Class301();
		local22.method6622(new Class4_Sub11(local18));
		return local22;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)[I")
	public int[] method2869(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray18.length) {
			return this.anInt3076 == -1 ? new int[0] : new int[] { this.anInt3076 };
		} else if (this.aBooleanArray8[arg0] && this.anIntArrayArray18[arg0].length > 1) {
			@Pc(61) int local61 = this.anInt3076 == -1 ? 0 : 1;
			@Pc(65) Random local65 = new Random();
			@Pc(72) int[] local72 = new int[this.anIntArrayArray18[arg0].length];
			Static685.method6466(this.anIntArrayArray18[arg0], 0, local72, 0, local72.length);
			for (@Pc(84) int local84 = local61; local84 < local72.length; local84++) {
				@Pc(99) int local99 = Static149.method2598(local65, local72.length - local61) + local61;
				@Pc(103) int local103 = local72[local84];
				local72[local84] = local72[local99];
				local72[local99] = local103;
			}
			return local72;
		} else {
			return this.anIntArrayArray18[arg0];
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)Z")
	public boolean method2870() {
		return this.anInt3076 != -1;
	}
}
