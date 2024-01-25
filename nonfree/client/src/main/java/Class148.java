import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.rl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class148 implements Interface24 {

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
	private int anInt4326;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
	private int anInt4327;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "B")
	private byte aByte54;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "Z")
	private boolean aBoolean329 = false;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Lclient!hg;")
	private final Class43_Sub1_Sub1 aClass43_Sub1_Sub1_5;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Z")
	private final boolean aBoolean328;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!hg;Z)V")
	public Class148(@OriginalArg(0) Class43_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass43_Sub1_Sub1_5 = arg0;
		this.aBoolean328 = arg1;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4803() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(16) boolean local16 = this.aBoolean328 & true;
		if (!this.aBoolean329 && rl.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt4327, local16 ? 8192 : 0, this.aClass43_Sub1_Sub1_5.aGeometryBuffer1), (int) 3102)) {
			this.aBoolean329 = true;
			return this.aClass43_Sub1_Sub1_5.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
	@Override
	public void method6939() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a((byte) -67);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt4327 = 0;
		this.anInt4326 = 0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method4800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Source arg2) {
		return this.method4802(arg0, arg1) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt4326, this.aBoolean328 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)I")
	public int method3838() {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4801() {
		if (this.aBoolean329 && rl.a(this.anIDirect3DVertexBuffer1.Unlock(), (int) 3102)) {
			this.aBoolean329 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)I")
	@Override
	public int method6937() {
		return this.anInt4326;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method4802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte54 = (byte) arg0;
		this.anInt4326 = arg1;
		if (this.anInt4326 > this.anInt4327) {
			@Pc(18) short local18 = 8;
			@Pc(27) byte local27;
			if (this.aBoolean328) {
				local18 = 520;
				local27 = 0;
			} else {
				local27 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a((byte) -67);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass43_Sub1_Sub1_5.anIDirect3DDevice1.a(this.anInt4326, local18, 0, local27, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt4327 = this.anInt4326;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}
}
