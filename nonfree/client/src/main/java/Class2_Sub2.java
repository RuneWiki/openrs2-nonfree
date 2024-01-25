import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public abstract class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!td;")
	protected Class234 aClass234_41;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
	public int anInt7759;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "Lclient!hm;")
	protected Class114 aClass114_41;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "Z")
	public boolean aBoolean518;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "[Lclient!sd;")
	public final Class2_Sub2[] aClass2_Sub2Array42;

	static {
		new Class231("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean518 = arg1;
		this.aClass2_Sub2Array42 = new Class2_Sub2[arg0];
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public void method6262() {
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)I")
	public int method6263() {
		return -1;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)[I")
	protected final int[] method6266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub2Array42[arg0].aBoolean518 ? this.aClass2_Sub2Array42[arg0].method6274(arg1) : this.aClass2_Sub2Array42[arg0].method6271(arg1)[0];
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(Z)I")
	public int method6268() {
		return -1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[[I")
	public int[][] method6271(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
	public void method6272() {
		if (this.aBoolean518) {
			this.aClass234_41.method5372();
			this.aClass234_41 = null;
		} else {
			this.aClass114_41.method2348();
			this.aClass114_41 = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!hw;BI)V")
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)[I")
	public int[] method6274(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)[[I")
	protected final int[][] method6276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass2_Sub2Array42[arg0].aBoolean518) {
			@Pc(25) int[] local25 = this.aClass2_Sub2Array42[arg0].method6274(arg1);
			return new int[][] { local25, local25, local25 };
		} else {
			return this.aClass2_Sub2Array42[arg0].method6271(arg1);
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(III)V")
	public void method6277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt7759 == 255 ? arg0 : this.anInt7759;
		if (this.aBoolean518) {
			this.aClass234_41 = new Class234(local12, arg0, arg1);
		} else {
			this.aClass114_41 = new Class114(local12, arg0, arg1);
		}
	}
}
