import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.qi;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class285 implements Interface19 {

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "B")
	private byte aByte97;

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
	private int anInt7497;

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "I")
	private int anInt7498;

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "Z")
	private boolean aBoolean566 = false;

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "Z")
	private final boolean aBoolean567;

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "Lclient!eda;")
	private final Class45_Sub2_Sub1 aClass45_Sub2_Sub1_5;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!eda;Z)V")
	public Class285(@OriginalArg(0) Class45_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean567 = arg1;
		this.aClass45_Sub2_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)I")
	@Override
	public int method6432() {
		return this.anInt7497;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIB)Z")
	@Override
	public boolean method6255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte97 = (byte) arg1;
		this.anInt7497 = arg0;
		if (this.anInt7497 > this.anInt7498) {
			@Pc(26) short local26 = 8;
			@Pc(31) byte local31;
			if (this.aBoolean567) {
				local31 = 0;
				local26 = 520;
			} else {
				local31 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b(-127);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass45_Sub2_Sub1_5.anIDirect3DDevice1.a(this.anInt7497, local26, 0, local31, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt7498 = this.anInt7497;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6252() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean567 & true;
		if (!this.aBoolean566 && qi.a((byte) 35, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt7498, local9 ? 8192 : 0, this.aClass45_Sub2_Sub1_5.aGeometryBuffer1))) {
			this.aBoolean566 = true;
			return this.aClass45_Sub2_Sub1_5.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(B)V")
	@Override
	public void method6436() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b(-128);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt7498 = 0;
		this.anInt7497 = 0;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method6254(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		return this.method6255(arg2, arg0) ? this.anIDirect3DVertexBuffer1.a(arg1, 0, 0, this.anInt7497, this.aBoolean567 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)I")
	public int method6256() {
		return this.aByte97;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6251() {
		if (this.aBoolean566 && qi.a((byte) 35, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean566 = false;
			return true;
		} else {
			return false;
		}
	}
}
