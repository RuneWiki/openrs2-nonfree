import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class Class228 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Lclient!tda;")
	public Class334 aClass334_13 = Static159.aClass334_8;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!bja;")
	protected final Class36 aClass36_20;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!vea;")
	protected final Class363 aClass363_18;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!ta;")
	protected final Class137_Sub1_Sub2 aClass137_Sub1_Sub2_9;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
	public final boolean aBoolean746;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!ta;Lclient!vea;Lclient!bja;ZI)V")
	protected Class228(@OriginalArg(0) Class137_Sub1_Sub2 arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) Class36 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass36_20 = arg2;
		this.aClass363_18 = arg1;
		this.aClass137_Sub1_Sub2_9 = arg0;
		this.aBoolean746 = arg3;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method9086();

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!tda;)V")
	public void method9087(@OriginalArg(1) Class334 arg0) {
		this.aClass334_13 = arg0;
	}
}
