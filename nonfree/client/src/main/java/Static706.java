import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static706 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "[I")
	public static final int[] anIntArray786 = new int[32];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	public static void method9430() {
		Static484.anIntArray561 = null;
		Static447.anIntArray501 = null;
		Static305.anIntArray361 = null;
		Static121.anIntArray144 = null;
		Static45.anIntArray79 = null;
		Static469.aBoolean496 = false;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZLclient!ha;ZZ)Lclient!jl;")
	public static Class196 method9431(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) boolean arg3) {
		if (arg0 == -1) {
			return null;
		}
		if (Static690.anIntArray771 != null) {
			for (@Pc(16) int local16 = 0; local16 < Static690.anIntArray771.length; local16++) {
				if (arg0 == Static690.anIntArray771[local16]) {
					return Static169.aClass196Array1[local16];
				}
			}
		}
		@Pc(60) Class196 local60 = (Class196) Static692.aClass307_92.method7002((long) (arg0 << 1 | (arg3 ? 1 : 0)));
		if (local60 != null) {
			if (arg1 && local60.aClass169_6 == null) {
				@Pc(76) Class169 local76 = Static462.method6278(arg0, Static725.aClass182_131);
				if (local76 == null) {
					return null;
				}
				local60.aClass169_6 = local76;
			}
			return local60;
		}
		@Pc(90) Class361[] local90 = Static735.method8275(Static175.aClass182_46, arg0);
		if (local90 == null) {
			return null;
		}
		@Pc(100) Class169 local100 = Static462.method6278(arg0, Static725.aClass182_131);
		if (local100 == null) {
			return null;
		}
		if (arg1) {
			local60 = new Class196(arg2.method9353(local100, local90, arg3), local100);
		} else {
			local60 = new Class196(arg2.method9353(local100, local90, arg3));
		}
		Static692.aClass307_92.method7000(local60, (long) ((arg3 ? 1 : 0) | arg0 << 1));
		return local60;
	}
}
