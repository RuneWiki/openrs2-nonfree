import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class Class24 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "Lclient!gu;")
	public Class113 aClass113_7 = Static402.aClass113_9;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "Lclient!uda;")
	protected final Class292 aClass292_7;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "Lclient!hv;")
	protected final Class122_Sub2_Sub1 aClass122_Sub2_Sub1_5;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "Lclient!sb;")
	protected final Class264 aClass264_8;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Z")
	public final boolean aBoolean289;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!hv;Lclient!uda;Lclient!sb;ZI)V")
	protected Class24(@OriginalArg(0) Class122_Sub2_Sub1 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) Class264 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass292_7 = arg1;
		this.aClass122_Sub2_Sub1_5 = arg0;
		this.aClass264_8 = arg2;
		this.aBoolean289 = arg3;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!gu;I)V")
	public void method7302(@OriginalArg(0) Class113 arg0) {
		this.aClass113_7 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method3590();
}
