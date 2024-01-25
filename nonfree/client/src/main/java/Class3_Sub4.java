import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public abstract class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "Lclient!ln;")
	protected Class146 aClass146_41;

	@OriginalMember(owner = "client!dw", name = "t", descriptor = "Lclient!st;")
	protected Class214 aClass214_41;

	@OriginalMember(owner = "client!dw", name = "v", descriptor = "I")
	public int anInt7582;

	@OriginalMember(owner = "client!dw", name = "D", descriptor = "[Lclient!dw;")
	public final Class3_Sub4[] aClass3_Sub4Array42;

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "Z")
	public boolean aBoolean524;

	static {
		new Class175("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass3_Sub4Array42 = new Class3_Sub4[arg0];
		this.aBoolean524 = arg1;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)[[I")
	public int[][] method5955(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)I")
	public int method5956() {
		return -1;
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)V")
	public void method5957() {
		if (this.aBoolean524) {
			this.aClass146_41.method3703();
			this.aClass146_41 = null;
		} else {
			this.aClass214_41.method5175();
			this.aClass214_41 = null;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IILclient!bt;)V")
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)[I")
	protected final int[] method5960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass3_Sub4Array42[arg0].aBoolean524 ? this.aClass3_Sub4Array42[arg0].method5966(arg1) : this.aClass3_Sub4Array42[arg0].method5955(arg1)[0];
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(III)[[I")
	protected final int[][] method5962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass3_Sub4Array42[arg0].aBoolean524) {
			@Pc(32) int[] local32 = this.aClass3_Sub4Array42[arg0].method5966(arg1);
			return new int[][] { local32, local32, local32 };
		} else {
			return this.aClass3_Sub4Array42[arg0].method5955(arg1);
		}
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(I)V")
	public void method5963() {
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(II)[I")
	public int[] method5966(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "(I)I")
	public int method5968() {
		return -1;
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(III)V")
	public void method5969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt7582 == 255 ? arg0 : this.anInt7582;
		if (this.aBoolean524) {
			this.aClass146_41 = new Class146(local12, arg0, arg1);
		} else {
			this.aClass214_41 = new Class214(local12, arg0, arg1);
		}
	}
}
