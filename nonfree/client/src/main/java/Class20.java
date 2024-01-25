import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public abstract class Class20 {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "Lclient!gw;")
	public Class123 aClass123_8 = Static40.aClass123_9;

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "Lclient!hg;")
	protected final Class43_Sub1_Sub1 aClass43_Sub1_Sub1_6;

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "Z")
	public final boolean aBoolean337;

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "Lclient!fda;")
	protected final Class93 aClass93_7;

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "Lclient!ro;")
	protected final Class292 aClass292_7;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!hg;Lclient!fda;Lclient!ro;ZI)V")
	protected Class20(@OriginalArg(0) Class43_Sub1_Sub1 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class292 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass43_Sub1_Sub1_6 = arg0;
		this.aBoolean337 = arg3;
		this.aClass93_7 = arg1;
		this.aClass292_7 = arg2;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ZLclient!gw;)V")
	public void method7422(@OriginalArg(1) Class123 arg0) {
		this.aClass123_8 = arg0;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method3898();
}
