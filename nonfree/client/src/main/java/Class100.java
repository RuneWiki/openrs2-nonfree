import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.qc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class100 implements Interface3 {

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "B")
	private byte aByte32;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
	private int anInt3032;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	private int anInt3033;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "Z")
	private final boolean aBoolean220;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "Lclient!rca;")
	private final Class5_Sub3_Sub2 aClass5_Sub3_Sub2_1;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!rca;Z)V")
	public Class100(@OriginalArg(0) Class5_Sub3_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean220 = arg1;
		this.aClass5_Sub3_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	@Override
	public boolean method2578(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method2580(arg1, arg2) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt3032, this.aBoolean220 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)I")
	@Override
	public int method3133() {
		return this.anInt3032;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3135() {
		if (this.aBoolean221 && qc.a((byte) 48, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean221 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method2580(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3032 = arg1;
		this.aByte32 = (byte) arg0;
		if (this.anInt3032 > this.anInt3033) {
			@Pc(22) short local22 = 8;
			@Pc(27) byte local27;
			if (this.aBoolean220) {
				local22 = 520;
				local27 = 0;
			} else {
				local27 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a((byte) -103);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass5_Sub3_Sub2_1.anIDirect3DDevice1.a(this.anInt3032, local22, 0, local27, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt3033 = this.anInt3032;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	@Override
	public void method3138() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a((byte) -64);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt3033 = 0;
		this.anInt3032 = 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)I")
	public int method2583() {
		return this.aByte32;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3136() {
		@Pc(11) boolean local11 = this.aBoolean220 & true;
		if (!this.aBoolean221 && qc.a((byte) 48, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt3033, local11 ? 8192 : 0, this.aClass5_Sub3_Sub2_1.aGeometryBuffer1))) {
			this.aBoolean221 = true;
			return this.aClass5_Sub3_Sub2_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}
}
