import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class Class28 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "Lclient!kha;")
	public Class189 aClass189_13 = Static276.aClass189_15;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Lclient!qda;")
	protected final Class281 aClass281_17;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "Z")
	public final boolean aBoolean579;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "Lclient!mh;")
	protected final Class126_Sub2_Sub2 aClass126_Sub2_Sub2_7;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "Lclient!ns;")
	protected final Class247 aClass247_19;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!mh;Lclient!qda;Lclient!ns;ZI)V")
	protected Class28(@OriginalArg(0) Class126_Sub2_Sub2 arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) Class247 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass281_17 = arg1;
		this.aBoolean579 = arg3;
		this.aClass126_Sub2_Sub2_7 = arg0;
		this.aClass247_19 = arg2;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!kha;)V")
	public void method7609(@OriginalArg(1) Class189 arg0) {
		this.aClass189_13 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method6206();
}
