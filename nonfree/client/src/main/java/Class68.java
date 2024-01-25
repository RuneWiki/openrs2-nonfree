import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.ec;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class68 implements Interface4 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "I")
	private int anInt2558;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "I")
	private int anInt2559;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "B")
	private byte aByte28;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Z")
	private final boolean aBoolean191;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!hl;")
	private final Class16_Sub1_Sub2 aClass16_Sub1_Sub2_1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!hl;Z)V")
	public Class68(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean191 = arg1;
		this.aClass16_Sub1_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!jaclib/memory/Source;BII)Z")
	@Override
	public boolean method6504(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.method6507(arg1, arg2) ? this.anIDirect3DVertexBuffer1.a(arg0, 0, 0, this.anInt2559, this.aBoolean191 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	@Override
	public void method6496() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(-31315);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt2558 = 0;
		this.anInt2559 = 0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6505() {
		if (this.aBoolean192 && ec.a(this.anIDirect3DVertexBuffer1.Unlock(), 2005530520)) {
			this.aBoolean192 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)I")
	public int method2175() {
		return this.aByte28;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6506() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(10) boolean local10 = this.aBoolean191 & true;
		if (!this.aBoolean192 && ec.a(this.anIDirect3DVertexBuffer1.Lock(0, this.anInt2558, local10 ? 8192 : 0, this.aClass16_Sub1_Sub2_1.aGeometryBuffer1), 2005530520)) {
			this.aBoolean192 = true;
			return this.aClass16_Sub1_Sub2_1.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method6507(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2559 = arg1;
		this.aByte28 = (byte) arg0;
		if (this.anInt2559 > this.anInt2558) {
			@Pc(20) short local20 = 8;
			@Pc(25) byte local25;
			if (this.aBoolean191) {
				local20 = 520;
				local25 = 0;
			} else {
				local25 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(-31315);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass16_Sub1_Sub2_1.anIDirect3DDevice1.a(this.anInt2559, local20, 0, local25, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt2558 = this.anInt2559;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)I")
	@Override
	public int method6492() {
		return this.anInt2559;
	}
}
