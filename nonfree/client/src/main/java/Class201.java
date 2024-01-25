import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.te;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class201 implements Interface23 {

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "B")
	private byte aByte60;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
	private int anInt5568;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
	private int anInt5569;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "Z")
	private boolean aBoolean355 = false;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "Lclient!ui;")
	private final Class121_Sub2_Sub2 aClass121_Sub2_Sub2_5;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "Z")
	private final boolean aBoolean356;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!ui;Z)V")
	public Class201(@OriginalArg(0) Class121_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass121_Sub2_Sub2_5 = arg0;
		this.aBoolean356 = arg1;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method7571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte60 = (byte) arg0;
		this.anInt5568 = arg1;
		if (this.anInt5569 < this.anInt5568) {
			@Pc(22) short local22 = 8;
			@Pc(27) byte local27;
			if (this.aBoolean356) {
				local27 = 0;
				local22 = 520;
			} else {
				local27 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a((byte) -40);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass121_Sub2_Sub2_5.anIDirect3DDevice1.a(this.anInt5568, local22, 0, local27, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt5569 = this.anInt5568;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I")
	public int method4804() {
		return this.aByte60;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7563() {
		if (this.aBoolean355 && te.a(2005530599, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean355 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	@Override
	public void method7567() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a((byte) -21);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt5568 = 0;
		this.anInt5569 = 0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	@Override
	public boolean method7570(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method7571(arg1, arg2) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt5568, this.aBoolean356 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)I")
	@Override
	public int method7559() {
		return this.anInt5568;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7569() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(11) boolean local11 = this.aBoolean356 & true;
		if (!this.aBoolean355 && te.a(2005530599, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt5569, local11 ? 8192 : 0, this.aClass121_Sub2_Sub2_5.aGeometryBuffer1))) {
			this.aBoolean355 = true;
			return this.aClass121_Sub2_Sub2_5.aGeometryBuffer1;
		} else {
			return null;
		}
	}
}
