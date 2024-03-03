import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class2_Sub3_Sub17 extends Class2_Sub3 {

	@OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
	public static final int anInt3134;

	@OriginalMember(owner = "client!jl", name = "V", descriptor = "Lclient!h;")
	public static final Class89 aClass89_129;

	@OriginalMember(owner = "client!jl", name = "X", descriptor = "Lclient!nk;")
	public static Class161 aClass161_5;

	@OriginalMember(owner = "client!jl", name = "Y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24;

	@OriginalMember(owner = "client!jl", name = "cb", descriptor = "Lclient!s;")
	public static final Class210 aClass210_8;

	@OriginalMember(owner = "client!jl", name = "db", descriptor = "Lclient!h;")
	public static final Class89 aClass89_130;

	@OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
	private int anInt3128 = 0;

	@OriginalMember(owner = "client!jl", name = "S", descriptor = "I")
	private int anInt3131 = 0;

	@OriginalMember(owner = "client!jl", name = "U", descriptor = "I")
	private int anInt3133 = 1;

	static {
		new Class79("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
		anInt3134 = 0;
		aClass89_129 = new Class89(79, 7);
		aClass161_5 = null;
		aStringArray24 = new String[] { "en", "de", "fr", "pt", "nl" };
		aClass210_8 = new Class210(8, 6);
		aClass89_130 = new Class89(86, 10);
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V", line = 198)
	public Class2_Sub3_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!bt;I)V", line = 3)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt3128 = arg1.method4816();
		} else if (arg0 == 1) {
			this.anInt3131 = arg1.method4816();
		} else if (arg0 == 3) {
			this.anInt3133 = arg1.method4816();
		}
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V", line = 47)
	@Override
	public void method6481() {
		Static28.method937();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BI)[I", line = 130)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(24) int local24 = Static16.anIntArray322[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static211.anInt4031; local32++) {
				@Pc(38) int local38 = Static311.anIntArray424[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(58) int local58;
				if (this.anInt3128 == 0) {
					local58 = (local38 - local24) * this.anInt3133;
				} else {
					@Pc(70) int local70 = local30 * local30 + local44 * local44 >> 12;
					local58 = (int) (Math.sqrt((double) ((float) local70 / 4096.0F)) * 4096.0D);
					local58 = (int) ((double) (local58 * this.anInt3133) * 3.141592653589793D);
				}
				local58 -= local58 & 0xFFFFF000;
				if (this.anInt3131 == 0) {
					local58 = Static141.anIntArray173[local58 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3131 == 2) {
					local58 -= 2048;
					if (local58 < 0) {
						local58 = -local58;
					}
					local58 = 2048 - local58 << 1;
				}
				local16[local32] = local58;
			}
		}
		return local16;
	}
}
