import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.fma;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aka")
public final class Class15 implements Interface14 {

	@OriginalMember(owner = "client!aka", name = "e", descriptor = "B")
	private byte aByte30;

	@OriginalMember(owner = "client!aka", name = "c", descriptor = "I")
	private int anInt702;

	@OriginalMember(owner = "client!aka", name = "g", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "I")
	private int anInt703;

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!aka", name = "d", descriptor = "Z")
	private final boolean aBoolean45;

	@OriginalMember(owner = "client!aka", name = "f", descriptor = "Lclient!tha;")
	private final Class22_Sub2_Sub1 aClass22_Sub2_Sub1_1;

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(Lclient!tha;Z)V")
	public Class15(@OriginalArg(0) Class22_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean45 = arg1;
		this.aClass22_Sub2_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(IIBLclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method6765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Source arg2) {
		return this.method6767(arg0, arg1) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt703, this.aBoolean45 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(IIZ)Z")
	@Override
	public boolean method6767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte30 = (byte) arg0;
		this.anInt703 = arg1;
		if (this.anInt702 < this.anInt703) {
			@Pc(13) short local13 = 8;
			@Pc(18) byte local18;
			if (this.aBoolean45) {
				local18 = 0;
				local13 = 520;
			} else {
				local18 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a((byte) -90);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass22_Sub2_Sub1_1.anIDirect3DDevice1.a(this.anInt703, local13, 0, local18, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt702 = this.anInt703;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6764() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(12) boolean local12 = this.aBoolean45 & true;
		if (!this.aBoolean46 && fma.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt702, local12 ? 8192 : 0, this.aClass22_Sub2_Sub1_1.aGeometryBuffer1), (byte) -93)) {
			this.aBoolean46 = true;
			return this.aClass22_Sub2_Sub1_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6766() {
		if (this.aBoolean46 && fma.a(this.anIDirect3DVertexBuffer1.Unlock(), (byte) -24)) {
			this.aBoolean46 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)V")
	@Override
	public void method6754() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a((byte) 109);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt703 = 0;
		this.anInt702 = 0;
	}

	@OriginalMember(owner = "client!aka", name = "c", descriptor = "(I)I")
	@Override
	public int method6752() {
		return this.anInt703;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(B)I")
	public int method640() {
		return this.aByte30;
	}
}
