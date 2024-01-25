import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.nba;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class144 implements Interface4 {

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "B")
	private byte aByte58;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
	private int anInt4197;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
	private int anInt4198;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "Z")
	private boolean aBoolean314 = false;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Z")
	private final boolean aBoolean313;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "Lclient!ss;")
	private final Class66_Sub1_Sub2 aClass66_Sub1_Sub2_3;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!ss;Z)V")
	public Class144(@OriginalArg(0) Class66_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean313 = arg1;
		this.aClass66_Sub1_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)I")
	public int method3562() {
		return this.aByte58;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7149() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(10) boolean local10 = this.aBoolean313 & true;
		if (!this.aBoolean314 && nba.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt4197, local10 ? 8192 : 0, this.aClass66_Sub1_Sub2_3.aGeometryBuffer1), (byte) -103)) {
			this.aBoolean314 = true;
			return this.aClass66_Sub1_Sub2_3.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method3559(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4198 = arg1;
		this.aByte58 = (byte) arg0;
		if (this.anInt4198 > this.anInt4197) {
			@Pc(24) short local24 = 8;
			@Pc(29) byte local29;
			if (this.aBoolean313) {
				local29 = 0;
				local24 = 520;
			} else {
				local29 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b(-91);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass66_Sub1_Sub2_3.anIDirect3DDevice1.a(this.anInt4198, local24, 0, local29, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt4197 = this.anInt4198;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method3561(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		return this.method3559(arg0, arg1) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt4198, this.aBoolean313 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)I")
	@Override
	public int method7145() {
		return this.anInt4198;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7150() {
		if (this.aBoolean314 && nba.a(this.anIDirect3DVertexBuffer1.Unlock(), (byte) -91)) {
			this.aBoolean314 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	@Override
	public void method7146() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b(-85);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt4198 = 0;
		this.anInt4197 = 0;
	}
}
