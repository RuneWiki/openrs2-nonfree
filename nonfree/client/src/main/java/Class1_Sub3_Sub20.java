import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class1_Sub3_Sub20 extends Class1_Sub3 {

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "[I")
	private final int[] anIntArray350 = new int[3];

	@OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
	private int anInt3883 = 4096;

	@OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
	private int anInt3880 = 4096;

	@OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
	private int anInt3879 = 409;

	@OriginalMember(owner = "client!lr", name = "Q", descriptor = "I")
	private int anInt3886 = 4096;

	static {
		new Class34("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3879 = arg1.method4556();
		} else if (arg0 == 1) {
			this.anInt3880 = arg1.method4556();
		} else if (arg0 == 2) {
			this.anInt3883 = arg1.method4556();
		} else if (arg0 == 3) {
			this.anInt3886 = arg1.method4556();
		} else if (arg0 == 4) {
			@Pc(61) int local61 = arg1.method4514();
			this.anIntArray350[2] = local61 >> 12 & 0x0;
			this.anIntArray350[1] = local61 >> 4 & 0xFF0;
			this.anIntArray350[0] = (local61 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(28) int[][] local28 = this.method5528(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static153.anInt3378; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(68) int local68 = local60 - this.anIntArray350[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (this.anInt3879 < local68) {
					local44[local54] = local60;
					local48[local54] = local36[local54];
					local52[local54] = local40[local54];
				} else {
					@Pc(102) int local102 = local36[local54];
					local68 = local102 - this.anIntArray350[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (this.anInt3879 < local68) {
						local44[local54] = local60;
						local48[local54] = local102;
						local52[local54] = local40[local54];
					} else {
						@Pc(139) int local139 = local40[local54];
						local68 = local139 - this.anIntArray350[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (local68 > this.anInt3879) {
							local44[local54] = local60;
							local48[local54] = local102;
							local52[local54] = local139;
						} else {
							local44[local54] = local60 * this.anInt3886 >> 12;
							local48[local54] = local102 * this.anInt3883 >> 12;
							local52[local54] = this.anInt3880 * local139 >> 12;
						}
					}
				}
			}
		}
		return local18;
	}
}
