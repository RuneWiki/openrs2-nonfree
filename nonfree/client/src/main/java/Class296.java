import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.aha;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class296 implements Interface19 {

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
	private int anInt7553;

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "B")
	private byte aByte108;

	@OriginalMember(owner = "client!qaa", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!qaa", name = "g", descriptor = "I")
	private int anInt7554;

	@OriginalMember(owner = "client!qaa", name = "d", descriptor = "Z")
	private boolean aBoolean596 = false;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "Lclient!us;")
	private final Class33_Sub2_Sub2 aClass33_Sub2_Sub2_6;

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "Z")
	private final boolean aBoolean595;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!us;Z)V")
	public Class296(@OriginalArg(0) Class33_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass33_Sub2_Sub2_6 = arg0;
		this.aBoolean595 = arg1;
	}

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "(B)I")
	public int method6569() {
		return this.aByte108;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6566() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean595 & true;
		if (!this.aBoolean596 && aha.a(-1, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt7553, local9 ? 8192 : 0, this.aClass33_Sub2_Sub2_6.aGeometryBuffer1))) {
			this.aBoolean596 = true;
			return this.aClass33_Sub2_Sub2_6.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IBI)Z")
	@Override
	public boolean method6565(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method6567(arg1, arg2) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt7554, this.aBoolean595 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IBI)Z")
	@Override
	public boolean method6567(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte108 = (byte) arg1;
		this.anInt7554 = arg0;
		if (this.anInt7553 < this.anInt7554) {
			@Pc(23) short local23 = 8;
			@Pc(28) byte local28;
			if (this.aBoolean595) {
				local23 = 520;
				local28 = 0;
			} else {
				local28 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(true);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass33_Sub2_Sub2_6.anIDirect3DDevice1.a(this.anInt7554, local23, 0, local28, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt7553 = this.anInt7554;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(B)V")
	@Override
	public void method8358() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(true);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt7553 = 0;
		this.anInt7554 = 0;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6568() {
		if (this.aBoolean596 && aha.a(-1, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean596 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)I")
	@Override
	public int method8353() {
		return this.anInt7554;
	}
}
