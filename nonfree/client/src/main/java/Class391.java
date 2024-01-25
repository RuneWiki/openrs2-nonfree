import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class391 {

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class391(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method8975(arg0, arg1);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)I")
	public int method8973() {
		return this.anIDirect3DSwapChain1.Present(0);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
	public void method8974() {
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.a(true);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.a(true);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.a(true);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;ILclient!jagdx/IDirect3DSurface;)V")
	public void method8975(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(2) IDirect3DSurface arg1) {
		this.anIDirect3DSurface2 = arg1;
		this.anIDirect3DSwapChain1 = arg0;
		this.anIDirect3DSurface1 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)Z")
	public boolean method8976() {
		return this.anIDirect3DSwapChain1 != null;
	}
}
