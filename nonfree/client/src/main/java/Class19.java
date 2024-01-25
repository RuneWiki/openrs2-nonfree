import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class Class19 {

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Lclient!ie;")
	public Class136 aClass136_10 = Static114.aClass136_8;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!g;")
	protected final Class110 aClass110_18;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Z")
	public final boolean aBoolean416;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!hg;")
	protected final Class4_Sub2_Sub1 aClass4_Sub2_Sub1_7;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "Lclient!vp;")
	protected final Class308 aClass308_9;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!hg;Lclient!g;Lclient!vp;ZI)V")
	protected Class19(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) Class308 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass110_18 = arg1;
		this.aBoolean416 = arg3;
		this.aClass4_Sub2_Sub1_7 = arg0;
		this.aClass308_9 = arg2;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!ie;)V")
	public void method7757(@OriginalArg(1) Class136 arg0) {
		this.aClass136_10 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method5123();
}
