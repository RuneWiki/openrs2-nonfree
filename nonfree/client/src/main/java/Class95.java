import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.kg;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class95 implements Interface26 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "B")
	private byte aByte28;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	private int anInt3517;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
	private int anInt3518;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "Z")
	private boolean aBoolean278 = false;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Z")
	private final boolean aBoolean277;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "Lclient!bea;")
	private final Class5_Sub2_Sub1 aClass5_Sub2_Sub1_3;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!bea;Z)V")
	public Class95(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean277 = arg1;
		this.aClass5_Sub2_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I")
	public int method2996() {
		return this.aByte28;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method8108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		return this.method8109(arg1, arg0) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt3517, this.aBoolean277 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method8109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3517 = arg1;
		this.aByte28 = (byte) arg0;
		if (this.anInt3518 < this.anInt3517) {
			@Pc(25) short local25 = 8;
			@Pc(30) byte local30;
			if (this.aBoolean277) {
				local30 = 0;
				local25 = 520;
			} else {
				local30 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b(119);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass5_Sub2_Sub1_3.anIDirect3DDevice1.a(this.anInt3517, local25, 0, local30, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt3518 = this.anInt3517;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8110() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(19) boolean local19 = this.aBoolean277 & true;
		if (!this.aBoolean278 && kg.a(-21593, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt3518, local19 ? 8192 : 0, this.aClass5_Sub2_Sub1_3.aGeometryBuffer1))) {
			this.aBoolean278 = true;
			return this.aClass5_Sub2_Sub1_3.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I")
	@Override
	public int method8094() {
		return this.anInt3517;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8107() {
		if (this.aBoolean278 && kg.a(-21593, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean278 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	@Override
	public void method8104() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b(112);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt3517 = 0;
		this.anInt3518 = 0;
	}
}
