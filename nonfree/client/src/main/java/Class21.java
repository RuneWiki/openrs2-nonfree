import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public abstract class Class21 {

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "Lclient!cw;")
	public Class59 aClass59_11 = Static70.aClass59_5;

	@OriginalMember(owner = "client!dha", name = "c", descriptor = "Lclient!pb;")
	protected final Class265 aClass265_18;

	@OriginalMember(owner = "client!dha", name = "d", descriptor = "Z")
	public final boolean aBoolean733;

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "Lclient!sga;")
	protected final Class132_Sub1_Sub2 aClass132_Sub1_Sub2_9;

	@OriginalMember(owner = "client!dha", name = "e", descriptor = "Lclient!oea;")
	protected final Class250 aClass250_20;

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Lclient!sga;Lclient!pb;Lclient!oea;ZI)V")
	protected Class21(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass265_18 = arg1;
		this.aBoolean733 = arg3;
		this.aClass132_Sub1_Sub2_9 = arg0;
		this.aClass250_20 = arg2;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(BLclient!cw;)V")
	public void method8893(@OriginalArg(1) Class59 arg0) {
		this.aClass59_11 = arg0;
	}

	@OriginalMember(owner = "client!dha", name = "c", descriptor = "(I)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method8894();
}
