import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class Class116 {

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "Lclient!lba;")
	public Class172 aClass172_10 = Static50.aClass172_2;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "Lclient!rca;")
	protected final Class5_Sub3_Sub2 aClass5_Sub3_Sub2_8;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "Z")
	public final boolean aBoolean471;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "Lclient!vt;")
	protected final Class310 aClass310_11;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "Lclient!kp;")
	protected final Class167 aClass167_11;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!rca;Lclient!kp;Lclient!vt;ZI)V")
	protected Class116(@OriginalArg(0) Class5_Sub3_Sub2 arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass5_Sub3_Sub2_8 = arg0;
		this.aBoolean471 = arg3;
		this.aClass310_11 = arg2;
		this.aClass167_11 = arg1;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!lba;I)V")
	public void method6468(@OriginalArg(0) Class172 arg0) {
		this.aClass172_10 = arg0;
	}

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method5960();
}
