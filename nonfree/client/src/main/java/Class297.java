import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.ud;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class297 implements Interface15 {

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
	private int anInt8223;

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "B")
	private byte aByte116;

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
	private int anInt8224;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "Z")
	private boolean aBoolean625 = false;

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "Lclient!rja;")
	private final Class13_Sub1_Sub2 aClass13_Sub1_Sub2_7;

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "Z")
	private final boolean aBoolean626;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!rja;Z)V")
	public Class297(@OriginalArg(0) Class13_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass13_Sub1_Sub2_7 = arg0;
		this.aBoolean626 = arg1;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)I")
	@Override
	public int method8734() {
		return this.anInt8224;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
	@Override
	public void method8737() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b((byte) -70);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt8224 = 0;
		this.anInt8223 = 0;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8744() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(16) boolean local16 = this.aBoolean626 & true;
		if (!this.aBoolean625 && ud.a(0, (int) this.anIDirect3DVertexBuffer1.Lock(0, this.anInt8223, local16 ? 8192 : 0, this.aClass13_Sub1_Sub2_7.aGeometryBuffer1))) {
			this.aBoolean625 = true;
			return this.aClass13_Sub1_Sub2_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method8746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8224 = arg0;
		this.aByte116 = (byte) arg1;
		if (this.anInt8224 > this.anInt8223) {
			@Pc(18) short local18 = 8;
			@Pc(23) byte local23;
			if (this.aBoolean626) {
				local23 = 0;
				local18 = 520;
			} else {
				local23 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b((byte) -70);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass13_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt8224, local18, 0, local23, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt8223 = this.anInt8224;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "(I)I")
	public int method7208() {
		return this.aByte116;
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8747() {
		if (this.aBoolean625 && ud.a(0, (int) this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean625 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method8745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Source arg2) {
		return this.method8746(arg0, arg1) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt8224, this.aBoolean626 ? 8192 : 0) : false;
	}
}
