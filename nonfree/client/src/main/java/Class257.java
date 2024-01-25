import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.op;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class257 implements Interface10 {

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
	private int anInt7706;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
	private int anInt7707;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Z")
	private boolean aBoolean583 = false;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "Lclient!lt;")
	private final Class87_Sub1_Sub2 aClass87_Sub1_Sub2_7;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Lclient!ti;")
	private final Class324 aClass324_7;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "Z")
	private final boolean aBoolean584;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!lt;Lclient!ti;Z)V")
	public Class257(@OriginalArg(0) Class87_Sub1_Sub2 arg0, @OriginalArg(1) Class324 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass87_Sub1_Sub2_7 = arg0;
		this.aClass324_7 = arg1;
		this.aBoolean584 = arg2;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
	@Override
	public void method7675(@OriginalArg(0) int arg0) {
		this.anInt7706 = arg0 * this.aClass324_7.anInt9051;
		if (this.anInt7707 >= this.anInt7706) {
			return;
		}
		@Pc(25) short local25 = 8;
		@Pc(34) byte local34;
		if (this.aBoolean584) {
			local25 = 520;
			local34 = 0;
		} else {
			local34 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(30216);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass87_Sub1_Sub2_7.anIDirect3DDevice1.a(this.anInt7706, local25, this.aClass324_7 == Static545.aClass324_13 ? 101 : 102, local34, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt7707 = this.anInt7706;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7682() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(17) boolean local17 = this.aBoolean584 & true;
		if (!this.aBoolean583 && op.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt7707, local17 ? 8192 : 0, this.aClass87_Sub1_Sub2_7.aGeometryBuffer1), (byte) -109)) {
			this.aBoolean583 = true;
			return this.aClass87_Sub1_Sub2_7.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)I")
	@Override
	public int method7668() {
		return this.anInt7706;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)Lclient!ti;")
	@Override
	public Class324 method7681() {
		return this.aClass324_7;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	@Override
	public void method7671() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.b(30216);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt7707 = 0;
		this.anInt7706 = 0;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7683() {
		if (this.aBoolean583 && op.a(this.anIDirect3DIndexBuffer1.Unlock(), (byte) -128)) {
			this.aBoolean583 = false;
			return true;
		} else {
			return false;
		}
	}
}
