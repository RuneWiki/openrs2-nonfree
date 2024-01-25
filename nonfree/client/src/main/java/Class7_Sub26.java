import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class7_Sub26 extends Class7 {

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
	public final int anInt3238;

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
	public final int anInt3236;

	@OriginalMember(owner = "client!ir", name = "q", descriptor = "[Z")
	public final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "[I")
	public final int[] anIntArray286;

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "[I")
	public final int[] anIntArray287;

	static {
		new Class55("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(I[B)V")
	public Class7_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt3238 = arg0;
		@Pc(11) Class7_Sub14 local11 = new Class7_Sub14(arg1);
		this.anInt3236 = local11.method3981();
		this.aBooleanArray16 = new boolean[this.anInt3236];
		this.anIntArray286 = new int[this.anInt3236];
		this.anIntArrayArray26 = new int[this.anInt3236][];
		this.anIntArray287 = new int[this.anInt3236];
		for (@Pc(38) int local38 = 0; local38 < this.anInt3236; local38++) {
			this.anIntArray287[local38] = local11.method3981();
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt3236; local54++) {
			this.aBooleanArray16[local54] = local11.method3981() == 1;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt3236; local79++) {
			this.anIntArray286[local79] = local11.method3943();
		}
		for (@Pc(95) int local95 = 0; local95 < this.anInt3236; local95++) {
			this.anIntArrayArray26[local95] = new int[local11.method3981()];
		}
		for (@Pc(116) int local116 = 0; local116 < this.anInt3236; local116++) {
			for (@Pc(120) int local120 = 0; local120 < this.anIntArrayArray26[local116].length; local120++) {
				this.anIntArrayArray26[local116][local120] = local11.method3981();
			}
		}
	}
}
