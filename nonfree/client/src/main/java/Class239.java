import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.mo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class239 implements Interface5 {

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "B")
	private byte aByte95;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
	private int anInt6845;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
	private int anInt6846;

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "Z")
	private boolean aBoolean497 = false;

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "Lclient!hv;")
	private final Class122_Sub2_Sub1 aClass122_Sub2_Sub1_7;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "Z")
	private final boolean aBoolean496;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!hv;Z)V")
	public Class239(@OriginalArg(0) Class122_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass122_Sub2_Sub1_7 = arg0;
		this.aBoolean496 = arg1;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5730() {
		if (this.aBoolean497 && mo.b(this.anIDirect3DVertexBuffer1.Unlock(), 28658)) {
			this.aBoolean497 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)I")
	@Override
	public int method5726() {
		return this.anInt6846;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)I")
	public int method5732() {
		return this.aByte95;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
	@Override
	public void method5728() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b((byte) 87);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt6846 = 0;
		this.anInt6845 = 0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte95 = (byte) arg1;
		this.anInt6846 = arg0;
		if (this.anInt6846 > this.anInt6845) {
			@Pc(21) short local21 = 8;
			@Pc(26) byte local26;
			if (this.aBoolean496) {
				local26 = 0;
				local21 = 520;
			} else {
				local26 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b((byte) 87);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass122_Sub2_Sub1_7.anIDirect3DDevice1.a(this.anInt6846, local21, 0, local26, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt6845 = this.anInt6846;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IBI)Z")
	@Override
	public boolean method5731(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.method5727(arg1, arg2) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt6846, this.aBoolean496 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5729() {
		@Pc(4) boolean local4 = this.aBoolean496 & true;
		if (!this.aBoolean497 && mo.b(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt6845, local4 ? 8192 : 0, this.aClass122_Sub2_Sub1_7.aGeometryBuffer1), 28658)) {
			this.aBoolean497 = true;
			return this.aClass122_Sub2_Sub1_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}
}
