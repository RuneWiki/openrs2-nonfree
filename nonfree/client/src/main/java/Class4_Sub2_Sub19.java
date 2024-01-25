import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public class Class4_Sub2_Sub19 extends Class4_Sub2 {

	@OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
	protected int anInt3832;

	@OriginalMember(owner = "client!kt", name = "Q", descriptor = "I")
	protected int anInt3838;

	@OriginalMember(owner = "client!kt", name = "T", descriptor = "[I")
	protected int[] anIntArray314;

	@OriginalMember(owner = "client!kt", name = "N", descriptor = "I")
	private int anInt3835 = -1;

	static {
		new Class242("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub19() {
		super(0, false);
	}

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "(I)Z")
	protected final boolean method2880() {
		if (this.anIntArray314 != null) {
			return true;
		} else if (this.anInt3835 >= 0) {
			@Pc(33) Class205 local33 = Static68.anInt4583 >= 0 ? Static464.method4782(Static206.aClass166_149, Static68.anInt4583, this.anInt3835) : Static464.method4792(Static206.aClass166_149, this.anInt3835);
			local33.method4790();
			this.anIntArray314 = local33.method4780();
			this.anInt3832 = local33.anInt6171;
			this.anInt3838 = local33.anInt6175;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426 && this.method2880()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(52) int local52 = (Static160.anInt3006 == this.anInt3832 ? arg0 : this.anInt3832 * arg0 / Static160.anInt3006) * this.anInt3838;
			@Pc(58) int local58;
			@Pc(67) int local67;
			if (this.anInt3838 == Static350.anInt6330) {
				for (local58 = 0; local58 < Static350.anInt6330; local58++) {
					local67 = this.anIntArray314[local52++];
					local36[local58] = (local67 & 0xFF) << 4;
					local32[local58] = local67 >> 4 & 0xFF0;
					local28[local58] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static350.anInt6330; local58++) {
					local67 = local58 * this.anInt3838 / Static350.anInt6330;
					@Pc(74) int local74 = this.anIntArray314[local67 + local52];
					local36[local58] = (local74 & 0xFF) << 4;
					local32[local58] = local74 >> 4 & 0xFF0;
					local28[local58] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public final void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt3835 = arg1.method4877();
		}
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)I")
	@Override
	public final int method5841() {
		return this.anInt3835;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)V")
	@Override
	public final void method5840() {
		super.method5840();
		this.anIntArray314 = null;
	}
}
