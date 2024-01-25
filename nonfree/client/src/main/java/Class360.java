import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.lg;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class360 implements Interface10 {

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "B")
	private byte aByte132;

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
	private int anInt9942;

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
	private int anInt9943;

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "Z")
	private boolean aBoolean715 = false;

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "Lclient!ul;")
	private final Class13_Sub3_Sub2 aClass13_Sub3_Sub2_8;

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "Z")
	private final boolean aBoolean716;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lclient!ul;Z)V")
	public Class360(@OriginalArg(0) Class13_Sub3_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass13_Sub3_Sub2_8 = arg0;
		this.aBoolean716 = arg1;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V")
	@Override
	public void method8446() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b((byte) -36);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt9943 = 0;
		this.anInt9942 = 0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8449() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(10) boolean local10 = this.aBoolean716 & true;
		if (!this.aBoolean715 && lg.b(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt9943, local10 ? 8192 : 0, this.aClass13_Sub3_Sub2_8.aGeometryBuffer1), 25499)) {
			this.aBoolean715 = true;
			return this.aClass13_Sub3_Sub2_8.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method8450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9942 = arg1;
		this.aByte132 = (byte) arg0;
		if (this.anInt9942 > this.anInt9943) {
			@Pc(23) short local23 = 8;
			@Pc(32) byte local32;
			if (this.aBoolean716) {
				local23 = 520;
				local32 = 0;
			} else {
				local32 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b((byte) -36);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass13_Sub3_Sub2_8.anIDirect3DDevice1.a(this.anInt9942, local23, 0, local32, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt9943 = this.anInt9942;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)I")
	@Override
	public int method8445() {
		return this.anInt9942;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method8447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		return this.method8450(arg0, arg1) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt9942, this.aBoolean716 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8448() {
		if (this.aBoolean715 && lg.b(this.anIDirect3DVertexBuffer1.Unlock(), 25499)) {
			this.aBoolean715 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)I")
	public int method8451() {
		return this.aByte132;
	}
}
