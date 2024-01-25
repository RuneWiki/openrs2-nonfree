import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public abstract class Class81 {

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "Lclient!gk;")
	public Class137 aClass137_11 = Static306.aClass137_8;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "Lclient!hda;")
	protected final Class144_Sub1_Sub1 aClass144_Sub1_Sub1_9;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "Z")
	public final boolean aBoolean769;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "Lclient!al;")
	protected final Class19 aClass19_19;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "Lclient!o;")
	protected final Class260 aClass260_14;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!hda;Lclient!o;Lclient!al;ZI)V")
	protected Class81(@OriginalArg(0) Class144_Sub1_Sub1 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass144_Sub1_Sub1_9 = arg0;
		this.aBoolean769 = arg3;
		this.aClass19_19 = arg2;
		this.aClass260_14 = arg1;
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method9339();

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZLclient!gk;)V")
	public void method9349(@OriginalArg(1) Class137 arg0) {
		this.aClass137_11 = arg0;
	}
}
