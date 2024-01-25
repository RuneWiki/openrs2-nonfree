import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public class Class21 implements Interface18 {

	@OriginalMember(owner = "client!va", name = "i", descriptor = "[I")
	public static final int[] anIntArray176 = new int[120];

	@OriginalMember(owner = "client!va", name = "g", descriptor = "I")
	public final int anInt3460;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "I")
	public final int anInt3467;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "Lclient!qk;")
	public final Class304 aClass304_9;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "Lclient!kr;")
	public final Class216 aClass216_9;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	public final int anInt3462;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "I")
	public final int anInt3469;

	@OriginalMember(owner = "client!va", name = "m", descriptor = "I")
	public final int anInt3465;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "I")
	public final int anInt3466;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "I")
	public final int anInt3463;

	static {
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < 120; local45++) {
			@Pc(50) int local50 = local45 + 1;
			@Pc(63) int local63 = (int) (Math.pow(2.0D, (double) local50 / 7.0D) * 300.0D + (double) local50);
			local43 += local63;
			anIntArray176[local45] = local43 / 4;
		}
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!qk;Lclient!kr;IIIIIII)V")
	public Class21(@OriginalArg(0) Class304 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt3460 = arg5;
		this.anInt3467 = arg6;
		this.aClass304_9 = arg0;
		this.aClass216_9 = arg1;
		this.anInt3462 = arg4;
		this.anInt3469 = arg2;
		this.anInt3465 = arg3;
		this.anInt3466 = arg8;
		this.anInt3463 = arg7;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Lclient!wv;")
	@Override
	public Class409 method7832() {
		return null;
	}
}
