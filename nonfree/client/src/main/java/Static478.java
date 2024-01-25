import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!bi;")
	public static Class31 aClass31_103;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public static int anInt8049 = 0;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_110 = new Class61(29, -1);

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!db;")
	public static final Class64 aClass64_418 = new Class64(112, 1);

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_111 = new Class61(45, 4);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Z")
	public static boolean method6639(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/lang/String;Lclient!bi;Z)Lclient!dca;")
	public static Class67 method6641(@OriginalArg(1) String arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg1.method653(arg0);
		if (local10 == -1) {
			return new Class67(0);
		}
		@Pc(25) int[] local25 = arg1.method664(local10);
		@Pc(31) Class67 local31 = new Class67(local25.length);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		while (true) {
			while (local33 < local31.anInt2257) {
				@Pc(49) Class4_Sub9 local49 = new Class4_Sub9(arg1.method667(local10, local25[local35++]));
				@Pc(55) int local55 = local49.method6026();
				@Pc(59) int local59 = local49.method5982();
				@Pc(63) int local63 = local49.method6015();
				if (!arg2 && local63 == 1) {
					local31.anInt2257--;
				} else {
					local31.anIntArray223[local33] = local55;
					local31.anIntArray222[local33] = local59;
					local33++;
				}
			}
			return local31;
		}
	}
}
