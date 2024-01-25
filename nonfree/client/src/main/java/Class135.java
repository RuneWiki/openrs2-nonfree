import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public abstract class Class135 {

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "Lclient!wga;")
	public Class385 aClass385_21 = Static198.aClass385_42;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "Lclient!ig;")
	protected final Class152 aClass152_18;

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "Lclient!sw;")
	protected final Class327 aClass327_15;

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "Z")
	public final boolean aBoolean458;

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "Lclient!rja;")
	protected final Class13_Sub1_Sub2 aClass13_Sub1_Sub2_4;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!rja;Lclient!sw;Lclient!ig;ZI)V")
	protected Class135(@OriginalArg(0) Class13_Sub1_Sub2 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) Class152 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass152_18 = arg2;
		this.aClass327_15 = arg1;
		this.aBoolean458 = arg3;
		this.aClass13_Sub1_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method5798();

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!wga;)V")
	public void method8137(@OriginalArg(1) Class385 arg0) {
		this.aClass385_21 = arg0;
	}
}
