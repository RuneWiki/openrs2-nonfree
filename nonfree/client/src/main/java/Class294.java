import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.aha;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class294 implements Interface16 {

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
	private int anInt7544;

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
	private int anInt7545;

	@OriginalMember(owner = "client!pw", name = "g", descriptor = "Z")
	private boolean aBoolean592 = false;

	@OriginalMember(owner = "client!pw", name = "f", descriptor = "Lclient!us;")
	private final Class33_Sub2_Sub2 aClass33_Sub2_Sub2_5;

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "Z")
	private final boolean aBoolean591;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "Lclient!dw;")
	private final Class79 aClass79_17;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lclient!us;Lclient!dw;Z)V")
	public Class294(@OriginalArg(0) Class33_Sub2_Sub2 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass33_Sub2_Sub2_5 = arg0;
		this.aBoolean591 = arg2;
		this.aClass79_17 = arg1;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)Lclient!dw;")
	@Override
	public Class79 method8365() {
		return this.aClass79_17;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8364() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean591 & true;
		if (!this.aBoolean592 && aha.a(-1, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt7545, local9 ? 8192 : 0, this.aClass33_Sub2_Sub2_5.aGeometryBuffer1))) {
			this.aBoolean592 = true;
			return this.aClass33_Sub2_Sub2_5.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)I")
	@Override
	public int method8353() {
		return this.anInt7544;
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)V")
	@Override
	public void method8358() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(true);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt7545 = 0;
		this.anInt7544 = 0;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)V")
	@Override
	public void method8360(@OriginalArg(1) int arg0) {
		this.anInt7544 = this.aClass79_17.anInt2185 * arg0;
		if (this.anInt7545 >= this.anInt7544) {
			return;
		}
		@Pc(20) short local20 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean591) {
			local20 = 520;
			local29 = 0;
		} else {
			local29 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(true);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass33_Sub2_Sub2_5.anIDirect3DDevice1.a(this.anInt7544, local20, Static111.aClass79_8 == this.aClass79_17 ? 101 : 102, local29, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt7545 = this.anInt7544;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8363() {
		if (this.aBoolean592 && aha.a(-1, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean592 = false;
			return true;
		} else {
			return false;
		}
	}
}
