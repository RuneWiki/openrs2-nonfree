import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class Class204 {

	@OriginalMember(owner = "client!or", name = "a", descriptor = "Lclient!fj;")
	public Class101 aClass101_11 = Static342.aClass101_4;

	@OriginalMember(owner = "client!or", name = "d", descriptor = "Lclient!ge;")
	protected final Class114 aClass114_17;

	@OriginalMember(owner = "client!or", name = "c", descriptor = "Z")
	public final boolean aBoolean565;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "Lclient!bv;")
	protected final Class42_Sub1_Sub1 aClass42_Sub1_Sub1_6;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "Lclient!dk;")
	protected final Class72 aClass72_13;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!bv;Lclient!dk;Lclient!ge;ZI)V")
	protected Class204(@OriginalArg(0) Class42_Sub1_Sub1 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) Class114 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass114_17 = arg2;
		this.aBoolean565 = arg3;
		this.aClass42_Sub1_Sub1_6 = arg0;
		this.aClass72_13 = arg1;
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6852();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZLclient!fj;)V")
	public void method6968(@OriginalArg(1) Class101 arg0) {
		this.aClass101_11 = arg0;
	}
}
