import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class Class13 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Lclient!bba;")
	public Class26 aClass26_10 = Static229.aClass26_6;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "Lclient!cu;")
	protected final Class33_Sub1_Sub2 aClass33_Sub1_Sub2_7;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "Z")
	public final boolean aBoolean679;

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "Lclient!em;")
	protected final Class82 aClass82_14;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "Lclient!ew;")
	protected final Class89 aClass89_18;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!cu;Lclient!em;Lclient!ew;ZI)V")
	protected Class13(@OriginalArg(0) Class33_Sub1_Sub2 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) Class89 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass33_Sub1_Sub2_7 = arg0;
		this.aBoolean679 = arg3;
		this.aClass82_14 = arg1;
		this.aClass89_18 = arg2;
	}

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6679();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!bba;I)V")
	public void method7294(@OriginalArg(0) Class26 arg0) {
		this.aClass26_10 = arg0;
	}
}
