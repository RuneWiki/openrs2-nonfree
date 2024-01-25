import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public abstract class Class99 {

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Lclient!cg;")
	public Class54 aClass54_9 = Static216.aClass54_3;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!wha;")
	protected final Class381 aClass381_8;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!et;")
	protected final Class104 aClass104_16;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!ul;")
	protected final Class13_Sub3_Sub2 aClass13_Sub3_Sub2_6;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Z")
	public final boolean aBoolean605;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!ul;Lclient!et;Lclient!wha;ZI)V")
	protected Class99(@OriginalArg(0) Class13_Sub3_Sub2 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class381 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass381_8 = arg2;
		this.aClass104_16 = arg1;
		this.aClass13_Sub3_Sub2_6 = arg0;
		this.aBoolean605 = arg3;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method7187();

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!cg;)V")
	public void method8818(@OriginalArg(1) Class54 arg0) {
		this.aClass54_9 = arg0;
	}
}
