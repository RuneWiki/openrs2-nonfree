import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public abstract class Class132 {

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "Lclient!gca;")
	public Class116 aClass116_14 = Static415.aClass116_12;

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "Lclient!al;")
	protected final Class19 aClass19_20;

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "Z")
	public final boolean aBoolean665;

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "Lclient!lw;")
	protected final Class223 aClass223_15;

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "Lclient!hb;")
	protected final Class133_Sub1_Sub1 aClass133_Sub1_Sub1_8;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!hb;Lclient!lw;Lclient!al;ZI)V")
	protected Class132(@OriginalArg(0) Class133_Sub1_Sub1 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass19_20 = arg2;
		this.aBoolean665 = arg3;
		this.aClass223_15 = arg1;
		this.aClass133_Sub1_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!gca;I)V")
	public void method7905(@OriginalArg(0) Class116 arg0) {
		this.aClass116_14 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method7906();
}
