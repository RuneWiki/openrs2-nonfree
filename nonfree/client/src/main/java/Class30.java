import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public abstract class Class30 {

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "Lclient!ju;")
	public Class164 aClass164_13 = Static411.aClass164_15;

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "Lclient!tga;")
	protected final Class14_Sub2_Sub2 aClass14_Sub2_Sub2_6;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "Lclient!nh;")
	protected final Class219 aClass219_13;

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "Z")
	public final boolean aBoolean598;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "Lclient!jr;")
	protected final Class161 aClass161_19;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!tga;Lclient!nh;Lclient!jr;ZI)V")
	protected Class30(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass14_Sub2_Sub2_6 = arg0;
		this.aClass219_13 = arg1;
		this.aBoolean598 = arg3;
		this.aClass161_19 = arg2;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!ju;)V")
	public void method7587(@OriginalArg(1) Class164 arg0) {
		this.aClass164_13 = arg0;
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6779();
}
