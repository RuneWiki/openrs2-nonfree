import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.sw;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class221 implements Interface2 {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
	private int anInt6972;

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
	private int anInt6973;

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!naa", name = "g", descriptor = "B")
	private byte aByte70;

	@OriginalMember(owner = "client!naa", name = "f", descriptor = "Z")
	private boolean aBoolean589 = false;

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "Z")
	private final boolean aBoolean588;

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "Lclient!mba;")
	private final Class15_Sub2_Sub2 aClass15_Sub2_Sub2_5;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lclient!mba;Z)V")
	public Class221(@OriginalArg(0) Class15_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean588 = arg1;
		this.aClass15_Sub2_Sub2_5 = arg0;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method5803(@OriginalArg(0) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		return this.method5805(arg2, arg0) ? this.anIDirect3DVertexBuffer1.a(arg1, 0, 0, this.anInt6973, this.aBoolean588 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "(I)I")
	public int method5807() {
		return this.aByte70;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V")
	@Override
	public void method6239() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a((byte) -46);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt6973 = 0;
		this.anInt6972 = 0;
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6241() {
		if (this.aBoolean589 && sw.a((byte) -58, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean589 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6243() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(16) boolean local16 = this.aBoolean588 & true;
		if (!this.aBoolean589 && sw.a((byte) -58, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt6972, local16 ? 8192 : 0, this.aClass15_Sub2_Sub2_5.aGeometryBuffer1))) {
			this.aBoolean589 = true;
			return this.aClass15_Sub2_Sub2_5.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)I")
	@Override
	public int method6235() {
		return this.anInt6973;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(BII)Z")
	@Override
	public boolean method5805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte70 = (byte) arg0;
		this.anInt6973 = arg1;
		if (this.anInt6972 < this.anInt6973) {
			@Pc(23) short local23 = 8;
			@Pc(28) byte local28;
			if (this.aBoolean588) {
				local28 = 0;
				local23 = 520;
			} else {
				local28 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a((byte) -46);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass15_Sub2_Sub2_5.anIDirect3DDevice1.a(this.anInt6973, local23, 0, local28, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt6972 = this.anInt6973;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}
}
