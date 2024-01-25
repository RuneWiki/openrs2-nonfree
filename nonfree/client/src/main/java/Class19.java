import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.hc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class19 implements Interface25 {

	@OriginalMember(owner = "client!an", name = "e", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "I")
	private int anInt343;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "B")
	private byte aByte10;

	@OriginalMember(owner = "client!an", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "Lclient!sd;")
	private final Class57_Sub3_Sub2 aClass57_Sub3_Sub2_1;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "Z")
	private final boolean aBoolean35;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!sd;Z)V")
	public Class19(@OriginalArg(0) Class57_Sub3_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass57_Sub3_Sub2_1 = arg0;
		this.aBoolean35 = arg1;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method2907(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt343 = arg1;
		this.aByte10 = (byte) arg0;
		if (this.anInt343 > this.anInt342) {
			@Pc(27) short local27 = 8;
			@Pc(32) byte local32;
			if (this.aBoolean35) {
				local32 = 0;
				local27 = 520;
			} else {
				local32 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(115);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass57_Sub3_Sub2_1.anIDirect3DDevice1.a(this.anInt343, local27, 0, local32, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt342 = this.anInt343;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method2908() {
		if (this.aBoolean36 && hc.a(this.anIDirect3DVertexBuffer1.Unlock(), true)) {
			this.aBoolean36 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)I")
	public int method341() {
		return this.aByte10;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)I")
	@Override
	public int method2915() {
		return this.anInt343;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method2906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Source arg2) {
		return this.method2907(arg0, arg1) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt343, this.aBoolean35 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
	@Override
	public void method2921() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(114);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt342 = 0;
		this.anInt343 = 0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method2909() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(17) boolean local17 = this.aBoolean35 & true;
		if (!this.aBoolean36 && hc.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt342, local17 ? 8192 : 0, this.aClass57_Sub3_Sub2_1.aGeometryBuffer1), true)) {
			this.aBoolean36 = true;
			return this.aClass57_Sub3_Sub2_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}
}
