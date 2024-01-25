import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class293 {

	@OriginalMember(owner = "client!si", name = "g", descriptor = "Lclient!pj;")
	private final Class248 aClass248_92;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "[[I")
	private final int[][] anIntArrayArray71;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class293(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_92 = arg2;
		this.aClass248_92.method5793(1);
		@Pc(22) Class6_Sub12 local22 = new Class6_Sub12(this.aClass248_92.method5797(0, 0));
		@Pc(26) int local26 = local22.method6019();
		if (local26 > 1) {
			this.anIntArrayArray71 = new int[0][];
		} else {
			@Pc(33) int local33 = local22.method6019();
			@Pc(36) Class136[] local36 = Static443.method6266();
			@Pc(38) boolean local38 = true;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local33 == local36.length) {
				for (local52 = 0; local52 < local36.length; local52++) {
					local58 = local22.method6019();
					if (local36[local52].anInt3908 != local58) {
						local38 = false;
						break;
					}
				}
			} else {
				local38 = false;
			}
			if (local38) {
				local52 = local22.method6019();
				local58 = local22.method6019();
				this.anIntArrayArray71 = new int[local58 + 1][];
				for (@Pc(95) int local95 = 0; local95 < local52; local95++) {
					@Pc(101) int local101 = local22.method6019();
					@Pc(105) int local105 = local22.method6044();
					this.anIntArrayArray71[local101] = new int[local105];
					for (@Pc(113) int local113 = 0; local113 < local105; local113++) {
						this.anIntArrayArray71[local95][local113] = local22.method6044();
					}
				}
			} else {
				this.anIntArrayArray71 = new int[0][];
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)[I")
	public int[] method6558(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.anIntArrayArray71.length ? this.anIntArrayArray71[arg0] : new int[0];
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(II)Lclient!wq;")
	public Class352 method6563(@OriginalArg(1) int arg0) {
		@Pc(15) byte[] local15 = this.aClass248_92.method5797(1, arg0);
		@Pc(19) Class352 local19 = new Class352();
		local19.method7913(new Class6_Sub12(local15));
		return local19;
	}
}
