import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.mk;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class101 implements Interface10 {

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "B")
	private byte aByte65;

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
	private int anInt3015;

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "I")
	private int anInt3016;

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "Z")
	private boolean aBoolean232 = false;

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "Lclient!ta;")
	private final Class137_Sub1_Sub2 aClass137_Sub1_Sub2_3;

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "Z")
	private final boolean aBoolean233;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!ta;Z)V")
	public Class101(@OriginalArg(0) Class137_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass137_Sub1_Sub2_3 = arg0;
		this.aBoolean233 = arg1;
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(B)V")
	@Override
	public void method5675() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(29036);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt3016 = 0;
		this.anInt3015 = 0;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3996() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(18) boolean local18 = this.aBoolean233 & true;
		if (!this.aBoolean232 && mk.b(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt3016, local18 ? 8192 : 0, this.aClass137_Sub1_Sub2_3.aGeometryBuffer1), -1)) {
			this.aBoolean232 = true;
			return this.aClass137_Sub1_Sub2_3.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)I")
	public int method2463() {
		return this.aByte65;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3995() {
		if (this.aBoolean232 && mk.b(this.anIDirect3DVertexBuffer1.Unlock(), -1)) {
			this.aBoolean232 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIZ)Z")
	@Override
	public boolean method3994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte65 = (byte) arg1;
		this.anInt3015 = arg0;
		if (this.anInt3016 < this.anInt3015) {
			@Pc(17) short local17 = 8;
			@Pc(22) byte local22;
			if (this.aBoolean233) {
				local17 = 520;
				local22 = 0;
			} else {
				local22 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(29036);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass137_Sub1_Sub2_3.anIDirect3DDevice1.a(this.anInt3015, local17, 0, local22, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt3016 = this.anInt3015;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method3993(@OriginalArg(0) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		return this.method3994(arg2, arg0) ? this.anIDirect3DVertexBuffer1.a(arg1, 0, 0, this.anInt3015, this.aBoolean233 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)I")
	@Override
	public int method5669() {
		return this.anInt3015;
	}
}
