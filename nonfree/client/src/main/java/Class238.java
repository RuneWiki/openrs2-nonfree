import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.ue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class238 implements Interface24 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	private int anInt7550;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	private int anInt7551;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Z")
	private boolean aBoolean547 = false;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!bfa;")
	private final Class20_Sub2_Sub1 aClass20_Sub2_Sub1_9;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Z")
	private final boolean aBoolean546;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!baa;")
	private final Class26 aClass26_18;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!bfa;Lclient!baa;Z)V")
	public Class238(@OriginalArg(0) Class20_Sub2_Sub1 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass20_Sub2_Sub1_9 = arg0;
		this.aBoolean546 = arg2;
		this.aClass26_18 = arg1;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)Lclient!baa;")
	@Override
	public Class26 method6478() {
		return this.aClass26_18;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6474() {
		if (this.aBoolean547 && ue.a(this.anIDirect3DIndexBuffer1.Unlock(), false)) {
			this.aBoolean547 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
	@Override
	public void method6476(@OriginalArg(1) int arg0) {
		this.anInt7550 = this.aClass26_18.anInt622 * arg0;
		if (this.anInt7551 >= this.anInt7550) {
			return;
		}
		@Pc(20) short local20 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean546) {
			local20 = 520;
			local29 = 0;
		} else {
			local29 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(9275);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass20_Sub2_Sub1_9.anIDirect3DDevice1.a(this.anInt7550, local20, this.aClass26_18 == Static29.aClass26_5 ? 101 : 102, local29, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt7551 = this.anInt7550;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6477() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(17) boolean local17 = this.aBoolean546 & true;
		if (!this.aBoolean547 && ue.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt7551, local17 ? 8192 : 0, this.aClass20_Sub2_Sub1_9.aGeometryBuffer1), false)) {
			this.aBoolean547 = true;
			return this.aClass20_Sub2_Sub1_9.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)I")
	@Override
	public int method6473() {
		return this.anInt7550;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	@Override
	public void method6475() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(9275);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt7551 = 0;
		this.anInt7550 = 0;
	}
}
