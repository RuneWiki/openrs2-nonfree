import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public final class Class54 {

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class54(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method1340(arg1, arg0);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)V")
	public void method1339() {
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.a((byte) -34);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.a((byte) -34);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.a((byte) -34);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSurface;ZLclient!jagdx/IDirect3DSwapChain;)V")
	public void method1340(@OriginalArg(0) IDirect3DSurface arg0, @OriginalArg(2) IDirect3DSwapChain arg1) {
		this.anIDirect3DSwapChain1 = arg1;
		this.anIDirect3DSurface2 = arg0;
		this.anIDirect3DSurface1 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)Z")
	public boolean method1341() {
		return this.anIDirect3DSwapChain1 != null;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)I")
	public int method1342() {
		return this.anIDirect3DSwapChain1.Present(0);
	}
}
