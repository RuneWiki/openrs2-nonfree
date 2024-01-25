import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "Lclient!rc;")
	public static Class303 aClass303_1;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
	public static int anInt4501;

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_61 = new Class171(39, 4);

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "Lclient!vba;")
	public static final Class366 aClass366_5 = new Class366();

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "Lclient!gm;")
	public static final Class135 aClass135_4 = new Class135("LIVE", "", "", 0);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)I")
	public static int method3844(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)Lclient!aka;")
	public static Class16 method3847(@OriginalArg(0) int arg0) {
		@Pc(17) Class16[] local17 = Static119.method1809();
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Class16 local25 = local17[local19];
			if (arg0 == local25.anInt484) {
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILclient!ha;ZZ)Lclient!ma;")
	public static Class221 method3849(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 == -1) {
			return null;
		}
		if (Static407.anIntArray349 != null) {
			for (@Pc(15) int local15 = 0; local15 < Static407.anIntArray349.length; local15++) {
				if (Static407.anIntArray349[local15] == arg0) {
					return Static342.aClass221Array1[local15];
				}
			}
		}
		@Pc(46) Class221 local46 = (Class221) Static368.aClass295_38.method6470((long) arg0);
		if (local46 != null) {
			if (arg2 && local46.aClass91_9 == null) {
				@Pc(58) Class91 local58 = Static473.method6301(arg0, Static516.aClass362_111);
				if (local58 == null) {
					return null;
				}
				local46.aClass91_9 = local58;
			}
			return local46;
		}
		@Pc(71) Class370[] local71 = Static688.method8599(Static197.aClass362_42, arg0);
		if (local71 == null) {
			return null;
		}
		@Pc(80) Class91 local80 = Static473.method6301(arg0, Static516.aClass362_111);
		if (local80 == null) {
			return null;
		}
		if (arg2) {
			local46 = new Class221(arg1.method8032(local80, local71), local80);
		} else {
			local46 = new Class221(arg1.method8032(local80, local71));
		}
		Static368.aClass295_38.method6469((long) arg0, local46);
		return local46;
	}
}
