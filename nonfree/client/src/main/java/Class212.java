import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public final class Class212 {

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class212(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method4817(arg1, arg0);
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)Z")
	public boolean method4814() {
		return this.anIDirect3DSwapChain1 != null;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(II)I")
	public int method4815() {
		return this.anIDirect3DSwapChain1.Present(0);
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)V")
	public void method4816() {
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.b(false);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.b(false);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.b(false);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSurface;Lclient!jagdx/IDirect3DSwapChain;I)V")
	public void method4817(@OriginalArg(0) IDirect3DSurface arg0, @OriginalArg(1) IDirect3DSwapChain arg1) {
		this.anIDirect3DSurface1 = arg0;
		this.anIDirect3DSwapChain1 = arg1;
		this.anIDirect3DSurface2 = this.anIDirect3DSwapChain1.a(0, 0);
	}
}
