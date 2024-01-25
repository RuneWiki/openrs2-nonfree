import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class272 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class272(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method6320(arg1, arg0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public void method6318() {
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.a((byte) -62);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.a((byte) -47);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.a((byte) -49);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)I")
	public int method6319() {
		return this.anIDirect3DSwapChain1.Present(0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!jagdx/IDirect3DSurface;Lclient!jagdx/IDirect3DSwapChain;)V")
	public void method6320(@OriginalArg(1) IDirect3DSurface arg0, @OriginalArg(2) IDirect3DSwapChain arg1) {
		this.anIDirect3DSwapChain1 = arg1;
		this.anIDirect3DSurface1 = arg0;
		this.anIDirect3DSurface2 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)Z")
	public boolean method6321() {
		return this.anIDirect3DSwapChain1 != null;
	}
}
