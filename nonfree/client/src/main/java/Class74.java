import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public abstract class Class74 {

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "Lclient!qo;")
	public Class277 aClass277_11 = Static579.aClass277_10;

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "Lclient!wd;")
	protected final Class366 aClass366_14;

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "Z")
	public final boolean aBoolean736;

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "Lclient!hl;")
	protected final Class16_Sub1_Sub2 aClass16_Sub1_Sub2_9;

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "Lclient!jm;")
	protected final Class160 aClass160_20;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lclient!hl;Lclient!wd;Lclient!jm;ZI)V")
	protected Class74(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass366_14 = arg1;
		this.aBoolean736 = arg3;
		this.aClass16_Sub1_Sub2_9 = arg0;
		this.aClass160_20 = arg2;
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method8279();

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!qo;I)V")
	public void method8280(@OriginalArg(0) Class277 arg0) {
		this.aClass277_11 = arg0;
	}
}
