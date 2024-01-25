import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public final class Class4_Sub2 extends Class4 implements Interface3 {

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
	private int anInt6241;

	static {
		new Class158("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lclient!ih;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class4_Sub2(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt6241 = arg1;
	}

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lclient!ih;I[BI)V")
	public Class4_Sub2(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6241 = arg1;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)I")
	@Override
	public int method5205() {
		return 0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)I")
	@Override
	public int method5204() {
		return this.anInt6241;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)J")
	@Override
	public long method5207() {
		return super.aNativeBuffer4.b();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method5206(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4797(arg0, arg1);
		this.anInt6241 = arg2;
	}
}
