import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.kg;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iga")
public final class Class141 implements Interface27 {

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
	private int anInt5275;

	@OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
	private int anInt5276;

	@OriginalMember(owner = "client!iga", name = "g", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!iga", name = "e", descriptor = "Z")
	private boolean aBoolean427 = false;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "Lclient!kq;")
	private final Class176 aClass176_4;

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "Lclient!bea;")
	private final Class5_Sub2_Sub1 aClass5_Sub2_Sub1_5;

	@OriginalMember(owner = "client!iga", name = "d", descriptor = "Z")
	private final boolean aBoolean426;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Lclient!bea;Lclient!kq;Z)V")
	public Class141(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass176_4 = arg1;
		this.aClass5_Sub2_Sub1_5 = arg0;
		this.aBoolean426 = arg2;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7962() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(9) boolean local9 = this.aBoolean426 & true;
		if (!this.aBoolean427 && kg.a(-21593, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt5275, local9 ? 8192 : 0, this.aClass5_Sub2_Sub1_5.aGeometryBuffer1))) {
			this.aBoolean427 = true;
			return this.aClass5_Sub2_Sub1_5.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)I")
	@Override
	public int method8094() {
		return this.anInt5276;
	}

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "(I)Lclient!kq;")
	@Override
	public Class176 method7961() {
		return this.aClass176_4;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Z)V")
	@Override
	public void method8104() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(31);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt5275 = 0;
		this.anInt5276 = 0;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7963() {
		if (this.aBoolean427 && kg.a(-21593, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean427 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(II)V")
	@Override
	public void method8101(@OriginalArg(0) int arg0) {
		this.anInt5276 = arg0 * this.aClass176_4.anInt6139;
		if (this.anInt5276 <= this.anInt5275) {
			return;
		}
		@Pc(13) short local13 = 8;
		@Pc(18) byte local18;
		if (this.aBoolean426) {
			local18 = 0;
			local13 = 520;
		} else {
			local18 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(32);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass5_Sub2_Sub1_5.anIDirect3DDevice1.a(this.anInt5276, local13, this.aClass176_4 == Static302.aClass176_9 ? 101 : 102, local18, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt5275 = this.anInt5276;
	}
}
