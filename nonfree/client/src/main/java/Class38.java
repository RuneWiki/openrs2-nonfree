import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public abstract class Class38 {

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "Lclient!nd;")
	public Class216 aClass216_10 = Static121.aClass216_4;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "Z")
	public final boolean aBoolean821;

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "Lclient!kq;")
	protected final Class176 aClass176_19;

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "Lclient!bea;")
	protected final Class5_Sub2_Sub1 aClass5_Sub2_Sub1_9;

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "Lclient!kt;")
	protected final Class178 aClass178_14;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lclient!bea;Lclient!kt;Lclient!kq;ZI)V")
	protected Class38(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aBoolean821 = arg3;
		this.aClass176_19 = arg2;
		this.aClass5_Sub2_Sub1_9 = arg0;
		this.aClass178_14 = arg1;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method8444();

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLclient!nd;)V")
	public void method8610(@OriginalArg(1) Class216 arg0) {
		this.aClass216_10 = arg0;
	}
}
