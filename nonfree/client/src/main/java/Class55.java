import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class Class55 {

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Lclient!ria;")
	public Class298 aClass298_8 = Static292.aClass298_5;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "Lclient!baa;")
	protected final Class26 aClass26_17;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Lclient!bfa;")
	protected final Class20_Sub2_Sub1 aClass20_Sub2_Sub1_8;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Z")
	public final boolean aBoolean526;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!wq;")
	protected final Class375 aClass375_33;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!bfa;Lclient!wq;Lclient!baa;ZI)V")
	protected Class55(@OriginalArg(0) Class20_Sub2_Sub1 arg0, @OriginalArg(1) Class375 arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass26_17 = arg2;
		this.aClass20_Sub2_Sub1_8 = arg0;
		this.aBoolean526 = arg3;
		this.aClass375_33 = arg1;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!ria;I)V")
	public void method8287(@OriginalArg(0) Class298 arg0) {
		this.aClass298_8 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6142();
}
