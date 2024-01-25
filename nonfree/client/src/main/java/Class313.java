import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.nba;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class313 implements Interface8 {

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
	private int anInt8693;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	private int anInt8694;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Z")
	private boolean aBoolean604 = false;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!ss;")
	private final Class66_Sub1_Sub2 aClass66_Sub1_Sub2_7;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Lclient!ne;")
	private final Class239 aClass239_20;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Z")
	private final boolean aBoolean603;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!ss;Lclient!ne;Z)V")
	public Class313(@OriginalArg(0) Class66_Sub1_Sub2 arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass66_Sub1_Sub2_7 = arg0;
		this.aClass239_20 = arg1;
		this.aBoolean603 = arg2;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)Lclient!ne;")
	@Override
	public Class239 method7147() {
		return this.aClass239_20;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	@Override
	public void method7146() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(-52);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt8693 = 0;
		this.anInt8694 = 0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7150() {
		if (this.aBoolean604 && nba.a(this.anIDirect3DIndexBuffer1.Unlock(), (byte) -42)) {
			this.aBoolean604 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
	@Override
	public void method7148(@OriginalArg(1) int arg0) {
		this.anInt8693 = arg0 * this.aClass239_20.anInt6113;
		if (this.anInt8693 <= this.anInt8694) {
			return;
		}
		@Pc(19) short local19 = 8;
		@Pc(24) byte local24;
		if (this.aBoolean603) {
			local19 = 520;
			local24 = 0;
		} else {
			local24 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(-97);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass66_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt8693, local19, Static349.aClass239_13 == this.aClass239_20 ? 101 : 102, local24, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt8694 = this.anInt8693;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)I")
	@Override
	public int method7145() {
		return this.anInt8693;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7149() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(10) boolean local10 = this.aBoolean603 & true;
		if (!this.aBoolean604 && nba.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt8694, local10 ? 8192 : 0, this.aClass66_Sub1_Sub2_7.aGeometryBuffer1), (byte) -96)) {
			this.aBoolean604 = true;
			return this.aClass66_Sub1_Sub2_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}
}
