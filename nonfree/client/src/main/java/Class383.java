import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.saa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class383 implements Interface12 {

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
	private int anInt10501;

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
	private int anInt10502;

	@OriginalMember(owner = "client!wba", name = "e", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!wba", name = "f", descriptor = "B")
	private byte aByte148;

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "Z")
	private boolean aBoolean732 = false;

	@OriginalMember(owner = "client!wba", name = "g", descriptor = "Lclient!sga;")
	private final Class132_Sub1_Sub2 aClass132_Sub1_Sub2_8;

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "Z")
	private final boolean aBoolean731;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!sga;Z)V")
	public Class383(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass132_Sub1_Sub2_8 = arg0;
		this.aBoolean731 = arg1;
	}

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "(I)I")
	public int method8892() {
		return this.aByte148;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)I")
	@Override
	public int method8886() {
		return this.anInt10501;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method8890(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		return this.method8889(arg2, arg0) ? this.anIDirect3DVertexBuffer1.a(arg1, 0, 0, this.anInt10501, this.aBoolean731 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
	@Override
	public void method8887() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(-5017);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt10502 = 0;
		this.anInt10501 = 0;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8888() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(21) boolean local21 = this.aBoolean731 & true;
		if (!this.aBoolean732 && saa.b(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt10502, local21 ? 8192 : 0, this.aClass132_Sub1_Sub2_8.aGeometryBuffer1), (byte) -82)) {
			this.aBoolean732 = true;
			return this.aClass132_Sub1_Sub2_8.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8891() {
		if (this.aBoolean732 && saa.b(this.anIDirect3DVertexBuffer1.Unlock(), (byte) 120)) {
			this.aBoolean732 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIZ)Z")
	@Override
	public boolean method8889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10501 = arg0;
		this.aByte148 = (byte) arg1;
		if (this.anInt10502 < this.anInt10501) {
			@Pc(17) short local17 = 8;
			@Pc(26) byte local26;
			if (this.aBoolean731) {
				local17 = 520;
				local26 = 0;
			} else {
				local26 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(-5017);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass132_Sub1_Sub2_8.anIDirect3DDevice1.a(this.anInt10501, local17, 0, local26, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt10502 = this.anInt10501;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}
}
