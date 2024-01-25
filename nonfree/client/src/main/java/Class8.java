import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.rn;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class8 implements Interface16 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
	private int anInt96;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
	private int anInt97;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "B")
	private byte aByte10;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Z")
	private boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!aia;")
	private final Class16_Sub1_Sub1 aClass16_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Z")
	private final boolean aBoolean13;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!aia;Z)V")
	public Class8(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass16_Sub1_Sub1_1 = arg0;
		this.aBoolean13 = arg1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BII)Z")
	@Override
	public boolean method6040(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt97 = arg0;
		this.aByte10 = (byte) arg1;
		if (this.anInt97 > this.anInt96) {
			@Pc(21) short local21 = 8;
			@Pc(26) byte local26;
			if (this.aBoolean13) {
				local26 = 0;
				local21 = 520;
			} else {
				local26 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(-6517);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass16_Sub1_Sub1_1.anIDirect3DDevice1.a(this.anInt97, local21, 0, local26, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt96 = this.anInt97;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	@Override
	public void method7731() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(-6517);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt96 = 0;
		this.anInt97 = 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6039() {
		if (this.aBoolean14 && rn.a(this.anIDirect3DVertexBuffer1.Unlock(), -105)) {
			this.aBoolean14 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)I")
	@Override
	public int method7727() {
		return this.anInt97;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method6038(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method6040(arg2, arg1) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt97, this.aBoolean13 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6041() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(17) boolean local17 = this.aBoolean13 & true;
		if (!this.aBoolean14 && rn.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt96, local17 ? 8192 : 0, this.aClass16_Sub1_Sub1_1.aGeometryBuffer1), -51)) {
			this.aBoolean14 = true;
			return this.aClass16_Sub1_Sub1_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)I")
	public int method86() {
		return this.aByte10;
	}
}
