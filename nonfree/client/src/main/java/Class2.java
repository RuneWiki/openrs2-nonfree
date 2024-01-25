import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class Class2 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Lclient!dca;")
	public Class65 aClass65_11 = Static93.aClass65_7;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!os;")
	protected final Class245 aClass245_15;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "Lclient!to;")
	protected final Class31_Sub1_Sub2 aClass31_Sub1_Sub2_9;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "Lclient!mg;")
	protected final Class204 aClass204_20;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "Z")
	public final boolean aBoolean648;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!to;Lclient!os;Lclient!mg;ZI)V")
	protected Class2(@OriginalArg(0) Class31_Sub1_Sub2 arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) Class204 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass245_15 = arg1;
		this.aClass31_Sub1_Sub2_9 = arg0;
		this.aClass204_20 = arg2;
		this.aBoolean648 = arg3;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method7710();

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!dca;B)V")
	public void method7711(@OriginalArg(0) Class65 arg0) {
		this.aClass65_11 = arg0;
	}
}
