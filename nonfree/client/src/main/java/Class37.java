import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.em;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class37 implements Interface22 {

	@OriginalMember(owner = "client!br", name = "b", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!br", name = "c", descriptor = "B")
	private byte aByte13;

	@OriginalMember(owner = "client!br", name = "d", descriptor = "I")
	private int anInt974;

	@OriginalMember(owner = "client!br", name = "e", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!br", name = "g", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "Z")
	private final boolean aBoolean49;

	@OriginalMember(owner = "client!br", name = "f", descriptor = "Lclient!kfa;")
	private final Class82_Sub3_Sub2 aClass82_Sub3_Sub2_2;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!kfa;Z)V")
	public Class37(@OriginalArg(0) Class82_Sub3_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean49 = arg1;
		this.aClass82_Sub3_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)I")
	public int method932() {
		return this.aByte13;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BII)Z")
	@Override
	public boolean method1387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte13 = (byte) arg0;
		this.anInt974 = arg1;
		if (this.anInt974 > this.anInt973) {
			@Pc(18) short local18 = 8;
			@Pc(23) byte local23;
			if (this.aBoolean49) {
				local23 = 0;
				local18 = 520;
			} else {
				local23 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b(-10573);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass82_Sub3_Sub2_2.anIDirect3DDevice1.a(this.anInt974, local18, 0, local23, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt973 = this.anInt974;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIZLclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method1388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Source arg2) {
		return this.method1387(arg1, arg0) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt974, this.aBoolean49 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method1390() {
		if (this.aBoolean50 && em.a(this.anIDirect3DVertexBuffer1.Unlock(), (int) -1)) {
			this.aBoolean50 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!br", name = "d", descriptor = "(I)I")
	@Override
	public int method7561() {
		return this.anInt974;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method1389() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(11) boolean local11 = this.aBoolean49 & true;
		if (!this.aBoolean50 && em.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt973, local11 ? 8192 : 0, this.aClass82_Sub3_Sub2_2.aGeometryBuffer1), (int) -1)) {
			this.aBoolean50 = true;
			return this.aClass82_Sub3_Sub2_2.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	@Override
	public void method7572() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b(-10573);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt973 = 0;
		this.anInt974 = 0;
	}
}
