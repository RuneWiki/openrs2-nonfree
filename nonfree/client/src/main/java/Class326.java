import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public final class Class326 {

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class326(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method7654(arg1, arg0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)Z")
	public boolean method7651() {
		return this.anIDirect3DSwapChain1 != null;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)I")
	public int method7652() {
		return this.anIDirect3DSwapChain1.Present(0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	public void method7653() {
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

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSurface;ILclient!jagdx/IDirect3DSwapChain;)V")
	public void method7654(@OriginalArg(0) IDirect3DSurface arg0, @OriginalArg(2) IDirect3DSwapChain arg1) {
		this.anIDirect3DSwapChain1 = arg1;
		this.anIDirect3DSurface2 = arg0;
		this.anIDirect3DSurface1 = this.anIDirect3DSwapChain1.a(0, 0);
	}
}
