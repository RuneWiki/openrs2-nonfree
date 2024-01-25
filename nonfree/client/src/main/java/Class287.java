import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.vba;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class287 implements Interface8 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
	private int anInt8138;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "B")
	private byte aByte90;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	private int anInt8139;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Z")
	private boolean aBoolean526 = false;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!vg;")
	private final Class90_Sub3_Sub2 aClass90_Sub3_Sub2_7;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Z")
	private final boolean aBoolean527;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!vg;Z)V")
	public Class287(@OriginalArg(0) Class90_Sub3_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass90_Sub3_Sub2_7 = arg0;
		this.aBoolean527 = arg1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)I")
	@Override
	public int method6458() {
		return this.anInt8138;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method6459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		return this.method6463(arg0, arg1) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt8138, this.aBoolean527 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)I")
	public int method6464() {
		return this.aByte90;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
	@Override
	public void method6461() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b(21066);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt8138 = 0;
		this.anInt8139 = 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6462() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(16) boolean local16 = this.aBoolean527 & true;
		if (!this.aBoolean526 && vba.a(-1, (int) this.anIDirect3DVertexBuffer1.Lock(0, this.anInt8139, local16 ? 8192 : 0, this.aClass90_Sub3_Sub2_7.aGeometryBuffer1))) {
			this.aBoolean526 = true;
			return this.aClass90_Sub3_Sub2_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6460() {
		if (this.aBoolean526 && vba.a(-1, (int) this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean526 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)Z")
	@Override
	public boolean method6463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8138 = arg0;
		this.aByte90 = (byte) arg1;
		if (this.anInt8139 < this.anInt8138) {
			@Pc(26) short local26 = 8;
			@Pc(31) byte local31;
			if (this.aBoolean527) {
				local26 = 520;
				local31 = 0;
			} else {
				local31 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b(21066);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass90_Sub3_Sub2_7.anIDirect3DDevice1.a(this.anInt8138, local26, 0, local31, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt8139 = this.anInt8138;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}
}
