import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class Class217 {

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "Lclient!on;")
	public Class280 aClass280_11 = Static131.aClass280_4;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "Lclient!hu;")
	protected final Class167 aClass167_20;

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "Lclient!sca;")
	protected final Class335 aClass335_18;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "Z")
	public final boolean aBoolean739;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "Lclient!tha;")
	protected final Class22_Sub2_Sub1 aClass22_Sub2_Sub1_9;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!tha;Lclient!sca;Lclient!hu;ZI)V")
	protected Class217(@OriginalArg(0) Class22_Sub2_Sub1 arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) Class167 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass167_20 = arg2;
		this.aClass335_18 = arg1;
		this.aBoolean739 = arg3;
		this.aClass22_Sub2_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method9228();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!on;B)V")
	public void method9229(@OriginalArg(0) Class280 arg0) {
		this.aClass280_11 = arg0;
	}
}
