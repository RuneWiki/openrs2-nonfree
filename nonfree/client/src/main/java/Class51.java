import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public abstract class Class51 {

	@OriginalMember(owner = "client!br", name = "e", descriptor = "Lclient!li;")
	public Class216 aClass216_7 = Static2.aClass216_1;

	@OriginalMember(owner = "client!br", name = "d", descriptor = "Z")
	public final boolean aBoolean261;

	@OriginalMember(owner = "client!br", name = "b", descriptor = "Lclient!pj;")
	protected final Class278 aClass278_7;

	@OriginalMember(owner = "client!br", name = "c", descriptor = "Lclient!sd;")
	protected final Class57_Sub3_Sub2 aClass57_Sub3_Sub2_6;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "Lclient!eu;")
	protected final Class114 aClass114_8;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!sd;Lclient!eu;Lclient!pj;ZI)V")
	protected Class51(@OriginalArg(0) Class57_Sub3_Sub2 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class278 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aBoolean261 = arg3;
		this.aClass278_7 = arg2;
		this.aClass57_Sub3_Sub2_6 = arg0;
		this.aClass114_8 = arg1;
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method2834();

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZLclient!li;)V")
	public void method8306(@OriginalArg(1) Class216 arg0) {
		this.aClass216_7 = arg0;
	}
}
