import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.dm;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class167 implements Interface7 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
	private int anInt4659;

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
	private int anInt4660;

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "Lclient!jagdx/IDirect3DIndexBuffer;")
	public IDirect3DIndexBuffer anIDirect3DIndexBuffer1;

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "Z")
	private boolean aBoolean344 = false;

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "Lclient!lc;")
	private final Class171 aClass171_6;

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "Lclient!nca;")
	private final Class39_Sub2_Sub1 aClass39_Sub2_Sub1_3;

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "Z")
	private final boolean aBoolean345;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!nca;Lclient!lc;Z)V")
	public Class167(@OriginalArg(0) Class39_Sub2_Sub1 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass171_6 = arg1;
		this.aClass39_Sub2_Sub1_3 = arg0;
		this.aBoolean345 = arg2;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)I")
	@Override
	public int method6941() {
		return this.anInt4660;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6949(@OriginalArg(1) int arg0) {
		this.anInt4660 = arg0 * this.aClass171_6.anInt4927;
		if (this.anInt4660 <= this.anInt4659) {
			return;
		}
		@Pc(20) short local20 = 8;
		@Pc(25) byte local25;
		if (this.aBoolean345) {
			local20 = 520;
			local25 = 0;
		} else {
			local25 = 1;
		}
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -27);
		}
		this.anIDirect3DIndexBuffer1 = this.aClass39_Sub2_Sub1_3.anIDirect3DDevice1.a(this.anInt4660, local20, Static268.aClass171_11 == this.aClass171_6 ? 101 : 102, local25, (IDirect3DIndexBuffer) this.anIDirect3DIndexBuffer1);
		this.anInt4659 = this.anInt4660;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6952() {
		@Pc(11) boolean local11 = this.aBoolean345 & true;
		if (!this.aBoolean344 && dm.a((int) 7155, this.anIDirect3DIndexBuffer1.Lock(0, this.anInt4659, local11 ? 8192 : 0, this.aClass39_Sub2_Sub1_3.aGeometryBuffer1))) {
			this.aBoolean344 = true;
			return this.aClass39_Sub2_Sub1_3.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)Lclient!lc;")
	@Override
	public Class171 method6955() {
		return this.aClass171_6;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6954() {
		if (this.aBoolean344 && dm.a((int) 7155, this.anIDirect3DIndexBuffer1.Unlock())) {
			this.aBoolean344 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V")
	@Override
	public void method6953() {
		if (this.anIDirect3DIndexBuffer1 != null) {
			this.anIDirect3DIndexBuffer1.a((byte) -27);
			this.anIDirect3DIndexBuffer1 = null;
		}
		this.anInt4660 = 0;
		this.anInt4659 = 0;
	}
}
