import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class3_Sub4_Sub9 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ka", name = "L", descriptor = "[Lclient!bn;")
	private static final Class33[] aClass33Array3 = new Class33[32];

	@OriginalMember(owner = "client!ka", name = "w", descriptor = "Lclient!gj;")
	public final Interface7 anInterface7_3;

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
	public final int anInt4516;

	static {
		@Pc(89) Class33[] local89 = Static203.method3389();
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			aClass33Array3[local89[local91].anInt1080] = local89[local91];
		}
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!gj;I)V")
	protected Class3_Sub4_Sub9(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1) {
		this.anInterface7_3 = arg0;
		this.anInt4516 = arg1;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method3818();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)Z")
	public abstract boolean method3821();
}
