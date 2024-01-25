import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class309 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class309(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method7458(arg1, arg0);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)Z")
	public boolean method7457() {
		return this.anIDirect3DSwapChain1 != null;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSurface;ILclient!jagdx/IDirect3DSwapChain;)V")
	public void method7458(@OriginalArg(0) IDirect3DSurface arg0, @OriginalArg(2) IDirect3DSwapChain arg1) {
		this.anIDirect3DSwapChain1 = arg1;
		this.anIDirect3DSurface2 = arg0;
		this.anIDirect3DSurface1 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
	public void method7459() {
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.b(124);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.b(124);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.b(-7);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)I")
	public int method7460() {
		return this.anIDirect3DSwapChain1.Present(0);
	}
}
