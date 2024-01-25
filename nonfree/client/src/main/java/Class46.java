import jagdx.IDirect3DBaseTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public abstract class Class46 {

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "Lclient!ej;")
	public Class82 aClass82_8 = Static55.aClass82_1;

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "Z")
	public final boolean aBoolean356;

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "Lclient!ok;")
	protected final Class242 aClass242_9;

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "Lclient!fi;")
	protected final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_7;

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "Lclient!pd;")
	protected final Class250 aClass250_10;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Lclient!fi;Lclient!pd;Lclient!ok;ZI)V")
	protected Class46(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) Class242 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aBoolean356 = arg3;
		this.aClass242_9 = arg2;
		this.aClass100_Sub1_Sub1_7 = arg0;
		this.aClass250_10 = arg1;
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)Lclient!jagdx/IDirect3DBaseTexture;")
	public abstract IDirect3DBaseTexture method4660();

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BLclient!ej;)V")
	public void method7827(@OriginalArg(1) Class82 arg0) {
		this.aClass82_8 = arg0;
	}
}
