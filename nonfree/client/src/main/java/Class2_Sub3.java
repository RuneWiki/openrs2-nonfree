import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "Lclient!nc;")
	protected Class137 aClass137_41;

	@OriginalMember(owner = "client!cj", name = "A", descriptor = "Lclient!hg;")
	protected Class90 aClass90_41;

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
	public int anInt6813;

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "[Lclient!cj;")
	public final Class2_Sub3[] aClass2_Sub3Array42;

	@OriginalMember(owner = "client!cj", name = "D", descriptor = "Z")
	public boolean aBoolean606;

	static {
		new Class140("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass2_Sub3Array42 = new Class2_Sub3[arg0];
		this.aBoolean606 = arg1;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
	public void method5698(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt6813 == 255 ? arg1 : this.anInt6813;
		if (this.aBoolean606) {
			this.aClass137_41 = new Class137(local14, arg1, arg0);
		} else {
			this.aClass90_41 = new Class90(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
	public int[] method5699(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(III)[I")
	protected final int[] method5700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass2_Sub3Array42[arg0].aBoolean606 ? this.aClass2_Sub3Array42[arg0].method5699(arg1) : this.aClass2_Sub3Array42[arg0].method5702(arg1)[0];
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)I")
	public int method5701() {
		return -1;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)[[I")
	public int[][] method5702(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILclient!ef;)V")
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
	public void method5705() {
		if (this.aBoolean606) {
			this.aClass137_41.method3989();
			this.aClass137_41 = null;
		} else {
			this.aClass90_41.method2394();
			this.aClass90_41 = null;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)I")
	public int method5706() {
		return -1;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBI)[[I")
	protected final int[][] method5707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub3Array42[arg1].aBoolean606) {
			@Pc(25) int[] local25 = this.aClass2_Sub3Array42[arg1].method5699(arg0);
			return new int[][] { local25, local25, local25 };
		} else {
			return this.aClass2_Sub3Array42[arg1].method5702(arg0);
		}
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
	public void method5708() {
	}
}
