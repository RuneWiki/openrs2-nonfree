import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.gfa;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class40 implements Interface8 {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
	private int anInt858;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "B")
	private byte aByte4;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
	private int anInt859;

	@OriginalMember(owner = "client!bp", name = "g", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "Lclient!ik;")
	private final Class162_Sub1_Sub1 aClass162_Sub1_Sub1_2;

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "Z")
	private final boolean aBoolean42;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!ik;Z)V")
	public Class40(@OriginalArg(0) Class162_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass162_Sub1_Sub1_2 = arg0;
		this.aBoolean42 = arg1;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method5366(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		return this.method5367(arg2, arg0) ? this.anIDirect3DVertexBuffer1.a(arg1, 0, 0, this.anInt858, this.aBoolean42 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)I")
	public int method819() {
		return this.aByte4;
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5368() {
		if (this.aBoolean43 && gfa.a(this.anIDirect3DVertexBuffer1.Unlock(), (int) 10067)) {
			this.aBoolean43 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)I")
	@Override
	public int method7030() {
		return this.anInt858;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	@Override
	public void method7032() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.b((byte) 90);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt858 = 0;
		this.anInt859 = 0;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5369() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(17) boolean local17 = this.aBoolean42 & true;
		if (!this.aBoolean43 && gfa.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt859, local17 ? 8192 : 0, this.aClass162_Sub1_Sub1_2.aGeometryBuffer1), (int) 10067)) {
			this.aBoolean43 = true;
			return this.aClass162_Sub1_Sub1_2.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method5367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte4 = (byte) arg1;
		this.anInt858 = arg0;
		if (this.anInt858 > this.anInt859) {
			@Pc(19) short local19 = 8;
			@Pc(24) byte local24;
			if (this.aBoolean42) {
				local24 = 0;
				local19 = 520;
			} else {
				local24 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.b((byte) 60);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass162_Sub1_Sub1_2.anIDirect3DDevice1.a(this.anInt858, local19, 0, local24, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt859 = this.anInt858;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}
}
