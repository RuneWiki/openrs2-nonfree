import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.co;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class72 implements Interface17 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
	private int anInt2328;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
	private int anInt2329;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "B")
	private byte aByte50;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "Z")
	private boolean aBoolean171 = false;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!fi;")
	private final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_5;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "Z")
	private final boolean aBoolean170;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!fi;Z)V")
	public Class72(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass100_Sub1_Sub1_5 = arg0;
		this.aBoolean170 = arg1;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)I")
	public int method1960() {
		return this.aByte50;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method8440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte50 = (byte) arg0;
		this.anInt2328 = arg1;
		if (this.anInt2328 > this.anInt2329) {
			@Pc(19) short local19 = 8;
			@Pc(24) byte local24;
			if (this.aBoolean170) {
				local24 = 0;
				local19 = 520;
			} else {
				local24 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a((byte) 127);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass100_Sub1_Sub1_5.anIDirect3DDevice1.a(this.anInt2328, local19, 0, local24, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt2329 = this.anInt2328;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1, @OriginalArg(2) int arg2) {
		return this.method8440(arg0, arg2) ? this.anIDirect3DVertexBuffer1.a(arg1, 0, 0, this.anInt2328, this.aBoolean170 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
	@Override
	public int method8428() {
		return this.anInt2328;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8438() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(18) boolean local18 = this.aBoolean170 & true;
		if (!this.aBoolean171 && co.a((byte) 86, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt2329, local18 ? 8192 : 0, this.aClass100_Sub1_Sub1_5.aGeometryBuffer1))) {
			this.aBoolean171 = true;
			return this.aClass100_Sub1_Sub1_5.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
	@Override
	public void method8431() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a((byte) 121);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt2329 = 0;
		this.anInt2328 = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8439() {
		if (this.aBoolean171 && co.a((byte) 46, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean171 = false;
			return true;
		} else {
			return false;
		}
	}
}
