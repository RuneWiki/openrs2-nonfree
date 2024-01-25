import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class297 {

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class297(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method7091(arg1, arg0);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)Z")
	public boolean method7089() {
		return this.anIDirect3DSwapChain1 != null;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public void method7090() {
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.b((byte) -118);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.b((byte) -55);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.b((byte) 109);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSurface;Lclient!jagdx/IDirect3DSwapChain;Z)V")
	public void method7091(@OriginalArg(0) IDirect3DSurface arg0, @OriginalArg(1) IDirect3DSwapChain arg1) {
		this.anIDirect3DSurface1 = arg0;
		this.anIDirect3DSwapChain1 = arg1;
		this.anIDirect3DSurface2 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)I")
	public int method7092() {
		return this.anIDirect3DSwapChain1.Present(0);
	}
}
