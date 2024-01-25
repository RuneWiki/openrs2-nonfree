import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class4_Sub4_Sub18 extends Class4_Sub4 {

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
	private int anInt4307 = 4096;

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
	private int anInt4310 = 409;

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "[I")
	private final int[] anIntArray356 = new int[3];

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
	private int anInt4304 = 4096;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
	private int anInt4306 = 4096;

	static {
		new Class15("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(28) int[][] local28 = this.method6049(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			for (@Pc(54) int local54 = 0; local54 < Static419.anInt6404; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(68) int local68 = local60 - this.anIntArray356[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (local68 > this.anInt4310) {
					local44[local54] = local60;
					local48[local54] = local36[local54];
					local52[local54] = local40[local54];
				} else {
					@Pc(106) int local106 = local36[local54];
					local68 = local106 - this.anIntArray356[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (local68 > this.anInt4310) {
						local44[local54] = local60;
						local48[local54] = local106;
						local52[local54] = local40[local54];
					} else {
						@Pc(146) int local146 = local40[local54];
						local68 = local146 - this.anIntArray356[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (local68 > this.anInt4310) {
							local44[local54] = local60;
							local48[local54] = local106;
							local52[local54] = local146;
						} else {
							local44[local54] = this.anInt4304 * local60 >> 12;
							local48[local54] = local106 * this.anInt4306 >> 12;
							local52[local54] = local146 * this.anInt4307 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4310 = arg1.method5028();
		} else if (arg0 == 1) {
			this.anInt4307 = arg1.method5028();
		} else if (arg0 == 2) {
			this.anInt4306 = arg1.method5028();
		} else if (arg0 == 3) {
			this.anInt4304 = arg1.method5028();
		} else if (arg0 == 4) {
			@Pc(61) int local61 = arg1.method5008();
			this.anIntArray356[0] = (local61 & 0xFF0000) << 4;
			this.anIntArray356[1] = local61 >> 4 & 0xFF0;
			this.anIntArray356[2] = local61 >> 12 & 0x0;
		}
	}
}
