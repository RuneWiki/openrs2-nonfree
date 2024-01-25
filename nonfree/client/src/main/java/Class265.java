import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.hb;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class265 implements Interface20 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
	private int anInt7817;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "B")
	private byte aByte95;

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
	private int anInt7818;

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "Z")
	private boolean aBoolean578 = false;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "Z")
	private final boolean aBoolean579;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "Lclient!gb;")
	private final Class9_Sub3_Sub1 aClass9_Sub3_Sub1_7;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!gb;Z)V")
	public Class265(@OriginalArg(0) Class9_Sub3_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean579 = arg1;
		this.aClass9_Sub3_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method6523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte95 = (byte) arg1;
		this.anInt7818 = arg0;
		if (this.anInt7817 < this.anInt7818) {
			@Pc(29) short local29 = 8;
			@Pc(34) byte local34;
			if (this.aBoolean579) {
				local29 = 520;
				local34 = 0;
			} else {
				local34 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a((byte) -34);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass9_Sub3_Sub1_7.anIDirect3DDevice1.a(this.anInt7818, local29, 0, local34, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt7817 = this.anInt7818;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V")
	@Override
	public void method6520() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a((byte) -34);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt7818 = 0;
		this.anInt7817 = 0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I")
	@Override
	public int method6519() {
		return this.anInt7818;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IBI)Z")
	@Override
	public boolean method6522(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method6523(arg2, arg1) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt7818, this.aBoolean579 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6521() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(10) boolean local10 = this.aBoolean579 & true;
		if (!this.aBoolean578 && hb.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt7817, local10 ? 8192 : 0, this.aClass9_Sub3_Sub1_7.aGeometryBuffer1), (byte) -49)) {
			this.aBoolean578 = true;
			return this.aClass9_Sub3_Sub1_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)I")
	public int method6525() {
		return this.aByte95;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6524() {
		if (this.aBoolean578 && hb.a(this.anIDirect3DVertexBuffer1.Unlock(), (byte) -109)) {
			this.aBoolean578 = false;
			return true;
		} else {
			return false;
		}
	}
}
