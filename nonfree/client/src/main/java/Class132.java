import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class132 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class132(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method3320(arg1, arg0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSurface;ILclient!jagdx/IDirect3DSwapChain;)V")
	public void method3320(@OriginalArg(0) IDirect3DSurface arg0, @OriginalArg(2) IDirect3DSwapChain arg1) {
		this.anIDirect3DSwapChain1 = arg1;
		this.anIDirect3DSurface2 = arg0;
		this.anIDirect3DSurface1 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	public void method3321() {
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.b(30216);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.b(30216);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.b(30216);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)Z")
	public boolean method3322() {
		return this.anIDirect3DSwapChain1 != null;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)I")
	public int method3323() {
		return this.anIDirect3DSwapChain1.Present(0);
	}
}
