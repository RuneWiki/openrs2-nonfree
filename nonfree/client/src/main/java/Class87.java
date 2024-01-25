import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class87 {

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Lclient!pq;")
	private final Class251 aClass251_39;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "[[I")
	private final int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class87(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_39 = arg2;
		this.aClass251_39.method5849(1);
		@Pc(22) Class6_Sub14 local22 = new Class6_Sub14(this.aClass251_39.method5860(0, 0));
		@Pc(26) int local26 = local22.method6041();
		if (local26 > 1) {
			this.anIntArrayArray33 = new int[0][];
		} else {
			@Pc(35) int local35 = local22.method6041();
			@Pc(38) Class165[] local38 = Static382.method5562();
			@Pc(40) boolean local40 = true;
			@Pc(50) int local50;
			@Pc(56) int local56;
			if (local35 == local38.length) {
				for (local50 = 0; local50 < local38.length; local50++) {
					local56 = local22.method6041();
					if (local38[local50].anInt4086 != local56) {
						local40 = false;
						break;
					}
				}
			} else {
				local40 = false;
			}
			if (local40) {
				local50 = local22.method6041();
				local56 = local22.method6041();
				this.anIntArrayArray33 = new int[local56 + 1][];
				for (@Pc(98) int local98 = 0; local98 < local50; local98++) {
					@Pc(104) int local104 = local22.method6041();
					@Pc(108) int local108 = local22.method6006();
					this.anIntArrayArray33[local104] = new int[local108];
					for (@Pc(116) int local116 = 0; local116 < local108; local116++) {
						this.anIntArrayArray33[local98][local116] = local22.method6006();
					}
				}
			} else {
				this.anIntArrayArray33 = new int[0][];
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)[I")
	public int[] method1801(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && this.anIntArrayArray33.length > arg0 ? this.anIntArrayArray33[arg0] : new int[0];
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)Lclient!ki;")
	public Class173 method1804(@OriginalArg(0) int arg0) {
		@Pc(10) byte[] local10 = this.aClass251_39.method5860(1, arg0);
		@Pc(14) Class173 local14 = new Class173();
		local14.method3652(new Class6_Sub14(local10));
		return local14;
	}
}
