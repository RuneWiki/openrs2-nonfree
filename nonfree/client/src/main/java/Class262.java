import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public abstract class Class262 {

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "Lclient!tha;")
	public Class324 aClass324_9 = Static468.aClass324_7;

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "Lclient!jt;")
	protected final Class182 aClass182_18;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "Lclient!kfa;")
	protected final Class82_Sub3_Sub2 aClass82_Sub3_Sub2_7;

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "Z")
	public final boolean aBoolean703;

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "Lclient!iv;")
	protected final Class168 aClass168_13;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!kfa;Lclient!iv;Lclient!jt;ZI)V")
	protected Class262(@OriginalArg(0) Class82_Sub3_Sub2 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass182_18 = arg2;
		this.aClass82_Sub3_Sub2_7 = arg0;
		this.aBoolean703 = arg3;
		this.aClass168_13 = arg1;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method8008();

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!tha;B)V")
	public void method8487(@OriginalArg(0) Class324 arg0) {
		this.aClass324_9 = arg0;
	}
}
