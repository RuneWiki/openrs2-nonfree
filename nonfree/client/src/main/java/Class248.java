import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.dm;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class248 implements Interface19 {

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "B")
	private byte aByte92;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
	private int anInt7755;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
	private int anInt7756;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "Z")
	private boolean aBoolean573 = false;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "Z")
	private final boolean aBoolean572;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "Lclient!nca;")
	private final Class39_Sub2_Sub1 aClass39_Sub2_Sub1_7;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!nca;Z)V")
	public Class248(@OriginalArg(0) Class39_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean572 = arg1;
		this.aClass39_Sub2_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIB)Z")
	@Override
	public boolean method6493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte92 = (byte) arg1;
		this.anInt7756 = arg0;
		if (this.anInt7756 > this.anInt7755) {
			@Pc(22) short local22 = 8;
			@Pc(31) byte local31;
			if (this.aBoolean572) {
				local22 = 520;
				local31 = 0;
			} else {
				local31 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a((byte) -27);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass39_Sub2_Sub1_7.anIDirect3DDevice1.a(this.anInt7756, local22, 0, local31, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt7755 = this.anInt7756;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	@Override
	public boolean method6489(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method6493(arg1, arg2) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt7756, this.aBoolean572 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6952() {
		@Pc(4) boolean local4 = this.aBoolean572 & true;
		if (!this.aBoolean573 && dm.a((int) 7155, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt7755, local4 ? 8192 : 0, this.aClass39_Sub2_Sub1_7.aGeometryBuffer1))) {
			this.aBoolean573 = true;
			return this.aClass39_Sub2_Sub1_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)I")
	@Override
	public int method6941() {
		return this.anInt7756;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
	@Override
	public void method6953() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a((byte) -27);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt7756 = 0;
		this.anInt7755 = 0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6954() {
		if (this.aBoolean573 && dm.a((int) 7155, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean573 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)I")
	public int method6494() {
		return this.aByte92;
	}
}
