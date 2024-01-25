import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class Class139 {

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!qq;")
	public Class240 aClass240_9 = Static539.aClass240_11;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "Lclient!lc;")
	protected final Class171 aClass171_18;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Lclient!nca;")
	protected final Class39_Sub2_Sub1 aClass39_Sub2_Sub1_8;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Z")
	public final boolean aBoolean595;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!jt;")
	protected final Class150 aClass150_14;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!nca;Lclient!jt;Lclient!lc;ZI)V")
	protected Class139(@OriginalArg(0) Class39_Sub2_Sub1 arg0, @OriginalArg(1) Class150 arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass171_18 = arg2;
		this.aClass39_Sub2_Sub1_8 = arg0;
		this.aBoolean595 = arg3;
		this.aClass150_14 = arg1;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6781();

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!qq;I)V")
	public void method7130(@OriginalArg(0) Class240 arg0) {
		this.aClass240_9 = arg0;
	}
}
