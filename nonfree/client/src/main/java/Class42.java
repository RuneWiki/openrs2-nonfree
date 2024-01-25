import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public abstract class Class42 {

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "Lclient!dj;")
	public Class71 aClass71_10 = Static567.aClass71_11;

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "Lclient!rt;")
	protected final Class298 aClass298_20;

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "Lclient!sq;")
	protected final Class314 aClass314_21;

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "Lclient!eda;")
	protected final Class45_Sub2_Sub1 aClass45_Sub2_Sub1_9;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "Z")
	public final boolean aBoolean642;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!eda;Lclient!sq;Lclient!rt;ZI)V")
	protected Class42(@OriginalArg(0) Class45_Sub2_Sub1 arg0, @OriginalArg(1) Class314 arg1, @OriginalArg(2) Class298 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass298_20 = arg2;
		this.aClass314_21 = arg1;
		this.aClass45_Sub2_Sub1_9 = arg0;
		this.aBoolean642 = arg3;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!dj;B)V")
	public void method6963(@OriginalArg(0) Class71 arg0) {
		this.aClass71_10 = arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6964();
}
