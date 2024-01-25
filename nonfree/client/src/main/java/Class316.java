import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.wu;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class316 implements Interface10 {

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
	private int anInt9535;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	private int anInt9536;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "B")
	private byte aByte106;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "Z")
	private boolean aBoolean675 = false;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "Z")
	private final boolean aBoolean674;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "Lclient!bv;")
	private final Class42_Sub1_Sub1 aClass42_Sub1_Sub1_8;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!bv;Z)V")
	public Class316(@OriginalArg(0) Class42_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean674 = arg1;
		this.aClass42_Sub1_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method7897(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9535 = arg1;
		this.aByte106 = (byte) arg0;
		if (this.anInt9535 > this.anInt9536) {
			@Pc(26) short local26 = 8;
			@Pc(31) byte local31;
			if (this.aBoolean674) {
				local26 = 520;
				local31 = 0;
			} else {
				local31 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a((byte) 123);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass42_Sub1_Sub1_8.anIDirect3DDevice1.a(this.anInt9535, local26, 0, local31, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt9536 = this.anInt9535;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7899() {
		if (this.aBoolean675 && wu.a(this.anIDirect3DVertexBuffer1.Unlock(), (byte) 112)) {
			this.aBoolean675 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
	@Override
	public void method7898() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a((byte) 6);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt9535 = 0;
		this.anInt9536 = 0;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method7896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		return this.method7897(arg0, arg1) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt9535, this.aBoolean674 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)I")
	@Override
	public int method7894() {
		return this.anInt9535;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)I")
	public int method7900() {
		return this.aByte106;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7895() {
		@Pc(4) boolean local4 = this.aBoolean674 & true;
		if (!this.aBoolean675 && wu.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt9536, local4 ? 8192 : 0, this.aClass42_Sub1_Sub1_8.aGeometryBuffer1), (byte) 122)) {
			this.aBoolean675 = true;
			return this.aClass42_Sub1_Sub1_8.aGeometryBuffer1;
		} else {
			return null;
		}
	}
}
