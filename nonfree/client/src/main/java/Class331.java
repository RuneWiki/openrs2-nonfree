import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.wd;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class331 implements Interface16 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "I")
	private int anInt8854;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "B")
	private byte aByte115;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "I")
	private int anInt8855;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Z")
	private boolean aBoolean667 = false;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Z")
	private final boolean aBoolean666;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!rd;")
	private final Class95_Sub3_Sub1 aClass95_Sub3_Sub1_7;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!rd;Z)V")
	public Class331(@OriginalArg(0) Class95_Sub3_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean666 = arg1;
		this.aClass95_Sub3_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	@Override
	public void method7459() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a((byte) -115);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt8855 = 0;
		this.anInt8854 = 0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7456() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(18) boolean local18 = this.aBoolean666 & true;
		if (!this.aBoolean667 && wd.a(119, (int) this.anIDirect3DVertexBuffer1.Lock(0, this.anInt8854, local18 ? 8192 : 0, this.aClass95_Sub3_Sub1_7.aGeometryBuffer1))) {
			this.aBoolean667 = true;
			return this.aClass95_Sub3_Sub1_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7458() {
		if (this.aBoolean667 && wd.a(43, (int) this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean667 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method7457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte115 = (byte) arg1;
		this.anInt8855 = arg0;
		if (this.anInt8855 > this.anInt8854) {
			@Pc(18) short local18 = 8;
			@Pc(23) byte local23;
			if (this.aBoolean666) {
				local18 = 520;
				local23 = 0;
			} else {
				local23 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a((byte) -116);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass95_Sub3_Sub1_7.anIDirect3DDevice1.a(this.anInt8855, local18, 0, local23, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt8854 = this.anInt8855;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)I")
	public int method7461() {
		return this.aByte115;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(Z)I")
	@Override
	public int method7455() {
		return this.anInt8855;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	@Override
	public boolean method7460(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method7457(arg2, arg1) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt8855, this.aBoolean666 ? 8192 : 0) : false;
	}
}
