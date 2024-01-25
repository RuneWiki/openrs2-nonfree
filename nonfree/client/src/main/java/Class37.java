import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.gh;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bia")
public final class Class37 implements Interface15 {

	@OriginalMember(owner = "client!bia", name = "f", descriptor = "I")
	private int anInt667;

	@OriginalMember(owner = "client!bia", name = "g", descriptor = "B")
	private byte aByte15;

	@OriginalMember(owner = "client!bia", name = "d", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "I")
	private int anInt668;

	@OriginalMember(owner = "client!bia", name = "c", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!bia", name = "e", descriptor = "Lclient!er;")
	private final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_2;

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "Z")
	private final boolean aBoolean44;

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lclient!er;Z)V")
	public Class37(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass100_Sub1_Sub1_2 = arg0;
		this.aBoolean44 = arg1;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5735() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(20) boolean local20 = this.aBoolean44 & true;
		if (!this.aBoolean43 && gh.a(-2005530585, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt667, local20 ? 8192 : 0, this.aClass100_Sub1_Sub1_2.aGeometryBuffer1))) {
			this.aBoolean43 = true;
			return this.aClass100_Sub1_Sub1_2.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(Z)I")
	public int method739() {
		return this.aByte15;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method5732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		return this.method5733(arg1, arg0) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt668, this.aBoolean44 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(Z)I")
	@Override
	public int method7346() {
		return this.anInt668;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)V")
	@Override
	public void method7351() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(-1);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt667 = 0;
		this.anInt668 = 0;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5734() {
		if (this.aBoolean43 && gh.a(-2005530585, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean43 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(BII)Z")
	@Override
	public boolean method5733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte15 = (byte) arg1;
		this.anInt668 = arg0;
		if (this.anInt667 < this.anInt668) {
			@Pc(28) short local28 = 8;
			@Pc(37) byte local37;
			if (this.aBoolean44) {
				local28 = 520;
				local37 = 0;
			} else {
				local37 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(-120);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass100_Sub1_Sub1_2.anIDirect3DDevice1.a(this.anInt668, local28, 0, local37, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt667 = this.anInt668;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}
}
