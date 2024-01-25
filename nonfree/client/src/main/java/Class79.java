import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.rn;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dia")
public final class Class79 implements Interface22 {

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "I")
	private int anInt2241;

	@OriginalMember(owner = "client!dia", name = "e", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!dia", name = "g", descriptor = "I")
	private int anInt2242;

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!dia", name = "f", descriptor = "Lclient!so;")
	private final Class330 aClass330_4;

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "Z")
	private final boolean aBoolean189;

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "Lclient!aia;")
	private final Class16_Sub1_Sub1 aClass16_Sub1_Sub1_2;

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Lclient!aia;Lclient!so;Z)V")
	public Class79(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass330_4 = arg1;
		this.aBoolean189 = arg2;
		this.aClass16_Sub1_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(B)I")
	@Override
	public int method7727() {
		return this.anInt2241;
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7738() {
		if (this.aBoolean188 && rn.a(this.anIDirect3DIndexBuffer1.Unlock(), -37)) {
			this.aBoolean188 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(I)Lclient!so;")
	@Override
	public Class330 method7740() {
		return this.aClass330_4;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(II)V")
	@Override
	public void method7734(@OriginalArg(0) int arg0) {
		this.anInt2241 = arg0 * this.aClass330_4.anInt8941;
		if (this.anInt2241 <= this.anInt2242) {
			return;
		}
		@Pc(22) short local22 = 8;
		@Pc(31) byte local31;
		if (this.aBoolean189) {
			local22 = 520;
			local31 = 0;
		} else {
			local31 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(-6517);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass16_Sub1_Sub1_2.anIDirect3DDevice1.a(this.anInt2241, local22, this.aClass330_4 == Static553.aClass330_15 ? 101 : 102, local31, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt2242 = this.anInt2241;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V")
	@Override
	public void method7731() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a(-6517);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt2241 = 0;
		this.anInt2242 = 0;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7739() {
		if (this.anIDirect3DIndexBuffer1 == null) {
			return null;
		}
		@Pc(11) boolean local11 = this.aBoolean189 & true;
		if (!this.aBoolean188 && rn.a(this.anIDirect3DIndexBuffer1.Lock(0, this.anInt2242, local11 ? 8192 : 0, this.aClass16_Sub1_Sub1_2.aGeometryBuffer1), -72)) {
			this.aBoolean188 = true;
			return this.aClass16_Sub1_Sub1_2.aGeometryBuffer1;
		} else {
			return null;
		}
	}
}
