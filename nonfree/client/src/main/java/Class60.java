import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.dt;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class60 implements Interface16 {

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
	private int anInt1817;

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
	private int anInt1818;

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "B")
	private byte aByte26;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "Z")
	private boolean aBoolean148 = false;

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "Z")
	private final boolean aBoolean149;

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "Lclient!hg;")
	private final Class4_Sub2_Sub1 aClass4_Sub2_Sub1_3;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lclient!hg;Z)V")
	public Class60(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean149 = arg1;
		this.aClass4_Sub2_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method7615(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1, @OriginalArg(3) int arg2) {
		return this.method7616(arg0, arg2) ? this.anIDirect3DVertexBuffer1.a(arg1, 0, 0, this.anInt1818, this.aBoolean149 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7613() {
		@Pc(13) boolean local13 = this.aBoolean149 & true;
		if (!this.aBoolean148 && dt.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt1817, local13 ? 8192 : 0, this.aClass4_Sub2_Sub1_3.aGeometryBuffer1), -2005530590)) {
			this.aBoolean148 = true;
			return this.aClass4_Sub2_Sub1_3.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)I")
	@Override
	public int method7605() {
		return this.anInt1818;
	}

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7614() {
		if (this.aBoolean148 && dt.a(this.anIDirect3DVertexBuffer1.Unlock(), -2005530590)) {
			this.aBoolean148 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)V")
	@Override
	public void method7609() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b(-11385);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt1817 = 0;
		this.anInt1818 = 0;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ZII)Z")
	@Override
	public boolean method7616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1818 = arg0;
		this.aByte26 = (byte) arg1;
		if (this.anInt1817 < this.anInt1818) {
			@Pc(18) short local18 = 8;
			@Pc(27) byte local27;
			if (this.aBoolean149) {
				local18 = 520;
				local27 = 0;
			} else {
				local27 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b(-11385);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass4_Sub2_Sub1_3.anIDirect3DDevice1.a(this.anInt1818, local18, 0, local27, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt1817 = this.anInt1818;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "(I)I")
	public int method1762() {
		return this.aByte26;
	}
}
