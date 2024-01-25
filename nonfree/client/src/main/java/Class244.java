import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.vq;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class244 implements Interface11 {

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "B")
	private byte aByte103;

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "I")
	private int anInt7318;

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
	private int anInt7319;

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "Z")
	private boolean aBoolean519 = false;

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "Lclient!ad;")
	private final Class5_Sub1_Sub1 aClass5_Sub1_Sub1_7;

	@OriginalMember(owner = "client!oda", name = "f", descriptor = "Z")
	private final boolean aBoolean520;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Lclient!ad;Z)V")
	public Class244(@OriginalArg(0) Class5_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass5_Sub1_Sub1_7 = arg0;
		this.aBoolean520 = arg1;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method6376(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1, @OriginalArg(3) int arg2) {
		return this.method6373(arg2, arg0) ? this.anIDirect3DVertexBuffer1.a(arg1, 0, 0, this.anInt7318, this.aBoolean520 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
	@Override
	public void method7982() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a((byte) -118);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt7318 = 0;
		this.anInt7319 = 0;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method6373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte103 = (byte) arg0;
		this.anInt7318 = arg1;
		if (this.anInt7318 > this.anInt7319) {
			@Pc(25) short local25 = 8;
			@Pc(30) byte local30;
			if (this.aBoolean520) {
				local30 = 0;
				local25 = 520;
			} else {
				local30 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a((byte) -98);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass5_Sub1_Sub1_7.anIDirect3DDevice1.a(this.anInt7318, local25, 0, local30, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt7319 = this.anInt7318;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Z)I")
	@Override
	public int method7980() {
		return this.anInt7318;
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)I")
	public int method6377() {
		return this.aByte103;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6374() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(10) boolean local10 = this.aBoolean520 & true;
		if (!this.aBoolean519 && vq.b(-2005530516, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt7319, local10 ? 8192 : 0, this.aClass5_Sub1_Sub1_7.aGeometryBuffer1))) {
			this.aBoolean519 = true;
			return this.aClass5_Sub1_Sub1_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6375() {
		if (this.aBoolean519 && vq.b(-2005530516, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean519 = false;
			return true;
		} else {
			return false;
		}
	}
}
