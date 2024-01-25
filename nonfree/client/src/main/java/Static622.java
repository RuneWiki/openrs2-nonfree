import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static622 {

	@OriginalMember(owner = "client!vaa", name = "i", descriptor = "Lclient!ot;")
	public static Class5_Sub16_Sub4 aClass5_Sub16_Sub4_8;

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
	public static int anInt10186;

	@OriginalMember(owner = "client!vaa", name = "d", descriptor = "Lclient!vea;")
	public static Class368 aClass368_13;

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
	public static int anInt10188;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "Lclient!vha;")
	public static final Class370 aClass370_20 = new Class370(7, 7);

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "Lclient!vaa;")
	public static final Class361 aClass361_18 = new Class361(0, 1);

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIII)V")
	public static void method8761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Class5_Sub5_Sub6 local16 = Static478.method6972((long) arg3 | (long) arg0 << 32, 18);
		local16.method2687();
		local16.anInt3064 = arg2;
		local16.anInt3058 = arg1;
	}
}
