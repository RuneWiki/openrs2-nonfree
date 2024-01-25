import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.ae;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class176 implements Interface23 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
	private int anInt4540;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "B")
	private byte aByte64;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
	private int anInt4541;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "Z")
	private boolean aBoolean341 = false;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Lclient!ega;")
	private final Class78_Sub1_Sub1 aClass78_Sub1_Sub1_4;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Z")
	private final boolean aBoolean340;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!ega;Z)V")
	public Class176(@OriginalArg(0) Class78_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass78_Sub1_Sub1_4 = arg0;
		this.aBoolean340 = arg1;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method5569(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4540 = arg0;
		this.aByte64 = (byte) arg1;
		if (this.anInt4541 < this.anInt4540) {
			@Pc(21) short local21 = 8;
			@Pc(26) byte local26;
			if (this.aBoolean340) {
				local21 = 520;
				local26 = 0;
			} else {
				local26 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b(107);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass78_Sub1_Sub1_4.anIDirect3DDevice1.a(this.anInt4540, local21, 0, local26, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt4541 = this.anInt4540;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5572() {
		if (this.aBoolean341 && ae.a((byte) 106, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean341 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)I")
	@Override
	public int method5598() {
		return this.anInt4540;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
	@Override
	public void method5601() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b(116);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt4541 = 0;
		this.anInt4540 = 0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5570() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(18) boolean local18 = this.aBoolean340 & true;
		if (!this.aBoolean341 && ae.a((byte) 109, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt4541, local18 ? 8192 : 0, this.aClass78_Sub1_Sub1_4.aGeometryBuffer1))) {
			this.aBoolean341 = true;
			return this.aClass78_Sub1_Sub1_4.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)I")
	public int method3636() {
		return this.aByte64;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	@Override
	public boolean method5571(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method5569(arg2, arg1) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt4540, this.aBoolean340 ? 8192 : 0) : false;
	}
}
