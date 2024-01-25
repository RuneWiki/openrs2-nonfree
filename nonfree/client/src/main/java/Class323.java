import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.raa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class323 implements Interface1 {

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "I")
	private int anInt9002;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "B")
	private byte aByte121;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "I")
	private int anInt9003;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Z")
	private boolean aBoolean737 = false;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Z")
	private final boolean aBoolean736;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!mh;")
	private final Class126_Sub2_Sub2 aClass126_Sub2_Sub2_8;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!mh;Z)V")
	public Class323(@OriginalArg(0) Class126_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean736 = arg1;
		this.aClass126_Sub2_Sub2_8 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7714() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(18) boolean local18 = this.aBoolean736 & true;
		if (!this.aBoolean737 && raa.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt9003, local18 ? 8192 : 0, this.aClass126_Sub2_Sub2_8.aGeometryBuffer1), (byte) 98)) {
			this.aBoolean737 = true;
			return this.aClass126_Sub2_Sub2_8.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method7718(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1, @OriginalArg(3) int arg2) {
		return this.method7715(arg2, arg0) ? this.anIDirect3DVertexBuffer1.a(arg1, 0, 0, this.anInt9002, this.aBoolean736 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7717() {
		if (this.aBoolean737 && raa.a(this.anIDirect3DVertexBuffer1.Unlock(), (byte) 120)) {
			this.aBoolean737 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)I")
	@Override
	public int method7713() {
		return this.anInt9002;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)I")
	public int method7719() {
		return this.aByte121;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method7715(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9002 = arg1;
		this.aByte121 = (byte) arg0;
		if (this.anInt9003 < this.anInt9002) {
			@Pc(24) short local24 = 8;
			@Pc(29) byte local29;
			if (this.aBoolean736) {
				local24 = 520;
				local29 = 0;
			} else {
				local29 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a((byte) 85);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass126_Sub2_Sub2_8.anIDirect3DDevice1.a(this.anInt9002, local24, 0, local29, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt9003 = this.anInt9002;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	@Override
	public void method7716() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a((byte) -70);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt9003 = 0;
		this.anInt9002 = 0;
	}
}
