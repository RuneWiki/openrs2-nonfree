import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public abstract class Class80 {

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "Lclient!ws;")
	public Class395 aClass395_15 = Static193.aClass395_14;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Lclient!aia;")
	protected final Class16_Sub1_Sub1 aClass16_Sub1_Sub1_9;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "Lclient!so;")
	protected final Class330 aClass330_20;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Lclient!ul;")
	protected final Class361 aClass361_17;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Z")
	public final boolean aBoolean764;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!aia;Lclient!ul;Lclient!so;ZI)V")
	protected Class80(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) Class330 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass16_Sub1_Sub1_9 = arg0;
		this.aClass330_20 = arg2;
		this.aClass361_17 = arg1;
		this.aBoolean764 = arg3;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method8757();

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ws;B)V")
	public void method8758(@OriginalArg(0) Class395 arg0) {
		this.aClass395_15 = arg0;
	}
}
