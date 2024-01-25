import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.qr;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class250 implements Interface16 {

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "B")
	private byte aByte92;

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
	private int anInt6897;

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
	private int anInt6898;

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "Z")
	private boolean aBoolean534 = false;

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "Z")
	private final boolean aBoolean535;

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "Lclient!gaa;")
	private final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_7;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!gaa;Z)V")
	public Class250(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean535 = arg1;
		this.aClass100_Sub1_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method5776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte92 = (byte) arg0;
		this.anInt6898 = arg1;
		if (this.anInt6898 > this.anInt6897) {
			@Pc(28) short local28 = 8;
			@Pc(33) byte local33;
			if (this.aBoolean535) {
				local28 = 520;
				local33 = 0;
			} else {
				local33 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b(6168);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass100_Sub1_Sub1_7.anIDirect3DDevice1.a(this.anInt6898, local28, 0, local33, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt6897 = this.anInt6898;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(B)I")
	public int method5777() {
		return this.aByte92;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IIB)Z")
	@Override
	public boolean method5773(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method5776(arg1, arg2) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt6898, this.aBoolean535 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5774() {
		if (this.aBoolean534 && qr.a(this.anIDirect3DVertexBuffer1.Unlock(), -2005530519)) {
			this.aBoolean534 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V")
	@Override
	public void method5772() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b(6168);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt6897 = 0;
		this.anInt6898 = 0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I")
	@Override
	public int method5771() {
		return this.anInt6898;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5775() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean535 & true;
		if (!this.aBoolean534 && qr.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt6897, local9 ? 8192 : 0, this.aClass100_Sub1_Sub1_7.aGeometryBuffer1), -2005530519)) {
			this.aBoolean534 = true;
			return this.aClass100_Sub1_Sub1_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}
}
