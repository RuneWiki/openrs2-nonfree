import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class Class16 {

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "Lclient!qt;")
	public Class283 aClass283_11 = Static494.aClass283_8;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Lclient!lt;")
	protected final Class87_Sub1_Sub2 aClass87_Sub1_Sub2_9;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Lclient!ti;")
	protected final Class324 aClass324_19;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "Z")
	public final boolean aBoolean693;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "Lclient!kca;")
	protected final Class187 aClass187_17;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!lt;Lclient!kca;Lclient!ti;ZI)V")
	protected Class16(@OriginalArg(0) Class87_Sub1_Sub2 arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) Class324 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass87_Sub1_Sub2_9 = arg0;
		this.aClass324_19 = arg2;
		this.aBoolean693 = arg3;
		this.aClass187_17 = arg1;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!qt;I)V")
	public void method8046(@OriginalArg(0) Class283 arg0) {
		this.aClass283_11 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method8047();
}
