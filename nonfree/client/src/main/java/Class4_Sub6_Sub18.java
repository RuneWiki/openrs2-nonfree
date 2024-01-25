import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class4_Sub6_Sub18 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
	private int anInt3910 = 4096;

	@OriginalMember(owner = "client!ln", name = "L", descriptor = "Z")
	private boolean aBoolean305 = true;

	static {
		new Class159("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3910 = arg1.method3401();
		} else if (arg0 == 1) {
			this.aBoolean305 = arg1.method3440() == 1;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(30) int[] local30 = this.method5702(Static341.anInt266 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method5702(arg0, 0);
			@Pc(46) int[] local46 = this.method5702(Static341.anInt266 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			for (@Pc(60) int local60 = 0; local60 < Static31.anInt797; local60++) {
				@Pc(74) int local74 = this.anInt3910 * (local46[local60] - local30[local60]);
				@Pc(94) int local94 = (local36[Static335.anInt6403 & local60 + 1] - local36[local60 - 1 & Static335.anInt6403]) * this.anInt3910;
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local114 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(135) int local135;
				@Pc(139) int local139;
				@Pc(137) int local137;
				if (local128 == 0) {
					local135 = 0;
					local137 = 0;
					local139 = 0;
				} else {
					local135 = local94 / local128;
					local139 = local74 / local128;
					local137 = 16777216 / local128;
				}
				if (this.aBoolean305) {
					local139 = (local139 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
				}
				local50[local60] = local135;
				local54[local60] = local139;
				local58[local60] = local137;
			}
		}
		return local11;
	}
}
