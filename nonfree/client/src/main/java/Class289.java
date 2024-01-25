import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.ala;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pka")
public final class Class289 implements Interface16 {

	@OriginalMember(owner = "client!pka", name = "e", descriptor = "I")
	private int anInt8484;

	@OriginalMember(owner = "client!pka", name = "g", descriptor = "I")
	private int anInt8485;

	@OriginalMember(owner = "client!pka", name = "c", descriptor = "B")
	private byte aByte131;

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!pka", name = "d", descriptor = "Z")
	private boolean aBoolean634 = false;

	@OriginalMember(owner = "client!pka", name = "f", descriptor = "Z")
	private final boolean aBoolean635;

	@OriginalMember(owner = "client!pka", name = "b", descriptor = "Lclient!de;")
	private final Class67_Sub1_Sub1 aClass67_Sub1_Sub1_8;

	@OriginalMember(owner = "client!pka", name = "<init>", descriptor = "(Lclient!de;Z)V")
	public Class289(@OriginalArg(0) Class67_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean635 = arg1;
		this.aClass67_Sub1_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(Lclient!jaclib/memory/Source;BII)Z")
	@Override
	public boolean method7125(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method7121(arg1, arg2) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt8484, this.aBoolean635 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!pka", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7124() {
		if (this.aBoolean634 && ala.a(this.anIDirect3DVertexBuffer1.Unlock(), -1)) {
			this.aBoolean634 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7122() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(11) boolean local11 = this.aBoolean635 & true;
		if (!this.aBoolean634 && ala.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt8485, local11 ? 8192 : 0, this.aClass67_Sub1_Sub1_8.aGeometryBuffer1), -1)) {
			this.aBoolean634 = true;
			return this.aClass67_Sub1_Sub1_8.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(I)I")
	@Override
	public int method9247() {
		return this.anInt8484;
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(Z)V")
	@Override
	public void method9249() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b((byte) 106);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt8484 = 0;
		this.anInt8485 = 0;
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IIZ)Z")
	@Override
	public boolean method7121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte131 = (byte) arg0;
		this.anInt8484 = arg1;
		if (this.anInt8484 > this.anInt8485) {
			@Pc(27) short local27 = 8;
			@Pc(36) byte local36;
			if (this.aBoolean635) {
				local27 = 520;
				local36 = 0;
			} else {
				local36 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b((byte) 92);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass67_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt8484, local27, 0, local36, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt8485 = this.anInt8484;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!pka", name = "c", descriptor = "(I)I")
	public int method7126() {
		return this.aByte131;
	}
}
