import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "[I")
	public static int[] anIntArray44;

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "Lclient!oq;")
	public static Class268 aClass268_1;

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_13 = new Class305(24, 4);

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "Z")
	public static final boolean aBoolean56 = false;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!wm;ZLjava/lang/String;I)Lclient!ff;")
	public static Class116 method706(@OriginalArg(0) Class390 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		@Pc(17) int local17 = arg0.method8910(arg2);
		if (local17 == -1) {
			return new Class116(0);
		}
		@Pc(31) int[] local31 = arg0.method8900(local17);
		@Pc(37) Class116 local37 = new Class116(local31.length);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local37.anInt3317 > local39) {
				@Pc(54) Class5_Sub41 local54 = new Class5_Sub41(arg0.method8914(local17, local31[local41++]));
				@Pc(58) int local58 = local54.method7804();
				@Pc(62) int local62 = local54.method7860();
				@Pc(66) int local66 = local54.method7816();
				if (!arg1 && local66 == 1) {
					local37.anInt3317--;
				} else {
					local37.anIntArray154[local39] = local58;
					local37.anIntArray153[local39] = local62;
					local39++;
				}
			}
			return local37;
		}
	}
}
