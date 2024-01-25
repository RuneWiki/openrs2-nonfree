import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public abstract class Class38 {

	@OriginalMember(owner = "client!hfa", name = "e", descriptor = "Lclient!ag;")
	public Class8 aClass8_8 = Static608.aClass8_11;

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "Z")
	public final boolean aBoolean576;

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "Lclient!wj;")
	protected final Class389 aClass389_8;

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "Lclient!uda;")
	protected final Class95_Sub1_Sub2 aClass95_Sub1_Sub2_7;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "Lclient!g;")
	protected final Class122 aClass122_16;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lclient!uda;Lclient!g;Lclient!wj;ZI)V")
	protected Class38(@OriginalArg(0) Class95_Sub1_Sub2 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) Class389 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aBoolean576 = arg3;
		this.aClass389_8 = arg2;
		this.aClass95_Sub1_Sub2_7 = arg0;
		this.aClass122_16 = arg1;
	}

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6846();

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BLclient!ag;)V")
	public void method7462(@OriginalArg(1) Class8 arg0) {
		this.aClass8_8 = arg0;
	}
}
