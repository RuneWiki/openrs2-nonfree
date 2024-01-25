import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class339 {

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "Lclient!pe;")
	private final Class254 aClass254_133;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "[[I")
	private final int[][] anIntArrayArray81;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "[Z")
	private final boolean[] aBooleanArray39;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
	private final int anInt9963;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class339(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_133 = arg2;
		this.aClass254_133.method6396(1);
		@Pc(22) Class3_Sub7 local22 = new Class3_Sub7(this.aClass254_133.method6401(0, 0));
		@Pc(26) int local26 = local22.method6538();
		if (local26 > 3) {
			this.anIntArrayArray81 = new int[0][];
			this.aBooleanArray39 = new boolean[0];
			this.anInt9963 = -1;
		} else {
			@Pc(33) int local33 = local22.method6538();
			@Pc(36) Class103[] local36 = Static107.method2268();
			@Pc(38) boolean local38 = true;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local36.length == local33) {
				for (local52 = 0; local52 < local36.length; local52++) {
					local58 = local22.method6538();
					if (local36[local52].anInt3267 != local58) {
						local38 = false;
						break;
					}
				}
			} else {
				local38 = false;
			}
			if (local38) {
				local52 = local22.method6538();
				local58 = local22.method6538();
				if (local26 > 2) {
					this.anInt9963 = local22.method6525();
				} else {
					this.anInt9963 = -1;
				}
				this.aBooleanArray39 = new boolean[local58 + 1];
				this.anIntArrayArray81 = new int[local58 + 1][];
				@Pc(128) int local128;
				for (@Pc(122) int local122 = 0; local122 < local52; local122++) {
					local128 = local22.method6538();
					this.aBooleanArray39[local128] = local22.method6538() == 1;
					@Pc(144) int local144 = local22.method6535();
					@Pc(156) int local156;
					if (this.anInt9963 == -1) {
						this.anIntArrayArray81[local128] = new int[local144];
						for (local156 = 0; local156 < local144; local156++) {
							this.anIntArrayArray81[local128][local156] = local22.method6535();
						}
					} else {
						this.anIntArrayArray81[local128] = new int[local144 + 1];
						this.anIntArrayArray81[local128][0] = this.anInt9963;
						for (local156 = 0; local156 < local144; local156++) {
							this.anIntArrayArray81[local128][local156 + 1] = local22.method6535();
						}
					}
				}
				for (local128 = 0; local128 < local58 + 1; local128++) {
					if (this.anIntArrayArray81[local128] == null) {
						if (this.anInt9963 == -1) {
							this.anIntArrayArray81[local128] = new int[0];
						} else {
							this.anIntArrayArray81[local128] = new int[] { this.anInt9963 };
						}
					}
				}
			} else {
				this.anIntArrayArray81 = new int[0][];
				this.aBooleanArray39 = new boolean[0];
				this.anInt9963 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[I")
	public int[] method8092(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray81.length <= arg0) {
			return this.anInt9963 == -1 ? new int[0] : new int[] { this.anInt9963 };
		} else if (this.aBooleanArray39[arg0] && this.anIntArrayArray81[arg0].length > 1) {
			@Pc(56) int local56 = this.anInt9963 == -1 ? 0 : 1;
			@Pc(65) Random local65 = new Random();
			@Pc(72) int[] local72 = new int[this.anIntArrayArray81[arg0].length];
			Static602.method4669(this.anIntArrayArray81[arg0], 0, local72, 0, local72.length);
			for (@Pc(84) int local84 = local56; local84 < local72.length; local84++) {
				@Pc(97) int local97 = local56 + Static137.method2798(local65, local72.length - local56);
				@Pc(101) int local101 = local72[local84];
				local72[local84] = local72[local97];
				local72[local97] = local101;
			}
			return local72;
		} else {
			return this.anIntArrayArray81[arg0];
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Z")
	public boolean method8093() {
		return this.anInt9963 != -1;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)Lclient!si;")
	public Class298 method8097(@OriginalArg(1) int arg0) {
		@Pc(10) byte[] local10 = this.aClass254_133.method6401(1, arg0);
		@Pc(14) Class298 local14 = new Class298();
		local14.method7347(new Class3_Sub7(local10));
		return local14;
	}
}
