import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.ck;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class61 implements Interface6 {

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
	private int anInt1251;

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "B")
	private byte aByte21;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
	private int anInt1252;

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "Z")
	private boolean aBoolean104 = false;

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "Lclient!os;")
	private final Class75_Sub1_Sub2 aClass75_Sub1_Sub2_1;

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "Z")
	private final boolean aBoolean105;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!os;Z)V")
	public Class61(@OriginalArg(0) Class75_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass75_Sub1_Sub2_1 = arg0;
		this.aBoolean105 = arg1;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3658() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean105 & true;
		if (!this.aBoolean104 && ck.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt1251, local9 ? 8192 : 0, this.aClass75_Sub1_Sub2_1.aGeometryBuffer1), -1)) {
			this.aBoolean104 = true;
			return this.aClass75_Sub1_Sub2_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method3659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1252 = arg0;
		this.aByte21 = (byte) arg1;
		if (this.anInt1251 < this.anInt1252) {
			@Pc(28) short local28 = 8;
			@Pc(33) byte local33;
			if (this.aBoolean105) {
				local28 = 520;
				local33 = 0;
			} else {
				local33 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(true);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass75_Sub1_Sub2_1.anIDirect3DDevice1.a(this.anInt1252, local28, 0, local33, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt1251 = this.anInt1252;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)I")
	public int method1203() {
		return this.aByte21;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method3660(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method3659(arg2, arg1) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt1252, this.aBoolean105 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3657() {
		if (this.aBoolean104 && ck.a(this.anIDirect3DVertexBuffer1.Unlock(), -1)) {
			this.aBoolean104 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V")
	@Override
	public void method8675() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(true);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt1252 = 0;
		this.anInt1251 = 0;
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)I")
	@Override
	public int method8674() {
		return this.anInt1252;
	}
}
