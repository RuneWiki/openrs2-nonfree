import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.hia;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class236 implements Interface7 {

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
	private int anInt6685;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
	private int anInt6686;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "B")
	private byte aByte91;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "Z")
	private boolean aBoolean480 = false;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Z")
	private final boolean aBoolean479;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "Lclient!hda;")
	private final Class144_Sub1_Sub1 aClass144_Sub1_Sub1_5;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!hda;Z)V")
	public Class236(@OriginalArg(0) Class144_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean479 = arg1;
		this.aClass144_Sub1_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5840() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(19) boolean local19 = this.aBoolean479 & true;
		if (!this.aBoolean480 && hia.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt6686, local19 ? 8192 : 0, this.aClass144_Sub1_Sub1_5.aGeometryBuffer1), (byte) -123)) {
			this.aBoolean480 = true;
			return this.aClass144_Sub1_Sub1_5.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method5841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6685 = arg1;
		this.aByte91 = (byte) arg0;
		if (this.anInt6685 > this.anInt6686) {
			@Pc(27) short local27 = 8;
			@Pc(32) byte local32;
			if (this.aBoolean479) {
				local32 = 0;
				local27 = 520;
			} else {
				local32 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b(80);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass144_Sub1_Sub1_5.anIDirect3DDevice1.a(this.anInt6685, local27, 0, local32, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt6686 = this.anInt6685;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I")
	public int method5845() {
		return this.aByte91;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)I")
	@Override
	public int method5839() {
		return this.anInt6685;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IIZ)Z")
	@Override
	public boolean method5844(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method5841(arg2, arg1) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt6685, this.aBoolean479 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5843() {
		if (this.aBoolean480 && hia.a(this.anIDirect3DVertexBuffer1.Unlock(), (byte) -123)) {
			this.aBoolean480 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	@Override
	public void method5842() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b(126);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt6686 = 0;
		this.anInt6685 = 0;
	}
}
