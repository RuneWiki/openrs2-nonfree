import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.oo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class197 implements Interface3 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	private int anInt5988;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "B")
	private byte aByte88;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
	private int anInt5989;

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "Z")
	private boolean aBoolean528 = false;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "Z")
	private final boolean aBoolean529;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "Lclient!cka;")
	private final Class65_Sub2_Sub1 aClass65_Sub2_Sub1_3;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!cka;Z)V")
	public Class197(@OriginalArg(0) Class65_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean529 = arg1;
		this.aClass65_Sub2_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)I")
	public int method4979() {
		return this.aByte88;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method8244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5988 = arg0;
		this.aByte88 = (byte) arg1;
		if (this.anInt5988 > this.anInt5989) {
			@Pc(13) short local13 = 8;
			@Pc(18) byte local18;
			if (this.aBoolean529) {
				local13 = 520;
				local18 = 0;
			} else {
				local18 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(true);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass65_Sub2_Sub1_3.anIDirect3DDevice1.a(this.anInt5988, local13, 0, local18, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt5989 = this.anInt5988;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	@Override
	public void method8235() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(true);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt5989 = 0;
		this.anInt5988 = 0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method8246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		return this.method8244(arg0, arg1) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt5988, this.aBoolean529 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8245() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean529 & true;
		if (!this.aBoolean528 && oo.a(false, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt5989, local9 ? 8192 : 0, this.aClass65_Sub2_Sub1_3.aGeometryBuffer1))) {
			this.aBoolean528 = true;
			return this.aClass65_Sub2_Sub1_3.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)I")
	@Override
	public int method8232() {
		return this.anInt5988;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8243() {
		if (this.aBoolean528 && oo.a(false, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean528 = false;
			return true;
		} else {
			return false;
		}
	}
}
