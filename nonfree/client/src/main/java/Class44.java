import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.uo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class44 implements Interface24 {

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
	private int anInt906;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "B")
	private byte aByte45;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "Lclient!wu;")
	private final Class145_Sub1_Sub2 aClass145_Sub1_Sub2_2;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "Z")
	private final boolean aBoolean114;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!wu;Z)V")
	public Class44(@OriginalArg(0) Class145_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass145_Sub1_Sub2_2 = arg0;
		this.aBoolean114 = arg1;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)I")
	public int method827() {
		return this.aByte45;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	@Override
	public void method9218() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b((byte) 115);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt907 = 0;
		this.anInt906 = 0;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)I")
	@Override
	public int method9217() {
		return this.anInt907;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method9230() {
		if (this.aBoolean113 && uo.a(this.anIDirect3DVertexBuffer1.Unlock(), true)) {
			this.aBoolean113 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BII)Z")
	@Override
	public boolean method9227(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt907 = arg1;
		this.aByte45 = (byte) arg0;
		if (this.anInt907 > this.anInt906) {
			@Pc(19) short local19 = 8;
			@Pc(24) byte local24;
			if (this.aBoolean114) {
				local19 = 520;
				local24 = 0;
			} else {
				local24 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b((byte) -111);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass145_Sub1_Sub2_2.anIDirect3DDevice1.a(this.anInt907, local19, 0, local24, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt906 = this.anInt907;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method9228() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(23) boolean local23 = this.aBoolean114 & true;
		if (!this.aBoolean113 && uo.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt906, local23 ? 8192 : 0, this.aClass145_Sub1_Sub2_2.aGeometryBuffer1), true)) {
			this.aBoolean113 = true;
			return this.aClass145_Sub1_Sub2_2.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method9229(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		return this.method9227(arg0, arg2) ? this.anIDirect3DVertexBuffer1.a(arg1, 0, 0, this.anInt907, this.aBoolean114 ? 8192 : 0) : false;
	}
}
