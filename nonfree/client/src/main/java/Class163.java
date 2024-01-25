import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public final class Class163 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class163(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method4735(arg0, arg1);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)I")
	public int method4733() {
		return this.anIDirect3DSwapChain1.Present(0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public void method4734() {
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.a(9275);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.a(9275);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.a(9275);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;BLclient!jagdx/IDirect3DSurface;)V")
	public void method4735(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(2) IDirect3DSurface arg1) {
		this.anIDirect3DSurface1 = arg1;
		this.anIDirect3DSwapChain1 = arg0;
		this.anIDirect3DSurface2 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Z")
	public boolean method4736() {
		return this.anIDirect3DSwapChain1 != null;
	}
}
