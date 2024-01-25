import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.qr;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class187 implements Interface11 {

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
	private int anInt4917;

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
	private int anInt4918;

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "Z")
	private boolean aBoolean390 = false;

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "Z")
	private final boolean aBoolean389;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "Lclient!bt;")
	private final Class42 aClass42_17;

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "Lclient!gaa;")
	private final Class100_Sub1_Sub1 aClass100_Sub1_Sub1_6;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!gaa;Lclient!bt;Z)V")
	public Class187(@OriginalArg(0) Class100_Sub1_Sub1 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean389 = arg2;
		this.aClass42_17 = arg1;
		this.aClass100_Sub1_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V")
	@Override
	public void method5772() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(6168);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt4918 = 0;
		this.anInt4917 = 0;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Lclient!bt;")
	@Override
	public Class42 method4115() {
		return this.aClass42_17;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4118() {
		if (this.aBoolean390 && qr.a(this.anIDirect3DIndexBuffer1.Unlock(), -2005530519)) {
			this.aBoolean390 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method4114() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean389 & true;
		if (!this.aBoolean390 && qr.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt4918, local9 ? 8192 : 0, this.aClass100_Sub1_Sub1_6.aGeometryBuffer1), -2005530519)) {
			this.aBoolean390 = true;
			return this.aClass100_Sub1_Sub1_6.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)V")
	@Override
	public void method4117(@OriginalArg(1) int arg0) {
		this.anInt4917 = arg0 * this.aClass42_17.anInt1131;
		if (this.anInt4917 <= this.anInt4918) {
			return;
		}
		@Pc(25) short local25 = 8;
		@Pc(34) byte local34;
		if (this.aBoolean389) {
			local25 = 520;
			local34 = 0;
		} else {
			local34 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(6168);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass100_Sub1_Sub1_6.anIDirect3DDevice1.a(this.anInt4917, local25, this.aClass42_17 == Static47.aClass42_5 ? 101 : 102, local34, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt4918 = this.anInt4917;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)I")
	@Override
	public int method5771() {
		return this.anInt4917;
	}
}
