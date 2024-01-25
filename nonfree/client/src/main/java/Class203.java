import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.hl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public final class Class203 implements Interface9 {

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "B")
	private byte aByte65;

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
	private int anInt5974;

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "I")
	private int anInt5975;

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "Z")
	private boolean aBoolean443 = false;

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "Z")
	private final boolean aBoolean444;

	@OriginalMember(owner = "client!lfa", name = "f", descriptor = "Lclient!kaa;")
	private final Class44_Sub2_Sub2 aClass44_Sub2_Sub2_4;

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lclient!kaa;Z)V")
	public Class203(@OriginalArg(0) Class44_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean444 = arg1;
		this.aClass44_Sub2_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)V")
	@Override
	public void method5230() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b(100);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt5975 = 0;
		this.anInt5974 = 0;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method5103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		return this.method5102(arg1, arg0) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt5975, this.aBoolean444 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5101() {
		if (this.aBoolean443 && hl.a((byte) -94, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean443 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5100() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(11) boolean local11 = this.aBoolean444 & true;
		if (!this.aBoolean443 && hl.a((byte) 112, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt5974, local11 ? 8192 : 0, this.aClass44_Sub2_Sub2_4.aGeometryBuffer1))) {
			this.aBoolean443 = true;
			return this.aClass44_Sub2_Sub2_4.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)I")
	@Override
	public int method5223() {
		return this.anInt5975;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIZ)Z")
	@Override
	public boolean method5102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5975 = arg1;
		this.aByte65 = (byte) arg0;
		if (this.anInt5974 < this.anInt5975) {
			@Pc(24) short local24 = 8;
			@Pc(29) byte local29;
			if (this.aBoolean444) {
				local29 = 0;
				local24 = 520;
			} else {
				local29 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b(100);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass44_Sub2_Sub2_4.anIDirect3DDevice1.a(this.anInt5975, local24, 0, local29, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt5974 = this.anInt5975;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(B)I")
	public int method5105() {
		return this.aByte65;
	}
}
