import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public final class Class23 {

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface1;

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "Lclient!jagdx/IDirect3DSwapChain;")
	private IDirect3DSwapChain anIDirect3DSwapChain1;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "Lclient!jagdx/IDirect3DSurface;")
	private IDirect3DSurface anIDirect3DSurface2;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!jagdx/IDirect3DSwapChain;Lclient!jagdx/IDirect3DSurface;)V")
	public Class23(@OriginalArg(0) IDirect3DSwapChain arg0, @OriginalArg(1) IDirect3DSurface arg1) {
		this.method391(arg1, arg0);
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)Z")
	public boolean method389() {
		return this.anIDirect3DSwapChain1 != null;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
	public void method390() {
		if (this.anIDirect3DSurface1 != null) {
			this.anIDirect3DSurface1.a(-112);
			this.anIDirect3DSurface1 = null;
		}
		if (this.anIDirect3DSurface2 != null) {
			this.anIDirect3DSurface2.a(14);
			this.anIDirect3DSurface2 = null;
		}
		if (this.anIDirect3DSwapChain1 != null) {
			this.anIDirect3DSwapChain1.a(-109);
			this.anIDirect3DSwapChain1 = null;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!jagdx/IDirect3DSurface;ZLclient!jagdx/IDirect3DSwapChain;)V")
	public void method391(@OriginalArg(0) IDirect3DSurface arg0, @OriginalArg(2) IDirect3DSwapChain arg1) {
		this.anIDirect3DSurface2 = arg0;
		this.anIDirect3DSwapChain1 = arg1;
		this.anIDirect3DSurface1 = this.anIDirect3DSwapChain1.a(0, 0);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)I")
	public int method392() {
		return this.anIDirect3DSwapChain1.Present(0);
	}
}
