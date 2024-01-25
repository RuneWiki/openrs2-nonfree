import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.pp;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class219 implements Interface26 {

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
	private int anInt6935;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
	private int anInt6936;

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "B")
	private byte aByte94;

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "Z")
	private boolean aBoolean602 = false;

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "Z")
	private final boolean aBoolean603;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "Lclient!cu;")
	private final Class33_Sub1_Sub2 aClass33_Sub1_Sub2_6;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!cu;Z)V")
	public Class219(@OriginalArg(0) Class33_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean603 = arg1;
		this.aClass33_Sub1_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I")
	@Override
	public int method7621() {
		return this.anInt6936;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method7634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		return this.method7633(arg1, arg0) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt6936, this.aBoolean603 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method7633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6936 = arg1;
		this.aByte94 = (byte) arg0;
		if (this.anInt6936 > this.anInt6935) {
			@Pc(19) short local19 = 8;
			@Pc(24) byte local24;
			if (this.aBoolean603) {
				local24 = 0;
				local19 = 520;
			} else {
				local24 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b(15);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass33_Sub1_Sub2_6.anIDirect3DDevice1.a(this.anInt6936, local19, 0, local24, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt6935 = this.anInt6936;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)I")
	public int method5813() {
		return this.aByte94;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7632() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(16) boolean local16 = this.aBoolean603 & true;
		if (!this.aBoolean602 && pp.a(false, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt6935, local16 ? 8192 : 0, this.aClass33_Sub1_Sub2_6.aGeometryBuffer1))) {
			this.aBoolean602 = true;
			return this.aClass33_Sub1_Sub2_6.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7635() {
		if (this.aBoolean602 && pp.a(false, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean602 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	@Override
	public void method7627() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b(126);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt6936 = 0;
		this.anInt6935 = 0;
	}
}
