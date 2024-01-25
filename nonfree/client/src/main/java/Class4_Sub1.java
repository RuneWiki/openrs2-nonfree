import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class4_Sub1 extends Class4 implements Interface10 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	private int anInt54;

	static {
		new Class158("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!ih;I[BI)V")
	public Class4_Sub1(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt54 = arg1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method5857(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method4797(arg0, arg1);
		this.anInt54 = 5123;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)I")
	@Override
	public int method5859() {
		return this.anInt54;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)I")
	@Override
	public int method5858() {
		return 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)J")
	@Override
	public long method5856() {
		return super.aNativeBuffer4.b();
	}
}
