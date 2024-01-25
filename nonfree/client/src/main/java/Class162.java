import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class162 {

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
	private int anInt4498 = 0;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
	private int anInt4501 = -1;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Lclient!um;")
	private Class244 aClass244_21 = new Class244();

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "Z")
	public boolean aBoolean291 = false;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	private final int anInt4500;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	private final int anInt4499;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "[Lclient!sa;")
	private Class6_Sub36[] aClass6_Sub36Array1;

	static {
		new Class267("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(III)V")
	public Class162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4500 = arg1;
		this.anInt4499 = arg0;
		this.anIntArrayArrayArray9 = new int[this.anInt4499][3][arg2];
		this.aClass6_Sub36Array1 = new Class6_Sub36[this.anInt4500];
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public void method3809() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4499; local7++) {
			this.anIntArrayArrayArray9[local7][0] = null;
			this.anIntArrayArrayArray9[local7][1] = null;
			this.anIntArrayArrayArray9[local7][2] = null;
			this.anIntArrayArrayArray9[local7] = null;
		}
		this.anIntArrayArrayArray9 = null;
		this.aClass6_Sub36Array1 = null;
		this.aClass244_21.method5969();
		this.aClass244_21 = null;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)[[[I")
	public int[][][] method3810() {
		if (this.anInt4500 != this.anInt4499) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt4499; local29++) {
			this.aClass6_Sub36Array1[local29] = Static384.aClass6_Sub36_1;
		}
		return this.anIntArrayArrayArray9;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[[I")
	public int[][] method3811(@OriginalArg(0) int arg0) {
		if (this.anInt4500 == this.anInt4499) {
			this.aBoolean291 = this.aClass6_Sub36Array1[arg0] == null;
			this.aClass6_Sub36Array1[arg0] = Static384.aClass6_Sub36_1;
			return this.anIntArrayArrayArray9[arg0];
		} else if (this.anInt4499 == 1) {
			this.aBoolean291 = arg0 != this.anInt4501;
			this.anInt4501 = arg0;
			return this.anIntArrayArrayArray9[0];
		} else {
			@Pc(50) Class6_Sub36 local50 = this.aClass6_Sub36Array1[arg0];
			if (local50 == null) {
				this.aBoolean291 = true;
				if (this.anInt4498 < this.anInt4499) {
					local50 = new Class6_Sub36(arg0, this.anInt4498);
					this.anInt4498++;
				} else {
					@Pc(81) Class6_Sub36 local81 = (Class6_Sub36) this.aClass244_21.method5974();
					local50 = new Class6_Sub36(arg0, local81.anInt6327);
					this.aClass6_Sub36Array1[local81.anInt6328] = null;
					local81.method6525();
				}
				this.aClass6_Sub36Array1[arg0] = local50;
			} else {
				this.aBoolean291 = false;
			}
			this.aClass244_21.method5972(local50);
			return this.anIntArrayArrayArray9[local50.anInt6327];
		}
	}
}
