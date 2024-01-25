import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class Class154 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "Lclient!tn;")
	public Class318 aClass318_11 = Static132.aClass318_4;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Lclient!oe;")
	protected final Class7_Sub1_Sub2 aClass7_Sub1_Sub2_8;

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "Lclient!jb;")
	protected final Class161 aClass161_19;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "Lclient!qda;")
	protected final Class273 aClass273_18;

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "Z")
	public final boolean aBoolean696;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!oe;Lclient!jb;Lclient!qda;ZI)V")
	protected Class154(@OriginalArg(0) Class7_Sub1_Sub2 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) Class273 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass7_Sub1_Sub2_8 = arg0;
		this.aClass161_19 = arg1;
		this.aClass273_18 = arg2;
		this.aBoolean696 = arg3;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLclient!tn;)V")
	public void method7869(@OriginalArg(1) Class318 arg0) {
		this.aClass318_11 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method7870();
}
