import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public abstract class Class77 {

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "Lclient!wh;")
	public Class400 aClass400_35 = Static610.aClass400_36;

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "Lclient!pm;")
	protected final Class295 aClass295_15;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "Lclient!wu;")
	protected final Class145_Sub1_Sub2 aClass145_Sub1_Sub2_9;

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "Z")
	public final boolean aBoolean823;

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "Lclient!hk;")
	protected final Class158 aClass158_20;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Lclient!wu;Lclient!pm;Lclient!hk;ZI)V")
	protected Class77(@OriginalArg(0) Class145_Sub1_Sub2 arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(2) Class158 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass295_15 = arg1;
		this.aClass145_Sub1_Sub2_9 = arg0;
		this.aBoolean823 = arg3;
		this.aClass158_20 = arg2;
	}

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method8447();

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!wh;Z)V")
	public void method8448(@OriginalArg(0) Class400 arg0) {
		this.aClass400_35 = arg0;
	}
}
