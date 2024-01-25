import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class Class48 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "Lclient!ui;")
	public Class339 aClass339_11 = Static108.aClass339_3;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "Lclient!kca;")
	protected final Class182 aClass182_15;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "Lclient!ad;")
	protected final Class5_Sub1_Sub1 aClass5_Sub1_Sub1_8;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Z")
	public final boolean aBoolean621;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "Lclient!wq;")
	protected final Class376 aClass376_10;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!ad;Lclient!kca;Lclient!wq;ZI)V")
	protected Class48(@OriginalArg(0) Class5_Sub1_Sub1 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class376 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass182_15 = arg1;
		this.aClass5_Sub1_Sub1_8 = arg0;
		this.aBoolean621 = arg3;
		this.aClass376_10 = arg2;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZLclient!ui;)V")
	public void method7472(@OriginalArg(1) Class339 arg0) {
		this.aClass339_11 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "d", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method7473();
}
